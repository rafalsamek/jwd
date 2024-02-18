USE rsamek
GO

CREATE SCHEMA budget
GO

CREATE TABLE budget.BudgetEntries (
    ID int IDENTITY PRIMARY KEY,
    EntryDate datetime NOT NULL DEFAULT GETDATE(),
    EntryName nvarchar(255) NOT NULL,
    Amount money NOT NULL,
)
GO

SELECT * FROM budget.BudgetEntries;

INSERT INTO budget.BudgetEntries(EntryName, Amount) VALUES ('obiad', -47);
INSERT INTO budget.BudgetEntries(EntryName, Amount) VALUES ('wypłata', 100000);