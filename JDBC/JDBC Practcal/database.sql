CREATE TABLE student(
id INT PRIMARY KEY,
fname VARCHAR(50),
lname VARCHAR(50)
);

DELIMITER //
CREATE PROCEDURE getFullName(IN sid INT, OUT fullname VARCHAR(100))
BEGIN
SELECT CONCAT(fname,' ',lname) INTO fullname FROM student WHERE id=sid;
END //
DELIMITER ;
