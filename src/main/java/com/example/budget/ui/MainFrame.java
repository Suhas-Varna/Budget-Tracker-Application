package com.example.budget.ui;

import com.example.budget.domain.Transaction;
import com.example.budget.service.BudgetService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;

public class MainFrame extends JFrame {
    // Ensure Look & Feel is set before any components are created
    static {
        try {
            boolean set = false;
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    set = true; break;
                }
            }
            if (!set) UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}
    }

    private final BudgetService service;

    private final JLabel balanceLabel = new JLabel("", SwingConstants.CENTER);
    private final DefaultTableModel model = new DefaultTableModel(
            new String[]{"ID","Date","Type","Amount","Description","Category"}, 0
    ) {
        @Override public boolean isCellEditable(int r, int c) { return false; }
    };
    private final JTable table = new JTable(model);

    private final JComboBox<String> typeBox = new JComboBox<>(new String[]{"INCOME","EXPENSE"});
    private final JTextField amountField = new JTextField();
    private final JTextField descField = new JTextField();
    private final JTextField catField = new JTextField();

    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final java.text.NumberFormat INR =
            java.text.NumberFormat.getCurrencyInstance(new java.util.Locale("en","IN"));

    public MainFrame(BudgetService service) {
        super("Budget Tracker (JDBC)");
        this.service = service;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 560);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10,10));

        // Base typography
        Font base = new Font("Arial", Font.PLAIN, 14);
        UIManager.put("Label.font", base);
        UIManager.put("TextField.font", base);
        UIManager.put("ComboBox.font", base);
        UIManager.put("Table.font", base);
        UIManager.put("TableHeader.font", base.deriveFont(Font.BOLD));

        // Top: Balance
        balanceLabel.setFont(new Font("Arial", Font.BOLD, 24));
        balanceLabel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(balanceLabel, BorderLayout.NORTH);

        // Center: Table
        table.setFillsViewportHeight(true);
        table.setRowHeight(28);
        table.setAutoCreateRowSorter(true); // optional: click headers to sort
        JScrollPane scroll = new JScrollPane(table);
        add(scroll, BorderLayout.CENTER);

        // Fixed column widths for cleaner look (apply immediately)
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        var cm = table.getColumnModel();
        if (cm.getColumnCount() == 6) {
            cm.getColumn(0).setPreferredWidth(70);   // ID
            cm.getColumn(1).setPreferredWidth(180);  // Date
            cm.getColumn(2).setPreferredWidth(100);  // Type
            cm.getColumn(3).setPreferredWidth(140);  // Amount
            cm.getColumn(4).setPreferredWidth(320);  // Description
            cm.getColumn(5).setPreferredWidth(160);  // Category
        }

        // Bottom: Form + Buttons
        JPanel form = new JPanel(new GridLayout(2,1,8,8));
        JPanel row1 = new JPanel(new GridLayout(1,8,8,0));
        row1.add(new JLabel("Type:"));
        row1.add(typeBox);
        row1.add(new JLabel("Amount:"));
        row1.add(amountField);
        row1.add(new JLabel("Description:"));
        row1.add(descField);
        row1.add(new JLabel("Category:"));
        row1.add(catField);

        // Tooltips (hints)
        typeBox.setToolTipText("INCOME = money coming in, EXPENSE = money going out");
        amountField.setToolTipText("Enter a positive number, e.g., 1250 or 99.50");
        descField.setToolTipText("Short note, e.g., salary, groceries, petrol");
        catField.setToolTipText("Optional: Food, Rent, Travel, Shopping");

        JPanel row2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton addBtn = new JButton("Add");
        JButton delBtn = new JButton("Delete Selected");
        row2.add(addBtn);
        row2.add(delBtn);

        form.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        form.add(row1);
        form.add(row2);
        add(form, BorderLayout.SOUTH);

        // Default button (Enter triggers Add)
        getRootPane().setDefaultButton(addBtn);

        // Delete key removes selected row
        table.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("DELETE"), "delRow");
        table.getActionMap().put("delRow", new AbstractAction() {
            @Override public void actionPerformed(java.awt.event.ActionEvent e) { onDelete(); }
        });

        // Actions
        addBtn.addActionListener(e -> onAdd());
        delBtn.addActionListener(e -> onDelete());

        // Focus on Amount when ready
        SwingUtilities.invokeLater(() -> amountField.requestFocusInWindow());

        refreshUI();
    }

    private void onAdd() {
        try {
            String type = (String) typeBox.getSelectedItem();
            BigDecimal amt = new BigDecimal(amountField.getText().trim());
            String desc = descField.getText().trim();
            String cat = catField.getText().trim();

            if (amt.signum() <= 0) {
                JOptionPane.showMessageDialog(this, "Amount must be a positive number.");
                amountField.requestFocusInWindow();
                return;
            }
            if (desc.isBlank()) {
                JOptionPane.showMessageDialog(this, "Description cannot be empty.");
                descField.requestFocusInWindow();
                return;
            }

            if ("INCOME".equals(type)) service.addIncome(amt, desc, cat);
            else service.addExpense(amt, desc, cat);

            amountField.setText("");
            descField.setText("");
            catField.setText("");
            amountField.requestFocusInWindow();
            refreshUI();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for Amount.");
            amountField.requestFocusInWindow();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    private void onDelete() {
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Select a row to delete.");
            return;
        }
        long id = Long.parseLong(model.getValueAt(row, 0).toString());
        int confirm = JOptionPane.showConfirmDialog(this, "Delete transaction #" + id + "?", "Confirm",
                JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (service.delete(id)) refreshUI();
        }
    }

    private void refreshUI() {
        var bal = service.balance();
        balanceLabel.setText("Current Balance: " + INR.format(bal));
        balanceLabel.setForeground(bal.signum() >= 0 ? new Color(0,128,0) : Color.RED);

        model.setRowCount(0);
        for (Transaction t : service.all()) {
            model.addRow(new Object[]{
                    t.getId(),
                    t.getDateTime().format(FMT),
                    t.getType().name(),
                    INR.format(t.getAmount()),
                    t.getDescription(),
                    t.getCategory()
            });
        }
    }
}
