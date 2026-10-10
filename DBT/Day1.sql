-- Assignment No 1

CREATE TABLE Vehicle(
    vid INT,
    vname VARCHAR(15),
    price INT,
    discount FLOAT(5,2),
    milage INT,
    category VARCHAR(10),
    details VARCHAR(100)
);

CREATE TABLE customer(
    custid INT,
    cname VARCHAR(15),
    location VARCHAR(100)
);

CREATE TABLE Salesman(
    sid INT,
    sname VARCHAR(15),
	city VARCHAR(10),
    experience float(2,1)
);

INSERT INTO vehicle
VALUES(1,'Activa',80000,10,35,'Bike','Two Wheeler.Sturdy.Milage 30 km'),
(2,'Santro',95000,20,20,'Car','Product of Hyandai'),
(3,'Yamaha',160000,5,70,'Bike','Sturdy and good milage'),
(4,'I-10',300000,8,18,'Car','Good small car'),
(5,'WaganR',250000,10,25,'Car','Good milage car'),
(6,'Hero splendor',75000,9,65,'Bike','Best bike'),
(7,'Royal Enfild',190000,5,40,'Bike','a royal bike');

--Check table
 SELECT * FROM vehicle;
+------+---------------+--------+----------+--------+----------+---------------------------------+
| vid  | vname         | price  | discount | milage | category | details                         |
+------+---------------+--------+----------+--------+----------+---------------------------------+
|    1 | Activa        |  80000 |    10.00 |     35 | Bike     | Two Wheeler.Sturdy.Milage 30 km |
|    2 | Santro        |  95000 |    20.00 |     20 | Car      | Product of Hyandai              |
|    3 | Yamaha        | 160000 |     5.00 |     70 | Bike     | Sturdy and good milage          |
|    4 | I-10          | 300000 |     8.00 |     18 | Car      | Good small car                  |
|    5 | WaganR        | 250000 |    10.00 |     25 | Car      | Good milage car                 |
|    6 | Hero splendor |  75000 |     9.00 |     65 | Bike     | Best bike                       |
|    7 | Royal Enfild  | 190000 |     5.00 |     40 | Bike     | a royal bike                    |
+------+---------------+--------+----------+--------+----------+---------------------------------+


INSERT INTO customer
VALUES
(1,'Nilima','Pimpri'),
(2,'Ganesh','Pune'),
(3,'Kishor','Kothrud'),
(4,'Priya','Aundh');

SELECT * FROM customer;

+--------+--------+----------+
| custid | cname  | location |
+--------+--------+----------+
|      1 | Nilima | Pimpri   |
|      2 | Ganesh | Pune     |
|      3 | Kishor | Kothrud  |
|      4 | Priya  | Aundh    |
+--------+--------+----------+

INSERT INTO Salesman
VALUES
(10,'Rajesh','Mumbai',5),
(11,'Seema','Pune',8),
(12,'Shailesh','Nagpur',7),
(4,'Rakhi','Pune',2);

SELECT * FROM Salesman;

+------+----------+--------+------------+
| sid  | sname    | city   | experience |
+------+----------+--------+------------+
|   10 | Rajesh   | Mumbai |        5.0 |
|   11 | Seema    | Pune   |        8.0 |
|   12 | Shailesh | Nagpur |        7.0 |
|    4 | Rakhi    | Pune   |        2.0 |
+------+----------+--------+------------+

-- Assignment No 2


SELECT * 
FROM Salesman
WHERE city='Pune';

+------+-------+------+------------+
| sid  | sname | city | experience |
+------+-------+------+------------+
|   11 | Seema | Pune |        8.0 |
|    4 | Rakhi | Pune |        2.0 |
+------+-------+------+------------+

-- Assignment No 3
SELECT * 
FROM Salesman
WHERE city='Pune' or city='Mumbai';

