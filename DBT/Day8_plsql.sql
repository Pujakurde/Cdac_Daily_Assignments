-- Assignment no 1
delimiter //
drop procedure if exists display_avg_sal;
create procedure display_avg_sal()
BEGIN 
	SELECT avg(sal)
	FROM EMP;
END //
delimiter ;

call display_avg_sal();

+-------------+
| avg(sal)    |
+-------------+
| 2176.839286 |
+-------------+

-- Assignment no 2
delimiter //
drop procedure if exists display_avg_sal;
create procedure display_avg_sal()
BEGIN 
	SELECT avg(sal)
	FROM EMP
	WHERE DEPTNO=20;
END //
delimiter ;

call display_avg_sal();

+-------------+
| avg(sal)    |
+-------------+
| 2296.450000 |
+-------------+


-- Assignment no 3
delimiter //
drop procedure if exists display_avg_sal;
create procedure display_avg_sal(dno int)
BEGIN 
	SELECT avg(sal)
	FROM EMP
	WHERE DEPTNO=dno;
END //
delimiter ;

call display_avg_sal(20);
+-------------+
| avg(sal)    |
+-------------+
| 2296.450000 |
+-------------+

call display_avg_sal(30);
+-------------+
| avg(sal)    |
+-------------+
| 1633.166667 |
+-------------+


-- Assignment no 4
delimiter //
drop procedure if exists display_tot_sal;
create procedure display_tot_sal(n int)
BEGIN 
	SELECT sal+ifnull(comm,0) as "Total Salary"
	FROM EMP
	where empno=n;
END //
delimiter ;

call display_tot_sal(7369);

+--------------+
| Total Salary |
+--------------+
|       968.00 |
+--------------+

-- Assignment no 5
--

delimiter //
drop procedure if exists find_sal;
create procedure find_sal(mempno int,out msal decimal(7,2))
begin
	declare vempno int;
	declare vsal decimal(7,2);
	select empno,sal into vempno,vsal
	from emp
	where empno=mempno;
	if vempno = mempno
	then 
		set msal=vsal;
	ELSE
		set msal=0;
	end if;
end//
delimiter ;

call find_sal(7369,@x);

select @x as salary;

+--------+
| salary |
+--------+
| 968.00 |
+--------+


-- Assignment no 6

delimiter //
drop procedure if exists find_name;
create procedure find_name(In mempno int,out mname VARCHAR(20))
begin
	select ename into mname
	from emp
	where empno=mempno;
end//
delimiter ;

call find_name(7369,@x);

select @x as name;

+-------+
| name  |
+-------+
| SMITH |
+-------+

-- Assignment no 7
delimiter //
drop procedure if exists display_date;
create procedure display_date(in d date)
begin
  select count(*)
  from emp
  where YEAR(hiredate)=YEAR(d);
end //
delimiter ;
call display_date('1980-12-17');

+----------+
| count(*) |
+----------+
|        1 |
+----------+

-- Assignment no 8
delimiter //
drop procedure if exists display_job;
create procedure display_job(in empno int)
begin
  select empno,mgr,ename
  from emp
  where job='manager';
end //
delimiter ;
call display_job(7782);

+-------+------+-------+
| empno | mgr  | ename |
+-------+------+-------+
|  7782 | 7839 | JONES |
|  7782 | 7839 | BLAKE |
|  7782 | 7839 | CLARK |
+-------+------+-------+
-- Assignment no 9
delimiter //
drop procedure if exists find_name;
create procedure find_name(In mempno int,out mname VARCHAR(20))
begin
	select ename into mname
	from emp
	where empno=mempno;
end//
delimiter ;

call find_name(7369,@x);

select @x as name;

+-------+
| name  |
+-------+
| SMITH |
+-------+
-- Assignment no 10
delimiter //
drop procedure if exists display_tot_sal;
create procedure display_tot_sal(n int)
BEGIN 
	SELECT sal+ifnull(comm,0) as "Total Salary"
	FROM EMP
	where empno=n;
END //
delimiter ;

call display_tot_sal(7369);

+--------------+
| Total Salary |
+--------------+
|       968.00 |
+--------------+

-- Assignment no 11
delimiter //
drop procedure if exists display_avg_sal;
create procedure display_avg_sal(dno int)
BEGIN 
	SELECT avg(sal)
	FROM EMP
	WHERE DEPTNO=dno;
END //
delimiter ;

call display_avg_sal(20);
+-------------+
| avg(sal)    |
+-------------+
| 2296.450000 |
+-------------+

call display_avg_sal(30);
+-------------+
| avg(sal)    |
+-------------+
| 1633.166667 |
+-------------+

