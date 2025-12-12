CREATE TABLE IF NOT EXISTS transactions (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  datetime TEXT NOT NULL,                      -- ISO-8601 string (e.g., 2025-12-12T11:45:00)
  type TEXT NOT NULL CHECK(type IN ('INCOME','EXPENSE')),
  amount NUMERIC NOT NULL CHECK(amount > 0),
  description TEXT NOT NULL,
  category TEXT
);
