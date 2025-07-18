CREATE PROCEDURE calculate_interest
AS
BEGIN
    SET NOCOUNT ON;

    UPDATE accounts
    SET balance = balance + (balance * 0.03);
END;
