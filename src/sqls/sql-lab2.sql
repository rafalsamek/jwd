-- https://java.mmiklas.wszib.edu.pl/dodatki/lab-sql2.html

USE rsamek
GO

CREATE OR ALTER PROCEDURE DropConstraintIfExists @TableName NVARCHAR(128),
                                                 @ConstraintName NVARCHAR(128),
                                                 @SchemaName NVARCHAR(128) = 'dbo' -- Default schema is dbo
AS
BEGIN
    SET NOCOUNT ON

    DECLARE @SqlCmd NVARCHAR(MAX)

    -- Check if the table and the constraint exist
    IF EXISTS(SELECT 1
              FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS
              WHERE TABLE_NAME = @TableName
                AND CONSTRAINT_NAME = @ConstraintName
                AND TABLE_SCHEMA = @SchemaName)
        BEGIN
            -- Prepare the SQL command to drop the constraint
            SET @SqlCmd = N'ALTER TABLE ' + QUOTENAME(@SchemaName) + N'.' + QUOTENAME(@TableName) +
                          N' DROP CONSTRAINT ' + QUOTENAME(@ConstraintName) + N';'

            -- Execute the command
            EXEC sp_executesql @SqlCmd;
            PRINT 'Constraint ' + @ConstraintName + ' on table ' + @TableName + ' dropped successfully.'
        END
    ELSE
        BEGIN
            PRINT 'Either the table or constraint does not exist in the schema ' + @SchemaName + '.'
        END
END
GO

-- views
DROP VIEW IF EXISTS Forum.vClues
DROP VIEW IF EXISTS Forum.vTopics
DROP VIEW IF EXISTS Forum.vTopicsExtended
DROP VIEW IF EXISTS Forum.vUsersConfirmedRegistrations
GO

-- foreign keys
EXEC DropConstraintIfExists @TableName = 'Topics', @ConstraintName = 'FK_Topics_Topics_ID', @SchemaName = 'Forum'
EXEC DropConstraintIfExists @TableName = 'Topics', @ConstraintName = 'FK_Topics_Users_ID', @SchemaName = 'Forum'
EXEC DropConstraintIfExists @TableName = 'Topics', @ConstraintName = 'FK_Topics_Clues_ID', @SchemaName = 'Forum'
EXEC DropConstraintIfExists @TableName = 'UserStats', @ConstraintName = 'FK_UserStats_Users_ID', @SchemaName = 'Forum'
EXEC DropConstraintIfExists @TableName = 'UserStats', @ConstraintName = 'FK_UserStats_Topic_ID', @SchemaName = 'Forum'
EXEC DropConstraintIfExists @TableName = 'UsersLogins', @ConstraintName = 'FK_UsersLogins_User_ID', @SchemaName = 'Forum'
-- checks
EXEC DropConstraintIfExists @TableName = 'Users', @ConstraintName = 'CK_EmailAddress', @SchemaName = 'Forum'
GO

DROP TABLE IF EXISTS Forum.Topics
DROP TABLE IF EXISTS Forum.Clues
DROP TABLE IF EXISTS Forum.Users
DROP TABLE IF EXISTS Forum.UsersLogins
DROP TABLE IF EXISTS Forum.UserStats
GO

DROP SCHEMA IF EXISTS Forum
GO

CREATE SCHEMA Forum
GO

CREATE TABLE Forum.Topics
(
    ID           int IDENTITY,
    ParentID     int           NULL,
    CreateTime   datetime      NOT NULL,
    TopicSubject nvarchar(128) NULL,
    TopicBody    nvarchar(MAX) NULL,
    AuthorID     int           NULL,
    ClueID       int           NOT NULL,
    ViewsCnt     int           NOT NULL,
    AnswersCnt   int           NOT NULL
)
GO

ALTER TABLE Forum.Topics
    ADD CONSTRAINT PK_Topics PRIMARY KEY (ID)
GO

CREATE TABLE Forum.Clues
(
    ID        int IDENTITY,
    Name      nvarchar(50)  NOT NULL,
    Descript  nvarchar(400) NULL,
    TopicsCnt int           NOT NULL
)
GO