+------+--------+--------+------------+
| sid  | sname  | city   | experience |
+------+--------+--------+------------+
|   10 | Rajesh | Mumbai |        5.0 |
|   11 | Seema  | Pune   |        8.0 |
|    4 | Rakhi  | Pune   |        2.0 |
+------+--------+--------+------------+

-- Assignment No 4
INSERT INTO customer
VALUES
(5,'Geeta','Pimpri'),
(6,'Raj','Aundh'),
(7,'Yash','Aundh');

SELECT * FROM customer;
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


-- Assignment No 5
SELECT * 
FROM Vehicle
WHERE vname='Royal Enfild';

+------+--------------+--------+----------+--------+----------+--------------+
| vid  | vname        | price  | discount | milage | category | details      |
+------+--------------+--------+----------+--------+----------+--------------+
|    7 | Royal Enfild | 190000 |     5.00 |     40 | Bike     | a royal bike |
+------+--------------+--------+----------+--------+----------+--------------+

-- Assignment No 6
SELECT * 
FROM Vehicle
WHERE category='Bike';


+------+---------------+--------+----------+--------+----------+---------------------------------+
| vid  | vname         | price  | discount | milage | category | details                         |
+------+---------------+--------+----------+--------+----------+---------------------------------+
|    1 | Activa        |  80000 |    10.00 |     35 | Bike     | Two Wheeler.Sturdy.Milage 30 km |
|    3 | Yamaha        | 160000 |     5.00 |     70 | Bike     | Sturdy and good milage          |
|    6 | Hero splendor |  75000 |     9.00 |     65 | Bike     | Best bike                       |
|    7 | Royal Enfild  | 190000 |     5.00 |     40 | Bike     | a royal bike                    |
+------+---------------+--------+----------+--------+----------+---------------------------------+


-- Assignment No 7
SELECT vid,vname,price,details,
price-discount 'total price'
FROM Vehicle;

+------+---------------+--------+---------------------------------+-------------+
| vid  | vname         | price  | details                         | total price |
+------+---------------+--------+---------------------------------+-------------+
|    1 | Activa        |  80000 | Two Wheeler.Sturdy.Milage 30 km |    79990.00 |
|    2 | Santro        |  95000 | Product of Hyandai              |    94980.00 |
|    3 | Yamaha        | 160000 | Sturdy and good milage          |   159995.00 |
|    4 | I-10          | 300000 | Good small car                  |   299992.00 |
|    5 | WaganR        | 250000 | Good milage car                 |   249990.00 |
|    6 | Hero splendor |  75000 | Best bike                       |    74991.00 |
|    7 | Royal Enfild  | 190000 | a royal bike                    |   189995.00 |
+------+---------------+--------+---------------------------------+-------------+


-- Assignment No 8

SELECT *
FROM Vehicle
WHERE price<100000

+------+---------------+-------+----------+--------+----------+---------------------------------+
| vid  | vname         | price | discount | milage | category | details                         |
+------+---------------+-------+----------+--------+----------+---------------------------------+
|    1 | Activa        | 80000 |    10.00 |     35 | Bike     | Two Wheeler.Sturdy.Milage 30 km |
|    2 | Santro        | 95000 |    20.00 |     20 | Car      | Product of Hyandai              |
|    6 | Hero splendor | 75000 |     9.00 |     65 | Bike     | Best bike                       |
+------+---------------+-------+----------+--------+----------+---------------------------------+


-- Assignment No 9

SELECT *
FROM Salesman
WHERE experience >5;

+------+----------+--------+------------+
| sid  | sname    | city   | experience |
+------+----------+--------+------------+
|   11 | Seema    | Pune   |        8.0 |
|   12 | Shailesh | Nagpur |        7.0 |
+------+----------+--------+------------+

-- Assignment No 10
SELECT * 
FROM Vehicle
WHERE vname='i-10';

