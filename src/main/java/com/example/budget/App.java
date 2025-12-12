package com.example.budget;

import com.example.budget.dao.DataSource;
import com.example.budget.dao.TransactionDao;
import com.example.budget.service.BudgetService;
import com.example.budget.ui.MainFrame;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        // Initialize database + table
        DataSource.init();

        // Wire layers
        var dao = new TransactionDao();
        var service = new BudgetService(dao);

        // Launch Swing UI
        SwingUtilities.invokeLater(() -> new MainFrame(service).setVisible(true));
    }
}
