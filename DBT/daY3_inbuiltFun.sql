--DAY 03:
--DATES IN DIFFERRNT FORMAT
-- Assignment no 1
SELECT DATE_FORMAT(HIREDATE ,"%Y")
FROM EMP;

+-----------------------------+
| DATE_FORMAT(HIREDATE ,"%Y") |
+-----------------------------+
| 1980                        |
| 1981                        |
| 1981                        |
| 1981                        |
| 1981                        |
| 1981                        |
| 1981                        |
| 1982                        |
| 1981                        |
| 1981                        |
| 1983                        |
| 1981                        |
| 1981                        |
| 1982                        |
+-----------------------------+
SELECT DATE_FORMAT(HIREDATE ,"%M")
FROM EMP;
+-----------------------------+
| DATE_FORMAT(HIREDATE ,"%M") |
+-----------------------------+
| December                    |
| February                    |
| February                    |
| April                       |
| September                   |
| May                         |
| June                        |
| December                    |
| November                    |
| September                   |
| January                     |
| December                    |
| December                    |
| January                     |
+-----------------------------+

SELECT DATE_FORMAT(HIREDATE ,"%D")
FROM EMP;

+-----------------------------+
| DATE_FORMAT(HIREDATE ,"%D") |
+-----------------------------+
| 17th                        |
| 20th                        |
| 22nd                        |
| 2nd                         |
| 28th                        |
| 1st                         |
| 9th                         |
| 9th                         |
| 17th                        |
| 8th                         |
| 12th                        |
| 3rd                         |
| 3rd                         |
| 23rd                        |
+-----------------------------+
SELECT DATE_FORMAT(HIREDATE ,"%y")
FROM EMP;
+-----------------------------+
| DATE_FORMAT(HIREDATE ,"%y") |
+-----------------------------+
| 80                          |
| 81                          |
| 81                          |
| 81                          |
| 81                          |
| 81                          |
| 81                          |
| 82                          |
| 81                          |
| 81                          |
| 83                          |
| 81                          |
| 81                          |
| 82                          |
+-----------------------------+

SELECT DATE_FORMAT(HIREDATE ,"%m")
FROM EMP;

+-----------------------------+
| DATE_FORMAT(HIREDATE ,"%m") |
+-----------------------------+
| 12                          |
| 02                          |
| 02                          |
| 04                          |
| 09                          |
| 05                          |
| 06                          |
| 12                          |
| 11                          |
| 09                          |
| 01                          |
| 12                          |
| 12                          |
| 01                          |
+-----------------------------+
SELECT DATE_FORMAT(HIREDATE ,"%d")
FROM EMP;

+-----------------------------+
| DATE_FORMAT(HIREDATE ,"%d") |
+-----------------------------+
| 17                          |
| 20                          |
| 22                          |
| 02                          |
| 28                          |
| 01                          |
| 09                          |
| 09                          |
| 17                          |
| 08                          |
| 12                          |
| 03                          |
| 03                          |
| 23                          |
+-----------------------------+


-- Assignment no 2
SELECT ename,sal
FROM EMP
WHERE mod(sal,3)=0;

+--------+---------+
| ename  | sal     |
+--------+---------+
| BLAKE  | 2850.00 |
| SCOTT  | 3000.00 |
| TURNER | 1500.00 |
| FORD   | 3000.00 |
+--------+---------+

-- Assignment no 3
SELECT CONCAT_Ws('****',ename,sal)
FROM EMP;
+-----------------------------+
| CONCAT_Ws('****',ename,sal) |
+-----------------------------+
| SMITH****800.00             |
| ALLEN****1600.00            |
| WARD****1250.00             |
| JONES****2975.00            |
| MARTIN****1250.00           |
| BLAKE****2850.00            |
| CLARK****2450.00            |
| SCOTT****3000.00            |
| KING****5000.00             |
| TURNER****1500.00           |
| ADAMS****1100.00            |
| JAMES****950.00             |
| FORD****3000.00             |
| MILLER****1300.00           |
+-----------------------------+

-- Assignment no 4
SELECT CONCAT(ename,'@mycompany.com')
email
FROM EMP;

+----------------------+
| email                |
+----------------------+
| SMITH@mycompany.com  |
| ALLEN@mycompany.com  |
| WARD@mycompany.com   |
| JONES@mycompany.com  |
| MARTIN@mycompany.com |
| BLAKE@mycompany.com  |
| CLARK@mycompany.com  |
| SCOTT@mycompany.com  |
| KING@mycompany.com   |
| TURNER@mycompany.com |
| ADAMS@mycompany.com  |
| JAMES@mycompany.com  |
| FORD@mycompany.com   |
| MILLER@mycompany.com |
+----------------------+