+------+-------+--------+----------+--------+----------+----------------+
| vid  | vname | price  | discount | milage | category | details        |
+------+-------+--------+----------+--------+----------+----------------+
|    4 | I-10  | 300000 |     8.00 |     18 | Car      | Good small car |
+------+-------+--------+----------+--------+----------+----------------+


-- Assignment No 11
SELECT vid 'Vehicle id',
vname 'Vehicle name', 
price 'Price',
details 'Details',
discount 'Discount'
FROM Vehicle;

+------------+---------------+--------+---------------------------------+----------+
| Vehicle id | Vehicle name  | Price  | Details                         | Discount |
+------------+---------------+--------+---------------------------------+----------+
|          1 | Activa        |  80000 | Two Wheeler.Sturdy.Milage 30 km |    10.00 |
|          2 | Santro        |  95000 | Product of Hyandai              |    20.00 |
|          3 | Yamaha        | 160000 | Sturdy and good milage          |     5.00 |
|          4 | I-10          | 300000 | Good small car                  |     8.00 |
|          5 | WaganR        | 250000 | Good milage car                 |    10.00 |
|          6 | Hero splendor |  75000 | Best bike                       |     9.00 |
|          7 | Royal Enfild  | 190000 | a royal bike                    |     5.00 |
+------------+---------------+--------+---------------------------------+----------+


-- Assignment No 12

SELECT * 
FROM Salesman
WHERE city='Pune' AND experience>5;

+------+-------+------+------------+
| sid  | sname | city | experience |
+------+-------+------+------------+
|   11 | Seema | Pune |        8.0 |
+------+-------+------+------------+




--UPDATE CLAUSE ASSIGNMENT NO 1

SELECT * FROM VEHICLE;
+------+---------------+--------+----------+--------+----------+---------------------------------+
| vid  | vname         | price  | discount | milage | category | details                         |
+------+---------------+--------+----------+--------+----------+---------------------------------+
|    1 | Activa        |  80000 |    10.00 |     35 | Bike     | Two Wheeler.Sturdy.Milage 30 km |
|    2 | Santro        |  95000 |    20.00 |     20 | Car      | Product of Hyandai              |
|    3 | Yamaha        | 160000 |     5.00 |     70 | Bike     | Sturdy and good milage          |
|    4 | I-10          | 300000 |     8.00 |     18 | Car      | Good small car                  |
|    5 | WaganR        | 250000 |    10.00 |     25 | Car      | Good milage car                 |
|    6 | Hero splendor |  75000 |     9.00 |     65 | Bike     | Best bike                       |
|    7 | Royal Enfild  | 190000 |     5.00 |     40 | Bike     | a royal bike                    |
+------+---------------+--------+----------+--------+----------+---------------------------------+
7 rows in set (0.00 sec)

UPDATE Vehicle
SET PRICE =  80000
WHERE PRICE=75000;

-- AFTER CHANGE
SELECT * FROM VEHICLE;
+------+---------------+--------+----------+--------+----------+---------------------------------+
| vid  | vname         | price  | discount | milage | category | details                         |
+------+---------------+--------+----------+--------+----------+---------------------------------+
|    1 | Activa        |  80000 |    10.00 |     35 | Bike     | Two Wheeler.Sturdy.Milage 30 km |
|    2 | Santro        |  95000 |    20.00 |     20 | Car      | Product of Hyandai              |
|    3 | Yamaha        | 160000 |     5.00 |     70 | Bike     | Sturdy and good milage          |
|    4 | I-10          | 300000 |     8.00 |     18 | Car      | Good small car                  |
|    5 | WaganR        | 250000 |    10.00 |     25 | Car      | Good milage car                 |
|    6 | Hero splendor |  80000 |     9.00 |     65 | Bike     | Best bike                       |
|    7 | Royal Enfild  | 190000 |     5.00 |     40 | Bike     | a royal bike                    |
+------+---------------+--------+----------+--------+----------+---------------------------------+


