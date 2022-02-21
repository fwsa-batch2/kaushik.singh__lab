mysql> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| kaushik            |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.01 sec)

mysql> CREATE DATABASE School;
Query OK, 1 row affected (0.01 sec)

mysql> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| School             |
| information_schema |
| kaushik            |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
6 rows in set (0.00 sec)

mysql> USE School;
Database changed
mysql>  CREATE TABLE Students(Id int primary key auto_increment, Firstname varchar(255) NOT NULL, Secondname varchar(255) NOT NULL,Email varchar(255) UNIQUE NOT
 NULL, Age int(2) NOT NULL, dateofbirth date NOT NULL);
Query OK, 0 rows affected, 1 warning (0.04 sec)

mysql> SHOW TABLES;
+------------------+
| Tables_in_School |
+------------------+
| Students         |
+------------------+
1 row in set (0.00 sec)

mysql> DESC Students;
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| Id          | int          | NO   | PRI | NULL    | auto_increment |
| Firstname   | varchar(255) | NO   |     | NULL    |                |
| Secondname  | varchar(255) | NO   |     | NULL    |                |
| Email       | varchar(255) | NO   | UNI | NULL    |                |
| Age         | int          | NO   |     | NULL    |                |
| dateofbirth | date         | NO   |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
6 rows in set (0.00 sec)

mysql> INSERT INTO Students (Firstname,Secondname,Email,Age,dateofbirth) VALUES
('Aswath','kaja','Aswathkaja007@gmail.com','17','16-02-2004');
ERROR 1292 (22007): Incorrect date value: '16-02-2004' for column 'dateofbirth' at row 1
mysql> INSERT INTO Students (Firstname,Secondname,Email,Age,dateofbirth) VALUES
('Aswath','kaja','Aswathkaja007@gmail.com','17','2004-02-16');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO Students (Firstname,Secondname,Email,Age,dateofbirth) VALUES
('Vimal','raj','vimal@gmail.com','19','2002-12-20');
Query OK, 1 row affected (0.00 sec)

mysql> INSERT INTO Students (Firstname,Secondname,Email,Age,dateofbirth) VALUES
('Prasanna','venkatesh','prasannavenkatesh@gmail.com','21','2001-01-20');
Query OK, 1 row affected (0.02 sec)

mysql> SELECT * FROM Students;
+----+-----------+------------+-----------------------------+-----+-------------+
| Id | Firstname | Secondname | Email                       | Age | dateofbirth |
+----+-----------+------------+-----------------------------+-----+-------------+
|  1 | Aswath    | kaja       | Aswathkaja007@gmail.com     |  17 | 2004-02-16  |
|  2 | Vimal     | raj        | vimal@gmail.com             |  19 | 2002-12-20  |
|  3 | Prasanna  | venkatesh  | prasannavenkatesh@gmail.com |  21 | 2001-01-20  |
+----+-----------+------------+-----------------------------+-----+-------------+
3 rows in set (0.00 sec)

mysql> SELECT * FROM Students WHERE Id='1';
+----+-----------+------------+-------------------------+-----+-------------+
| Id | Firstname | Secondname | Email                   | Age | dateofbirth |
+----+-----------+------------+-------------------------+-----+-------------+
|  1 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  |
+----+-----------+------------+-------------------------+-----+-------------+
1 row in set (0.00 sec)

