-- Create table for accounts
CREATE TABLE accounts (
    id INT PRIMARY KEY IDENTITY(1,1),
    name VARCHAR(100) NOT NULL,
    balance FLOAT NOT NULL
);

-- Create table for transactions
CREATE TABLE transactions (
    id INT PRIMARY KEY IDENTITY(1,1),
    account_id INT NOT NULL,
    type VARCHAR(10), -- CREDIT or DEBIT
    amount FLOAT NOT NULL,
    timestamp DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (account_id) REFERENCES accounts(id)
);
