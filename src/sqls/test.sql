USE rsamek;
GO;

ALTER TABLE test.Users DROP CONSTRAINT IF EXISTS FK_Users_UserRoles_ID;
GO;


ALTER TABLE test.Users DROP CONSTRAINT IF EXISTS FK_Users_UserCountries_ID;
GO;

DROP TABLE IF EXISTS test.UserRoles;
DROP TABLE IF EXISTS test.UserCountries;
DROP TABLE IF EXISTS test.Users;
DROP SCHEMA IF EXISTS test;
GO;

CREATE SCHEMA test;
GO;

-- DROP TABLE IF exists nokeytable;
-- GO;
--
-- CREATE TABLE nokeytable
-- (
--     ID INT
-- );
--
-- INSERT INTO nokeytable (ID) VALUES (NULL);
--
-- SELECT * FROM nokeytable;
--
-- DROP TABLE nokeytable;
-- GO;

CREATE TABLE test.Users
(
    ID INT IDENTITY PRIMARY KEY,
    UserRoleID INT NOT NULL,
    UserCountryID VARCHAR(3) NULL DEFAULT 'PL',
    Name VARCHAR(100)
);

CREATE TABLE test.UserRoles
(
    ID INT IDENTITY PRIMARY KEY,
    Name VARCHAR(100)
);
GO;

CREATE TABLE test.UserCountries
(
    ID VARCHAR(3) PRIMARY KEY,
    Name VARCHAR(30) NOT NULL
);
GO;

ALTER TABLE test.Users
    ADD CONSTRAINT FK_Users_UserRoles_ID FOREIGN KEY (UserRoleID)
        REFERENCES test.UserRoles;
GO;


ALTER TABLE test.Users
    ADD CONSTRAINT FK_Users_UserCountries_ID FOREIGN KEY (UserCountryID)
        REFERENCES test.UserCountries
        ON DELETE SET DEFAULT
        ON UPDATE SET NULL;
GO;

INSERT INTO test.UserRoles (Name)
VALUES
    ('Guest'),
    ('Employee'),
    ('Director'),
    ('Administrator');

INSERT INTO test.UserCountries (ID, Name)
VALUES
    ('PL', 'Poland'),
    ('GB', 'Great Britain'),
    ('DE', 'Germany');



INSERT INTO test.Users (Name, UserRoleID, UserCountryID)
VALUES  ('Ewa', 2, 'PL'),
        ('Renata', 3, 'DE'),
        ('Marcin', 4, 'PL'),
        ('Rafał', 1, 'GB');
GO;

--
UPDATE test.UserCountries SET ID = 'GBP' WHERE ID = 'GB';
--
DELETE FROM test.UserCountries WHERE ID = 'DE';