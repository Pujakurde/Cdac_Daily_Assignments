--Day 6 Subquery
-- ASSIGNMENT NO 1
--DISPLAY ALL EMPLOYEE WHO EARN MORE THAN SMITH EARNS
SELECT *
FROM EMP 
WHERE SAL >(SELECT SAL 
			FROM EMP
			WHERE ENAME='SMITH');
			
			
+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 3183.25 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 3049.50 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2621.50 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1331.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 | 1149.50 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1573.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+


-- ASSIGNMENT NO 2
--DISPLAY ALL EMPLOYEE WHO EARN MORE THAN MARTIN AND FORD EARN
SELECT *
FROM EMP 
WHERE SAL > ALL(SELECT SAL 
			FROM EMP
			WHERE ENAME IN('MARTIN','FORD'));

+-------+-------+-----------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB       | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+-----------+------+------------+---------+------+--------+
|  7566 | JONES | MANAGER   | 7839 | 1981-04-02 | 3183.25 | NULL |     20 |
|  7698 | BLAKE | MANAGER   | 7839 | 1981-05-01 | 3049.50 | NULL |     30 |
|  7839 | KING  | PRESIDENT | NULL | 1981-11-17 | 5000.00 | NULL |     10 |
+-------+-------+-----------+------+------------+---------+------+--------+


-- ASSIGNMENT NO 3
--DISPLAY ALL EMPLOYEE WHO EARN SAL LESS THAN SCOTT AND MORE THAN ADAMS
SELECT *
FROM EMP
WHERE SAL < (
    SELECT SAL
    FROM EMP
    WHERE ENAME = 'SCOTT'
)
AND SAL > (
    SELECT SAL
    FROM EMP
    WHERE ENAME = 'ADAMS'
);
+-------+--------+----------+------+------------+---------+--------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM   | DEPTNO |
+-------+--------+----------+------+------------+---------+--------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 | 300.00 |     30 |
|  7782 | CLARK  | MANAGER  | 7839 | 1981-06-09 | 2621.50 |   NULL |     10 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |   0.00 |     30 |
|  7934 | MILLER | CLERK    | 7782 | 1982-01-23 | 1573.00 |   NULL |     10 |
+-------+--------+----------+------+------------+---------+--------+--------+

-- ASSIGNMENT NO 4
--DISPLAY ALL EMPLOYEES WITH SAL EITHER > WARD'S SAL OR BLAKE'S SAL
SELECT *
FROM EMP
WHERE SAL > ANY(
    SELECT SAL
    FROM EMP
    WHERE ENAME IN ('WARD','BLAKE' ));
	
	
+-------+--------+-----------+------+------------+---------+--------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM   | DEPTNO |
+-------+--------+-----------+------+------------+---------+--------+--------+
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 | 300.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 3183.25 |   NULL |     20 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 3049.50 |   NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2621.50 |   NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |   NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |   NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |   0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1331.00 |   NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |   NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1573.00 |   NULL |     10 |
+-------+--------+-----------+------+------------+---------+--------+--------+

-- ASSIGNMENT NO 5
--DISPLAY ALL EMPLOYEES WHO EARN MORE THAN AVG SAL OF DEPT 10
SELECT *
FROM EMP
WHERE SAL >(
    SELECT AVG(SAL)
    FROM EMP
    WHERE DEPTNO=10)
	GROUP BY DEPTNO;
	
	
+-------+-------+-----------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB       | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+-----------+------+------------+---------+------+--------+
|  7566 | JONES | MANAGER   | 7839 | 1981-04-02 | 3183.25 | NULL |     20 |
|  7839 | KING  | PRESIDENT | NULL | 1981-11-17 | 5000.00 | NULL |     10 |
+-------+-------+-----------+------+------------+---------+------+--------+

-- ASSIGNMENT NO 6
SELECT *
FROM EMP
WHERE JOB= 'SALESMAN';

+-------+--------+----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+----------+------+------------+---------+---------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
+-------+--------+----------+------+------------+---------+---------+--------+

-- ASSIGNMENT NO 7
CREATE TABLE SALESMAN_DATA(
SID INT PRIMARY KEY,
SNAME VARCHAR(15)UNIQUE NOT NULL,
CITY VARCHAR(15));

CREATE TABLE CATEGORY(
CID INT PRIMARY KEY,
CNAME VARCHAR(15) UNIQUE NOT NULL,
DESCRIPTION VARCHAR(30));

CREATE TABLE PRODUCT(
PID INT PRIMARY KEY,
PNAME VARCHAR(20),
PRICE FLOAT(6,2) DEFAULT 20.00,
QTY INT CHECK (QTY>0),
CID INT,
SID INT,
CONSTRAINT FK_CID FOREIGN KEY(CID) 
REFERENCES CATEGORY(CID) ON DELETE SET NULL,
CONSTRAINT FK_SID FOREIGN KEY(SID)
REFERENCES SALESMAN_DATA(SID));


INSERT INTO CATEGORY 
VALUES
(1,'CHIPS','VERY CRUNCHY'),
(2,'CHOCOLATE','VERY CHOCOLATY'),
(3,'SNACKS','YUMMY'),
(4,'COLD DRINKS','THANDA THANDA COOL COOL');

