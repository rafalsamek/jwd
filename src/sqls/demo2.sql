-- wyświetl "aktywną" bazę danych
select DB_NAME();
 
-- przełącz się na bazę danych
use rsamek;
 
-- Przykład tworzenia i usuwania bazy danych (jeżeli mamy uprawnienia)
----------------------------------------------------------------------
CREATE DATABASE NewDatabase
 
ALTER DATABASE NewDatabase SET  READ_ONLY WITH NO_WAIT
GO
 
USE master
DROP DATABASE NewDatabase
 
 
CREATE DATABASE NewDatabase
 
SELECT * FROM Customers
 
-- Tworzenie i modyfikowanie tabeli
---------------------------------------
USE NewDatabase
 
CREATE TABLE Customers (
  ID int PRIMARY KEY,
  Firstname nvarchar(50) NOT NULL,
  Lastname nvarchar(50) NOT NULL,
  BirthDate date NOT NULL
)
 
-- usunięcie tabeli
DROP TABLE Customers
 
 
CREATE TABLE Customers (
  ID int PRIMARY KEY,
  Firstname nvarchar(50),
  Lastname nvarchar(50),
  WrongColumnName date
)
 
SELECT * FROM Customers
 
-- modyfikowanie tabeli - usunięcie kolumny
ALTER TABLE Customers
DROP COLUMN WrongColumnName
 
 
SELECT * FROM Customers
 
-- modyfikowanie tabeli - dodanie kolumny
ALTER TABLE Customers ADD BirthDate date
 
SELECT * FROM Customers

 
CREATE TABLE Orders (
  OrderID int PRIMARY KEY,
  OrderDate datetime,
  CustomerID int
)
 
 
-- wstawianie danych do tabeli Customers
INSERT INTO Customers (ID, Firstname, Lastname, BirthDate)
VALUES (1, 'John', 'Smith', '19800105')
 
INSERT INTO Customers (ID, Firstname, Lastname, BirthDate)
VALUES (2, 'Kurt', 'Wallander', '19480105')
 
-- nie można wstawić duplikatu klucza głównego
INSERT INTO Customers (ID, Firstname, Lastname, BirthDate)
VALUES (2, 'James', 'Bond', '19680413')
 
INSERT INTO Customers (ID, Firstname, Lastname, BirthDate)
VALUES (3, 'James', 'Bond', '19680413')
 
SELECT * FROM Customers
 
-- usunięcie wszystkich wierszy z tabeli Customers
DELETE FROM Customers
 
 
 
 
-- właściwość Nullability
---------------------------------------
/*
 PK nie może zawierać wartości NULL
 dla pozostałych kolumn możemy określić nullability
*/
CREATE TABLE Test (
 ID int PRIMARY KEY, -- nie może być null
 Col2_NULL int NULL,
 Col3_NOTNULL int NOT NULL
)
 
INSERT INTO Test (ID, Col2_NULL, Col3_NOTNULL)
VALUES (1, 22, 33) -- wszystkie 3 kolumny
 
INSERT INTO Test (ID, Col2_NULL, Col3_NOTNULL)
VALUES (2, NULL, 33) -- podajemy jawnie null dla 2 kolumny
 
INSERT INTO Test (ID, Col3_NOTNULL)
VALUES (3, 33) -- nie podajemy wartości 2 kolumny, null zostanie wstawione niejawnie
 
SELECT * FROM Test
 
-- 3 kolumna nie może zawierać wartości null
INSERT INTO Test (ID, Col2_NULL, Col3_NOTNULL)
VALUES (4, 22, NULL) -- niepowodzenie, próba jawnego wstawienia null do 3 kolumny
 
-- niepowodzenie, pominięcie wartości dla 3 kolumny, czyli próba niejawnego wstawienia wartości null
INSERT INTO Test (ID, Col2_NULL)
VALUES (5, 22)
 
SELECT * FROM Test
 
DROP TABLE Test
 
 
 
-- Przestrzenie (schemas)
---------------------------------------
 
-- usunięcie tabeli dbo.Customers
DROP TABLE dbo.Customers
 
