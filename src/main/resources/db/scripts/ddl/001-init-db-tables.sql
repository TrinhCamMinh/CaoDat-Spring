-- Bảng AccountMember
CREATE TABLE AccountMember
(
    MemberID       INT PRIMARY KEY,
    MemberPassword VARCHAR(255) NOT NULL,
    FullName       VARCHAR(100),
    EmailAddress   VARCHAR(100),
    MemberRole     VARCHAR(50)
);

-- Bảng Categories
CREATE TABLE Categories
(
    CategoryID   INT PRIMARY KEY,
    CategoryName VARCHAR(100) NOT NULL
);

-- Bảng Products
CREATE TABLE Products
(
    ProductID    INT PRIMARY KEY,
    ProductName  VARCHAR(100) NOT NULL,
    CategoryID   INT,
    UnitsInStock INT,
    UnitPrice    DECIMAL(10, 2),
    FOREIGN KEY (CategoryID) REFERENCES Categories (CategoryID)
);