mysql> ALTER TABLE Students ADD Class varchar(70);
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> ALTER TABLE Students MODIFY COLUMN Class char(100);
Query OK, 3 rows affected (0.05 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> DESC students;
ERROR 1146 (42S02): Table 'School.students' doesn't exist
mysql> DESC Students;
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| Id          | int          | NO   | PRI | NULL    | auto_increment |
| Firstname   | varchar(255) | NO   |     | NULL    |                |
| Secondname  | varchar(255) | NO   |     | NULL    |                |
| Email       | varchar(255) | NO   | UNI | NULL    |                |
| Age         | int          | NO   |     | NULL    |                |
| dateofbirth | date         | NO   |     | NULL    |                |
| Class       | char(100)    | YES  |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
7 rows in set (0.00 sec)

mysql> SELECT * FROM Students;
+----+-----------+------------+-----------------------------+-----+-------------+-------+
| Id | Firstname | Secondname | Email                       | Age | dateofbirth | Class |
+----+-----------+------------+-----------------------------+-----+-------------+-------+
|  1 | Aswath    | kaja       | Aswathkaja007@gmail.com     |  17 | 2004-02-16  | NULL  |
|  2 | Vimal     | raj        | vimal@gmail.com             |  19 | 2002-12-20  | NULL  |
|  3 | Prasanna  | venkatesh  | prasannavenkatesh@gmail.com |  21 | 2001-01-20  | NULL  |
+----+-----------+------------+-----------------------------+-----+-------------+-------+
3 rows in set (0.00 sec)

mysql>  UPDATE Students SET Class = "XII" WHERE Id = 1;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql>  UPDATE Students SET Class = "X" WHERE Id = 2;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql>  UPDATE Students SET Class = "XII" WHERE Id = 3;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> SELECT * FROM Students;
+----+-----------+------------+-----------------------------+-----+-------------+-------+
| Id | Firstname | Secondname | Email                       | Age | dateofbirth | Class |
+----+-----------+------------+-----------------------------+-----+-------------+-------+
|  1 | Aswath    | kaja       | Aswathkaja007@gmail.com     |  17 | 2004-02-16  | XII   |
|  2 | Vimal     | raj        | vimal@gmail.com             |  19 | 2002-12-20  | X     |
|  3 | Prasanna  | venkatesh  | prasannavenkatesh@gmail.com |  21 | 2001-01-20  | XII   |
+----+-----------+------------+-----------------------------+-----+-------------+-------+
3 rows in set (0.00 sec)

mysql> DELETE FROM Students WHERE Id=3;
Query OK, 1 row affected (0.01 sec)

mysql> SELECT * FROM Students;
+----+-----------+------------+-------------------------+-----+-------------+-------+
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
+----+-----------+------------+-------------------------+-----+-------------+-------+
|  1 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
|  2 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | X     |
+----+-----------+------------+-------------------------+-----+-------------+-------+
2 rows in set (0.00 sec)

mysql> DROP TABLE Students;
Query OK, 0 rows affected (0.02 sec)

mysql> DROP DATABASE School;
Query OK, 0 rows affected (0.02 sec)

mysql> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| kaushik            |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.00 sec)

mysql>  CREATE TABLE Constraints(Firstname varchar(255) NOT NULL);
ERROR 1046 (3D000): No database selected
mysql> CREATE DATABASES school;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'DATABASES school' at line 1
mysql> CREATE DATABASE school;
Query OK, 1 row affected (0.01 sec)

mysql> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| kaushik            |
| mysql              |
| performance_schema |
| school             |
| sys                |
+--------------------+
6 rows in set (0.00 sec)

mysql> USE school;
Database changed
mysql>  CREATE TABLE Constraints(Firstname varchar(255) NOT NULL);
Query OK, 0 rows affected (0.03 sec)

mysql>  CREATE TABLE Constraints(Secondname varchar(255) NOT NULL);
ERROR 1050 (42S01): Table 'Constraints' already exists
mysql>  CREATE TABLE Constraints(Email varchar(255) UNIQUE);
ERROR 1050 (42S01): Table 'Constraints' already exists
mysql>  CREATE TABLE Constraints(Email varchar(255) UNIQUE);
ERROR 1050 (42S01): Table 'Constraints' already exists
mysql> DROP DATABASE school;
Query OK, 1 row affected (0.02 sec)

mysql> CREATE DATABASE school;
Query OK, 1 row affected (0.01 sec)

mysql> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| kaushik            |
| mysql              |
| performance_schema |
| school             |
| sys                |
+--------------------+
6 rows in set (0.00 sec)

mysql> USE school;
Database changed
mysql> CREATE TABLE students(Id int(3) PRIMARY KEY AUTO_INCREMENT, Firstname varchar(255) NOT NULL, Secondname varchar(255) NOT NULL, Email varchar(255) UNIQUE, Age int(2) NOT NULL, dateofbi
rth date NOT NULL, Class varchar(255) DEFAULT 'XII', CHECK (Age>=3));
Query OK, 0 rows affected, 2 warnings (0.03 sec)

mysql> SELECT * FROM students;
Empty set (0.00 sec)

