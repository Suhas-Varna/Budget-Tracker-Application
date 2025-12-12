package com.example.budget.dao;

import com.example.budget.domain.Transaction;
import com.example.budget.domain.Transaction.Type;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TransactionDao {

    public List<Transaction> findAll() {
        String sql = "SELECT id, datetime, type, amount, description, category " +
                     "FROM transactions ORDER BY datetime DESC";
        try (Connection c = DataSource.get();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            List<Transaction> list = new ArrayList<>();
            while (rs.next()) list.add(map(rs));
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public long insert(Transaction t) {
        String sql = "INSERT INTO transactions(datetime,type,amount,description,category) VALUES(?,?,?,?,?)";
        try (Connection c = DataSource.get();
             PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, t.getDateTime().toString());
            ps.setString(2, t.getType().name());
            ps.setBigDecimal(3, t.getAmount());
            ps.setString(4, t.getDescription());
            ps.setString(5, t.getCategory());
            ps.executeUpdate();

            try (ResultSet keys = ps.getGeneratedKeys()) {
                return keys.next() ? keys.getLong(1) : 0L;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean delete(long id) {
        String sql = "DELETE FROM transactions WHERE id=?";
        try (Connection c = DataSource.get();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setLong(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Transaction map(ResultSet rs) throws SQLException {
        return new Transaction(
            rs.getLong("id"),
            LocalDateTime.parse(rs.getString("datetime")),
            Type.valueOf(rs.getString("type")),
            rs.getBigDecimal("amount"),
            rs.getString("description"),
            rs.getString("category")
        );
    }
}