-- sukces ponieważ tabela Orders znajduje się w domyślnym schemacie dbo
DROP TABLE Orders
GO
 
CREATE SCHEMA SqlLearner
GO
 
CREATE TABLE SqlLearner.Customers (
  ID int PRIMARY KEY,
  Firstname nvarchar(50),
  Lastname nvarchar(50),
  BirthDate date
)
 
CREATE TABLE SqlLearner.Orders (
  OrderID int PRIMARY KEY,
  OrderDate datetime,
  CustomerID int
)

-- próba usunięcia utworzonych tabel
 
DROP TABLE SqlLearner.Customers
 
-- niepowodzenie, ponieważ tabela Orders jest w przestrzeni SqlLearner
DROP TABLE Orders
 
-- sukces
DROP TABLE SqlLearner.Orders

DROP SCHEMA SqlLearner
GO
 
-- Identities
---------------------------------------
-- DROP TABLE Customers
 
CREATE TABLE Customers (
  ID int IDENTITY PRIMARY KEY,
  Firstname nvarchar(50),
  Lastname nvarchar(50),
  BirthDate date
)
 
 
-- niepowodzenie
-- nie możemy podać jawnie wartości kolumny ID
INSERT INTO Customers (ID, Firstname, Lastname, BirthDate)
VALUES (1, 'John', 'Smith', '19800105')
 
-- sukces
INSERT INTO Customers (Firstname, Lastname, BirthDate)
VALUES ('John', 'Smith', '19800105')
 
INSERT INTO Customers (Firstname, Lastname, BirthDate)
VALUES ('Kurt', 'Wallander', '19480105')
 
SELECT * FROM Customers
 
-- po usunięciu wartości identity nie są ponownie użyte
DELETE FROM Customers WHERE ID = 2
 
INSERT INTO Customers (Firstname, Lastname, BirthDate)
VALUES ('James', 'Bond', '19680413')
 
SELECT * FROM Customers
 
 
 
 
-- Klucze obce (foreign keys)
---------------------------------------
-- DROP TABLE Customers
-- DROP TABLE Orders
 
-- klucze obce nie są wymagane do łączenia tabel
-- pomagają jednak egzekwować integralność referencyjną
 
-- przykład nr 1 - bez kluczy obcych
CREATE TABLE Customers (
  ID int IDENTITY PRIMARY KEY,
  Firstname nvarchar(50),
  Lastname nvarchar(50),
  BirthDate date
)
 
CREATE TABLE Orders (
  OrderID int IDENTITY PRIMARY KEY,
  OrderDate datetime,
  CustomerID int
)
 
INSERT INTO Customers (Firstname, Lastname, BirthDate)
VALUES ('John', 'Smith', '19800105')
INSERT INTO Customers (Firstname, Lastname, BirthDate)
VALUES ('Kurt', 'Wallander', '19480105')
INSERT INTO Customers (Firstname, Lastname, BirthDate)
VALUES ('James', 'Bond', '19680413')
 
 
SELECT * FROM Customers
 
 
-- nowe zamówienie z jawnie określoną datą zamówienia orderDate dla klienta o id 1
INSERT INTO Orders (OrderDate, CustomerID)
VALUES ('20111115 12:20:45', 1)
 
-- nowe zamówienie z bieżącą datą zamówienia orderDate dla klienta o id 2
INSERT INTO Orders (OrderDate, CustomerID)
VALUES (GETDATE(), 2)
 
SELECT * FROM Orders
 
-- nowe zamówienie z bieżącą datą zamówienia orderDate dla nieistniejącego klienta
-- naruszona integralność referencyjna (niespójne dane)
-- zapytanie zakończone powodzeniem
INSERT INTO Orders (OrderDate, CustomerID)
VALUES (GETDATE(), 10)
 
 
-- przykład nr 2 - z kluczem obcym
DROP TABLE Orders
 
