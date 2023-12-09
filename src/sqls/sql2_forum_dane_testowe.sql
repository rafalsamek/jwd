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


--SELECT * FROM Forum.Topics

--SELECT * FROM Forum.UserStats
--SELECT * FROM Forum.UsersLogins

