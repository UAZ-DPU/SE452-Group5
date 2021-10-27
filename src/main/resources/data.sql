INSERT INTO member (memberID, fName, lName) VALUES
    (101, 'John', 'Smith', 'pass1234'),
    (102, 'Jane', 'Doe', 'pass1235'),
    (103, 'Max', 'Adams', 'pass1236'),
    (104, 'Josh', 'Williams', 'pass1237'),
    (105, 'Jack', 'Brown', 'pass1238');

INSERT INTO booksCheckedOut (memberID, numCheckedOut) VALUES
    (101, 2),
    (102, 1),
    (103, 1),
    (104, 0),
    (105, 2);

INSERT INTO usernameEmployee (employeeID, username) VALUES
    (1001, 'pmarkow'),
    (1002, 'elaine12'),
    (1003, 'hmakas'),
    (1004, 'aleos5'),
    (1005, 'lasef');

INSERT INTO booksAvailable (bookID, numAvailable) VALUES
    ('000000001', 5),
    ('000000002', 32),
    ('000000003', 2),
    ('000000004', 0);

INSERT INTO magazinesAvailable (magazineID, numAvailable) VALUES
    ('M00000001', 6),
    ('M00000002', 22),
    ('M00000003', 7),
    ('M00000004', 0);
