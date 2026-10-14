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

