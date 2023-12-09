-- ilo�� post�w w w�tkach
CREATE VIEW Forum.vClues
AS
SELECT c.ID, c.Name, c.Descript, COUNT(t.ID) AS TopicsCnt
FROM Forum.Clues AS c 
LEFT OUTER JOIN Forum.Topics AS t ON t.ClueID = c.ID
GROUP BY c.ID, c.Name, c.Descript
GO

SELECT * FROM Forum.vClues
GO


-- w�tki (bez odpowiedzi) wraz z danymi autor�w
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


-- przyk�ad podzapytania
SELECT
	t.ID,
	t.TopicSubject,
	t.AuthorID,
	(SELECT (Firstname + ' ' + Lastname) FROM Forum.Users WHERE ID = t.AuthorID) AS FullName
FROM Forum.Topics AS t
GO


-- w�tki, autorzy, liczba, czas i autor ostatniej odpowiedzi
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