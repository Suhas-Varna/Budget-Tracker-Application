package com.example.budget.dao;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataSource {
    // SQLite DB file in your project root
    private static final String URL = "jdbc:sqlite:budget.db";

    public static Connection get() throws java.sql.SQLException {
        return DriverManager.getConnection(URL);
    }

    // Read src/main/resources/schema.sql and run it once
    public static void init() {
        try (Connection c = get(); Statement st = c.createStatement()) {
            String ddl = Files.readString(Path.of("src/main/resources/schema.sql"), StandardCharsets.UTF_8);
            st.execute(ddl);
            System.out.println("[DB] Initialized at " + URL);
        } catch (Exception e) {
            throw new RuntimeException("Failed to init DB", e);
        }
    }
}
