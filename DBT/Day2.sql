CREATE DATABASE DAY2;
USE DAY2;
CREATE TABLE EMP
       (EMPNO INT ,
        ENAME varchar(10),
        JOB varchar(9),
        MGR INT ,
        HIREDATE DATE,
        SAL DECIMAL(7, 2),
        COMM DECIMAL(7, 2),
        DEPTNO INT );

INSERT INTO EMP VALUES
        (7369, 'SMITH',  'CLERK',     7902,
        STR_TO_DATE('17-DEC-1980', '%d-%b-%Y'),  800, NULL, 20);
INSERT INTO EMP VALUES
        (7499, 'ALLEN',  'SALESMAN',  7698,
        STR_TO_DATE('20-FEB-1981', '%d-%b-%Y'), 1600,  300, 30);
INSERT INTO EMP VALUES
        (7521, 'WARD',   'SALESMAN',  7698,
        STR_TO_DATE('22-FEB-1981', '%d-%b-%Y'), 1250,  500, 30);
INSERT INTO EMP VALUES
        (7566, 'JONES',  'MANAGER',   7839,
        STR_TO_DATE('2-APR-1981', '%d-%b-%Y'),  2975, NULL, 20);
INSERT INTO EMP VALUES
        (7654, 'MARTIN', 'SALESMAN',  7698,
        STR_TO_DATE('28-SEP-1981', '%d-%b-%Y'), 1250, 1400, 30);
INSERT INTO EMP VALUES
        (7698, 'BLAKE',  'MANAGER',   7839,
        STR_TO_DATE('1-MAY-1981', '%d-%b-%Y'),  2850, NULL, 30);
INSERT INTO EMP VALUES
        (7782, 'CLARK',  'MANAGER',   7839,
        STR_TO_DATE('9-JUN-1981', '%d-%b-%Y'),  2450, NULL, 10);
INSERT INTO EMP VALUES
        (7788, 'SCOTT',  'ANALYST',   7566,
        STR_TO_DATE('09-DEC-1982', '%d-%b-%Y'), 3000, NULL, 20);
INSERT INTO EMP VALUES
        (7839, 'KING',   'PRESIDENT', NULL,
        STR_TO_DATE('17-NOV-1981', '%d-%b-%Y'), 5000, NULL, 10);
INSERT INTO EMP VALUES
        (7844, 'TURNER', 'SALESMAN',  7698,
        STR_TO_DATE('8-SEP-1981', '%d-%b-%Y'),  1500,    0, 30);
INSERT INTO EMP VALUES
        (7876, 'ADAMS',  'CLERK',     7788,
        STR_TO_DATE('12-JAN-1983', '%d-%b-%Y'), 1100, NULL, 20);
INSERT INTO EMP VALUES
        (7900, 'JAMES',  'CLERK',     7698,
        STR_TO_DATE('3-DEC-1981', '%d-%b-%Y'),   950, NULL, 30);
INSERT INTO EMP VALUES
        (7902, 'FORD',   'ANALYST',   7566,
        STR_TO_DATE('3-DEC-1981', '%d-%b-%Y'),  3000, NULL, 20);
INSERT INTO EMP VALUES
        (7934, 'MILLER', 'CLERK',     7782,
        STR_TO_DATE('23-JAN-1982', '%d-%b-%Y'), 1300, NULL, 10);

CREATE TABLE DEPT
       (DEPTNO INT, 
        DNAME varchar(14),
        LOC varchar(13)
       );

INSERT INTO DEPT VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT VALUES (20, 'RESEARCH',   'DALLAS');
INSERT INTO DEPT VALUES (30, 'SALES',      'CHICAGO');
INSERT INTO DEPT VALUES (40, 'OPERATIONS', 'BOSTON');

CREATE TABLE BONUS
        (ENAME varchar(10),
         JOB   varchar(9),
         SAL   INT,
         COMM  INT);

CREATE TABLE SALGRADE
        (GRADE INT,
         LOSAL INT,
         HISAL INT);

INSERT INTO SALGRADE VALUES (1,  700, 1200);
INSERT INTO SALGRADE VALUES (2, 1201, 1400);
INSERT INTO SALGRADE VALUES (3, 1401, 2000);
INSERT INTO SALGRADE VALUES (4, 2001, 3000);
INSERT INTO SALGRADE VALUES (5, 3001, 9999);


-- ASSIGNMENT NO 1
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

INSERT INTO employee
VALUES
(20,'Ajay',16000,NULL);

