-- Day 7 
-- Assignment no 1

-- list all rooms allocated or not allocated to any COURSES

SELECT r.rid,r.rname, c.cid,c.cname
from room r
left JOIN COURSES c
on r.rid=c.rid;

+-----+--------+------+-------+
| rid | rname  | cid  | cname |
+-----+--------+------+-------+
| 100 | Jasmin |  121 | DBDA  |
| 101 | Rose   |  131 | DAC   |
| 103 | Mogra  | NULL | NULL  |
| 105 | Lotus  |  151 | DOIT  |
+-----+--------+------+-------+

-- Assignment no 2
SELECT p.pid,p.pname,p.price,p.qty,s.sid,s.sname
from product p
join salesman_data s
on p.sid=s.sid
where s.sname='Kirti';


+-----+--------+-------+------+-----+-------+
| pid | pname  | price | qty  | sid | sname |
+-----+--------+-------+------+-----+-------+
| 123 | lays   | 30.00 |   30 |  12 | Kirti |
| 134 | nachos | 50.00 |   50 |  12 | Kirti |
+-----+--------+-------+------+-----+-------+

-- Assignment no 3
--display empno,ename,sal,deptno 
--and loc for all employee getting grade2 sal

SELECT e.empno,e.ename,e.sal,d.loc
from emp e 
join dept d
on e.deptno =d.deptno
join salgrade s
on e.sal BETWEEN s.losal and s.hisal
where s.grade=2; 

+-------+--------+---------+---------+
| empno | ename  | sal     | loc     |
+-------+--------+---------+---------+
|  7876 | ADAMS  | 1331.00 | DALLAS  |
|  7654 | MARTIN | 1250.00 | CHICAGO |
|  7521 | WARD   | 1250.00 | CHICAGO |
+-------+--------+---------+---------+

-- Assignment no 4
-- display empno,ename,sal,deptno 
--and loc for all employee
--working as manager and joined in year 1981

SELECT e.empno,e.ename,e.sal,d.loc
from emp e 
join dept d
on e.deptno =d.deptno
where job='manager' and date_format(hiredate,'%y')=81; 
+-------+-------+---------+----------+
| empno | ename | sal     | loc      |
+-------+-------+---------+----------+
|  7782 | CLARK | 2621.50 | NEW YORK |
|  7566 | JONES | 3183.25 | DALLAS   |
|  7698 | BLAKE | 3049.50 | CHICAGO  |
+-------+-------+---------+----------+

-- Assignment no 5
-- display empno,ename,sal,deptno 
--and loc employee assigned and not assigned

SELECT e.empno,e.ename,e.sal,d.loc
from emp e 
left join dept d
on e.deptno =d.deptno;


+-------+--------+---------+----------+
| empno | ename  | sal     | loc      |
+-------+--------+---------+----------+
|  7369 | SMITH  |  968.00 | DALLAS   |
|  7499 | ALLEN  | 1600.00 | CHICAGO  |
|  7521 | WARD   | 1250.00 | CHICAGO  |
|  7566 | JONES  | 3183.25 | DALLAS   |
|  7654 | MARTIN | 1250.00 | CHICAGO  |
|  7698 | BLAKE  | 3049.50 | CHICAGO  |
|  7782 | CLARK  | 2621.50 | NEW YORK |
|  7788 | SCOTT  | 3000.00 | DALLAS   |
|  7839 | KING   | 5000.00 | NEW YORK |
|  7844 | TURNER | 1500.00 | CHICAGO  |
|  7876 | ADAMS  | 1331.00 | DALLAS   |
|  7900 | JAMES  | 1149.50 | CHICAGO  |
|  7902 | FORD   | 3000.00 | DALLAS   |
|  7934 | MILLER | 1573.00 | NEW YORK |
+-------+--------+---------+----------+

-- Assignment no 6
SELECT e1.empno,
       e1.ename AS Employee,
       e1.mgr,
       e2.ename AS Manager
FROM emp e1
JOIN emp e2
ON e1.mgr = e2.empno;

+-------+----------+------+---------+
| empno | Employee | mgr  | Manager |
+-------+----------+------+---------+
|  7902 | FORD     | 7566 | JONES   |
|  7788 | SCOTT    | 7566 | JONES   |
|  7900 | JAMES    | 7698 | BLAKE   |
|  7844 | TURNER   | 7698 | BLAKE   |
|  7654 | MARTIN   | 7698 | BLAKE   |
|  7521 | WARD     | 7698 | BLAKE   |
|  7499 | ALLEN    | 7698 | BLAKE   |
|  7934 | MILLER   | 7782 | CLARK   |
|  7876 | ADAMS    | 7788 | SCOTT   |
|  7782 | CLARK    | 7839 | KING    |
|  7698 | BLAKE    | 7839 | KING    |
|  7566 | JONES    | 7839 | KING    |
|  7369 | SMITH    | 7902 | FORD    |
+-------+----------+------+---------+

-- Assignment no 7
--use day7
create table product(
	pid int,
	pname varchar(20),
	sid int);
	