CREATE TABLE Orders (
  OrderID int IDENTITY PRIMARY KEY,
  OrderDate datetime,
  CustomerID int REFERENCES Customers(ID)
)
 
 
INSERT INTO Orders (OrderDate, CustomerID)
VALUES ('20111115 12:20:45', 1)
INSERT INTO Orders (OrderDate, CustomerID)
VALUES (GETDATE(), 2)
 
-- nowe zamówienie z bieżącą datą zamówienia orderDate dla nieistniejącego klienta
-- naruszona integralność referencyjna
-- zapytanie zakończone niepowodzeniem (i to jest ok, bo chroni nasze dane)
INSERT INTO Orders (OrderDate, CustomerID)
VALUES (GETDATE(), 10)
 
SELECT * FROM Orders
 
-- drugi sposób definiowania kluczy
-- nazwanie ograniczeń zwiększa czytelność
 
DROP TABLE Orders
 
CREATE TABLE Orders (
  OrderID int IDENTITY,
  OrderDate datetime,
  CustomerID int
)
 
ALTER TABLE Orders
ADD CONSTRAINT FK_Orders_Customers_ID FOREIGN KEY(CustomerID)
REFERENCES Customers (ID)
GO
 
ALTER TABLE Orders DROP CONSTRAINT FK_Orders_Customers_ID
GO
 
SELECT * FROM Orders
 
/*
WITH CHECK jest opcją domyślną, SQL Server sprawdza, czy
dane, które już istnieją w tabeli Orders są prawidłowe.
Możemy również użyć WITH NOCHECK - SQL Server nie będzie weryfikował
istniejących wierszy i sprawdzi tylko wiersze,
które w przyszłości zostaną wstawione lub zaktualizowane.
*/

ALTER TABLE Orders WITH CHECK -- wartość domyślna
ADD CONSTRAINT PK_Orders PRIMARY KEY (OrderID)
GO
 
INSERT INTO Orders (OrderDate, CustomerID)
VALUES (GETDATE(), 10)
 
ALTER TABLE Orders  WITH NOCHECK -- !
ADD CONSTRAINT FK_Orders_Customers_ID FOREIGN KEY(CustomerID)
REFERENCES Customers (ID)
GO
 
SELECT * FROM Orders

-- uruchomienie samej weryfikacji 
-- dziwna składnia... niepowodzenie z powodu niespójnych danych
ALTER TABLE Orders WITH CHECK CHECK CONSTRAINT FK_Orders_Customers_ID
 
-- usunięcie wszystkich wierszy...
DELETE FROM Orders
 
-- dziwna składnia...
-- sukces
ALTER TABLE Orders WITH CHECK CHECK CONSTRAINT FK_Orders_Customers_ID
 
 
 
 
 
-- Opcja CASCADE
 
 
-- wstawienie testowych danych
INSERT INTO Orders (OrderDate, CustomerID)
VALUES (GETDATE(), 1)
INSERT INTO Orders (OrderDate, CustomerID)
VALUES (GETDATE(), 2)
INSERT INTO Orders (OrderDate, CustomerID)
VALUES (GETDATE(), 2)
INSERT INTO Orders (OrderDate, CustomerID)
VALUES (GETDATE(), 2)
INSERT INTO Orders (OrderDate, CustomerID)
VALUES (GETDATE(), 3)
INSERT INTO Orders (OrderDate, CustomerID)
VALUES (GETDATE(), 3)
 
SELECT * FROM Orders
SELECT * FROM Customers
 
-- niepowodzenie ze względu na więzy integralności
-- nie możemy usunąć klienta posiadającego zamówienie
DELETE FROM Customers WHERE ID = 1
 
-- możemy zmienić to zachowanie poprzez opcję CASCADE
/*
[ ON DELETE { NO ACTION | CASCADE | SET NULL | SET DEFAULT } ]
[ ON UPDATE { NO ACTION | CASCADE | SET NULL | SET DEFAULT } ]
 
NO ACTION
 Opcja domyślna jeśli nie zdefiniowano ON DELETE lub ON UPDATE.
ON DELETE NO ACTION
 Określa, że ​​jeśli zostanie podjęta próba usunięcia wiersza
 do którego odwołują się klucze obce w innych tabelach,
 zgłaszany jest błąd i instrukcja DELETE jest wycofywana.
ON UPDATE NO ACTION
 Określa, że ​​jeśli zostanie podjęta próba zaktualizowania wartości klucza
 w wierszu, do którego odwołują się istniejące klucze obce
 w innych tabelach, zgłaszany jest błąd i instrukcja UPDATE jest wycofywana.
*/
 
