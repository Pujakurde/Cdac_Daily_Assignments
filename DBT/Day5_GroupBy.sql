-- Group BY
--ASSIGNMENT NO1
SELECT DEPTNO,MIN(SAL)
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;

+--------+----------+
| DEPTNO | MIN(SAL) |
+--------+----------+
|     10 |  1573.00 |
|     20 |   968.00 |
|     30 |  1149.50 |
+--------+----------+

-- ASSIGNMENT NO 2:
SELECT SUM(SAL),DEPTNO
FROM EMP
GROUP BY DEPTNO
HAVING SUM(SAL)>10000;

+----------+--------+
| SUM(SAL) | DEPTNO |
+----------+--------+
| 11482.25 |     20 |
+----------+--------+

--ASSIGNMENT NO 3
SELECT DEPTNO,job,SUM(SAL),
FROM EMP
WHERE DEPTNO != 30
GROUP BY DEPTNO,job
HAVING SUM(SAL)>5000;

+----------+--------+
| SUM(SAL) | DEPTNO |
+----------+--------+
| 11482.25 |     20 |
|  9194.50 |     10 |
+----------+--------+

--ASSIGNMENT NO 4
SELECT MAX(Sal),job
FROM EMP
WHERE job='MANAGER'
GROUP BY job;

+----------+---------+
| MAX(Sal) | job     |
+----------+---------+
|  3183.25 | MANAGER |
+----------+---------+

--ASSIGNMENT NO 5
SELECT job,avg(sal),COUNT(*)
FROM EMP
GROUP BY job;

+-----------+-------------+----------+
| job       | avg(sal)    | COUNT(*) |
+-----------+-------------+----------+
| CLERK     | 1255.375000 |        4 |
| SALESMAN  | 1400.000000 |        4 |
| MANAGER   | 2951.416667 |        3 |
| ANALYST   | 3000.000000 |        2 |
| PRESIDENT | 5000.000000 |        1 |
+-----------+-------------+----------+

--ASSIGNMENT NO 6
SELECT DEPTNO,COUNT(*)
FROM EMP
GROUP BY DEPTNO
HAVING COUNT(*) > 4;

+--------+----------+
| DEPTNO | COUNT(*) |
+--------+----------+
|     20 |        5 |
|     30 |        6 |
+--------+----------+

--ASSIGNMENT NO 7
SELECT job,sum(Sal),min(sal)
FROM EMP
WHERE job='MANAGER'
GROUP BY job;

+---------+----------+----------+
| job     | sum(Sal) | min(sal) |
+---------+----------+----------+
| MANAGER |  8854.25 |  2621.50 |
+---------+----------+----------+

--ASSIGNMENT NO 8
SELECT DEPTNO, SUM(SAL),COUNT(*)
FROM EMP
WHERE JOB = 'CLERK'
GROUP BY DEPTNO
HAVING COUNT(*)>1;

+--------+----------+----------+
| DEPTNO | SUM(SAL) | COUNT(*) |
+--------+----------+----------+
|     20 |  2299.00 |        2 |
+--------+----------+----------+

--ASSIGNMENT NO 9
SELECT DEPTNO, COUNT(*)
FROM EMP
WHERE sal>1500
GROUP BY DEPTNO
Order by COUNT(*) desc;

+--------+----------+
| DEPTNO | COUNT(*) |
+--------+----------+
|     20 |        3 |
|     10 |        3 |
|     30 |        2 |
+--------+----------+

--ASSIGNMENT NO 10
SELECT DEPTNO, COUNT(*)
FROM EMP
WHERE job ='ANALYST'
GROUP BY DEPTNO;

+--------+----------+
| DEPTNO | COUNT(*) |
+--------+----------+
|     20 |        2 |
+--------+----------+

--ASSIGNMENT NO 11
SELECT COUNT(*)
FROM EMP
WHERE comm is not null or 0
GROUP BY DEPTNO;

+----------+
| COUNT(*) |
+----------+
|        4 |
+----------+

--ASSIGNMENT NO 12
SELECT MIN(SAL) 
FROM EMP
where DATE_FORMAT(HIREDATE,'%y')=81
GROUP BY DATE_FORMAT(HIREDATE,'%y');

+----------+
| MIN(SAL) |
+----------+
|  1149.50 |
+----------+