insert into product
VALUES( 1,'Pen',2),
(2,'Pencil',3),
(3,'Eraser',2),
(4,'Sketch pens',1);


SELECT p1.pid,p1.pname,p1.sid,p2.pname as sample_name
from product p1
join product p2
on p1.sid =p2.pid;

+------+-------------+------+-------------+
| pid  | pname       | sid  | sample_name |
+------+-------------+------+-------------+
|    4 | Sketch pens |    1 | Pen         |
|    3 | Eraser      |    2 | Pencil      |
|    1 | Pen         |    2 | Pencil      |
|    2 | Pencil      |    3 | Eraser      |
+------+-------------+------+-------------+


-- Assignment no 8
--use day6

SELECT p.pid,p.pname,p.price,p.qty,s.sid,s.sname,s.city
from product p
join salesman_data s
on p.sid=s.sid
WHERE p.price > 50; 

+-----+-------------+-------+------+-----+-------+------+
| pid | pname       | price | qty  | sid | sname | city |
+-----+-------------+-------+------+-----+-------+------+
| 213 | Sketch pens | 56.00 |  150 |  11 | Rahul | Pune |
+-----+-------------+-------+------+-----+-------+------+


-- display product info and salesman from sold and unsold product
SELECT p.pid,p.pname,p.price,p.qty,s.sid,s.sname,s.city
from product p
left join salesman_data s


on p.sid=s.sid;

+-----+-------------+-------+------+------+-------+----------+
| pid | pname       | price | qty  | sid  | sname | city     |
+-----+-------------+-------+------+------+-------+----------+
| 111 | pepsi       | 40.00 |   50 |   11 | Rahul | Pune     |
| 123 | lays        | 30.00 |   30 |   12 | Kirti | Mumbai   |
| 124 | dairy milk  | 40.00 |   60 |   14 | Arnav | Amravati |
| 125 | pringles    | 40.00 |   60 |   14 | Arnav | Amravati |
| 134 | nachos      | 50.00 |   50 |   12 | Kirti | Mumbai   |
| 167 | eraser      | 90.00 |    5 | NULL | NULL  | NULL     |
| 213 | Sketch pens | 56.00 |  150 |   11 | Rahul | Pune     |
+-----+-------------+-------+------+------+-------+----------+

--list all unsold products
SELECT p.pid, p.pname, p.price, p.qty
FROM product p
LEFT JOIN salesman_data s
ON p.sid = s.sid
WHERE s.sid IS NULL; 

SELECT p.pid, p.pname, p.price, p.qty
FROM product p
WHERE p.sid IS NULL;

+-----+--------+-------+------+
| pid | pname  | price | qty  |
+-----+--------+-------+------+
| 167 | eraser | 90.00 |    5 |
+-----+--------+-------+------+ 

-- Assignment no 9
--list all pid,pname,cid,cname 
--use day6
SELECT p.pid,p.pname,p.cid,c.cname
from product p
join category c
on c.cid=p.cid  and c.cname='Chips';

+-----+----------+------+-------+
| pid | pname    | cid  | cname |
+-----+----------+------+-------+
| 123 | lays     |    1 | CHIPS |
| 125 | pringles |    1 | CHIPS |
| 134 | nachos   |    1 | CHIPS |
+-----+----------+------+-------+

-- Assignment no 10
--use day2

SELECT e.empno,e.ename,e.deptno,d.dname,
e.sal,e.hiredate,s.grade
from emp e 
join dept d
on e.deptno =d.deptno
join salgrade s
on e.sal BETWEEN s.losal and s.hisal
where year(e.hiredate) BETWEEN 1980 and 1981;

+-------+--------+--------+------------+---------+------------+-------+
| empno | ename  | deptno | dname      | sal     | hiredate   | grade |
+-------+--------+--------+------------+---------+------------+-------+
|  7900 | JAMES  |     30 | SALES      | 1149.50 | 1981-12-03 |     1 |
|  7369 | SMITH  |     20 | RESEARCH   |  968.00 | 1980-12-17 |     1 |
|  7654 | MARTIN |     30 | SALES      | 1250.00 | 1981-09-28 |     2 |
|  7521 | WARD   |     30 | SALES      | 1250.00 | 1981-02-22 |     2 |
|  7844 | TURNER |     30 | SALES      | 1500.00 | 1981-09-08 |     3 |
|  7499 | ALLEN  |     30 | SALES      | 1600.00 | 1981-02-20 |     3 |
|  7902 | FORD   |     20 | RESEARCH   | 3000.00 | 1981-12-03 |     4 |
|  7782 | CLARK  |     10 | ACCOUNTING | 2621.50 | 1981-06-09 |     4 |
|  7839 | KING   |     10 | ACCOUNTING | 5000.00 | 1981-11-17 |     5 |
|  7698 | BLAKE  |     30 | SALES      | 3049.50 | 1981-05-01 |     5 |
|  7566 | JONES  |     20 | RESEARCH   | 3183.25 | 1981-04-02 |     5 |
+-------+--------+--------+------------+---------+------------+-------+