-- Assignment no 5
SELECT ename,LENGTH(ename)
Length
FROM EMP;

+--------+--------+
| ename  | Length |
+--------+--------+
| SMITH  |      5 |
| ALLEN  |      5 |
| WARD   |      4 |
| JONES  |      5 |
| MARTIN |      6 |
| BLAKE  |      5 |
| CLARK  |      5 |
| SCOTT  |      5 |
| KING   |      4 |
| TURNER |      6 |
| ADAMS  |      5 |
| JAMES  |      5 |
| FORD   |      4 |
| MILLER |      6 |
+--------+--------+

-- Assignment no 6
SELECT ename,job,
CONCAT(substr(ename,1,3),'...','2',
substr(job,3,1),'@mycompany.com')
email
FROM EMP;

+--------+-----------+------------------------+
| ename  | job       | email                  |
+--------+-----------+------------------------+
| SMITH  | CLERK     | SMI...2E@mycompany.com |
| ALLEN  | SALESMAN  | ALL...2L@mycompany.com |
| WARD   | SALESMAN  | WAR...2L@mycompany.com |
| JONES  | MANAGER   | JON...2N@mycompany.com |
| MARTIN | SALESMAN  | MAR...2L@mycompany.com |
| BLAKE  | MANAGER   | BLA...2N@mycompany.com |
| CLARK  | MANAGER   | CLA...2N@mycompany.com |
| SCOTT  | ANALYST   | SCO...2A@mycompany.com |
| KING   | PRESIDENT | KIN...2E@mycompany.com |
| TURNER | SALESMAN  | TUR...2L@mycompany.com |
| ADAMS  | CLERK     | ADA...2E@mycompany.com |
| JAMES  | CLERK     | JAM...2E@mycompany.com |
| FORD   | ANALYST   | FOR...2A@mycompany.com |
| MILLER | CLERK     | MIL...2E@mycompany.com |
+--------+-----------+------------------------+

-- Assignment no 7
SELECT concat(
upper(substr(ename,1,1)) ,
LOWER(substr(ename,2,Length(ename))),' ',
upper(substr(job,1,1)) ,
LOWER(substr(job,2,Length(job))))
as Name
FROM EMP;

+-----------------+
| Name            |
+-----------------+
| Smith Clerk     |
| Allen Salesman  |
| Ward Salesman   |
| Jones Manager   |
| Martin Salesman |
| Blake Manager   |
| Clark Manager   |
| Scott Analyst   |
| King President  |
| Turner Salesman |
| Adams Clerk     |
| James Clerk     |
| Ford Analyst    |
| Miller Clerk    |
+-----------------+

-- Assignment no 8
SELECT concat(
LOWER(substr(ename,1,3)),
upper(substr(ename,4,Length(ename))))
as Name
FROM EMP;

+--------+
| Name   |
+--------+
| smiTH  |
| allEN  |
| warD   |
| jonES  |
| marTIN |
| blaKE  |
| claRK  |
| scoTT  |
| kinG   |
| turNER |
| adaMS  |
| jamES  |
| forD   |
| milLER |
+--------+

-- Assignment no 9
SELECT substr(ename,-3,Length(ename))
as Name
FROM EMP;

+------+
| Name |
+------+
| ITH  |
| LEN  |
| ARD  |
| NES  |
| TIN  |
| AKE  |
| ARK  |
| OTT  |
| ING  |
| NER  |
| AMS  |
| MES  |
| ORD  |
| LER  |
+------+

-- Assignment no 10
SELECT concat(lower((substr(ename,1,3))),
lower(substr(job,-2,Length(job))),
'@knowit.com')
as email_id
FROM EMP;

+------------------+
| email_id         |
+------------------+
| smirk@knowit.com |
| allan@knowit.com |
| waran@knowit.com |
| joner@knowit.com |
| maran@knowit.com |
| blaer@knowit.com |
| claer@knowit.com |
| scost@knowit.com |
| kinnt@knowit.com |
| turan@knowit.com |
| adark@knowit.com |
| jamrk@knowit.com |
| forst@knowit.com |
| milrk@knowit.com |
+------------------+

