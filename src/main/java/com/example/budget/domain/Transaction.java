package com.example.budget.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    public enum Type { INCOME, EXPENSE }

    private Long id;                  // DB-generated
    private LocalDateTime dateTime;   // when created
    private Type type;                // INCOME or EXPENSE
    private BigDecimal amount;        // always positive
    private String description;       // required
    private String category;          // optional

    public Transaction(Long id, LocalDateTime dateTime, Type type,
                       BigDecimal amount, String description, String category) {
        this.id = id;
        this.dateTime = dateTime;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.category = category;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDateTime getDateTime() { return dateTime; }
    public Type getType() { return type; }
    public BigDecimal getAmount() { return amount; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
}