-- Assignment no 11
CREATE TABLE INCRE(
GRADE INT,
HIKE INT
);
INSERT INTO INCRE
VALUES(1,0),
(2,7),
(3,5),
(4,2),
(5,NULL);


SELECT e.empno,e.ename,e.deptno,d.dname,
e.sal,s.grade,i.hike
from emp e 
join dept d
on e.deptno =d.deptno
join salgrade s
on e.sal BETWEEN s.losal and s.hisal
join incre i
on i.grade=s.grade;

+-------+--------+--------+------------+---------+-------+------+
| empno | ename  | deptno | dname      | sal     | grade | hike |
+-------+--------+--------+------------+---------+-------+------+
|  7369 | SMITH  |     20 | RESEARCH   |  968.00 |     1 |    0 |
|  7900 | JAMES  |     30 | SALES      | 1149.50 |     1 |    0 |
|  7521 | WARD   |     30 | SALES      | 1250.00 |     2 |    7 |
|  7654 | MARTIN |     30 | SALES      | 1250.00 |     2 |    7 |
|  7876 | ADAMS  |     20 | RESEARCH   | 1331.00 |     2 |    7 |
|  7499 | ALLEN  |     30 | SALES      | 1600.00 |     3 |    5 |
|  7844 | TURNER |     30 | SALES      | 1500.00 |     3 |    5 |
|  7934 | MILLER |     10 | ACCOUNTING | 1573.00 |     3 |    5 |
|  7782 | CLARK  |     10 | ACCOUNTING | 2621.50 |     4 |    2 |
|  7788 | SCOTT  |     20 | RESEARCH   | 3000.00 |     4 |    2 |
|  7902 | FORD   |     20 | RESEARCH   | 3000.00 |     4 |    2 |
|  7566 | JONES  |     20 | RESEARCH   | 3183.25 |     5 | NULL |
|  7698 | BLAKE  |     30 | SALES      | 3049.50 |     5 | NULL |
|  7839 | KING   |     10 | ACCOUNTING | 5000.00 |     5 | NULL |
+-------+--------+--------+------------+---------+-------+------+


-- Assignment no 12
SELECT e1.empno,
       e1.ename AS Employee,
	   e1.job AS "Employee job",
       e1.mgr,
	   e2.job
FROM emp e1
JOIN emp e2
ON e1.mgr = e2.empno
where e1.job='salesman';

+-------+----------+--------------+------+---------+
| empno | Employee | Employee job | mgr  | job     |
+-------+----------+--------------+------+---------+
|  7844 | TURNER   | SALESMAN     | 7698 | MANAGER |
|  7654 | MARTIN   | SALESMAN     | 7698 | MANAGER |
|  7521 | WARD     | SALESMAN     | 7698 | MANAGER |
|  7499 | ALLEN    | SALESMAN     | 7698 | MANAGER |
+-------+----------+--------------+------+---------+

-- Assignment no 13
SELECT
    e.empno,
    e.ename,
    e.job,
    e.hiredate,
    e.sal,
    e.deptno,
    d.dname,
    d.loc
FROM emp e
JOIN dept d
    ON e.deptno = d.deptno
WHERE d.loc = 'DALLAS'
  AND YEAR(e.hiredate) = 1980;
  
  
+-------+-------+-------+------------+--------+--------+----------+--------+
| empno | ename | job   | hiredate   | sal    | deptno | dname    | loc    |
+-------+-------+-------+------------+--------+--------+----------+--------+
|  7369 | SMITH | CLERK | 1980-12-17 | 968.00 |     20 | RESEARCH | DALLAS |
+-------+-------+-------+------------+--------+--------+----------+--------+

-- Assignment no 14
SELECT
    e.ename,
    e.sal,
    e.deptno,
    d.dname
FROM emp e
JOIN dept d
    ON e.deptno = d.deptno
WHERE e.sal > (
    SELECT AVG(sal)
    FROM emp
);

+-------+---------+--------+------------+
| ename | sal     | deptno | dname      |
+-------+---------+--------+------------+
| JONES | 3183.25 |     20 | RESEARCH   |
| BLAKE | 3049.50 |     30 | SALES      |
| CLARK | 2621.50 |     10 | ACCOUNTING |
| SCOTT | 3000.00 |     20 | RESEARCH   |
| KING  | 5000.00 |     10 | ACCOUNTING |
| FORD  | 3000.00 |     20 | RESEARCH   |
+-------+---------+--------+------------+

-- Assignment no 15
SELECT
    e.ename,
    e.sal,
    e.deptno,
    d.dname
FROM emp e
JOIN dept d
    ON e.deptno = d.deptno
JOIN salgrade s
    ON e.sal BETWEEN s.losal AND s.hisal
WHERE s.grade = 3
  AND e.job = 'SALESMAN';

+--------+---------+--------+-------+
| ename  | sal     | deptno | dname |
+--------+---------+--------+-------+
| TURNER | 1500.00 |     30 | SALES |
| ALLEN  | 1600.00 |     30 | SALES |
+--------+---------+--------+-------+

-- Assignment no 16