-- Assignment no 11
SELECT *
FROM EMP
WHERE DATEDIFF(CURRENT_DATE,HIREDATE)> 44*365;

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
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 |  950.00 |    NULL |     30 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1300.00 |    NULL |     10 |
+-------+--------+-----------+------+------------+---------+---------+--------+


-- Assignment no 12
CREATE TABLE COPY_EMP
AS
SELECT * FROM EMP;
UPDATE COPY_EMP
SET SAL =SAL+(SAL*0.05)
WHERE DATEDIFF(CURRENT_DATE,HIREDATE)> 44*365;
SELECT ENAME, HIREDATE, SAL
FROM COPY_EMP
WHERE DATEDIFF(CURRENT_DATE,HIREDATE)> 44*365;

+--------+------------+---------+
| ENAME  | HIREDATE   | SAL     |
+--------+------------+---------+
| SMITH  | 1980-12-17 |  840.00 |
| ALLEN  | 1981-02-20 | 1680.00 |
| WARD   | 1981-02-22 | 1312.50 |
| JONES  | 1981-04-02 | 3123.75 |
| MARTIN | 1981-09-28 | 1312.50 |
| BLAKE  | 1981-05-01 | 2992.50 |
| CLARK  | 1981-06-09 | 2572.50 |
| KING   | 1981-11-17 | 5250.00 |
| TURNER | 1981-09-08 | 1575.00 |
| JAMES  | 1981-12-03 |  997.50 |
| FORD   | 1981-12-03 | 3150.00 |
| MILLER | 1982-01-23 | 1365.00 |
+--------+------------+---------+

-- Assignment no 13
--Clerk
SELECT * FROM EMP
WHERE JOB='Clerk';

+-------+--------+-------+------+------------+---------+------+--------+
| EMPNO | ENAME  | JOB   | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+--------+-------+------+------------+---------+------+--------+
|  7369 | SMITH  | CLERK | 7902 | 1980-12-17 |  880.00 | NULL |     20 |
|  7876 | ADAMS  | CLERK | 7788 | 1983-01-12 | 1210.00 | NULL |     20 |
|  7900 | JAMES  | CLERK | 7698 | 1981-12-03 | 1045.00 | NULL |     30 |
|  7934 | MILLER | CLERK | 7782 | 1982-01-23 | 1430.00 | NULL |     10 |
+-------+--------+-------+------+------------+---------+------+--------+

UPDATE EMP
SET SAL =SAL+(SAL*0.10)
WHERE JOB='Clerk';

SELECT * FROM EMP
WHERE JOB='Clerk';

+-------+--------+-------+------+------------+---------+------+--------+
| EMPNO | ENAME  | JOB   | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+--------+-------+------+------------+---------+------+--------+
|  7369 | SMITH  | CLERK | 7902 | 1980-12-17 |  968.00 | NULL |     20 |
|  7876 | ADAMS  | CLERK | 7788 | 1983-01-12 | 1331.00 | NULL |     20 |
|  7900 | JAMES  | CLERK | 7698 | 1981-12-03 | 1149.50 | NULL |     30 |
|  7934 | MILLER | CLERK | 7782 | 1982-01-23 | 1573.00 | NULL |     10 |
+-------+--------+-------+------+------------+---------+------+--------+

--ANALYST
SELECT * FROM EMP
WHERE JOB='ANALYST';

+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7788 | SCOTT | ANALYST | 7566 | 1982-12-09 | 3000.00 | NULL |     20 |
|  7902 | FORD  | ANALYST | 7566 | 1981-12-03 | 3000.00 | NULL |     20 |
+-------+-------+---------+------+------------+---------+------+--------+
UPDATE EMP
SET SAL =SAL+(SAL*0.07)
WHERE JOB='ANALYST';

SELECT * FROM EMP
WHERE JOB='ANALYST';

+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7788 | SCOTT | ANALYST | 7566 | 1982-12-09 | 3000.00 | NULL |     20 |
|  7902 | FORD  | ANALYST | 7566 | 1981-12-03 | 3000.00 | NULL |     20 |
+-------+-------+---------+------+------------+---------+------+--------+

-- Manager
SELECT * FROM EMP
WHERE JOB='Manager';

+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7566 | JONES | MANAGER | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7698 | BLAKE | MANAGER | 7839 | 1981-05-01 | 2850.00 | NULL |     30 |
|  7782 | CLARK | MANAGER | 7839 | 1981-06-09 | 2450.00 | NULL |     10 |
+-------+-------+---------+------+------------+---------+------+--------+
UPDATE EMP
SET SAL =SAL+(SAL*0.07)
WHERE JOB='Manager';