ALTER TABLE Forum.Clues
    ADD CONSTRAINT PK_Clues PRIMARY KEY (ID)
GO

CREATE TABLE Forum.Users
(
    ID             int IDENTITY,
    EmailAddress   nvarchar(100) NOT NULL,
    Pass           nvarchar(250) NULL,
    Firstname      nvarchar(100) NULL,
    Lastname       nvarchar(100) NULL,
    RegisterTime   datetime      NOT NULL,
    RegConfirmTime datetime      NULL,
    ForumPostsCnt  int           NOT NULL
)
GO

ALTER TABLE Forum.Users
    ADD CONSTRAINT PK_Users PRIMARY KEY (ID)
GO

CREATE TABLE Forum.UsersLogins
(
    ID        int IDENTITY,
    UserID    int           NOT NULL,
    LoginTime datetime      NOT NULL,
    IPAddress varchar(30)   NULL,
    HostName  nvarchar(100) NULL
)
GO

ALTER TABLE Forum.UsersLogins
    ADD CONSTRAINT PK_UsersLogins PRIMARY KEY (ID)
GO

CREATE TABLE Forum.UserStats
(
    ID      int IDENTITY,
    UserID  int      NOT NULL,
    TopicID int      NOT NULL,
    Times   datetime NOT NULL
)
GO

ALTER TABLE Forum.UserStats
    ADD CONSTRAINT PK_UserStats PRIMARY KEY (ID)
GO

-- Foreign keys
ALTER TABLE Forum.Topics
    ADD CONSTRAINT FK_Topics_Topics_ID FOREIGN KEY (ParentID)
        REFERENCES Forum.Topics (ID)
GO

ALTER TABLE Forum.Topics
    ADD CONSTRAINT FK_Topics_Users_ID FOREIGN KEY (AuthorID)
        REFERENCES Forum.Users (ID)
GO

ALTER TABLE Forum.Topics
    ADD CONSTRAINT FK_Topics_Clues_ID FOREIGN KEY (ClueID)
        REFERENCES Forum.Clues (ID)
GO

ALTER TABLE Forum.UserStats
    ADD CONSTRAINT FK_UserStats_Users_ID FOREIGN KEY (UserID)
        REFERENCES Forum.Users (ID)
GO

ALTER TABLE Forum.UserStats
    ADD CONSTRAINT FK_UserStats_Topic_ID FOREIGN KEY (TopicID)
        REFERENCES Forum.Topics (ID)
GO

ALTER TABLE Forum.UsersLogins
    ADD CONSTRAINT FK_UsersLogins_User_ID FOREIGN KEY (UserID)
        REFERENCES Forum.Users (ID)
GO

-- Defaults
ALTER TABLE Forum.Topics
    ADD CONSTRAINT DF_CreateTime
        DEFAULT GETDATE() FOR CreateTime
GO

ALTER TABLE Forum.Users
    ADD CONSTRAINT DF_RegisterTime
        DEFAULT GETDATE() FOR RegisterTime
GO

ALTER TABLE Forum.UserStats
    ADD CONSTRAINT DF_Times
        DEFAULT GETDATE() FOR Times
GO

ALTER TABLE Forum.UsersLogins
    ADD CONSTRAINT DF_LoginTime
        DEFAULT GETDATE() FOR LoginTime
GO

ALTER TABLE Forum.Clues
    ADD CONSTRAINT DF_TopicsCnt
        DEFAULT 0 FOR TopicsCnt
GO

ALTER TABLE Forum.Users
    ADD CONSTRAINT DF_ForumPostsCnt
        DEFAULT 0 FOR ForumPostsCnt
GO

ALTER TABLE Forum.Topics
    ADD CONSTRAINT DF_ViewsCnt
        DEFAULT 0 FOR ViewsCnt
GO


ALTER TABLE Forum.Topics
    ADD CONSTRAINT DF_AnswersCnt
        DEFAULT 0 FOR AnswersCnt
GO

-- checks
ALTER TABLE Forum.Users
    ADD CONSTRAINT CK_EmailAddress CHECK (CHARINDEX('@',EmailAddress) <> 0)
GO

-- test data
-- Test Data