mysql> DESC students;
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| Id          | int          | NO   | PRI | NULL    | auto_increment |
| Firstname   | varchar(255) | NO   |     | NULL    |                |
| Secondname  | varchar(255) | NO   |     | NULL    |                |
| Email       | varchar(255) | YES  | UNI | NULL    |                |
| Age         | int          | NO   |     | NULL    |                |
| dateofbirth | date         | NO   |     | NULL    |                |
| Class       | varchar(255) | YES  |     | XII     |                |
+-------------+--------------+------+-----+---------+----------------+
7 rows in set (0.00 sec)

mysql> INSERT INTO students (Firstname,Secondname,Email,Age,dateofbirth) VALUES ('Aswath','kaja','Aswathkaja007@gmail.com','17','2004-02-16','');
ERROR 1136 (21S01): Column count doesn't match value count at row 1
mysql> INSERT INTO students (Firstname,Secondname,Email,Age,dateofbirth) VALUES ('Aswath','kaja','Aswathkaja007@gmail.com','17','2004-02-16','XII');
ERROR 1136 (21S01): Column count doesn't match value count at row 1
mysql> INSERT INTO students (Firstname,Secondname,Email,Age,dateofbirth) VALUES ('Vimal','raj','vimal@gmail.com','19','2002-12-20');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO students (Firstname,Secondname,Email,Age,dateofbirth) VALUES ('Aswath','kaja','Aswathkaja007@gmail.com','17','2004-02-16');
Query OK, 1 row affected (0.01 sec)

mysql> SELECT * FROM students;
+----+-----------+------------+-------------------------+-----+-------------+-------+
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
+----+-----------+------------+-------------------------+-----+-------------+-------+
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
+----+-----------+------------+-------------------------+-----+-------------+-------+
2 rows in set (0.00 sec)

mysql> CREATE TABLE Coach(studId int PRIMARY KEY AUTO_INCREMENT, mark int(3), Id int, FOREIGN KEY(Id) REFERENCES constraints(Id));
ERROR 1824 (HY000): Failed to open the referenced table 'constraints'
mysql> CREATE TABLE Coach(studId int PRIMARY KEY AUTO_INCREMENT, mark int(3), Id int, FOREIGN KEY(Id) REFERENCES school(Id));
ERROR 1824 (HY000): Failed to open the referenced table 'school'
mysql> CREATE TABLE Coach(studId int PRIMARY KEY AUTO_INCREMENT, mark int(3), Id int, FOREIGN KEY(Id) REFERENCES students(Id));
Query OK, 0 rows affected, 1 warning (0.03 sec)

mysql> INSERT INTO Coach(mark,PersonId) VALUES (100,1);
ERROR 1054 (42S22): Unknown column 'PersonId' in 'field list'
mysql> INSERT INTO Coach(mark,Id) VALUES (100,1);
Query OK, 1 row affected (0.01 sec)

mysql> DESC Coach;
+--------+------+------+-----+---------+----------------+
| Field  | Type | Null | Key | Default | Extra          |
+--------+------+------+-----+---------+----------------+
| studId | int  | NO   | PRI | NULL    | auto_increment |
| mark   | int  | YES  |     | NULL    |                |
| Id     | int  | YES  | MUL | NULL    |                |
+--------+------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

mysql> SELECT * FROM Coach;
+--------+------+------+
| studId | mark | Id   |
+--------+------+------+
|      1 |  100 |    1 |
+--------+------+------+
1 row in set (0.00 sec)

mysql> SELECT * FROM students;
+----+-----------+------------+-------------------------+-----+-------------+-------+
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
+----+-----------+------------+-------------------------+-----+-------------+-------+
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
+----+-----------+------------+-------------------------+-----+-------------+-------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM students WHERE Class = 'XII' AND Age = 19;
+----+-----------+------------+-----------------+-----+-------------+-------+
| Id | Firstname | Secondname | Email           | Age | dateofbirth | Class |
+----+-----------+------------+-----------------+-----+-------------+-------+
|  1 | Vimal     | raj        | vimal@gmail.com |  19 | 2002-12-20  | XII   |
+----+-----------+------------+-----------------+-----+-------------+-------+
1 row in set (0.00 sec)