SELECT * FROM EMPLOYEE;
+-------+--------+----------+-----------+
| EMPNO | ENAME  | BASIC    | INCENTIVE |
+-------+--------+----------+-----------+
|     1 | Rajesh | 20000.00 |   1500.00 |
|     2 | Sarita | 25000.00 |   1000.00 |
|     3 | Meera  | 15000.00 |   3000.00 |
|     4 | Jitesh | 30000.00 |    500.00 |
|     5 | Ramesh | 12000.00 |   3000.00 |
|    20 | Ajay   | 16000.00 |      NULL |
+-------+--------+----------+-----------+



-- ASSIGNMENT no 2
UPDATE employee
SET BASIC = BASIC * 1.05
WHERE BASIC <20000;

SELECT * FROM EMPLOYEE;
+-------+--------+----------+-----------+
| EMPNO | ENAME  | BASIC    | INCENTIVE |
+-------+--------+----------+-----------+
|     1 | Rajesh | 20000.00 |   1500.00 |
|     2 | Sarita | 25000.00 |   1000.00 |
|     3 | Meera  | 15750.00 |   3000.00 |
|     4 | Jitesh | 30000.00 |    500.00 |
|     5 | Ramesh | 12600.00 |   3000.00 |
|    20 | Ajay   | 16800.00 |      NULL |
+-------+--------+----------+-----------+


-- ASSIGNMENT no 3 COPY OF CUSTOMER AND SALESMAN

use day1;

CREATE table customer1
as 
SELECT * 
FROM customer;

select * from customer1;
+--------+--------+----------+
| custid | cname  | location |
+--------+--------+----------+
|      1 | Nilima | Pimpri   |
|      2 | Ganesh | Pune     |
|      3 | Kishor | Kothrud  |
|      4 | Priya  | Aundh    |
|      5 | Geeta  | Pimpri   |
|      6 | Raj    | Aundh    |
|      7 | Yash   | Aundh    |
+--------+--------+----------+
7 rows in set (0.00 sec)

select * from customer;
+--------+--------+----------+
| custid | cname  | location |
+--------+--------+----------+
|      1 | Nilima | Pimpri   |
|      2 | Ganesh | Pune     |
|      3 | Kishor | Kothrud  |
|      4 | Priya  | Aundh    |
|      5 | Geeta  | Pimpri   |
|      6 | Raj    | Aundh    |
|      7 | Yash   | Aundh    |
+--------+--------+----------+
7 rows in set (0.00 sec)


CREATE table Salesman1
as 
SELECT * 
FROM Salesman;

select * from Salesman;
+------+----------+--------+------------+
| sid  | sname    | city   | experience |
+------+----------+--------+------------+
|   10 | Rajesh   | Mumbai |        5.0 |
|   11 | Seema    | Pune   |        8.0 |
|   12 | Shailesh | Nagpur |        7.0 |
|    4 | Rakhi    | Pune   |        2.0 |
+------+----------+--------+------------+


select * from Salesman1;
+------+----------+--------+------------+
| sid  | sname    | city   | experience |
+------+----------+--------+------------+
|   10 | Rajesh   | Mumbai |        5.0 |
|   11 | Seema    | Pune   |        8.0 |
|   12 | Shailesh | Nagpur |        7.0 |
|    4 | Rakhi    | Pune   |        2.0 |
+------+----------+--------+------------+



--ASSIGNMENT no 4
SELECT * 
FROM EMP 
WHERE SAL>2000 OR COMM>200;

+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
+-------+--------+-----------+------+------------+---------+---------+--------+

--ASSIGNMENT no 5
USE DAY2;

SELECT * 
FROM EMP 
WHERE JOB ='CLERK'OR SAL>2000;

+-------+--------+-----------+------+------------+---------+------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+--------+-----------+------+------------+---------+------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 | NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 | NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 | NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 | NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 | NULL |     10 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 | NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 | NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 | NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 | NULL |     10 |
+-------+--------+-----------+------+------------+---------+------+--------+


--ASSIGNMENT no 6
USE DAY2;

SELECT * 
FROM EMP 
WHERE SAL = 1100 OR SAL =1250;

+-------+--------+----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+----------+------+------------+---------+---------+--------+
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7876 | ADAMS  | CLERK    | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
+-------+--------+----------+------+------------+---------+---------+--------+

--ASSIGNMENT no 7
USE DAY2;

SELECT * 
FROM EMP 
WHERE SAL > 1250 AND SAL <2850;