INSERT INTO Salesman_data(sid,sname,city)
VALUES(11,'Rahul','Pune'),
      (12,'Kirti','Mumbai'),
      (13,'Prasad','Nashik'),
      (14,'Arnav','Amravati');
	  
INSERT INTO Product(pid,pname,price,qty,cid,sid)
VALUES(123,'lays',30,30.00,1,12),
      (111,'pepsi',40,50.00,4,11),
      (134,'nachos',50,50.00,1,12),
      (124,'dairy milk',40,60.00,2,14),
      (125,'pringles',40,60.00,1,14),
      (213,'Sketch pens',56,150.00,null,11),
      (167,'eraser',90,5.00,null,null);
	  
--list all pid,pname,cid,cname	  
SELECT p.pid,p.pname,c.cid,c.CNAME
from product p,CATEGORY c
where p.cid=c.cid and cname= 'CHIPS';

+-----+----------+-----+-------+
| pid | pname    | cid | CNAME |
+-----+----------+-----+-------+
| 123 | lays     |   1 | CHIPS |
| 125 | pringles |   1 | CHIPS |
| 134 | nachos   |   1 | CHIPS |
+-----+----------+-----+-------+

--DISPLAY all salesmen who did not sell any product
SELECT sid,sname
from SALESMAN_DATA
where sid not in(
SELECT sid 
from product 
where sid is not null );

+-----+--------+
| sid | sname  |
+-----+--------+
|  13 | Prasad |
+-----+--------+

SELECT cid,cname
from CATEGORY
where cid not in(
SELECT cid 
from product 
where cid is not null );

+-----+--------+
| cid | cname  |
+-----+--------+
|   3 | SNACKS |
+-----+--------+

SELECT *
from PRODUCT
where cid is null;

+-----+-------------+-------+------+------+------+
| PID | PNAME       | PRICE | QTY  | CID  | SID  |
+-----+-------------+-------+------+------+------+
| 167 | eraser      | 90.00 |    5 | NULL | NULL |
| 213 | Sketch pens | 56.00 |  150 | NULL |   11 |
+-----+-------------+-------+------+------+------+

-- list all salesmen whoe stays in city where names start with p or n
SELECT *
FROM SALESMAN_DATA
WHERE sname LIKE 'P%'
   OR sname LIKE 'N%';
+-----+--------+--------+
| SID | SNAME  | CITY   |
+-----+--------+--------+
|  13 | Prasad | Nashik |
+-----+--------+--------+

ALTER TABLE SALESMAN_DATA
ADD COLUMN CREDIT_LIMIT INT ;

+-----+--------+----------+--------------+
| SID | SNAME  | CITY     | CREDIT_LIMIT |
+-----+--------+----------+--------------+
|  11 | Rahul  | Pune     |         NULL |
|  12 | Kirti  | Mumbai   |         NULL |
|  13 | Prasad | Nashik   |         NULL |
|  14 | Arnav  | Amravati |         NULL |
+-----+--------+----------+--------------+

-- DISPLAY DEPT NO AND DEPT NAMES TO WHICH NO EMPLOYEE IS ASSIGNED
SELECT DEPTNO, DNAME
FROM DEPT
WHERE DEPTNO NOT IN (
    SELECT DEPTNO
    FROM EMP
);


+--------+------------+
| DEPTNO | DNAME      |
+--------+------------+
|     40 | OPERATIONS |
+--------+------------+

-- ASSIGNMENT NO 8
CREATE TABLE faculty (
           fid INT PRIMARY KEY,
           fname VARCHAR(20),
           sp_skill1 VARCHAR(20),
           sp_skill2 VARCHAR(20));
			
INSERT INTO faculty VALUES
		(10,'Amol','Database','Java'),
       (11,'Asha','Java','MySQL'),
       (12,'Kiran','CPP','database'),
      (13,'Seeta','MySQL','database');
	  
CREATE TABLE room(rid INT PRIMARY KEY,
rname VARCHAR(15) NOT NULL,
rloc VARCHAR(20));

INSERT INTO room VALUES
		(100,'Jasmin','1st floor'),
       (101,'Rose','2nd floor'),
       (105,'Lotus','1st floor'),
      (103,'Mogra','1st floor');


CREATE TABLE courses (
           cid INT PRIMARY KEY,
           cname VARCHAR(20) NOT NULL,
           rid INT,
           fid INT,
           FOREIGN KEY(rid) REFERENCES room(rid) ON DELETE SET NULL,
           FOREIGN KEY(fid) REFERENCES faculty(fid) ON DELETE SET NULL
       );

INSERT INTO courses VALUES
       (121, 'DBDA', 100, 10),
       (131, 'DAC', 101, NULL),
       (141, 'DTISS', NULL, NULL),
       (151, 'DOIT', 105, 12);  
	  
-- ASSIGNMENT NO 9
SELECT * 
FROM EMP
WHERE MGR IN ( SELECT EMPNO
				FROM EMP
				WHERE ENAME='BLAKE');
				
+-------+--------+----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+----------+------+------------+---------+---------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7900 | JAMES  | CLERK    | 7698 | 1981-12-03 | 1149.50 |    NULL |     30 |
+-------+--------+----------+------+------------+---------+---------+--------+