mysql> SELECT * FROM students WHERE NOT Age = 21;
+----+-----------+------------+-------------------------+-----+-------------+-------+
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
+----+-----------+------------+-------------------------+-----+-------------+-------+
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
+----+-----------+------------+-------------------------+-----+-------------+-------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM students WHERE Age BETWEEN 10 AND 22;
+----+-----------+------------+-------------------------+-----+-------------+-------+
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
+----+-----------+------------+-------------------------+-----+-------------+-------+
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
+----+-----------+------------+-------------------------+-----+-------------+-------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM students WHERE Class IN ('XII');
+----+-----------+------------+-------------------------+-----+-------------+-------+
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
+----+-----------+------------+-------------------------+-----+-------------+-------+
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
+----+-----------+------------+-------------------------+-----+-------------+-------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM students WHERE Firstname LIKE 'As%';
+----+-----------+------------+-------------------------+-----+-------------+-------+
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
+----+-----------+------------+-------------------------+-----+-------------+-------+
|  2 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
+----+-----------+------------+-------------------------+-----+-------------+-------+
1 row in set (0.00 sec)

mysql> CREATE TABLE Markclass_A(Id int,Mark int,Name varchar(100));
Query OK, 0 rows affected (0.03 sec)

mysql> INSERT INTO markclass_A (Id,Mark,Name) VALUES (1,10,'Vimal'),(2,0,'Aswath');
ERROR 1146 (42S02): Table 'school.markclass_A' doesn't exist
mysql> INSERT INTO Markclass_A (Id,Mark,Name) VALUES (1,10,'Vimal'),(2,0,'Aswath');
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM markclass_A;
ERROR 1146 (42S02): Table 'school.markclass_A' doesn't exist
mysql> SELECT * FROM Markclass_A;
+------+------+--------+
| Id   | Mark | Name   |
+------+------+--------+
|    1 |   10 | Vimal  |
|    2 |    0 | Aswath |
+------+------+--------+
2 rows in set (0.00 sec)

mysql> CREATE TABLE Markclass_B(Id int,Mark int,Name varchar(100));
Query OK, 0 rows affected (0.02 sec)

mysql> INSERT INTO Markclass_B (Id,Mark,Name) VALUES (1,10,'haiden'),(2,0,'prasana');
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM Markclass_B;
+------+------+---------+
| Id   | Mark | Name    |
+------+------+---------+
|    1 |   10 | haiden  |
|    2 |    0 | prasana |
+------+------+---------+
2 rows in set (0.00 sec)

mysql> SELECT Mark FROM Markclass_A WHERE mark = ANY(SELECT mark FROM markclass_B);
ERROR 1146 (42S02): Table 'school.markclass_B' doesn't exist
mysql> SELECT Mark FROM Markclass_A WHERE mark = ANY(SELECT mark FROM Markclass_B);
+------+
| Mark |
+------+
|   10 |
|    0 |
+------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM students;
+----+-----------+------------+-------------------------+-----+-------------+-------+
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
+----+-----------+------------+-------------------------+-----+-------------+-------+
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
+----+-----------+------------+-------------------------+-----+-------------+-------+
2 rows in set (0.00 sec)

mysql> SELECT MIN(age) FROM Students;
ERROR 1146 (42S02): Table 'school.Students' doesn't exist
mysql> SELECT MIN(age) FROM students;
+----------+
| MIN(age) |
+----------+
|       17 |
+----------+
1 row in set (0.00 sec)

mysql> SELECT MAX(age) FROM students;
+----------+
| MAX(age) |
+----------+
|       19 |
+----------+
1 row in set (0.00 sec)

mysql> SELECT AVG(age) FROM students;
+----------+
| AVG(age) |
+----------+
|  18.0000 |
+----------+
1 row in set (0.00 sec)

mysql> SELECT COUNT(age) FROM Students;
ERROR 1146 (42S02): Table 'school.Students' doesn't exist
mysql> SELECT COUNT(age) FROM students;
+------------+
| COUNT(age) |
+------------+
|          2 |
+------------+
1 row in set (0.00 sec)

mysql> SELECT SUM(age) FROM Studentslist;
ERROR 1146 (42S02): Table 'school.Studentslist' doesn't exist
mysql> SELECT SUM(age) FROM students;
+----------+
| SUM(age) |
+----------+
|       36 |
+----------+
1 row in set (0.00 sec)

mysql> 

