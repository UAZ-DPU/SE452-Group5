DROP TABLE IF EXISTS member;
DROP TABLE IF EXISTS booksCheckedOut;
DROP TABLE IF EXISTS usernameEmployee;


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