-- ON UPDATE CASCADE
ALTER TABLE Orders DROP CONSTRAINT FK_Orders_Customers_ID
 
ALTER TABLE Orders 
ADD CONSTRAINT FK_Orders_Customers_ID FOREIGN KEY(CustomerID)
REFERENCES Customers ([ID])
 ON DELETE CASCADE
 ON UPDATE CASCADE
GO
 
 
 
SELECT * FROM Orders
SELECT * FROM Customers
 
SELECT '__ DELETE operation __ ON DELETE CASCADE' AS [ACTION]
DELETE FROM Customers WHERE ID = 1
 
SELECT * FROM Orders
SELECT * FROM Customers
 
 
 
-- ON UPDATE SET NULL
ALTER TABLE Orders DROP CONSTRAINT FK_Orders_Customers_ID
 
ALTER TABLE Orders 
ADD CONSTRAINT FK_Orders_Customers_ID FOREIGN KEY(CustomerID)
REFERENCES Customers ([ID])
 ON DELETE SET NULL
 ON UPDATE SET NULL
GO
 
 
SELECT * FROM Orders
SELECT * FROM Customers
 
SELECT '__ DELETE operation __ ON DELETE SET NULL' AS ACTION
DELETE FROM Customers WHERE ID = 2
 
SELECT * FROM Orders
SELECT * FROM Customers
 
 
 
---------------------------------------
---------------------------------------
-- Wartości domyślne (defaults)
---------------------------------------
DROP TABLE Orders
DROP TABLE Customers
 
CREATE TABLE Customers (
  ID int IDENTITY,
  Firstname nvarchar(50),
  Lastname nvarchar(50),
  BirthDate date
)
 
ALTER TABLE Customers
ADD CONSTRAINT PK_Customers PRIMARY KEY (ID)
GO
 
INSERT INTO Customers (Firstname, Lastname, BirthDate)
VALUES ('John', 'Smith', '19800105')
INSERT INTO Customers (Firstname, Lastname, BirthDate)
VALUES ('Kurt', 'Wallander', '19480105')
INSERT INTO Customers (Firstname, Lastname, BirthDate)
VALUES ('James', 'Bond', '19680413')
 
 
SELECT * FROM Customers
 
CREATE TABLE Orders (
  OrderID int IDENTITY,
  OrderDate datetime DEFAULT GETDATE(),
  CustomerID int
)
 
ALTER TABLE Orders
ADD CONSTRAINT PK_Orders PRIMARY KEY (OrderID)
GO
 
ALTER TABLE Orders
ADD CONSTRAINT FK_Orders_Customers_ID FOREIGN KEY(CustomerID)
REFERENCES Customers (ID)
GO
 
-- możemy jawnie podać wartość dla kolumny z zadeklarowaną wartością domyślną
INSERT INTO Orders (OrderDate, CustomerID) VALUES ('20110812', 1)
SELECT * FROM Orders
 
-- jeżeli pominiemy kolumnę z zadeklarowaną wartością domyślną sql server wstawi za nas odpowiednią wartość
INSERT INTO Orders (CustomerID) VALUES (2)
SELECT * FROM Orders
 
-- ten sam rezultat...
INSERT INTO Orders (OrderDate, CustomerID) VALUES (DEFAULT, 2)
SELECT * FROM Orders
 
 
-- drugi sposób definiowania wartości domyślnych
-- nazwanie ograniczeń zwiększa czytelność
 
DROP TABLE Orders
 
CREATE TABLE Orders (
  OrderID int IDENTITY,
  OrderDate datetime,
  CustomerID int
)
 
ALTER TABLE Orders
ADD CONSTRAINT DF_OrderDate
DEFAULT GETDATE() FOR OrderDate
 
