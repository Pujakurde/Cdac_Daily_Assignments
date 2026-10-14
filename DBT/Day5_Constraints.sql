
-- Assignment no 1


+--------+------------+----------+
| DEPTNO | DNAME      | LOC      |
+--------+------------+----------+
|     10 | ACCOUNTING | NEW YORK |
|     20 | RESEARCH   | DALLAS   |
|     30 | SALES      | CHICAGO  |
|     40 | OPERATIONS | BOSTON   |
+--------+------------+----------+

-- add pk for dept100
ALTER TABLE dept100
ADD CONSTRAINT pk_no PRIMARY KEY (DEPTNO);
desc dept100;

+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| DEPTNO | int         | NO   | PRI | NULL    |       |
| DNAME  | varchar(14) | YES  |     | NULL    |       |
| LOC    | varchar(13) | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
create table emp100 as
select * from emp;

select * from emp100;

+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  968.00 |    NULL |     20 |
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

ALTER TABLE emp100
ADD CONSTRAINT pk_no PRIMARY KEY (EMPNO);
desc emp100;

+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| EMPNO    | int          | NO   | PRI | NULL    |       |
| ENAME    | varchar(10)  | YES  |     | NULL    |       |
| JOB      | varchar(9)   | YES  |     | NULL    |       |
| MGR      | int          | YES  |     | NULL    |       |
| HIREDATE | date         | YES  |     | NULL    |       |
| SAL      | decimal(7,2) | YES  |     | NULL    |       |
| COMM     | decimal(7,2) | YES  |     | NULL    |       |
| DEPTNO   | int          | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+


-- Assignment no 2
use day1;
ALTER TABLE vehicle
ADD CONSTRAINT pk_no PRIMARY KEY (vid);
desc vehicle;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| vid      | int          | NO   | PRI | NULL    |       |
| vname    | varchar(15)  | YES  |     | NULL    |       |
| price    | int          | YES  |     | NULL    |       |
| discount | float(5,2)   | YES  |     | NULL    |       |
| milage   | int          | YES  |     | NULL    |       |
| category | varchar(10)  | YES  |     | NULL    |       |
| details  | varchar(100) | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+

ALTER TABLE customer
ADD CONSTRAINT pk_no PRIMARY KEY (custid);
desc customer;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| custid   | int          | NO   | PRI | NULL    |       |
| cname    | varchar(15)  | YES  |     | NULL    |       |
| location | varchar(100) | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+

ALTER TABLE salesman
ADD CONSTRAINT pk_no PRIMARY KEY (sid);
desc salesman;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| sid        | int         | NO   | PRI | NULL    |       |
| sname      | varchar(15) | YES  |     | NULL    |       |
| city       | varchar(10) | YES  |     | NULL    |       |
| experience | float(2,1)  | YES  |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+


-- Assignment no 3
INSERT INTO vehicle(vname,category,price,discount,milage,details)
VALUES('Passion','Bike',90000,null,50,'For passonate rider'),
('Honda City','Car',140000,null,20,'Best in Honda World'),
('TVS iCu','Electric Scooter',140000,null,40,'Best in new World');

--ERROR 1364 (HY000): Field 'vid' doesn't have a default value

-- Assignment no 4
create table dept11 as
select * from dept;
 
select * from dept11;
+--------+------------+----------+
| DEPTNO | DNAME      | LOC      |
+--------+------------+----------+
|     10 | ACCOUNTING | NEW YORK |
|     20 | RESEARCH   | DALLAS   |
|     30 | SALES      | CHICAGO  |
|     40 | OPERATIONS | BOSTON   |
+--------+------------+----------+

ALTER TABLE dept11
ADD CONSTRAINT dno PRIMARY KEY (DEPTNO);
desc dept11;

+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| DEPTNO | int         | NO   | PRI | NULL    |       |
| DNAME  | varchar(14) | YES  |     | NULL    |       |
| LOC    | varchar(13) | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+

-- Assignment no 5
create table emp110 as
select * from emp;

select * from emp110;
+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  968.00 |    NULL |     20 |
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

ALTER TABLE emp110
ADD CONSTRAINT dno FOREIGN KEY(DEPTNO)
REFERENCES dept11(DEPTNO);
desc emp110;

+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| EMPNO    | int          | YES  |     | NULL    |       |
| ENAME    | varchar(10)  | YES  |     | NULL    |       |
| JOB      | varchar(9)   | YES  |     | NULL    |       |
| MGR      | int          | YES  |     | NULL    |       |
| HIREDATE | date         | YES  |     | NULL    |       |
| SAL      | decimal(7,2) | YES  |     | NULL    |       |
| COMM     | decimal(7,2) | YES  |     | NULL    |       |
| DEPTNO   | int          | YES  | MUL | NULL    |       |
+----------+--------------+------+-----+---------+-------+

-- Assignment no 6