-- Forum.Users
INSERT INTO Forum.Users (EmailAddress, Pass, Firstname, Lastname)
VALUES ('kurt.wallander@gmail.com', 'Pa$$w0rd', 'Kurt', 'Wallander')
INSERT INTO Forum.Users (EmailAddress, Pass, Firstname, Lastname)
VALUES ('james.bond@gmail.com', 'Pa$$w0rd', 'James', 'Bond')
INSERT INTO Forum.Users (EmailAddress, Pass, Firstname, Lastname)
VALUES ('john.smith@gmail.com', 'Pa$$w0rd', 'John', 'Smith')

UPDATE Forum.Users SET RegConfirmTime = GETDATE() WHERE ID = 1
UPDATE Forum.Users SET RegConfirmTime = GETDATE() WHERE ID = 2

SELECT * FROM Forum.Users


-- Forum.Clues

INSERT INTO Forum.Clues (Name, Descript)
VALUES ('SQL Server 2008 - General', 'General questions, comments, or notes about SQL Server 2008.')
INSERT INTO Forum.Clues (Name, Descript)
VALUES ('T-SQL (SS2K8)', 'Questions or comments on the new T-SQL changes in SQL Server 2008.')
INSERT INTO Forum.Clues (Name, Descript)
VALUES ('Security', 'Permissions, Encryptions')
INSERT INTO Forum.Clues (Name, Descript)
VALUES ('SQL Server 2008 Administration', 'Questions about maintaining, configuring, or upgrading an instance to SQL Server 2008.')
INSERT INTO Forum.Clues (Name, Descript)
VALUES ('SQL Server 2008 High Availability', 'Questions on clustering, mirroring, or log shipping for SQL Server 2008')

SELECT * FROM Forum.Clues


-- Forum.Topics
INSERT INTO Forum.Topics (ParentID, TopicSubject, TopicBody, AuthorID, ClueID)
VALUES (NULL, 'ShrinkDatabase doesn''t shrink the data file', 'I am now a bit stumped and would appreciate some helpful advice.', 1, 1)
INSERT INTO Forum.UsersLogins (UserID, IPAddress, HostName) VALUES (1, '192.168.0.1', 'localhost')
INSERT INTO Forum.UserStats (UserID, TopicID) VALUES (1, 1)
-- SELECT * FROM Forum.Topics
INSERT INTO Forum.Topics (ParentID, TopicSubject, TopicBody, AuthorID, ClueID)
VALUES (1, NULL, 'You probably need to rebuild the clustered index on the table (well, after the shrink you definitely need to).', 2, 1)
INSERT INTO Forum.UsersLogins (UserID, IPAddress, HostName) VALUES (2, '192.168.0.2', 'localhost')
INSERT INTO Forum.UserStats (UserID, TopicID) VALUES (2, 1)

INSERT INTO Forum.Topics (ParentID, TopicSubject, TopicBody, AuthorID, ClueID)
VALUES (1, NULL, 'Many thanks for your answer to my question', 1, 1)
INSERT INTO Forum.UserStats (UserID, TopicID) VALUES (1, 1)


-- omitting TopicBody
INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (NULL, 'Restore script not working', 3, 1)

-- what is last identity value?
SELECT @@IDENTITY -- 4

INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (4, NULL, 2, 1)


SELECT * FROM Forum.Topics


-- other questions... (one batch)

-- "Relational design question" + 5 answers
INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (NULL, 'Relational design question', 3, 1)

DECLARE @LastID int = (SELECT @@IDENTITY)

INSERT INTO Forum.UserStats (UserID, TopicID) VALUES (3, @LastID)
INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (@LastID, NULL, 3, 1)
INSERT INTO Forum.UserStats (UserID, TopicID) VALUES (2, @LastID)
INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (@LastID, NULL, 2, 1)
INSERT INTO Forum.UserStats (UserID, TopicID) VALUES (3, @LastID)
INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (@LastID, NULL, 3, 1)
INSERT INTO Forum.UserStats (UserID, TopicID) VALUES (2, @LastID)
INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (@LastID, NULL, 2, 1)

-- "Connections in use?" + 1 answers
INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (NULL, 'Connections in use?', 2, 1)
SELECT @LastID = @@IDENTITY
INSERT INTO Forum.UserStats (UserID, TopicID) VALUES (1, @LastID)
INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (@LastID, NULL, 1, 1)