ALTER TABLE Orders
ADD CONSTRAINT PK_Orders PRIMARY KEY (OrderID)
GO
 
ALTER TABLE Orders
ADD CONSTRAINT FK_Orders_Customers_ID FOREIGN KEY(CustomerID)
REFERENCES Customers (ID)
GO
 
 
-- dane testowe
INSERT INTO Orders (CustomerID) VALUES (1)
INSERT INTO Orders (CustomerID) VALUES (1)
INSERT INTO Orders (CustomerID) VALUES (2)
INSERT INTO Orders (CustomerID) VALUES (3)
 
DELETE FROM Orders
 
-- jak dodać więcej niż jedną wartość w jednym zapytaniu
INSERT INTO Orders (CustomerID) VALUES (1), (1), (2), (3)
 
SELECT * FROM Customers
SELECT * FROM Orders
 
 
---------------------------------------
---------------------------------------
-- Klauzula sprawdzająca check
---------------------------------------
 
-- DROP TABLE Orders
-- DROP TABLE Customers
 
CREATE TABLE Customers (
  ID int IDENTITY,
  Firstname nvarchar(50),
  Lastname nvarchar(50),
  BirthDate date
)
 
ALTER TABLE Customers
ADD CONSTRAINT PK_Customers PRIMARY KEY (ID)
GO
 
-- wstawienie wiersza z niepoprawną datą urodzenia (przyszła data)
-- sukces
INSERT INTO Customers (Firstname, Lastname, BirthDate)
VALUES ('John', 'Smith', '20290105')
 
SELECT * FROM Customers
 
-- pomaga klauzula CHECK...
 
-- niepowodzenie
ALTER TABLE Customers -- WITH NOCHECK
ADD CONSTRAINT CK_BirthDate CHECK (BirthDate < GETDATE())
 
-- usuwamy niepoprawne dane
DELETE FROM Customers
 
-- (powtórnie) sukces
ALTER TABLE Customers
ADD CONSTRAINT CK_BirthDate CHECK (BirthDate < GETDATE())
 
-- (powtórnie) wstawienie wiersza z niepoprawną datą urodzenia (przyszła data))
-- niepowodzenie
INSERT INTO Customers (Firstname, Lastname, BirthDate)
VALUES ('John', 'Smith', '20290105')
 
-- sukces
INSERT INTO Customers (Firstname, Lastname, BirthDate)
VALUES ('John', 'Smith', '19800105')
 
 
-- jak usunąć ograniczenie z klauzulą CHECK? 
 ALTER TABLE Customers DROP CONSTRAINT CK_BirthDate
GO
 
CREATE TABLE Orders (
  OrderID int IDENTITY,
  OrderDate datetime,
  CustomerID int
)
GO
 
---------------------------------------
---------------------------------------
-- Widoki (views)
---------------------------------------
 
CREATE VIEW vNamesOfCustomers
AS
SELECT c.Firstname, c.Lastname
FROM Customers AS c
 
 
SELECT * FROM vNamesOfCustomers
 
 
CREATE VIEW vOrders
AS
SELECT o.OrderID, o.OrderDate, o.CustomerID, c.Firstname, c.Lastname
FROM Customers AS c
JOIN Orders AS o ON o.CustomerID = c.ID
GO
 
SELECT * FROM vOrders
GO
 
ALTER VIEW vOrders
AS
SELECT o.OrderID, o.OrderDate, o.CustomerID, c.Firstname + ' ' + c.Lastname AS FullName
FROM Customers AS c
JOIN Orders AS o ON o.CustomerID = c.ID
GO
 
SELECT * FROM vOrders
GO
 
DROP VIEW vOrders
GO
 
 
CREATE VIEW vNoOfOrders
AS
SELECT c.ID, c.Firstname, c.Lastname, COUNT(*) AS NoOfOrders
FROM Customers AS c
JOIN Orders AS o ON o.CustomerID = c.ID
GROUP BY c.ID, c.Firstname, c.Lastname
GO
 
SELECT * FROM vNoOfOrders ORDER BY NoOfOrders DESC