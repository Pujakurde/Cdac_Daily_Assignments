CREATE TABLE employee(EMPNO INT ,
ENAME varchar(10),
BASIC DECIMAL(8, 2),
INCENTIVE DECIMAL(6,2));

INSERT INTO employee
VALUES
(1,'Rajesh',20000,1500),
(2,'Sarita',25000,1000),
(3,'Meera',15000,3000),
(4,'Jitesh',30000,500),
(5,'Ramesh',12000,3000);

SELECT * 
FROM EMPLOYEE;

--update
UPDATE EMPLOYEE
SET INCENTIVE=1000
WHERE ENAME='Jitesh';


SELECT * FROM EMPLOYEE WHERE ENAME='Jitesh';
+-------+--------+----------+-----------+
| EMPNO | ENAME  | BASIC    | INCENTIVE |
+-------+--------+----------+-----------+
|     4 | Jitesh | 30000.00 |   1000.00 |
+-------+--------+----------+-----------+


