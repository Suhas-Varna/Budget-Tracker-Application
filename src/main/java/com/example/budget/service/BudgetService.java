package com.example.budget.service;

import com.example.budget.dao.TransactionDao;
import com.example.budget.domain.Transaction;
import com.example.budget.domain.Transaction.Type;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class BudgetService {
    private final TransactionDao dao;

    public BudgetService(TransactionDao dao) { this.dao = dao; }

    public List<Transaction> all() { return dao.findAll(); }

    public BigDecimal balance() {
        return dao.findAll().stream()
            .map(t -> t.getType() == Type.INCOME ? t.getAmount() : t.getAmount().negate())
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void addIncome(BigDecimal amount, String desc, String cat) {
        validate(amount, desc);
        dao.insert(new Transaction(null, LocalDateTime.now(), Type.INCOME, amount, desc, cat));
    }

    public void addExpense(BigDecimal amount, String desc, String cat) {
        validate(amount, desc);
        dao.insert(new Transaction(null, LocalDateTime.now(), Type.EXPENSE, amount, desc, cat));
    }

    public boolean delete(long id) { return dao.delete(id); }

    private void validate(BigDecimal amount, String desc) {
        if (amount == null || amount.signum() <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (desc == null || desc.isBlank()) throw new IllegalArgumentException("Description required");
    }
}