-- "Connections in use?" + 1 answers
INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (NULL, 'SSIS return nulls', 2, 1)

-- "Read XML file to SQL table" + 2 answers, Clue 2
INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (NULL, 'Read XML file to SQL table', 2, 2)
SELECT @LastID = @@IDENTITY
INSERT INTO Forum.UserStats (UserID, TopicID) VALUES (1, @LastID)
INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (@LastID, NULL, 1, 2)
INSERT INTO Forum.UserStats (UserID, TopicID) VALUES (2, @LastID)
INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (@LastID, NULL, 2, 2)

-- "Run stored proc against selected databases" + 1 answers, Clue 2
INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (NULL, 'Run stored proc against selected databases', 2, 2)
SELECT @LastID = @@IDENTITY
INSERT INTO Forum.UserStats (UserID, TopicID) VALUES (1, @LastID)
INSERT INTO Forum.Topics (ParentID, TopicSubject, AuthorID, ClueID)
VALUES (@LastID, NULL, 1, 2)


SELECT * FROM Forum.Topics

SELECT * FROM Forum.UserStats
SELECT * FROM Forum.UsersLogins
GO

-- views
-- ilość postów w wątkach
CREATE VIEW Forum.vClues
AS
SELECT c.ID, c.Name, c.Descript, COUNT(t.ID) AS TopicsCnt
FROM Forum.Clues AS c
         LEFT OUTER JOIN Forum.Topics AS t ON t.ClueID = c.ID
GROUP BY c.ID, c.Name, c.Descript
GO

SELECT * FROM Forum.vClues
GO


-- wątki (bez odpowiedzi) wraz z danymi autorów
CREATE VIEW Forum.vTopics
AS
SELECT
    t.ID,
    CONVERT(varchar(19), t.CreateTime, 120) AS CreateTime,
    t.TopicSubject,
    t.ClueID,
    t.AuthorID,
    u.Firstname,
    u.Lastname
FROM Forum.Topics AS t
         JOIN Forum.Users AS u ON u.ID = t.AuthorID
WHERE t.ParentID IS NULL
GO

SELECT * FROM Forum.vTopics WHERE ClueID = 1
GO


-- przykład podzapytania
SELECT
    t.ID,
    t.TopicSubject,
    t.AuthorID,
    (SELECT (Firstname + ' ' + Lastname) FROM Forum.Users WHERE ID = t.AuthorID) AS FullName
FROM Forum.Topics AS t
GO


-- wątki, autorzy, liczba, czas i autor ostatniej odpowiedzi
CREATE VIEW Forum.vTopicsExtended
AS
SELECT
    t.ID,
    CONVERT(varchar(19), t.CreateTime, 120) AS CreateTime,
    t.TopicSubject,
    t.ClueID,
    t.AuthorID,
    u.Firstname,
    u.Lastname,
    (SELECT COUNT(*)
     FROM Forum.Topics
     WHERE ParentID = t.ID)	AS RepliesCnt,

    (SELECT TOP 1 CONVERT(varchar(19), CreateTime, 120)
     FROM Forum.Topics
     WHERE ParentID = t.ID
     ORDER BY CreateTime DESC) AS LastReplyTime,

    (SELECT TOP 1 Users.Firstname + ' ' + Users.Lastname
     FROM Forum.Topics
              JOIN Forum.Users
                   ON Users.ID = Topics.AuthorID
     WHERE ParentID = t.ID
     ORDER BY CreateTime DESC) AS LastReplyAuthor

FROM Forum.Topics AS t
         JOIN Forum.Users AS u ON u.ID = t.AuthorID
WHERE t.ParentID IS NULL
GO

SELECT * FROM Forum.vTopicsExtended WHERE ClueID = 1
GO




-- vUsersConfirmedRegistrations
CREATE VIEW Forum.vUsersConfirmedRegistrations
AS
SELECT ID, Firstname, Lastname FROM Forum.Users WHERE RegConfirmTime IS NOT NULL
GO


SELECT * FROM Forum.vUsersConfirmedRegistrations