+-------+--------+----------+------+------------+---------+--------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM   | DEPTNO |
+-------+--------+----------+------+------------+---------+--------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 | 300.00 |     30 |
|  7782 | CLARK  | MANAGER  | 7839 | 1981-06-09 | 2450.00 |   NULL |     10 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |   0.00 |     30 |
|  7934 | MILLER | CLERK    | 7782 | 1982-01-23 | 1300.00 |   NULL |     10 |
+-------+--------+----------+------+------------+---------+--------+--------+


--ASSIGNMENT no 8
USE DAY2;

SELECT * 
FROM EMP 
WHERE DEPTNO =20;


+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7369 | SMITH | CLERK   | 7902 | 1980-12-17 |  800.00 | NULL |     20 |
|  7566 | JONES | MANAGER | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7788 | SCOTT | ANALYST | 7566 | 1982-12-09 | 3000.00 | NULL |     20 |
|  7876 | ADAMS | CLERK   | 7788 | 1983-01-12 | 1100.00 | NULL |     20 |
|  7902 | FORD  | ANALYST | 7566 | 1981-12-03 | 3000.00 | NULL |     20 |
+-------+-------+---------+------+------------+---------+------+--------+


--ASSIGNMENT no 9
USE DAY2;

SELECT * 
FROM EMP 
WHERE HIREDATE>'1981-06-09';


+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+


--ASSIGNMENT no 10

SELECT EMPNO,ENAME,SAL,COMM,
SAL +IFNULL(COMM,0)"TOTAL SALARY"
FROM EMP;

+-------+--------+---------+---------+--------------+
| EMPNO | ENAME  | SAL     | COMM    | TOTAL SALARY |
+-------+--------+---------+---------+--------------+
|  7369 | SMITH  |  800.00 |    NULL |       800.00 |
|  7499 | ALLEN  | 1600.00 |  300.00 |      1900.00 |
|  7521 | WARD   | 1250.00 |  500.00 |      1750.00 |
|  7566 | JONES  | 2975.00 |    NULL |      2975.00 |
|  7654 | MARTIN | 1250.00 | 1400.00 |      2650.00 |
|  7698 | BLAKE  | 2850.00 |    NULL |      2850.00 |
|  7782 | CLARK  | 2450.00 |    NULL |      2450.00 |
|  7788 | SCOTT  | 3000.00 |    NULL |      3000.00 |
|  7839 | KING   | 5000.00 |    NULL |      5000.00 |
|  7844 | TURNER | 1500.00 |    0.00 |      1500.00 |
|  7876 | ADAMS  | 1100.00 |    NULL |      1100.00 |
|  7900 | JAMES  |  950.00 |    NULL |       950.00 |
|  7902 | FORD   | 3000.00 |    NULL |      3000.00 |
|  7934 | MILLER | 1300.00 |    NULL |      1300.00 |
+-------+--------+---------+---------+--------------+


--ASSIGNMENT no 12

SELECT *
FROM EMP
WHERE SAL>2000 AND (JOB ='CLERK' OR JOB='SALESMAN');

Empty set (0.00 sec)

SELECT * FROM EMP;
+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  800.00 |    NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+


--ASSIGNMENT no 13

SELECT *
FROM EMP
WHERE (DEPTNO=20 OR DEPTNO =30) AND COMM IS NULL;

+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7369 | SMITH | CLERK   | 7902 | 1980-12-17 |  800.00 | NULL |     20 |
|  7566 | JONES | MANAGER | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7698 | BLAKE | MANAGER | 7839 | 1981-05-01 | 2850.00 | NULL |     30 |
|  7788 | SCOTT | ANALYST | 7566 | 1982-12-09 | 3000.00 | NULL |     20 |
|  7876 | ADAMS | CLERK   | 7788 | 1983-01-12 | 1100.00 | NULL |     20 |
|  7900 | JAMES | CLERK   | 7698 | 1981-12-03 |  950.00 | NULL |     30 |
|  7902 | FORD  | ANALYST | 7566 | 1981-12-03 | 3000.00 | NULL |     20 |
+-------+-------+---------+------+------------+---------+------+--------+


--ASSIGNMENT no 14

SELECT *
FROM EMP
WHERE (DEPTNO=10 OR DEPTNO =30 )AND 
(HIREDATE BETWEEN '1982-01-01' AND '1982-12-31');

+-------+--------+-------+------+------------+---------+------+--------+
| EMPNO | ENAME  | JOB   | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+--------+-------+------+------------+---------+------+--------+
|  7934 | MILLER | CLERK | 7782 | 1982-01-23 | 1300.00 | NULL |     10 |
+-------+--------+-------+------+------------+---------+------+--------+