SELECT * FROM EMP
WHERE JOB='Manager';

+-------+-------+---------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB     | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+---------+------+------------+---------+------+--------+
|  7566 | JONES | MANAGER | 7839 | 1981-04-02 | 3183.25 | NULL |     20 |
|  7698 | BLAKE | MANAGER | 7839 | 1981-05-01 | 3049.50 | NULL |     30 |
|  7782 | CLARK | MANAGER | 7839 | 1981-06-09 | 2621.50 | NULL |     10 |
+-------+-------+---------+------+------------+---------+------+--------+

-- Assignment NO 14

SELECT * 
FROM EMP
WHERE SAL BETWEEN 1000 AND 3000
ORDER BY HIREDATE;

+-------+--------+----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+----------+------+------------+---------+---------+--------+
|  7499 | ALLEN  | SALESMAN | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7782 | CLARK  | MANAGER  | 7839 | 1981-06-09 | 2621.50 |    NULL |     10 |
|  7844 | TURNER | SALESMAN | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7900 | JAMES  | CLERK    | 7698 | 1981-12-03 | 1149.50 |    NULL |     30 |
|  7902 | FORD   | ANALYST  | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7934 | MILLER | CLERK    | 7782 | 1982-01-23 | 1573.00 |    NULL |     10 |
|  7788 | SCOTT  | ANALYST  | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7876 | ADAMS  | CLERK    | 7788 | 1983-01-12 | 1331.00 |    NULL |     20 |
+-------+--------+----------+------+------------+---------+---------+--------+


-- Assignment NO 15
SELECT LPAD(ENAME, 10, ' ') AS NAME,
       RPAD(JOB, 9, ' ') AS JOB
FROM EMP; 

+------------+-----------+
| NAME       | JOB       |
+------------+-----------+
|      SMITH | CLERK     |
|      ALLEN | SALESMAN  |
|       WARD | SALESMAN  |
|      JONES | MANAGER   |
|     MARTIN | SALESMAN  |
|      BLAKE | MANAGER   |
|      CLARK | MANAGER   |
|      SCOTT | ANALYST   |
|       KING | PRESIDENT |
|     TURNER | SALESMAN  |
|      ADAMS | CLERK     |
|      JAMES | CLERK     |
|       FORD | ANALYST   |
|     MILLER | CLERK     |
+------------+-----------+


-- Assignment NO 16
SELECT CONCAT('HELLO ',ENAME,'!')
AS 'EARNED COMMISION'
FROM EMP
WHERE COMM IS NOT NULL;

+------------------+
| EARNED COMMISION |
+------------------+
| HELLO ALLEN!     |
| HELLO WARD!      |
| HELLO MARTIN!    |
| HELLO TURNER!    |
+------------------+

-- Assignment NO 17
SELECT *
FROM EMP
ORDER BY DEPTNO ASC, HIREDATE ASC, ENAME ASC;


+-------+--------+-----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB       | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+-----------+------+------------+---------+---------+--------+
|  7782 | CLARK  | MANAGER   | 7839 | 1981-06-09 | 2621.50 |    NULL |     10 |
|  7839 | KING   | PRESIDENT | NULL | 1981-11-17 | 5000.00 |    NULL |     10 |
|  7934 | MILLER | CLERK     | 7782 | 1982-01-23 | 1573.00 |    NULL |     10 |
|  7369 | SMITH  | CLERK     | 7902 | 1980-12-17 |  968.00 |    NULL |     20 |
|  7566 | JONES  | MANAGER   | 7839 | 1981-04-02 | 3183.25 |    NULL |     20 |
|  7902 | FORD   | ANALYST   | 7566 | 1981-12-03 | 3000.00 |    NULL |     20 |
|  7788 | SCOTT  | ANALYST   | 7566 | 1982-12-09 | 3000.00 |    NULL |     20 |
|  7876 | ADAMS  | CLERK     | 7788 | 1983-01-12 | 1331.00 |    NULL |     20 |
|  7499 | ALLEN  | SALESMAN  | 7698 | 1981-02-20 | 1600.00 |  300.00 |     30 |
|  7521 | WARD   | SALESMAN  | 7698 | 1981-02-22 | 1250.00 |  500.00 |     30 |
|  7698 | BLAKE  | MANAGER   | 7839 | 1981-05-01 | 3049.50 |    NULL |     30 |
|  7844 | TURNER | SALESMAN  | 7698 | 1981-09-08 | 1500.00 |    0.00 |     30 |
|  7654 | MARTIN | SALESMAN  | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
|  7900 | JAMES  | CLERK     | 7698 | 1981-12-03 | 1149.50 |    NULL |     30 |
+-------+--------+-----------+------+------------+---------+---------+--------+


