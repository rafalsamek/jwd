-- https://java.mmiklas.wszib.edu.pl/dodatki/lab-sql2.html

USE rsamek

DROP SCHEMA IF EXISTS Forum
GO

CREATE SCHEMA Forum
GO

DROP TABLE IF EXISTS Topics
GO

CREATE TABLE Topics (
    TopicID int IDENTITY,
)
GO

DROP TABLE IF EXISTS Clues
GO

CREATE TABLE Clues (

)
GO

DROP TABLE IF EXISTS Users
GO

CREATE TABLE Users (

)
GO

DROP TABLE IF EXISTS UsersLogins
GO

CREATE TABLE UsersLogins (

)
GO

DROP TABLE IF EXISTS UserStats
GO

CREATE TABLE UserStats (

)
GO