--ASSIGNMENT no 15

SELECT *
FROM EMP
WHERE MGR IS NULL;

+-------+-------+-----------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB       | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+-----------+------+------------+---------+------+--------+
|  7839 | KING  | PRESIDENT | NULL | 1981-11-17 | 5000.00 | NULL |     10 |
+-------+-------+-----------+------+------------+---------+------+--------+

--ASSIGNMENT no 16

SELECT *
FROM EMP
WHERE HIREDATE BETWEEN '1981-01-01' AND '1983-12-31';


+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 2975.00 |    NULL |     20 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 2850.00 |    NULL |     30 |
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2450.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1100.00 |    NULL |     20 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+


--ASSIGNMENT no 17 COPY ONLY STRUCTURE
CREATE TABLE EMP10
SELECT *
FROM EMP
WHERE 1=2;


SELECT * FROM EMP10;
Empty set (0.00 sec)



--ASSIGNMENT no 18


INSERT INTO EMP10 VALUES
        (7369, 'SMITH',  'CLERK',NULL,
        STR_TO_DATE('17-DEC-1980', '%d-%b-%Y'), 
		800, 300, 20);
SELECT * FROM EMP10;
+-------+-------+-------+------+------------+--------+--------+--------+
| EMPNO | ENAME | JOB   | MGR  | HIREDATE   | SAL    | COMM   | DEPTNO |
+-------+-------+-------+------+------------+--------+--------+--------+
|  7369 | SMITH | CLERK | NULL | 1980-12-17 | 800.00 | 300.00 |     20 |
+-------+-------+-------+-----+------------+--------+--------+--------+


--ASSIGNMENT no 19
SELECT * 
FROM EMP
WHERE MGR IS NULL;

+-------+-------+-----------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB       | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+-----------+------+------------+---------+------+--------+
|  7839 | KING  | PRESIDENT | NULL | 1981-11-17 | 5000.00 | NULL |     10 |
+-------+-------+-----------+------+------------+---------+------+--------+


--ASSIGNMENT no 20
SELECT EMPNO,ENAME,DEPTNO 
FROM EMP
WHERE MGR=7698;


+-------+--------+--------+
| EMPNO | ENAME  | DEPTNO |
+-------+--------+--------+
|  7499 | ALLEN  |     30 |
|  7521 | WARD   |     30 |
|  7654 | MARTIN |     30 |
|  7844 | TURNER |     30 |
|  7900 | JAMES  |     30 |
+-------+--------+--------+


--ASSIGNMENT no 21
SELECT * 
FROM EMP
WHERE JOB='MANAGER' AND DEPTNO=10;

+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7782 | CLARK | MANAGER | 7839 | 1981-06-09 | 2450.00 | NULL |     10 |
+-------+-------+---------+------+------------+---------+------+--------+

--ASSIGNMENT no 22
SELECT EMPNO,ENAME,DEPTNO 
FROM EMP
WHERE MGR=7698;


+-------+--------+--------+
| EMPNO | ENAME  | DEPTNO |
+-------+--------+--------+
|  7499 | ALLEN  |     30 |
|  7521 | WARD   |     30 |
|  7654 | MARTIN |     30 |
|  7844 | TURNER |     30 |
|  7900 | JAMES  |     30 |
+-------+--------+--------+


--ASSIGNMENT no 23
SELECT DISTINCT JOB "JOBS"
FROM EMP;

+-----------+
| JOBS      |
+-----------+
| CLERK     |
| SALESMAN  |
| MANAGER   |
| ANALYST   |
| PRESIDENT |
+-----------+

--ASSIGNMENT no 24
SELECT DISTINCT DEPTNO
FROM EMP;

+--------+
| DEPTNO |
+--------+
|     20 |
|     30 |
|     10 |
+--------+

--ASSIGNMENT no 25

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
FROM EMPLOYEE
WHERE BASIC >15000;

+-------+--------+----------+-----------+
| EMPNO | ENAME  | BASIC    | INCENTIVE |
+-------+--------+----------+-----------+
|     1 | Rajesh | 20000.00 |   1500.00 |
|     2 | Sarita | 25000.00 |   1000.00 |
|     3 | Meera  | 15750.00 |   3000.00 |
|     4 | Jitesh | 30000.00 |    500.00 |
|    20 | Ajay   | 16800.00 |      NULL |
+-------+--------+----------+-----------+



