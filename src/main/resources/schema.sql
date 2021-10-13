DROP TABLE IF EXISTS member;
DROP TABLE IF EXISTS booksCheckedOut;
DROP TABLE IF EXISTS usernameEmployee;
DROP TABLE IF EXISTS booksAvailable;
DROP TABLE IF EXISTS magazinesAvailable;

CREATE TABLE member
(
  memberID    number(3),
  fName       varchar(30),
  lName       varchar(30),
  primary key (memberID)
);

CREATE TABLE booksCheckedOut
(
  memberID      number(3),
  numCheckedOut number(1),
  primary key   (memberID)
);

CREATE TABLE usernameEmployee
(
  employeeID    number(4),
  username      varchar(10),
  primary key   (employeeID)
);

CREATE TABLE booksAvailable
(
  bookID        varchar(25),
  numAvailable  number(4),
  primary key   (bookID)
);

CREATE TABLE magazinesAvailable
(
  magazineID    varchar(25),
  numAvailable  number(4),
  primary key   (magazineID)
);