--ASSIGNMENT NO 13
SELECT AVG(SAL) 
FROM EMP
where DATEdiff(CURRENT_DATE,HIREDATE)/365>44
GROUP BY DATEdiff(CURRENT_DATE,HIREDATE);


--ASSIGNMENT NO 14
SELECT DEPTNO,COUNT(*)
FROM EMP
WHERE JOB = 'CLERK' AND (DEPTNO=10 OR DEPTNO =20)
GROUP BY DEPTNO;

+--------+----------+
| DEPTNO | COUNT(*) |
+--------+----------+
|     20 |        2 |
|     10 |        1 |
+--------+----------+

--ASSIGNMENT NO 15
SELECT COUNT(*)
FROM EMP
WHERE JOB = 'SALESMAN' AND SAL>1500
GROUP BY SAL;

+----------+
| COUNT(*) |
+----------+
|        1 |
+----------+

--ASSIGNMENT NO 16
SELECT DATE_FORMAT(HIREDATE,'%M') AS MONTH,
       COUNT(*) AS EMP_COUNT
FROM EMP
WHERE DATE_FORMAT(HIREDATE,'%M') = 'February'
GROUP BY DATE_FORMAT(HIREDATE,'%M');
+----------+-----------+
| MONTH    | EMP_COUNT |
+----------+-----------+
| February |         2 |
+----------+-----------+

--ASSIGNMENT NO 17
SELECT DEPTNO,COUNT(*)
FROM EMP
WHERE DEPTNO= 30 and job='MANAGER'
GROUP BY DEPTNO,job;

+--------+----------+
| DEPTNO | COUNT(*) |
+--------+----------+
|     30 |        1 |
+--------+----------+

--ASSIGNMENT NO 18
SELECT DATE_FORMAT(HIREDATE,'%Y') as year,
COUNT(*)
FROM EMP
GROUP BY DATE_FORMAT(HIREDATE,'%Y')
having COUNT(*)>4;

+------+----------+
| year | COUNT(*) |
+------+----------+
| 1981 |       10 |
+------+----------+

--ASSIGNMENT NO 19
SELECT JOB,HIREDATE,SAL,DEPTNO
FROM EMP
WHERE JOB ='CLERK' 
and( DEPTNO=20 or DEPTNO=30) 
and DATE_FORMAT(HIREDATE,'%M') = 'December';

+-------+------------+---------+--------+
| JOB   | HIREDATE   | SAL     | DEPTNO |
+-------+------------+---------+--------+
| CLERK | 1980-12-17 |  968.00 |     20 |
| CLERK | 1981-12-03 | 1149.50 |     30 |
+-------+------------+---------+--------+


--ASSIGNMENT NO 20
SELECT JOB,SAL
FROM EMP
WHERE JOB ='MANAGER'
and mod(sal,2)=0;

Empty set (0.00 sec)

--ASSIGNMENT NO 21
SELECT DATE_FORMAT(HIREDATE,'%Y') as year,
COUNT(*)
FROM EMP
GROUP by DATE_FORMAT(HIREDATE,'%Y')
ORDER BY DATE_FORMAT(HIREDATE,'%Y');

+------+----------+
| year | COUNT(*) |
+------+----------+
| 1980 |        1 |
| 1981 |       10 |
| 1982 |        2 |
| 1983 |        1 |
+------+----------+

--ASSIGNMENT NO 22
SELECT sum(sal) as TotalInvestedAmt
FROM EMP
WHERE JOB='SALESMAN'
GROUP by job;

+------------------+
| TotalInvestedAmt |
+------------------+
|          5600.00 |
+------------------+

--ASSIGNMENT NO 23
SELECT job,MAX(Sal)as MaximumSalary ,
min(sal) as MinimumSalary 
FROM EMP
WHERE JOB='Clerk'
GROUP by job;

+-------+---------------+---------------+
| job   | MaximumSalary | MinimumSalary |
+-------+---------------+---------------+
| CLERK |       1573.00 |        968.00 |
+-------+---------------+---------------+

--ASSIGNMENT NO 24
SELECT
count(EMPNO) as Employee_hired
FROM EMP
where DATE_FORMAT(HIREDATE,'%y')=80
GROUP BY EMPNO;

+----------------+
| Employee_hired |
+----------------+
|              1 |
+----------------+