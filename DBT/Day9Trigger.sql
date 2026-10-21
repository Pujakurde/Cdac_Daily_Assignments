--Day9Trigger
--use day9;
--assignment no 1
create table product(
pid int,
pname VARCHAR(20),
price float(5,2),
qty int
);
 
insert into product
values( 1,'Pen',10.00,72),
(2,'Eraser',5.00,99),
(3,'Pencil',6.00,400);

ALTER TABLE product
add column amt FLOAT(7,2) ;

create table product_details(
pid int,
amt float(5,2));

delimiter //
create TRIGGER pd_update
before update 
on product
for each ROW
begin 
insert into product_details
values (old.pid,OLD.amt);
end//

delimiter ;

update product
set amt = price*qty ;

select * from product_details;

+------+------+
| pid  | amt  |
+------+------+
|    1 | NULL |
|    2 | NULL |
|    3 | NULL |
+------+------+


select * from product;
+------+--------+-------+------+---------+
| pid  | pname  | price | qty  | amt     |
+------+--------+-------+------+---------+
|    1 | Pen    | 10.00 |   72 |  720.00 |
|    2 | Eraser |  5.00 |   99 |  495.00 |
|    3 | Pencil |  6.00 |  400 | 2400.00 |
+------+--------+-------+------+---------+

--assignment no 2
create table emp_wage(
eno int,
ename VARCHAR(20),
sal float(7,2),
over_time int 
);
alter table emp_wage
add CONSTRAINT pk_no primary key(eno);

ALTER TABLE emp_wage
MODIFY eno INT AUTO_INCREMENT;

drop trigger if exists overTime_insert;
delimiter //
create trigger overTime_insert
before insert
on emp_wage
for each row
begin
   IF NEW.over_time IS NULL THEN
     set new.over_time=400;
   end if;
end //
delimiter ;

insert into emp_wage
values(1,'amit',20000.00,200);

INSERT INTO emp_wage(ename,sal,over_time)
VALUES
('amul',50000.00,null);

SELECT * FROM emp_wage;

+-----+-------+----------+-----------+
| eno | ename | sal      | over_time |
+-----+-------+----------+-----------+
|   1 | amit  | 20000.00 |       200 |
|   2 | amul  | 50000.00 |       400 |
+-----+-------+----------+-----------+

--assignment no 3
CREATE TABLE order_master
(oid int primary key AUTO_INCREMENT,
pname varchar(20),
qty int,
price float(7,2));



insert into order_master(pname,qty,price)
values('Pen',10.00,72),
('Eraser',5.00,99),
('Pencil',6.00,400);

ALTER TABLE order_master
add column amt FLOAT(7,2) ;


CREATE TABLE order_log
(oid int,
odate date,
amt float(7,2));

drop trigger if exists od_insert;
delimiter //
create TRIGGER od_insert
after insert
on order_master
for each ROW
begin 
insert into order_log
values (new.oid,now(),new.qty*new.price);
end//

delimiter ;

INSERT INTO order_master(pname,qty,price)
VALUES('Scale',2,50);


select * from order_log;

+------+------------+--------+
| oid  | odate      | amt    |
+------+------------+--------+
|    4 | 2026-10-18 | 100.00 |
+------+------------+--------+

 select * from order_master;
+-----+--------+------+--------+---------+
| oid | pname  | qty  | price  | amt     |
+-----+--------+------+--------+---------+
|   1 | Pen    |   10 |  72.00 |  720.00 |
|   2 | Eraser |    5 |  99.00 |  495.00 |
|   3 | Pencil |    6 | 400.00 | 2400.00 |
|   4 | Scale  |    2 |  50.00 |    NULL |
+-----+--------+------+--------+---------+