-- Assignment NO 18
SELECT CONCAT(
       ENAME,
       ' IS A ',
       UPPER(SUBSTR(JOB,1,1)),
       LOWER(SUBSTR(JOB,2))
       ) AS DESCRIPTION
FROM EMP;

+----------------------+
| DESCRIPTION          |
+----------------------+
| SMITH IS A Clerk     |
| ALLEN IS A Salesman  |
| WARD IS A Salesman   |
| JONES IS A Manager   |
| MARTIN IS A Salesman |
| BLAKE IS A Manager   |
| CLARK IS A Manager   |
| SCOTT IS A Analyst   |
| KING IS A President  |
| TURNER IS A Salesman |
| ADAMS IS A Clerk     |
| JAMES IS A Clerk     |
| FORD IS A Analyst    |
| MILLER IS A Clerk    |
+----------------------+

-- Assignment NO 19
SELECT CONCAT(
       ENAME, ',',
       EMPNO, ',',
       JOB, ',',
       IFNULL(MGR,'N/A'), ',',
       HIREDATE, ',',
       SAL, ',',
       IFNULL(COMM,'N/A'), ',',
       DEPTNO
       ) AS DESCRIPTION
FROM EMP;
+---------------------------------------------------------+
| DESCRIPTION                                             |
+---------------------------------------------------------+
| SMITH,7369,CLERK,7902,1980-12-17,968.00,N/A,20          |
| ALLEN,7499,SALESMAN,7698,1981-02-20,1600.00,300.00,30   |
| WARD,7521,SALESMAN,7698,1981-02-22,1250.00,500.00,30    |
| JONES,7566,MANAGER,7839,1981-04-02,3183.25,N/A,20       |
| MARTIN,7654,SALESMAN,7698,1981-09-28,1250.00,1400.00,30 |
| BLAKE,7698,MANAGER,7839,1981-05-01,3049.50,N/A,30       |
| CLARK,7782,MANAGER,7839,1981-06-09,2621.50,N/A,10       |
| SCOTT,7788,ANALYST,7566,1982-12-09,3000.00,N/A,20       |
| KING,7839,PRESIDENT,N/A,1981-11-17,5000.00,N/A,10       |
| TURNER,7844,SALESMAN,7698,1981-09-08,1500.00,0.00,30    |
| ADAMS,7876,CLERK,7788,1983-01-12,1331.00,N/A,20         |
| JAMES,7900,CLERK,7698,1981-12-03,1149.50,N/A,30         |
| FORD,7902,ANALYST,7566,1981-12-03,3000.00,N/A,20        |
| MILLER,7934,CLERK,7782,1982-01-23,1573.00,N/A,10        |
+---------------------------------------------------------+

-- Assignment NO 20
SELECT * 
FROM EMP 
WHERE DAYNAME(HIREDATE) = 'Monday';

+-------+--------+----------+------+------------+---------+---------+--------+
| EMPNO | ENAME  | JOB      | MGR  | HIREDATE   | SAL     | COMM    | DEPTNO |
+-------+--------+----------+------+------------+---------+---------+--------+
|  7654 | MARTIN | SALESMAN | 7698 | 1981-09-28 | 1250.00 | 1400.00 |     30 |
+-------+--------+----------+------+------------+---------+---------+--------+

-- Assignment NO 21

SELECT CONCAT(DATE_FORMAT(HIREDATE,'%M'),' ',
DATE_FORMAT(HIREDATE,'%d'),',',
DATE_FORMAT(HIREDATE,'%Y'))
AS HIREDATE_FORMAT
FROM EMP;

+--------------------+
| HIREDATE_FORMAT    |
+--------------------+
| December 17, 1980  |
| February 20, 1981  |
| February 22, 1981  |
| April 02, 1981     |
| September 28, 1981 |
| May 01, 1981       |
| June 09, 1981      |
| December 09, 1982  |
| November 17, 1981  |
| September 08, 1981 |
| January 12, 1983   |
| December 03, 1981  |
| December 03, 1981  |
| January 23, 1982   |
+--------------------+