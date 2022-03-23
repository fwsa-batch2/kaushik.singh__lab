
#### MLG  DATABASE...

```syntax
use mlg;
```

### CREATING TABLE user ...
```syntax
CREATE TABLE user (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Firstname VARCHAR(255) NOT NULL,
    Lastname VARCHAR(255) NOT NULL,
    Email VARCHAR(255) UNIQUE NOT NULL,
    dob DATE NOT NULL,
    password VARCHAR(255) NOT NULL,
    status VARCHAR(10) DEFAULT 'ACTIVE' CHECK (status IN ('ACTIVE' , 'INACTIVE')),
    Created_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    Modify_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```
DESC user;

| Field        | Type         | Null | Key | Default           | Extra                                         |
|:-------------|:-------------|:----:|:---:|:-----------------:|:----------------------------------------------|
| Id           | int          | NO   | PRI | NULL              | auto_increment                                |
| Firstname    | varchar(255) | NO   |     | NULL              |                                               |
| Lastname     | varchar(255) | NO   |     | NULL              |                                               |
| Email        | varchar(255) | NO   | UNI | NULL              |                                               |
| dob          | date         | NO   |     | NULL              |                                               |
| password     | varchar(255) | NO   |     | NULL              |                                               |
| status       | varchar(10)  | YES  |     | ACTIVE            |                                               |
| Created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED                             |
| Modify_date  | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED on update CURRENT_TIMESTAMP |


### CREATING TABLE Vehicle_type ...
```syntax
CREATE TABLE Vehicle_type (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    wheels INT NOT NULL,
    Names VARCHAR(100) NOT NULL
);
```
DESC Vehicle_type;

| Field      | Type         | Null | Key | Default | Extra          |
|:-----------|:-------------|:----:|:----:|:------:|:---------------|
| Id         | int          | NO   | PRI | NULL    | auto_increment |
| Names      | varchar(100) | NO   |     | NULL    |                |
| wheels_typ | int          | YES  |     | NULL    |                |


### CREATING TABLE Company ...
```syntax
SHOW TABLES;
CREATE TABLE Company (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Names VARCHAR(100) NOT NULL,
    Description VARCHAR(255) NOT NULL,
    status VARCHAR(10) DEFAULT 'ACTIVE' CHECK (status IN ('ACTIVE' , 'INACTIVE')),
    Created_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    Modify_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```
DESC company;

| Field        | Type         | Null | Key | Default           | Extra                                         |
|:-------------|:-------------|:----:|:---:|:-----------------:|:----------------------------------------------|
| Id           | int          | NO   | PRI | NULL              | auto_increment                                |
| Names        | varchar(100) | NO   |     | NULL              |                                               |
| Description  | varchar(255) | NO   |     | NULL              |                                               |
| status       | varchar(10)  | YES  |     | ACTIVE            |                                               |
| Created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED                             |
| Modify_date  | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED on update CURRENT_TIMESTAMP |

### CREATING TABLE  models ...
```syntax
CREATE TABLE models (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Names VARCHAR(100) NOT NULL,
    wheels INT NOT NULL,
    Description VARCHAR(255) NOT NULL,
    status VARCHAR(10) DEFAULT 'ACTIVE' CHECK (status IN ('ACTIVE' , 'INACTIVE')),
    Created_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    Modify_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```

| Field        | Type         | Null | Key | Default           | Extra                                         |
|:-------------|:-------------|:----:|:---:|:-----------------:|:----------------------------------------------|
| Id           | int          | NO   | PRI | NULL              | auto_increment                                |
| Names        | varchar(100) | NO   |     | NULL              |                                               |
| wheels       | int          | NO   |     | NULL              |                                               |
| Description  | varchar(255) | NO   |     | NULL              |                                               |
| status       | varchar(10)  | YES  |     | ACTIVE            |                                               |
| Created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED                             |
| Modify_date  | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED on update CURRENT_TIMESTAMP |

### CREATING TABLE vehicle ...
```syntax
CREATE TABLE vehicle (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Names VARCHAR(100) NOT NULL,
    Description VARCHAR(255) NOT NULL,
    price INT NOT NULL,  Created_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    Modify_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    company_id INT,
    models_id INT,
    FOREIGN KEY (company_id)
        REFERENCES company (id),
    FOREIGN KEY (models_id)
        REFERENCES models (id)
);
```
DESC vehicle;

| Field        | Type         | Null | Key | Default           | Extra                                         |
|:-------------|:-------------|:----:|:---:|:-----------------:|:----------------------------------------------|
| Id           | int          | NO   | PRI | NULL              | auto_increment                                |
| Names        | varchar(100) | NO   |     | NULL              |                                               |
| Description  | varchar(255) | NO   |     | NULL              |                                               |
| price        | int          | NO   |     | NULL              |                                               |
| Created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED                             |
| Modify_date  | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED on update CURRENT_TIMESTAMP |
| company_id   | int          | YES  | MUL | NULL              |                                               |
| models_id    | int          | YES  | MUL | NULL              |                                               |

### CREATING TABLE  role ...
```syntax
CREATE TABLE role (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Names VARCHAR(100) NOT NULL,
    status VARCHAR(10) DEFAULT 'ACTIVE' CHECK (status IN ('ACTIVE' , 'INACTIVE')),
    Created_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    Modify_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```
 DESC role;

| Field        | Type         | Null | Key | Default           | Extra                                         |
|:-------------|:-------------|:----:|:---:|:-----------------:|:----------------------------------------------|
| Id           | int          | NO   | PRI | NULL              | auto_increment                                |
| Names        | varchar(100) | NO   |     | NULL              |                                               |
| status       | varchar(10)  | YES  |     | ACTIVE            |                                               |
| Created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED                             |
| Modify_date  | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED on update CURRENT_TIMESTAMP |

### CREATING TABLE  admin ...
```syntax
CREATE TABLE admin (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Names VARCHAR(100) NOT NULL,
    company_id INT,
    user_id INT,
    role_id INT,
    FOREIGN KEY (company_id)
        REFERENCES company (id),
    FOREIGN KEY (user_id)
        REFERENCES user (id),
    FOREIGN KEY (role_id)
        REFERENCES role (id),
    Created_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    Modify_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```
DESC admin;

| Field        | Type         | Null | Key | Default           | Extra                                         |
|:-------------|:-------------|:----:|:---:|:-----------------:|:----------------------------------------------|
| Id           | int          | NO   | PRI | NULL              | auto_increment                                |
| Names        | varchar(100) | NO   |     | NULL              |                                               |
| company_id   | int          | YES  | MUL | NULL              |                                               |
| user_id      | int          | YES  | MUL | NULL              |                                               |
| role_id      | int          | YES  | MUL | NULL              |                                               |
| Created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED                             |
| Modify_date  | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED on update CURRENT_TIMESTAMP |

### CREATING TABLE booking ...
```syntax
CREATE TABLE booking (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Names VARCHAR(100) NOT NULL,
    address VARCHAR(255) NOT NULL,
    user_id INT,
    models_id INT,
    FOREIGN KEY (user_id)
        REFERENCES user (id),
    FOREIGN KEY (models_id)
        REFERENCES models (id),
    Created_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    Modify_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```
DESC booking;

| Field        | Type         | Null | Key | Default           | Extra                                         |
|:-------------|:-------------|:----:|:---:|:-----------------:|:----------------------------------------------|
| Id           | int          | NO   | PRI | NULL              | auto_increment                                |
| Names        | varchar(100) | NO   |     | NULL              |                                               |
| address      | varchar(255) | NO   |     | NULL              |                                               |
| user_id      | int          | YES  | MUL | NULL              |                                               |
| models_id    | int          | YES  | MUL | NULL              |                                               |
| Created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED                             |
| Modify_date  | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED on update CURRENT_TIMESTAMP |

### CREATING TABLE reviews ...
```syntax
CREATE TABLE reviews (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Names VARCHAR(100) NOT NULL,
    user_id INT,
    FOREIGN KEY (user_id)
        REFERENCES user (id),
    description VARCHAR(255) NOT NULL,
    Created_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    Modify_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```
DESC reviews;

| Field        | Type         | Null | Key | Default           | Extra                                         |
|:-------------|:-------------|:----:|:---:|:-----------------:|:----------------------------------------------|
| Id           | int          | NO   | PRI | NULL              | auto_increment                                |
| Names        | varchar(100) | NO   |     | NULL              |                                               |
| user_id      | int          | YES  | MUL | NULL              |                                               |
| description  | varchar(255) | NO   |     | NULL              |                                               |
| Created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED                             |
| Modify_date  | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED on update CURRENT_TIMESTAMP |

### MySQL INSERTING INTO user...
```syntax
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(1,'kaushik','singh','kaushick@gmail.com','2003-07-16','Valorant');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(2,'Vimal','raj','viaml@gmail.com','2002-09-19','uiuxdesgn');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(3,'Aswath','kaja','Aswath@gmail.com','2004-02-22','kajabai');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(4,'Haiden','arul','haiden@gmail.com','2002-10-12','haidenfdo');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(5,'Cithra','muthu','cithra@mlg.in','1987-08-3','arjun');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(6,'Shyam','anand','shyam@mlg.in','1978-10-18','Director');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(7,'Prasana','barathi','prasana@mlg.in','1992-06-13','prasana');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(8,'Revathi','iyer','revathi@mlg.in','1956-08-15','seniomanager');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(9,'Lisha','das','lisha@mlg.in','1990-02-04','Lisha');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(10,'Surya','umapathy','Surya@mlg.in','1998-12-20','surya');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(11,'Gajendran','venk','Gajendran@mlg.in','2003-05-04','gaja');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(12,'Rahamath','dhula','rahamath@mlg.in','2002-08-15','rahamath');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(13,'John','petter','john@mlg.in','2000-03-17','petter');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(14,'Monish','singh','monu@mlg.in','2003-04-01','monu');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(15,'karanjeeth','singh','karan@mlg.in','2006-09-15','karan');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(16,'Deepan','kumar','deepan@mlg.in','2002-05-08','deepan');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(17,'Sanjeev','kumar','sanjeev@mlg.in','1998-07-13','sanjeev');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(18,'Srimon','chari','srimon@mlg.in','2000-06-21','srimon');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(19,'Saravana','kumar','saravana@mlg.in','1998-07-13','saravana');
INSERT INTO user(id,Firstname,Lastname,Email,dob,password)values(20,'Rohith','krish','rohith@mlg.in','2003-09-15','krish');
```
SELECT * FROM user;

| Id | Firstname  | Lastname | Email              | dob        | password     | status | Created_date        | Modify_date         |
|:---|:-----------|:--------:|:------------------:|:----------:|:-------------|:-------|:--------------------|:--------------------|
|  1 | kaushik    | singh    | kaushick@gmail.com | 2003-07-16 | Valorant     | ACTIVE | 2022-03-21 16:00:08 | 2022-03-21 16:00:08 |
|  2 | Vimal      | raj      | viaml@gmail.com    | 2002-09-19 | uiuxdesgn    | ACTIVE | 2022-03-21 16:01:47 | 2022-03-21 16:01:47 |
|  3 | Aswath     | kaja     | Aswath@gmail.com   | 2004-02-22 | kajabai      | ACTIVE | 2022-03-21 16:02:40 | 2022-03-21 16:02:40 |
|  4 | Haiden     | arul     | haiden@gmail.com   | 2002-10-12 | haidenfdo    | ACTIVE | 2022-03-21 16:03:43 | 2022-03-21 16:03:43 |
|  5 | Cithra     | muthu    | cithra@mlg.in      | 1987-08-03 | arjun        | ACTIVE | 2022-03-21 16:05:11 | 2022-03-21 16:05:11 |
|  6 | Shyam      | anand    | shyam@mlg.in       | 1978-10-18 | Director     | ACTIVE | 2022-03-22 23:58:47 | 2022-03-22 23:58:47 |
|  7 | Prasana    | barathi  | prasana@mlg.in     | 1992-06-13 | prasana      | ACTIVE | 2022-03-22 23:58:47 | 2022-03-22 23:58:47 |
|  8 | Revathi    | iyer     | revathi@mlg.in     | 1956-08-15 | seniomanager | ACTIVE | 2022-03-22 23:58:47 | 2022-03-22 23:58:47 |
|  9 | Lisha      | das      | lisha@mlg.in       | 1990-02-04 | Lisha        | ACTIVE | 2022-03-22 23:58:47 | 2022-03-22 23:58:47 |
| 10 | Surya      | umapathy | Surya@mlg.in       | 1998-12-20 | surya        | ACTIVE | 2022-03-22 23:58:47 | 2022-03-22 23:58:47 |
| 11 | Gajendran  | venk     | Gajendran@mlg.in   | 2003-05-04 | gaja         | ACTIVE | 2022-03-22 23:58:47 | 2022-03-22 23:58:47 |
| 12 | Rahamath   | dhula    | rahamath@mlg.in    | 2002-08-15 | rahamath     | ACTIVE | 2022-03-22 23:58:47 | 2022-03-22 23:58:47 |
| 13 | John       | petter   | john@mlg.in        | 2000-03-17 | petter       | ACTIVE | 2022-03-22 23:58:47 | 2022-03-22 23:58:47 |
| 14 | Monish     | singh    | monu@mlg.in        | 2003-04-01 | monu         | ACTIVE | 2022-03-22 23:58:47 | 2022-03-22 23:58:47 |
| 15 | karanjeeth | singh    | karan@mlg.in       | 2006-09-15 | karan        | ACTIVE | 2022-03-22 23:58:47 | 2022-03-22 23:58:47 |
| 16 | Deepan     | kumar    | deepan@mlg.in      | 2002-05-08 | deepan       | ACTIVE | 2022-03-22 23:58:47 | 2022-03-22 23:58:47 |
| 17 | Sanjeev    | kumar    | sanjeev@mlg.in     | 1998-07-13 | sanjeev      | ACTIVE | 2022-03-22 23:58:47 | 2022-03-22 23:58:47 |
| 18 | Srimon     | chari    | srimon@mlg.in      | 2000-06-21 | srimon       | ACTIVE | 2022-03-22 23:58:47 | 2022-03-22 23:58:47 |
| 19 | Saravana   | kumar    | saravana@mlg.in    | 1998-07-13 | saravana     | ACTIVE | 2022-03-22 23:58:47 | 2022-03-22 23:58:47 |
| 20 | Rohith     | krish    | rohith@mlg.in      | 2003-09-15 | krish        | ACTIVE | 2022-03-23 00:11:49 | 2022-03-23 00:11:49 |

### MySQL INSERTING INTO Vehicle_type...
```syntax
INSERT INTO Vehicle_type(id,wheels,Names)values(1,'2','Bike');
INSERT INTO Vehicle_type(id,wheels,Names)values(2,'4','Car');
```

| Id | Names | wheels_typ |
|:---|:------|:-----------|
|  1 | Bike  |          2 |
|  2 | Car   |          4 |

### MySQL INSERTING INTO company...
```syntax
INSERT INTO company(id,Names,Description)values(001,'RollsRoyce','Rolls-Royce Motor Cars Limited is a British luxury automobile maker. Rolls-Royce Motor Cars Limited operates from purpose-built administrative');
INSERT INTO company(id,Names,Description)values(002,'Ford','Ford Motor Company is an American multinational automobile manufacturer headquartered in Dearborn, Michigan, United States');
INSERT INTO company(id,Names,Description)values(003,'Lamborghini','Automobili Lamborghini S.p.A. is an Italian brand and manufacturer of luxury sports cars and SUVs based in SantAgata Bolognese');
INSERT INTO company(id,Names,Description)values(004,'Audi','Audi AG is a German automotive manufacturer of luxury vehicles headquartered in Ingolstadt, Bavaria, Germany.');
INSERT INTO company(id,Names,Description)values(005,'Bentely','Bentley Motors Limited is a British manufacturer and marketer of luxury cars and SUVs, and a subsidiary of the Volkswagen Group since 1998. Headquartered in Crewe, England, the company was founded as Bentley Motors Limited by W. O.');
INSERT INTO company(id,Names,Description)values(006,'Benz','Mercedes-Benz, commonly referred to as just Mercedes, is a German luxury automotive marque. Mercedes-Benz and subsidiary Mercedes-Benz AG – of Daimler AG – are headquartered in Stuttgart');
INSERT INTO company(id,Names,Description)values(007,'Bmw','Bayerische Motoren Werke AG, commonly referred to as BMW, is a German multinational corporate manufacturer of luxury vehicles and motorcycles headquartered in Munich, Bavaria, Germany.');
INSERT INTO company(id,Names,Description)values(008,'MG','MG is a British automotive marque founded by Cecil Kimber in the 1920s, and M.G. Car Company Limited was the British sports car manufacturer that made the marque famous');
INSERT INTO company(id,Names,Description)values(100,'Ducati','Ducati Motor Holding S.p.A. is the motorcycle-manufacturing division of Italian company Ducati, headquartered in Bologna, Italy.');
INSERT INTO company(id,Names,Description)values(200,'Bmw moto','BMW Motorrad is the motorcycle brand of BMW, part of its Corporate and Brand Development division. It has produced motorcycles since 1923, and achieved record sales for the fifth year in succession in 2015');
INSERT INTO company(id,Names,Description)values(300,'Ktm','KTM AG is an Austrian motorcycle, bicycle and sports car manufacturer owned by Pierer Mobility AG & Indian manufacturer Bajaj Auto International Holdings BV. It was formed in 1992 but traces its foundation to as early as 1934');
INSERT INTO company(id,Names,Description)values(400,'Kawasiki','The Kawasaki Ninja is a name given to several series of Kawasaki sport bikes that started with the 1984 GPZ900R. Kawasaki Heavy Industries trademarked a version of the word Ninja in the form of a wordmark');
INSERT INTO company(id,Names,Description)values(500,'Royal Enfield','Royal Enfield is an Indian multinational motorcycle manufacturing company headquartered in Chennai, Tamil Nadu, India');
INSERT INTO company(id,Names,Description)values(600,'Tvs','TVS Motor Company is an Indian motorcycle manufacturer headquartered in Chennai, Tamil Nadu, India. It is the third largest motorcycle company in India with a revenue of over ₹20,000 crore in 2018–19.');
INSERT INTO company(id,Names,Description)values(700,'Honda','Honda Motor Company, Ltd. is a Japanese public multinational conglomerate manufacturer of automobiles, motorcycles, and power equipment, headquartered in Minato, Tokyo, Japan.');
INSERT INTO company(id,Names,Description)values(800,'Bajaj','Bajaj Auto Limited is an Indian multinational two wheeler & three wheeler manufacturing company based in the city of Pune, India. It manufactures motorcycles, scooters and auto rickshaws.');
```
SELECT * FROM company;

| Id  | Names         | Description                | status | Created_date        | Modify_date         |
|:----|:--------------|:--------------------------:|:------:|:-------------------:|:--------------------|
|   1 | RollsRoyce    | Rolls-Royce Motor Cars Limited is a British luxury automobile maker. Rolls-Royce Motor Cars Limited operates from purpose-built administrative | ACTIVE | 2022-03-21 23:07:59 | 2022-03-21 23:07:59 |
|   2 | Ford          | Ford Motor Company is an American multinational automobile manufacturer headquartered in Dearborn, Michigan, United States | ACTIVE | 2022-03-21 23:09:06 | 2022-03-21 23:09:06 |
|   3 | Lamborghini   | Automobili Lamborghini S.p.A. is an Italian brand and manufacturer of luxury sports cars and SUVs based in SantAgata Bolognese                                                                                                          | ACTIVE | 2022-03-21 23:10:29 | 2022-03-21 23:10:29 |
|   4 | Audi          | Audi AG is a German automotive manufacturer of luxury vehicles headquartered in Ingolstadt, Bavaria, Germany.                                                                                                                           | ACTIVE | 2022-03-21 23:11:21 | 2022-03-21 23:11:21 |
|   5 | Bentely       | Bentley Motors Limited is a British manufacturer and marketer of luxury cars and SUVs, and a subsidiary of the Volkswagen Group since 1998. Headquartered in Crewe, England, the company was founded as Bentley Motors Limited by W. O. | ACTIVE | 2022-03-21 23:12:17 | 2022-03-21 23:12:17 |
|   6 | Benz          | Mercedes-Benz, commonly referred to as just Mercedes, is a German luxury automotive marque. Mercedes-Benz and subsidiary Mercedes-Benz AG – of Daimler AG – are headquartered in Stuttgart                                              | ACTIVE | 2022-03-21 23:13:05 | 2022-03-21 23:13:05 |
|   7 | Bmw           | Bayerische Motoren Werke AG, commonly referred to as BMW, is a German multinational corporate manufacturer of luxury vehicles and motorcycles headquartered in Munich, Bavaria, Germany.                                                | ACTIVE | 2022-03-21 23:14:22 | 2022-03-21 23:14:22 |
|   8 | MG            | MG is a British automotive marque founded by Cecil Kimber in the 1920s, and M.G. Car Company Limited was the British sports car manufacturer that made the marque famous                                                                | ACTIVE | 2022-03-21 23:15:14 | 2022-03-21 23:15:14 |
| 100 | Ducati        | Ducati Motor Holding S.p.A. is the motorcycle-manufacturing division of Italian company Ducati, headquartered in Bologna, Italy.                                                                                                        | ACTIVE | 2022-03-22 13:23:04 | 2022-03-22 13:23:04 |
| 200 | Bmw moto      | BMW Motorrad is the motorcycle brand of BMW, part of its Corporate and Brand Development division. It has produced motorcycles since 1923, and achieved record sales for the fifth year in succession in 2015                           | ACTIVE | 2022-03-22 13:24:34 | 2022-03-22 13:24:34 |
| 300 | Ktm           | KTM AG is an Austrian motorcycle, bicycle and sports car manufacturer owned by Pierer Mobility AG & Indian manufacturer Bajaj Auto International Holdings BV. It was formed in 1992 but traces its foundation to as early as 1934       | ACTIVE | 2022-03-22 13:25:41 | 2022-03-22 13:25:41 |
| 400 | Kawasiki      | The Kawasaki Ninja is a name given to several series of Kawasaki sport bikes that started with the 1984 GPZ900R. Kawasaki Heavy Industries trademarked a version of the word Ninja in the form of a wordmark                            | ACTIVE | 2022-03-22 13:27:29 | 2022-03-22 13:27:29 |
| 500 | Royal Enfield | Royal Enfield is an Indian multinational motorcycle manufacturing company headquartered in Chennai, Tamil Nadu, India                                                                                                                   | ACTIVE | 2022-03-22 13:28:43 | 2022-03-22 13:28:43 |
| 600 | Tvs           | TVS Motor Company is an Indian motorcycle manufacturer headquartered in Chennai, Tamil Nadu, India. It is the third largest motorcycle company in India with a revenue of over ₹20,000 crore in 2018–19.                                | ACTIVE | 2022-03-22 13:29:49 | 2022-03-22 13:29:49 |
| 700 | Honda         | Honda Motor Company, Ltd. is a Japanese public multinational conglomerate manufacturer of automobiles, motorcycles, and power equipment, headquartered in Minato, Tokyo, Japan.                                                         | ACTIVE | 2022-03-22 13:30:49 | 2022-03-22 13:30:49 |
| 800 | Bajaj         | Bajaj Auto Limited is an Indian multinational two wheeler & three wheeler manufacturing company based in the city of Pune, India. It manufactures motorcycles, scooters and auto rickshaws.                                             | ACTIVE | 2022-03-22 13:32:03 | 2022-03-22 13:32:03 |
### MySQL INSERTING INTO  models...
```syntax
INSERT INTO models(id,Names,wheels,Description)values(00110,'Panthom',4,'ROLLS-ROYCE PHANTOM IS A 5 SEATER LUXURY AVAILABLE IN 2 VARIANTS, A 6749 CC, BS6 AND A SINGLE AUTOMATIC TRANSMISSION.');
INSERT INTO models(id,Names,wheels,Description)values(00111,'RR Dawn',4,'ROLLS-ROYCE DAWN BLACK BADGE6598 CC, AUTOMATIC, PETROL, 9.8 KMPL');
INSERT INTO models(id,Names,wheels,Description)values(00112,'Ghost',4,'ROLLS-ROYCE GHOST IS OFFERED IN 2 VARIANTS - THE BASE MODEL OF GHOST IS V12');
INSERT INTO models(id,Names,wheels,Description)values(00113,'Wraith',4,'WRAITH IS A COUPE, OFFERED WITH A CHOICE OF 6592 CC PETROL ENGINE OPTIONS. FOR PETROL ENGINE POWERED BY 6592 CC ');
INSERT INTO models(id,Names,wheels,Description)values(00220,'Ford Ecosport',4,'New Ford EcoSport BS6 with a new design, powerful engine, best petrol & diesel mileage and 6 Speed automatic transmission and easy maneuverability.');
INSERT INTO models(id,Names,wheels,Description)values(00221,'Ford Endeavour',4,'The Ford Endeavour has 1 Diesel Engine on offer. The Diesel engine is 1996 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the Endeavour has a mileage of 12.4 to 13.9 kmpl . The Endeavour is a 7 seater 4 .');
INSERT INTO models(id,Names,wheels,Description)values(00222,'Ford Evous',4,'FORD AN ALL-NEW EVOS AT THE 2021 AUTO SHANGHAI WHICH LIKE THE CITROEN C5 X DEBUTS A UNIQUE ESTATE-CROSSOVER COMBINATION BODY STYLE. SPECIFIC TO THE CHINESE MARKET, FOR NOW, THE EVOS ALSO HAS ANOTHER HIGHLIGHT 4K RESOLUTION');
INSERT INTO models(id,Names,wheels,Description)values(00223,'Ford Mustang',4,'The Ford Mustang has 1 Petrol Engine on offer. The Petrol engine is 4951 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the Mustang has a mileage of 13.0 kmpl & Ground clearance of Mustang is 137mm. ');
INSERT INTO models(id,Names,wheels,Description)values(00330,'Automobil Lambo',4,'Automobili Lamborghini S.p.A. (Italian pronunciation: [autoˈmɔːbili lamborˈɡiːni]) is an Italian brand and manufacturer of luxury sports cars and SUVs based Italian brand and manufacturer of luxury sports cars in SantAgata Bolognese.');
INSERT INTO models(id,Names,wheels,Description)values(00331,'Huracan',4,'THE HURACAN HAS THE SIGNATURE LOW DOWN LAMBO DESIGN AND HAS A VERY SIMILAR OVERALL SHAPE AS COMPARED TO THE LARGER AVENTADOR COUPE. IT GETS A LOW SWEEPING BONNET, WITH ANGULAR');
INSERT INTO models(id,Names,wheels,Description)values(00332,'Huracan autolambo',4,'THE HURACAN HAS THE SIGNATURE LOW DOWN LAMBO DESIGN AND HAS A VERY SIMILAR OVERALL SHAPE AS COMPARED TO THE LARGER AVENTADOR COUPE. WITH ANGULAR Founded in 1963, Automobili Lamborghini currently produces two super sports car models');
INSERT INTO models(id,Names,wheels,Description)values(00333,'Urus',4,'The Urus is available in two variants Lamborghini offers the SUV in a 5-seater configuration. The Urus is powered by a 4.0-litre twin-turbo V8 engine, It can complete the 0-100kmph run in 3.6 seconds and has a top speed of');
INSERT INTO models(id,Names,wheels,Description)values(00440,'R8',4,'The Audi R8 The Petrol engine is 5204 cc . It is available with Automatic transmission.Depending upon the variant & Ground clearance of R8 is 110mm. The R8 is a 2 seater 10 cylinder car and has length of 4426mm, width of 1940mm and a wheelbase of 2650mm.');
INSERT INTO models(id,Names,wheels,Description)values(00441,'A3',4,'The Audi A3 has 1 Diesel Engine and 1 Petrol Engine. The Diesel engine is 1968 cc while the Petrol engine is 1395 cc .Depending upon the variant and fuel type the A3 has a mileage of 19.2 to 20.38 kmpl & Ground clearance of A3 is 165mm.');
INSERT INTO models(id,Names,wheels,Description)values(00442,'A4',4,'The Audi A4 has 2 Petrol Engine on offer. The Petrol engine is 1997 cc and 1998 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the A4 has a mileage of 17.42 kmpl . The A4 is a 5 seater 4 cylinder .');
INSERT INTO models(id,Names,wheels,Description)values(00443,'A6',4,'The Audi A6 has 1 Petrol Engine on offer. The Petrol engine is 1984 cc .Depending upon the variant and fuel type the A6 has a mileage of 14.11 kmpl & Ground clearance of A6 is 165mm. The A6 is a 5 seater 4 cylinder.');
INSERT INTO models(id,Names,wheels,Description)values(00550,'Be Mulsanne',4,'The Bentley Mulsanne. The Petrol engine is 6752 cc .Depending upon the variant and fuel type the Mulsanne has a mileage of 10.1 kmpl & Ground clearance of Mulsanne is 170mm. The Mulsanne is a 5 seater 8 cylinder car ');
INSERT INTO models(id,Names,wheels,Description)values(00551,'Be Flying supra',4,'The Bentley Flying Spur has 2 Petrol Engine on offer. The Petrol engine is 3993 cc and 5950 cc .Depending upon the variant and fuel type the Flying Spur has a mileage of 10.2 to 12.5 kmpl. The Flying Spur is a 4 seater 12 cylinder car');
INSERT INTO models(id,Names,wheels,Description)values(00552,'Be Barnato',4,'The new Bentley Barnato  is a grand tourer that harnesses raw emotion. In each revolution of its W12 engine, and within every crafted detail, is an incredible power that puts immense thrill and drama at the heart of the drive.');
INSERT INTO models(id,Names,wheels,Description)values(00553,'Be Continental',4,'The Bentley Continental. The Petrol engine is 3993 cc and 5998 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the Continental has a mileage of 9.8 to 12.9 kmpl & Ground clearance of Continental is 142mm.');
INSERT INTO models(id,Names,wheels,Description)values(00660,'G wagon',4,'The Mercedes-Benz G-Class. The Diesel engine is 2925 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the G-Class has a mileage of 8.13 kmpl. The G-Class is a 5 seater 6 cylinder car');
INSERT INTO models(id,Names,wheels,Description)values(00661,'Benze CGT',4,'The Benz-cgt. The Diesel engine is 1950 cc while the Petrol engine is 1950 cc and 1991 cc.Depending upon the variant and fuel type the CGT has a mileage of 9.6 to 12.6 kmpl & Ground clearance of CGT is 130mm.');
INSERT INTO models(id,Names,wheels,Description)values(00662,'GT',4,'The Mercedes-Benz AMG GT has 1 Petrol Engine on offer. The Petrol engine is 3982 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the AMG GT has a mileage of 12.65 kmpl . The AMG GT is a 2 seater 8 cylinder car');
INSERT INTO models(id,Names,wheels,Description)values(00663,'Limousine',4,'The Mercedes-Benz AMG GT has 1 Petrol Engine on offer. The Petrol engine is 3982 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the AMG GT has a mileage of 12.65 kmpl . The AMG GT is a 2 seater 8 cylinder car');
INSERT INTO models(id,Names,wheels,Description)values(00770,'i8',4,'The BMW i8 has 1 Petrol Engine on offer. The Petrol engine is 1499 cc . It is available with Automatic.Depending upon the variant and fuel type the i8 has a mileage of 47.45 kmpl & Ground clearance of i8 is 117mm. The i8 is a 4 seater 3 cylinder car');
INSERT INTO models(id,Names,wheels,Description)values(00771,'M4',4,'This all new model shows the world just why this prominent company dazzles in what they do. The BMW M Series M4 Coupe stands as one of the rarest and most exquisite machines to cruise our streets. The two door vehicle is a blend of both');
INSERT INTO models(id,Names,wheels,Description)values(00772,'M5',4,'The BMW M5 has 1 Petrol Engine on offer. The Petrol engine is 4395 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the M5 has a mileage of 9.12 kmpl . The M5 is a 5 seater 8 cylinder car');
INSERT INTO models(id,Names,wheels,Description)values(00773,'M8',4,'The M8 is based on the BMW CLAR platform,[14] with strut and wishbone suspension at the front and multi-link suspension at the rear. Adaptive dampers are standard equipment. The all-wheel-drive system (called xDrive)');
INSERT INTO models(id,Names,wheels,Description)values(00880,'Mg Astro',4,'The MG Astor has 2 Petrol Engine on offer. The Petrol engine is 1498 cc and 1349 cc . It is available with Automatic & Manual transmission.Depending upon the variant and fuel type the Astor has a mileage of . The Astor is a 5 seater 4 cylinder car');
INSERT INTO models(id,Names,wheels,Description)values(00881,'Mg X motion',4,'The X-Motion is based on the same underpinnings and running gear as the Roewe RX8, which is a largely a China-only SUV produced by a SAIC-owned brand born from the ashes of Rover. The RX8 is powered by a 2-litre petrol engine that produces 221bhp');
INSERT INTO models(id,Names,wheels,Description)values(00882,'Mg Hector',4,'The MG Hector. The Diesel engine is 1956 cc while the Petrol engine is 1451 cc.Depending upon the variant and fuel type the Hector has a mileage of & Ground clearance of Hector is 192. The Hector is a 5 seater 4 cylinder car');
INSERT INTO models(id,Names,wheels,Description)values(00883,'Mg Gloster',4,'The MG Gloster has 1 Diesel Engine on offer. The Diesel engine is 1996 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the Gloster has a mileage of . The Gloster is a 7 seater 4 cylinder car');
INSERT INTO models(id,Names,wheels,Description)values(10010,'Ducati V2',2,'Ducati Panigale V2 Featured with 955cc BS6 Engine, Self Start Only, Digital Console. Riding Modes, Ducati Traction Control, Power Modes, Dual Channel ABS');
INSERT INTO models(id,Names,wheels,Description)values(10011,'Ducati V4',2,'The Ducati Panigale V4 is powered by a 1103 cc air-cooled engine which produces of power. It has a fuel tank of 16 L and a .Riding Modes, Ducati Traction Control, Power Modes, Dual Channel ABS ');
INSERT INTO models(id,Names,wheels,Description)values(10012,'Ducati Monster',2,'The Ducati Monster is a standard, or naked bike, motorcycle designed by Miguel Angel Galluzzi and produced by Ducati in Bologna, Italy, since 1993. In 2005, Monster sales accounted for over half of Ducatis worldwide sales');
INSERT INTO models(id,Names,wheels,Description)values(10013,'Ducati Scrambler',2,'Ducati Scrambler.This Scrambler 800 engine generates a power of 72.8 PS @ 8250 rpm and a torque of 66.2 Nm @ 5750 rpm. Ducati Scrambler 800 gets Disc brakes in the front and rear. The kerb weight of Scrambler 800 is 196 Kg. Ducati Scrambler');
INSERT INTO models(id,Names,wheels,Description)values(20020,'Bmw S1000rr',2,'BMW Motorrad has updated the S 1000 RR to meet Euro 5 emission norms. It also gets a new black paint scheme which gives customers a total of three colours to choose from including the current red and HP Motorsport colours.');
INSERT INTO models(id,Names,wheels,Description)values(20021,'Bmw G310r',2,'The BMW G 310 R is powered by a 313 cc air-cooled engine which produces of power. It has a fuel tank of 11 L and a . The BMW G 310 R starts at Rs 2.65 Lakh Rs (ex-showroom, Chennai). It is available in one variants.');
INSERT INTO models(id,Names,wheels,Description)values(20022,'Bmw 1200gs',2,'The BMW R1200GS and R1200GS Adventur, Germany by BMW Motorrad, part of the BMW group. It is one of the BMW GS family of dual sport motorcycles. Both motorcycles have a 1,170 cc, two-cylinder boxer engine with four valves per cylinder.');
INSERT INTO models(id,Names,wheels,Description)values(20023,'Bmw R1200',2,'The R1200 series from the BMW Motorrard naked, tourer and adventure.  The range from BMW helps in satisfying their customers as they can pick and choose according to their needs. The engine powering all these bikes is the 1170cc, flat twin Boxer');
INSERT INTO models(id,Names,wheels,Description)values(30030,'Rc 390',2,'KTM RC 390 is powered by 373.3 cc engine.This RC 390 engine generates a power of 43.5 PS @ 9000 rpm and a torque of 36 Nm @ 7000 rpm. KTM RC 390 gets Disc brakes in the front and rear. KTM RC 390 has Tubeless Tyre and Alloy Wheels.');
INSERT INTO models(id,Names,wheels,Description)values(30031,'Duke 250',2,'KTM 250 Duke is powered by 248.8 cc engine.This Duke 250 engine generates a power of 30 PS @ 9000 rpm and a torque of 24 Nm @ 7500 rpm. The claimed mileage of Duke 250 is 35.66 kmpl. KTM 250 Duke gets Disc brakes in the front and rear.It has Tubeless Tyre');
INSERT INTO models(id,Names,wheels,Description)values(30032,'Duke 390',2,'KTM 390 Duke is powered by 373.2 cc engine.This Duke 390 engine generates a power of 43.5 PS @ 9000 rpm and a torque of 37 Nm @ 7000 rpm. KTM 390 Duke gets Disc brakes in the front and rear. KTM 390 Duke has Tubeless Tyre and Alloy Wheels.');
INSERT INTO models(id,Names,wheels,Description)values(30033,'Rc 200',2,'The 2022 KTM RC 200 is powered by a 199.5 cc air-cooled engine which produces of power. It has a fuel tank of 13.7 l and a . The 2022 KTM RC 200 starts at Rs 2.08 Lakh Rs (ex-showroom, Chennai). It is available in one variants.');
INSERT INTO models(id,Names,wheels,Description)values(40040,'Ninja H2r',2,'	2-Channel ABS (Anti-Lock Braking System),Single-sided Swingarm, Oil Jets, Electronic Throttle Valves, Supercharged Engine, Öhlins TTX36 Rear Suspension, Aerodynamically-Designed Bodywork, Hydraulic Clutch & Back-Torque Limiter,Bank Angle Display');
INSERT INTO models(id,Names,wheels,Description)values(40041,'Ninja 400',2,'Kawasaki Ninja 400.This Ninja 400 engine generates a power of 49 PS @ 10000 rpm and a torque of 38 Nm @ 8000 rpm. Kawasaki Ninja 400 gets Disc brakes in the front and rear. The kerb weight of Ninja 400 is 173 Kg. Kawasaki Ninja 400 has Tubeless');
INSERT INTO models(id,Names,wheels,Description)values(40042,'Ninja 1000',2,'Kawasaki Ninja 1000SX is powered by 1043 cc engine.This Ninja 1000SX engine generates a power of 142 PS @ 10000 rpm and a torque of 111 Nm @ 8000 rpm. Kawasaki Ninja 1000SX gets Disc brakes in the front and rear. The weight of Ninja 1000SX is 238 Kg.');
INSERT INTO models(id,Names,wheels,Description)values(40043,'Ninja 650',2,'The Kawasaki Ninja 650 is powered by a 649 cc air-cooled engine which produces of power. It has a fuel tank of 15 L and a . The Kawasaki Ninja 650 starts at Rs 6.68 Lakh Rs (ex-showroom, Chennai). It is available in one variants.');
INSERT INTO models(id,Names,wheels,Description)values(50050,'Classic 350',2,'Royal Enfield Classic 350 .This Classic 350 engine generates a power of 20.21 PS @ 6100 rpm and a torque of 27 Nm @ 4000 rpm. The claimed mileage of Classic 350 is 41.55 kmpl. Royal Enfield Classic 350 gets Drum brakes in the front and rear');
INSERT INTO models(id,Names,wheels,Description)values(50051,'Classic 500',2,'Royal Enfield Classic 500 uses a fuel injected, single cylinder 499cc engine. This 4-stroke, twin spark engine generates a power output of 27.2 bhp at 5250 rpm. Royal Enfield Classic 500 gets Drum brakes in the front and rear');
INSERT INTO models(id,Names,wheels,Description)values(50052,'Himalayan',2,' Royal Enfield Himalayan is powered by 411 cc engine.This Himalayan engine generates a power of 24.31 PS @ 6500 rpm and a torque of 32 Nm @ 4000 - 4500 rpm. The claimed mileage of Himalayan is 39.96 kmpl. Royal Enfield Himalayan gets Disc brakes');
INSERT INTO models(id,Names,wheels,Description)values(50053,'Meteor 350',2,'Royal Enfield Meteor 350 is powered by 349 cc engine.This Meteor 350 engine generates a power of 20.4 PS @ 6100 rpm and a torque of 27 Nm @ 4000 rpm. The claimed mileage of Meteor 350 is 41.88 kmpl. Royal Enfield Meteor 350 gets Disc brakes ');
INSERT INTO models(id,Names,wheels,Description)values(60060,'Rtr 200',2,'TVS Motors has launched the Apache RTR 200 4V BS6. The Apache RTR 200 4V now comes only with the FI variant that delivers the same power and less torque.fuel-injected engine that gives power and torque output of  20.24hp and 16.8Nm, respectively. ');
INSERT INTO models(id,Names,wheels,Description)values(60061,'RR 310',2,'The TVS Apache RR 310 is powered by a 312.2 cc Liquied Cooled engine which produces 25.8 PS of power in Urban, Rain mode and 34 PS of power in Sport, Track mode. It has a fuel tank ,It is available in one variants.');
INSERT INTO models(id,Names,wheels,Description)values(60062,'Scooty pep',2,'The TVS Scooty Pep Plus is powered by a 87.8 cc air-cooled engine which produces of power. It has a fuel tank of 4.2 L and a . It is available in two variants.');
INSERT INTO models(id,Names,wheels,Description)values(60063,'Star city',2,'TVS Star City Plus is powered by 109.7 cc engine.This Star City Plus engine generates a power of 8.19 PS @ 7350 rpm and a torque of 8.7 Nm @ 4500 rpm. TVS Star City Plus gets Drum brakes . TVS Star City Plus has Tubeless Tyre and Alloy Wheels.');
INSERT INTO models(id,Names,wheels,Description)values(70070,'Dio',2,'Honda Dio is powered by 109.51 cc engine.This Dio engine generates a power of 7.76 PS @ 8000 rpm and a torque of 9 Nm @ 4750 rpm. The claimed mileage of Dio is 59.5 kmpl. Honda Dio gets Drum brakes in the front and rear. The kerb weight of Dio is 105 Kg.');
INSERT INTO models(id,Names,wheels,Description)values(70071,'Honda Cb350',2,'Honda CB350 is powered by 348.36 cc engine.This Hness CB350 engine generates a power of 21.07 PS @ 5500 rpm and a torque of 30 Nm @ 3000 rpm. The claimed mileage of Hness CB350 is 45.8 kmpl. Honda Hness CB350 gets Disc brakes in the front and rear.');
INSERT INTO models(id,Names,wheels,Description)values(70072,'Hornet',2,'New Honda Hornet 2.0 has been launched. Special Offers Available. Explore various features and specifications. Book test drive Now. Lid External Fuel Fill. Large Storage Space. Multi Function Unit. Engine Start/Stop Switch.');
INSERT INTO models(id,Names,wheels,Description)values(70073,'Cb shine',2,'Honda Shine is powered by 124 cc engine.This Shine engine generates a power of 10.74 PS @ 7500 rpm and a torque of 11 Nm @ 6000 rpm. Honda Shine gets Drum brakes in the front and rear. Honda Shine has Tubeless Tyre and Alloy Wheels.');
INSERT INTO models(id,Names,wheels,Description)values(80080,'220f',2,'Bajaj Pulsar 220 F BS6 is the base variant in the Pulsar 220 F lineup and is priced at Rs. 1.34 Lakh (ex-showroom, Delhi). This BS6 variant comes with an engine putting out and of max power and max torque respectively.');
INSERT INTO models(id,Names,wheels,Description)values(80081,'pulsar 150',2,'Bajaj Pulsar 150 BS6 is the mid variant in the Pulsar 150 lineup and is priced at Rs. 1.07 Lakh (ex-showroom, Delhi). This BS6 variant comes with an engine putting out and of max power and max torque respectively.');
INSERT INTO models(id,Names,wheels,Description)values(80082,'Ns 400',2,'The price of the Bajaj Pulsar NS400 . To know more about the Bajaj Pulsar NS400 STD images, reviews, offers & other details,Bajaj Pulsar NS400 STD mileage : It returns a certified mileage of 40.84 kmpl');
INSERT INTO models(id,Names,wheels,Description)values(80083,'Dominor 400',2,'Bajaj Dominar 400 is powered by 373.3 cc engine.This Dominar 400 engine generates a power of 40 PS @ 8800 rpm and a torque of 35 Nm @ 6500 rpm. Bajaj Dominar 400 gets Disc brakes in the front and rear. Bajaj Dominar 400 has Tubeless');
```
SELECT * FROM models;
+-------+-------------------+--------+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--------+---------------------+---------------------+
| Id    | Names             | wheels | Description                                                                                                                                                                                                                                                     | status | Created_date        | Modify_date         |
+-------+-------------------+--------+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--------+---------------------+---------------------+
|   110 | Panthom           |      4 | ROLLS-ROYCE PHANTOM IS A 5 SEATER LUXURY AVAILABLE IN 2 VARIANTS, A 6749 CC, BS6 AND A SINGLE AUTOMATIC TRANSMISSION.                                                                                                                                           | ACTIVE | 2022-03-22 14:52:19 | 2022-03-22 14:52:19 |
|   111 | RR Dawn           |      4 | ROLLS-ROYCE DAWN BLACK BADGE6598 CC, AUTOMATIC, PETROL, 9.8 KMPL                                                                                                                                                                                                | ACTIVE | 2022-03-22 14:53:34 | 2022-03-22 14:53:34 |
|   112 | Ghost             |      4 | ROLLS-ROYCE GHOST IS OFFERED IN 2 VARIANTS - THE BASE MODEL OF GHOST IS V12                                                                                                                                                                                     | ACTIVE | 2022-03-22 14:54:40 | 2022-03-22 14:54:40 |
|   113 | Wraith            |      4 | WRAITH IS A COUPE, OFFERED WITH A CHOICE OF 6592 CC PETROL ENGINE OPTIONS. FOR PETROL ENGINE POWERED BY 6592 CC                                                                                                                                                 | ACTIVE | 2022-03-22 14:55:24 | 2022-03-22 14:55:24 |
|   220 | Ford Ecosport     |      4 | New Ford EcoSport BS6 with a new design, powerful engine, best petrol & diesel mileage and 6 Speed automatic transmission and easy maneuverability.                                                                                                             | ACTIVE | 2022-03-22 14:57:36 | 2022-03-22 14:57:36 |
|   221 | Ford Endeavour    |      4 | The Ford Endeavour has 1 Diesel Engine on offer. The Diesel engine is 1996 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the Endeavour has a mileage of 12.4 to 13.9 kmpl . The Endeavour is a 7 seater 4 .         | ACTIVE | 2022-03-22 15:00:08 | 2022-03-22 15:00:08 |
|   222 | Ford Evous        |      4 | FORD AN ALL-NEW EVOS AT THE 2021 AUTO SHANGHAI WHICH LIKE THE CITROEN C5 X DEBUTS A UNIQUE ESTATE-CROSSOVER COMBINATION BODY STYLE. SPECIFIC TO THE CHINESE MARKET, FOR NOW, THE EVOS ALSO HAS ANOTHER HIGHLIGHT 4K RESOLUTION                                  | ACTIVE | 2022-03-22 15:00:58 | 2022-03-22 15:00:58 |
|   223 | Ford Mustang      |      4 | The Ford Mustang has 1 Petrol Engine on offer. The Petrol engine is 4951 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the Mustang has a mileage of 13.0 kmpl & Ground clearance of Mustang is 137mm.               | ACTIVE | 2022-03-22 15:03:16 | 2022-03-22 15:03:16 |
|   330 | Automobil Lambo   |      4 | Automobili Lamborghini S.p.A. (Italian pronunciation: [autoˈmɔːbili lamborˈɡiːni]) is an Italian brand and manufacturer of luxury sports cars and SUVs based in SantAgata Bolognese.                                                                            | ACTIVE | 2022-03-22 15:10:44 | 2022-03-22 15:10:44 |
|   331 | Huracan           |      4 | THE HURACAN HAS THE SIGNATURE LOW DOWN LAMBO DESIGN AND HAS A VERY SIMILAR OVERALL SHAPE AS COMPARED TO THE LARGER AVENTADOR COUPE. IT GETS A LOW SWEEPING BONNET, WITH ANGULAR                                                                                 | ACTIVE | 2022-03-22 15:11:57 | 2022-03-22 15:11:57 |
|   332 | Huracan autolambo |      4 | THE HURACAN HAS THE SIGNATURE LOW DOWN LAMBO DESIGN AND HAS A VERY SIMILAR OVERALL SHAPE AS COMPARED TO THE LARGER AVENTADOR COUPE. WITH ANGULAR Founded in 1963, Automobili Lamborghini currently produces two super sports car models                         | ACTIVE | 2022-03-22 15:15:17 | 2022-03-22 15:15:17 |
|   333 | Urus              |      4 | The Urus is available in two variants Lamborghini offers the SUV in a 5-seater configuration. The Urus is powered by a 4.0-litre twin-turbo V8 engine, It can complete the 0-100kmph run in 3.6 seconds and has a top speed of                                  | ACTIVE | 2022-03-22 15:18:15 | 2022-03-22 15:18:15 |
|   440 | R8                |      4 | The Audi R8 The Petrol engine is 5204 cc . It is available with Automatic transmission.Depending upon the variant & Ground clearance of R8 is 110mm. The R8 is a 2 seater 10 cylinder car and has length of 4426mm, width of 1940mm and a wheelbase of 2650mm.  | ACTIVE | 2022-03-22 15:23:00 | 2022-03-22 15:23:00 |
|   441 | A3                |      4 | The Audi A3 has 1 Diesel Engine and 1 Petrol Engine. The Diesel engine is 1968 cc while the Petrol engine is 1395 cc .Depending upon the variant and fuel type the A3 has a mileage of 19.2 to 20.38 kmpl & Ground clearance of A3 is 165mm.                    | ACTIVE | 2022-03-22 15:37:41 | 2022-03-22 15:37:41 |
|   442 | A4                |      4 | The Audi A4 has 2 Petrol Engine on offer. The Petrol engine is 1997 cc and 1998 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the A4 has a mileage of 17.42 kmpl . The A4 is a 5 seater 4 cylinder .                | ACTIVE | 2022-03-22 15:38:56 | 2022-03-22 15:38:56 |
|   443 | A6                |      4 | The Audi A6 has 1 Petrol Engine on offer. The Petrol engine is 1984 cc .Depending upon the variant and fuel type the A6 has a mileage of 14.11 kmpl & Ground clearance of A6 is 165mm. The A6 is a 5 seater 4 cylinder.                                         | ACTIVE | 2022-03-22 15:40:18 | 2022-03-22 15:40:18 |
|   550 | Be Mulsanne       |      4 | The Bentley Mulsanne. The Petrol engine is 6752 cc .Depending upon the variant and fuel type the Mulsanne has a mileage of 10.1 kmpl & Ground clearance of Mulsanne is 170mm. The Mulsanne is a 5 seater 8 cylinder car                                         | ACTIVE | 2022-03-22 15:54:50 | 2022-03-22 15:54:50 |
|   551 | Be Flying supra   |      4 | The Bentley Flying Spur has 2 Petrol Engine on offer. The Petrol engine is 3993 cc and 5950 cc .Depending upon the variant and fuel type the Flying Spur has a mileage of 10.2 to 12.5 kmpl. The Flying Spur is a 4 seater 12 cylinder car                      | ACTIVE | 2022-03-22 15:57:03 | 2022-03-22 15:57:03 |
|   552 | Be Barnato        |      4 | The new Bentley Barnato  is a grand tourer that harnesses raw emotion. In each revolution of its W12 engine, and within every crafted detail, is an incredible power that puts immense thrill and drama at the heart of the drive.                              | ACTIVE | 2022-03-22 15:59:16 | 2022-03-22 15:59:16 |
|   553 | Be Continental    |      4 | The Bentley Continental. The Petrol engine is 3993 cc and 5998 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the Continental has a mileage of 9.8 to 12.9 kmpl & Ground clearance of Continental is 142mm.          | ACTIVE | 2022-03-22 16:03:56 | 2022-03-22 16:03:56 |
|   660 | G wagon           |      4 | The Mercedes-Benz G-Class. The Diesel engine is 2925 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the G-Class has a mileage of 8.13 kmpl. The G-Class is a 5 seater 6 cylinder car                                 | ACTIVE | 2022-03-22 16:06:02 | 2022-03-22 16:06:02 |
|   661 | Benze CGT         |      4 | The Benz-cgt. The Diesel engine is 1950 cc while the Petrol engine is 1950 cc and 1991 cc.Depending upon the variant and fuel type the CGT has a mileage of 9.6 to 12.6 kmpl & Ground clearance of CGT is 130mm.                                                | ACTIVE | 2022-03-22 16:09:24 | 2022-03-22 16:09:24 |
|   662 | GT                |      4 | The Mercedes-Benz AMG GT has 1 Petrol Engine on offer. The Petrol engine is 3982 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the AMG GT has a mileage of 12.65 kmpl . The AMG GT is a 2 seater 8 cylinder car     | ACTIVE | 2022-03-22 16:10:38 | 2022-03-22 16:10:38 |
|   663 | Limousine         |      4 | The Mercedes-Benz AMG GT has 1 Petrol Engine on offer. The Petrol engine is 3982 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the AMG GT has a mileage of 12.65 kmpl . The AMG GT is a 2 seater 8 cylinder car     | ACTIVE | 2022-03-22 16:11:50 | 2022-03-22 16:11:50 |
|   770 | i8                |      4 | The BMW i8 has 1 Petrol Engine on offer. The Petrol engine is 1499 cc . It is available with Automatic.Depending upon the variant and fuel type the i8 has a mileage of 47.45 kmpl & Ground clearance of i8 is 117mm. The i8 is a 4 seater 3 cylinder car       | ACTIVE | 2022-03-22 16:13:52 | 2022-03-22 16:13:52 |
|   771 | M4                |      4 | This all new model shows the world just why this prominent company dazzles in what they do. The BMW M Series M4 Coupe stands as one of the rarest and most exquisite machines to cruise our streets. The two door vehicle is a blend of both                    | ACTIVE | 2022-03-22 16:18:03 | 2022-03-22 16:18:03 |
|   772 | M5                |      4 | The BMW M5 has 1 Petrol Engine on offer. The Petrol engine is 4395 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the M5 has a mileage of 9.12 kmpl . The M5 is a 5 seater 8 cylinder car                            | ACTIVE | 2022-03-22 16:20:48 | 2022-03-22 16:20:48 |
|   773 | M8                |      4 | The M8 is based on the BMW CLAR platform,[14] with strut and wishbone suspension at the front and multi-link suspension at the rear. Adaptive dampers are standard equipment. The all-wheel-drive system (called xDrive)                                        | ACTIVE | 2022-03-22 16:24:39 | 2022-03-22 16:24:39 |
|   880 | Mg Astro          |      4 | The MG Astor has 2 Petrol Engine on offer. The Petrol engine is 1498 cc and 1349 cc . It is available with Automatic & Manual transmission.Depending upon the variant and fuel type the Astor has a mileage of . The Astor is a 5 seater 4 cylinder car         | ACTIVE | 2022-03-22 16:28:22 | 2022-03-22 16:28:22 |
|   881 | Mg X motion       |      4 | The X-Motion is based on the same underpinnings and running gear as the Roewe RX8, which is a largely a China-only SUV produced by a SAIC-owned brand born from the ashes of Rover. The RX8 is powered by a 2-litre petrol engine that produces 221bhp          | ACTIVE | 2022-03-22 16:33:54 | 2022-03-22 16:33:54 |
|   882 | Mg Hector         |      4 | The MG Hector. The Diesel engine is 1956 cc while the Petrol engine is 1451 cc.Depending upon the variant and fuel type the Hector has a mileage of & Ground clearance of Hector is 192. The Hector is a 5 seater 4 cylinder car                                | ACTIVE | 2022-03-22 16:37:35 | 2022-03-22 16:37:35 |
|   883 | Mg Gloster        |      4 | The MG Gloster has 1 Diesel Engine on offer. The Diesel engine is 1996 cc . It is available with Automatic transmission.Depending upon the variant and fuel type the Gloster has a mileage of . The Gloster is a 7 seater 4 cylinder car                        | ACTIVE | 2022-03-22 16:39:13 | 2022-03-22 16:39:13 |
| 10010 | Ducati V2         |      2 | Ducati Panigale V2 Featured with 955cc BS6 Engine, Self Start Only, Digital Console. Riding Modes, Ducati Traction Control, Power Modes, Dual Channel ABS                                                                                                       | ACTIVE | 2022-03-22 16:44:10 | 2022-03-22 16:44:10 |
| 10011 | Ducati V4         |      2 | The Ducati Panigale V4 is powered by a 1103 cc air-cooled engine which produces of power. It has a fuel tank of 16 L and a .Riding Modes, Ducati Traction Control, Power Modes, Dual Channel ABS                                                                | ACTIVE | 2022-03-22 16:46:09 | 2022-03-22 16:46:09 |
| 10012 | Ducati Monster    |      2 | The Ducati Monster is a standard, or naked bike, motorcycle designed by Miguel Angel Galluzzi and produced by Ducati in Bologna, Italy, since 1993. In 2005, Monster sales accounted for over half of Ducatis worldwide sales                                   | ACTIVE | 2022-03-22 16:48:49 | 2022-03-22 16:48:49 |
| 10013 | Ducati Scrambler  |      2 | Ducati Scrambler.This Scrambler 800 engine generates a power of 72.8 PS @ 8250 rpm and a torque of 66.2 Nm @ 5750 rpm. Ducati Scrambler 800 gets Disc brakes in the front and rear. The kerb weight of Scrambler 800 is 196 Kg. Ducati Scrambler                | ACTIVE | 2022-03-22 16:52:43 | 2022-03-22 16:52:43 |
| 20020 | Bmw S1000rr       |      2 | BMW Motorrad has updated the S 1000 RR to meet Euro 5 emission norms. It also gets a new black paint scheme which gives customers a total of three colours to choose from including the current red and HP Motorsport colours.                                  | ACTIVE | 2022-03-22 16:55:27 | 2022-03-22 16:55:27 |
| 20021 | Bmw G310r         |      2 | The BMW G 310 R is powered by a 313 cc air-cooled engine which produces of power. It has a fuel tank of 11 L and a . The BMW G 310 R starts at Rs 2.65 Lakh Rs (ex-showroom, Chennai). It is available in one variants.                                         | ACTIVE | 2022-03-22 16:57:01 | 2022-03-22 16:57:01 |
| 20022 | Bmw 1200gs        |      2 | The BMW R1200GS and R1200GS Adventur, Germany by BMW Motorrad, part of the BMW group. It is one of the BMW GS family of dual sport motorcycles. Both motorcycles have a 1,170 cc, two-cylinder boxer engine with four valves per cylinder.                      | ACTIVE | 2022-03-22 17:00:38 | 2022-03-22 17:00:38 |
| 20023 | Bmw R1200         |      2 | The R1200 series from the BMW Motorrard naked, tourer and adventure.  The range from BMW helps in satisfying their customers as they can pick and choose according to their needs. The engine powering all these bikes is the 1170cc, flat twin Boxer           | ACTIVE | 2022-03-22 17:05:38 | 2022-03-22 17:05:38 |
| 30030 | Rc 390            |      2 | KTM RC 390 is powered by 373.3 cc engine.This RC 390 engine generates a power of 43.5 PS @ 9000 rpm and a torque of 36 Nm @ 7000 rpm. KTM RC 390 gets Disc brakes in the front and rear. KTM RC 390 has Tubeless Tyre and Alloy Wheels.                         | ACTIVE | 2022-03-22 17:11:12 | 2022-03-22 17:11:12 |
| 30031 | Duke 250          |      2 | KTM 250 Duke is powered by 248.8 cc engine.This Duke 250 engine generates a power of 30 PS @ 9000 rpm and a torque of 24 Nm @ 7500 rpm. The claimed mileage of Duke 250 is 35.66 kmpl. KTM 250 Duke gets Disc brakes in the front and rear.It has Tubeless Tyre | ACTIVE | 2022-03-22 17:14:20 | 2022-03-22 17:14:20 |
| 30032 | Duke 390          |      2 | KTM 390 Duke is powered by 373.2 cc engine.This Duke 390 engine generates a power of 43.5 PS @ 9000 rpm and a torque of 37 Nm @ 7000 rpm. KTM 390 Duke gets Disc brakes in the front and rear. KTM 390 Duke has Tubeless Tyre and Alloy Wheels.                 | ACTIVE | 2022-03-22 17:16:03 | 2022-03-22 17:16:03 |
| 30033 | Rc 200            |      2 | The 2022 KTM RC 200 is powered by a 199.5 cc air-cooled engine which produces of power. It has a fuel tank of 13.7 l and a . The 2022 KTM RC 200 starts at Rs 2.08 Lakh Rs (ex-showroom, Chennai). It is available in one variants.                             | ACTIVE | 2022-03-22 17:17:28 | 2022-03-22 17:17:28 |
| 40040 | Ninja H2r         |      2 |  2-Channel ABS (Anti-Lock Braking System),Single-sided Swingarm, Oil Jets, Electronic Throttle Valves, Supercharged Engine, Öhlins TTX36 Rear Suspension, Aerodynamically-Designed Bodywork, Hydraulic Clutch & Back-Torque Limiter,Bank Angle Display          | ACTIVE | 2022-03-22 17:27:06 | 2022-03-22 17:27:06 |
| 40041 | Ninja 400         |      2 | Kawasaki Ninja 400.This Ninja 400 engine generates a power of 49 PS @ 10000 rpm and a torque of 38 Nm @ 8000 rpm. Kawasaki Ninja 400 gets Disc brakes in the front and rear. The kerb weight of Ninja 400 is 173 Kg. Kawasaki Ninja 400 has Tubeless            | ACTIVE | 2022-03-22 17:29:45 | 2022-03-22 17:29:45 |
| 40042 | Ninja 1000        |      2 | Kawasaki Ninja 1000SX is powered by 1043 cc engine.This Ninja 1000SX engine generates a power of 142 PS @ 10000 rpm and a torque of 111 Nm @ 8000 rpm. Kawasaki Ninja 1000SX gets Disc brakes in the front and rear. The weight of Ninja 1000SX is 238 Kg.      | ACTIVE | 2022-03-22 17:31:11 | 2022-03-22 17:31:11 |
| 40043 | Ninja 650         |      2 | The Kawasaki Ninja 650 is powered by a 649 cc air-cooled engine which produces of power. It has a fuel tank of 15 L and a . The Kawasaki Ninja 650 starts at Rs 6.68 Lakh Rs (ex-showroom, Chennai). It is available in one variants.                           | ACTIVE | 2022-03-22 17:32:11 | 2022-03-22 17:32:11 |
| 50050 | Classic 350       |      2 | Royal Enfield Classic 350 .This Classic 350 engine generates a power of 20.21 PS @ 6100 rpm and a torque of 27 Nm @ 4000 rpm. The claimed mileage of Classic 350 is 41.55 kmpl. Royal Enfield Classic 350 gets Drum brakes in the front and rear                | ACTIVE | 2022-03-22 17:34:46 | 2022-03-22 17:34:46 |
| 50051 | Classic 500       |      2 | Royal Enfield Classic 500 uses a fuel injected, single cylinder 499cc engine. This 4-stroke, twin spark engine generates a power output of 27.2 bhp at 5250 rpm. Royal Enfield Classic 500 gets Drum brakes in the front and rear                               | ACTIVE | 2022-03-22 17:36:52 | 2022-03-22 17:36:52 |
| 50052 | Himalayan         |      2 |  Royal Enfield Himalayan is powered by 411 cc engine.This Himalayan engine generates a power of 24.31 PS @ 6500 rpm and a torque of 32 Nm @ 4000 - 4500 rpm. The claimed mileage of Himalayan is 39.96 kmpl. Royal Enfield Himalayan gets Disc brakes           | ACTIVE | 2022-03-22 17:40:14 | 2022-03-22 17:40:14 |
| 50053 | Meteor 350        |      2 | Royal Enfield Meteor 350 is powered by 349 cc engine.This Meteor 350 engine generates a power of 20.4 PS @ 6100 rpm and a torque of 27 Nm @ 4000 rpm. The claimed mileage of Meteor 350 is 41.88 kmpl. Royal Enfield Meteor 350 gets Disc brakes                | ACTIVE | 2022-03-22 17:42:15 | 2022-03-22 17:42:15 |
| 60060 | Rtr 200           |      2 | TVS Motors has launched the Apache RTR 200 4V BS6. The Apache RTR 200 4V now comes only with the FI variant that delivers the same power and less torque.fuel-injected engine that gives power and torque output of  20.24hp and 16.8Nm, respectively.          | ACTIVE | 2022-03-22 17:47:18 | 2022-03-22 17:47:18 |
| 60061 | RR 310            |      2 | The TVS Apache RR 310 is powered by a 312.2 cc Liquied Cooled engine which produces 25.8 PS of power in Urban, Rain mode and 34 PS of power in Sport, Track mode. It has a fuel tank ,It is available in one variants.                                          | ACTIVE | 2022-03-22 17:48:36 | 2022-03-22 17:48:36 |
| 60062 | Scooty pep        |      2 | The TVS Scooty Pep Plus is powered by a 87.8 cc air-cooled engine which produces of power. It has a fuel tank of 4.2 L and a . It is available in two variants.                                                                                                 | ACTIVE | 2022-03-22 17:52:57 | 2022-03-22 17:52:57 |
| 60063 | Star city         |      2 | TVS Star City Plus is powered by 109.7 cc engine.This Star City Plus engine generates a power of 8.19 PS @ 7350 rpm and a torque of 8.7 Nm @ 4500 rpm. TVS Star City Plus gets Drum brakes . TVS Star City Plus has Tubeless Tyre and Alloy Wheels.             | ACTIVE | 2022-03-22 17:54:53 | 2022-03-22 17:54:53 |
| 70070 | Dio               |      2 | Honda Dio is powered by 109.51 cc engine.This Dio engine generates a power of 7.76 PS @ 8000 rpm and a torque of 9 Nm @ 4750 rpm. The claimed mileage of Dio is 59.5 kmpl. Honda Dio gets Drum brakes in the front and rear. The kerb weight of Dio is 105 Kg.  | ACTIVE | 2022-03-22 17:57:20 | 2022-03-22 17:57:20 |
| 70071 | Honda Cb350       |      2 | Honda CB350 is powered by 348.36 cc engine.This Hness CB350 engine generates a power of 21.07 PS @ 5500 rpm and a torque of 30 Nm @ 3000 rpm. The claimed mileage of Hness CB350 is 45.8 kmpl. Honda Hness CB350 gets Disc brakes in the front and rear.        | ACTIVE | 2022-03-22 17:59:22 | 2022-03-22 17:59:22 |
| 70072 | Hornet            |      2 | New Honda Hornet 2.0 has been launched. Special Offers Available. Explore various features and specifications. Book test drive Now. Lid External Fuel Fill. Large Storage Space. Multi Function Unit. Engine Start/Stop Switch.                                 | ACTIVE | 2022-03-22 18:01:43 | 2022-03-22 18:01:43 |
| 70073 | Cb shine          |      2 | Honda Shine is powered by 124 cc engine.This Shine engine generates a power of 10.74 PS @ 7500 rpm and a torque of 11 Nm @ 6000 rpm. Honda Shine gets Drum brakes in the front and rear. Honda Shine has Tubeless Tyre and Alloy Wheels.                        | ACTIVE | 2022-03-22 18:02:54 | 2022-03-22 18:02:54 |
| 80080 | 220f              |      2 | Bajaj Pulsar 220 F BS6 is the base variant in the Pulsar 220 F lineup and is priced at Rs. 1.34 Lakh (ex-showroom, Delhi). This BS6 variant comes with an engine putting out and of max power and max torque respectively.                                      | ACTIVE | 2022-03-22 18:04:31 | 2022-03-22 18:04:31 |
| 80081 | pulsar 150        |      2 | Bajaj Pulsar 150 BS6 is the mid variant in the Pulsar 150 lineup and is priced at Rs. 1.07 Lakh (ex-showroom, Delhi). This BS6 variant comes with an engine putting out and of max power and max torque respectively.                                           | ACTIVE | 2022-03-22 18:09:40 | 2022-03-22 18:09:40 |
| 80082 | Ns 400            |      2 | The price of the Bajaj Pulsar NS400 . To know more about the Bajaj Pulsar NS400 STD images, reviews, offers & other details,Bajaj Pulsar NS400 STD mileage : It returns a certified mileage of 40.84 kmpl                                                       | ACTIVE | 2022-03-22 18:12:14 | 2022-03-22 18:12:14 |
| 80083 | Dominor 400       |      2 | Bajaj Dominar 400 is powered by 373.3 cc engine.This Dominar 400 engine generates a power of 40 PS @ 8800 rpm and a torque of 35 Nm @ 6500 rpm. Bajaj Dominar 400 gets Disc brakes in the front and rear. Bajaj Dominar 400 has Tubeless                        | ACTIVE | 2022-03-22 18:14:16 | 2022-03-22 18:14:16 |
+-------+-------------------+--------+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+--------+---------------------+---------------------+
### Deleting coloum ...
```syntax
delete from vehicle where id='1102';
```

### MySQL INSERTING INTO vehicle...
```syntax
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(1101,'RR Panthom','ROLLS-ROYCE PHANTOM IS A 5 SEATER LUXURY',8.99-110000000,001,00110);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(1102,'RR Dawn','Rolls-Royce Dawn reflects the opportunities that await',8.90-12000000,001,00111);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(1103,'RR Ghost','ROLLS-ROYCE GHOST IS OFFERED IN 2 VARIANTS',8.99-11000000,001,00112);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(1104,'RR Wraitht','ROLLS-ROYCE WRAITH IS A COUPE, OFFERED WITH A CHOICE OF 6592 CC',9.99-12000000,001,00113);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(2201,'F Ecosport','Ford EcoSport BS6 with a new design, powerful engine,',10.9-13000000,002,00220);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(2202,'F Endeavourt','The Ford Endeavour has 1 Diesel Engine on offer',5500001,002,00221);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(2203,'F Evous','FORD AN ALL-NEW EVOS AT THE 2021 AUTO SHANGHAI',6500001,002,00222);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(2204,'F Mustang','FORD Mustan Depending upon the variant and fuel type the Mustang',8000001,002,00223);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(3301,'L Automobil','Italian brand and manufacturer of luxury sports cars and SUVs ',10000001,003,00330);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(3302,'L Huracan','THE HURACAN HAS THE SIGNATURE LOW DOWN LAMBO DESIGN ',89000001,003,00331);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(3303,'L Huracan autolambo','A VERY SIMILAR OVERALL SHAPE AS COMPARED TO THE LARGER AVENTADOR COUPE ',78000001,003,00332);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(3304,'L Urus ','The Urus is available in two variants Lamborghini',90000001,003,00333);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(4401,'R8 ','The Audi R8 The Petrol engine is 5204 cc',80000001,004,00440);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(4402,'A3 ','The Audi A3 is the German carmakers most affordable sedan',65000001,004,00441);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(4403,'A4 ','The Audi A4 Sedan comes with a new 2.0L TFSI engine that generates 140 kW',65000001,004,00442);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(4404,'A6','The Audi A6 Bang & Olufsen with 3D sound system, Matrix LED headlights, 0-100 in 6.8 seconds.',87000001,004,00443);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(5501,'B Mulsanne',' The Mulsanne is a 5 seater 8 cylinder car',50000001,005,00550);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(5502,'B Flying supra',' The Flying supra is a grand tourer that harnesses',30000001,005,00551);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(5503,'B Barnato','Barnato  is a grand tourer that harnesses raw emotion.',40000001,005,00552);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(5504,'B Continental','The Continental It is available with Automatic transmission.Depending upon the variant',60000001,005,00553);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(6601,'G wagon','The Mercedes-Benz G-Class. The Diesel engine is 2925 cc ',24000001,006,00660);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(6602,'Benze CGT',' New most expensive car on BaT surprisingly not a Porsche CGT. As a matter of fact, the just-minted record-holder',11400001,006,00661);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(6603,'Benze GT','AMG GT R stands for the pursuit of maximum performance at all levels.',23000001,006,00662);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(6604,'Benze Limousine','No other car offers such cutting-edge technology and superior comfort. Worth the wait. Make the A-Class Limousine',4500001,006,00663);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(7701,'i8','The BMW i8 is a plug-in hybrid sports car and its powertrain is a combination of a petrol engine',26200001,007,00770);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(7702,'M4','BMW M4 Coupes share a top speed of 155 mph. The 0-60 mph acceleration time differs by model, with the M4 Coupe clocking',12500001,007,00771);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(7703,'M5','The M5 Competition’s peak output of 625hp. BMW M TwinPower Turbo.',16100001,007,00772);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(7704,'M8','The M8 Competitions superior driving dynamics make every drive a rewarding experience. The BMW M8 Competition offers luxury that rejuvenates and performance that inspires',21700001,007,00773);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(8801,'Mg Astro','THE BASE MODEL OF ASTOR IS STYLE AND THE .',9000001,008,00880);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(8802,'Mg X motion',' MG OFFERS A TOTAL OF FIVE PRODUCTS WHICH ARE PETROL , DIESEL AND ELECTRIC .',8000001,008,00881);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(8803,'Mg Hector','MG HECTOR VARIANTS: IT IS AVAILABLE IN FOUR TRIMS: STYLE',7100001,008,00882);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(8804,'Mg Gloster','THE BASE MODEL OF GLOSTER IS SUPER',2100001,008,00883);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(1001,'D V2','Panigale V2 consists of the classic',1700001,100,10010);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(1002,'D V4','THE Panigale V4 sporty monochrome Ducati',5700001,100,10011);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(1003,'D Monster','THE  Monster is a standard, or naked bike',2400001,100,10012);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(1004,'D Scramble','This is the Scrambler 800 engine generates a power',2400001,100,10013);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(2001,'Bmw S1000rr',' S 1000 RR to meet Euro 5 emission norms',300001,200,20020);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(2002,'Bmw G310r','The BMW G 310 R is powered by a 313 cc air-cooled engine',2250001,200,20021);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(2003,'Bmw 1200gs','The BMW R1200GS and R1200GS Adventur, Germany by BMW Motorrad',190001,200,20022);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(2004,'Bmw R1200','The R1200 series from the BMW Motorrard naked',234001,200,20023);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(3001,'Rc 390r','KTM RC 390 is powered by 373.3 cc engine',450001,300,30030);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(3002,'Duke 250','This Duke 250 engine generates a power of 30 PS @ 9000 rpm',210001,300,30031);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(3003,'Duke 390','This Duke 390 engine generates a power of 43.5 PS @ 9000 rpm and a torque of 37 Nm @ 7000 rpm.',410001,300,30032);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(3004,'Rc 200','The 2022 KTM RC 200 is powered by a 199.5 cc air-cooled engine',210001,300,30033);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(4001,'Ninja H2r','Maximum power with Ram Air, 240.0 kW {326 PS} / 14,000 rpm ; Maximum torque, Dimensions & Chassis.',8000001,400,40040);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(4002,'Ninja 400','The Ninja® 400 sportbike offers the largest displacement in category at 399cc ',1150001,400,40041);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(4003,'Ninja 1000','Ninja 1000 exhilarating engine character, the quick shifter enables clutch less upshifts and downshifts for seamless acceleration',1100001,400,40041);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(4004,'Ninja 650','Ninja 650 ; Maximum torque, 64.0 N.m {6.5 kgf.m} / 6,700 rpm ; Dimensions & Chassis.',500001,400,40043);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(5001,'Classic 350','Classic 350 is an all-new heart which beats to a unique rhythm, partnered with a new twin downtube chassis that rides strong and true',280001,500,50050);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(5002,'Classic 500','Classic 500 Tribute Black BS IV motorcycles are handcrafted at the iconic Royal Enfield Tiruvottiyur Factory which has a legacy of more than 65',310001,500,50051);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(5003,'Himalayan','The most versatile Royal Enfield motorcycle that can take riders almost everywhere they want to go - On road or Off-road. Ride along on a journey ',218001,500,50052);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(5004,'Meteor 350','With intuitive handling, standard ABS, a fantastic motor, room to spread out, and nicely finished styling, the Meteor 350 is a great motorcycle',216001,500,50053);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(6001,'Rtr 200','The TVS Apache RTR 200 4V represents the absolute pinnacle of race performance and technology',220001,600,60060);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(6002,'RR 310','The Apache RR 310 is the flagship TVS motorcycle in India and it offers great performance. ',340001,600,60061);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(6003,'Scooty pep','TVS Scooty Pep Plus - Price, Style, Features, Mileage. Available in 7 colours.',62001,600,60062);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(6004,'Star city','TVS StaR City Plus BSVI ETFi is a premium 110cc Motorcycle with designer styling and best in class features.',80001,600,60063);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(7001,'Dio',' DIO BS-VI with a sportier look and aggressive design. The advanced HET engine delivers an unmatched performance and also contributes',100001,700,70070);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(7002,'Honda Cb350','India has officially launched its first-ever 350cc cruiser bike in the Indian market. Known as Highness CB350',200001,700,70071);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(7003,'Hornet','The Hornet 2.0 marks the entry of the Japanese manufacturers entry into the fierce 180cc space.',98001,700,70072);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(7004,'Cb shine','Honda presents the all new Shine BS-VI with amazing eSP Technology and eco-friendly BS-VI Engine that keeps emission in check',100001,700,70073);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(8001,'220f','The true enthusiasts performance machine. This 4-Stroke, BSVI, 220cc DTS-i engine delivers 15 kW (20.4 PS) power and 18.55 Nm torque',137001,800,80080);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(8002,'pulsar 150','Bajaj Pulsar 150 has a 149.50 cc engine, designed with patented technologies like DTS-i, for a class leading 10.3 kW (14 PS) Power and enhanced',113001,800,80081);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(8003,'Ns 400','Performance. 18 kW (24.5 PS) Power DTS-i FI Engine ; Design. Most aggressive and muscular street fighter around ; Control & Handling. Perimeter frame ; Safety.',250001,800,80082);
INSERT INTO vehicle(id,Names,Description,price,company_id,models_id)values(8004,'Dominor 400','The Dominar 400 sports an LED headlight and turn indicators. Instrumentation is fully-digital and consists of a twin-display setup.',213001,800,80083);
```
SELECT * FROM vehicle;
| Id   | Names               | Description  | price      | Created_date        | Modify_date         | company_id | models_id |

| 1001 | D V2                | Panigale V2 consists of the classic                                                                                                                                        |    1700001 | 2022-03-22 22:56:08 | 2022-03-22 22:56:08 |        100 |     10010 |
| 1002 | D V4                | THE Panigale V4 sporty monochrome Ducati                                                                                                                                   |    5700001 | 2022-03-22 22:56:08 | 2022-03-22 22:56:08 |        100 |     10011 |
| 1003 | D Monster           | THE  Monster is a standard, or naked bike                                                                                                                                  |    2400001 | 2022-03-22 22:56:08 | 2022-03-22 22:56:08 |        100 |     10012 |
| 1004 | D Scramble          | This is the Scrambler 800 engine generates a power                                                                                                                         |    2400001 | 2022-03-22 22:56:08 | 2022-03-22 22:56:08 |        100 |     10013 |
| 1101 | RR Panthom          | ROLLS-ROYCE PHANTOM IS A 5 SEATER LUXURY                                                                                                                                   | -109999991 | 2022-03-22 18:38:01 | 2022-03-22 18:38:01 |          1 |       110 |
| 1102 | RR Dawn             | Rolls-Royce Dawn reflects the opportunities that await                                                                                                                     |  -11999991 | 2022-03-22 19:00:55 | 2022-03-22 19:00:55 |          1 |       111 |
| 1103 | RR Ghost            | ROLLS-ROYCE GHOST IS OFFERED IN 2 VARIANTS                                                                                                                                 |  -10999991 | 2022-03-22 19:03:16 | 2022-03-22 19:03:16 |          1 |       112 |
| 1104 | RR Wraitht          | ROLLS-ROYCE WRAITH IS A COUPE, OFFERED WITH A CHOICE OF 6592 CC                                                                                                            |  -11999990 | 2022-03-22 19:07:08 | 2022-03-22 19:07:08 |          1 |       113 |
| 2001 | Bmw S1000rr         |  S 1000 RR to meet Euro 5 emission norms                                                                                                                                   |     300001 | 2022-03-22 23:01:56 | 2022-03-22 23:01:56 |        200 |     20020 |
| 2002 | Bmw G310r           | The BMW G 310 R is powered by a 313 cc air-cooled engine                                                                                                                   |    2250001 | 2022-03-22 23:02:07 | 2022-03-22 23:02:07 |        200 |     20021 |
| 2003 | Bmw 1200gs          | The BMW R1200GS and R1200GS Adventur, Germany by BMW Motorrad                                                                                                              |     190001 | 2022-03-22 23:02:07 | 2022-03-22 23:02:07 |        200 |     20022 |
| 2004 | Bmw R1200           | The R1200 series from the BMW Motorrard naked                                                                                                                              |     234001 | 2022-03-22 23:02:07 | 2022-03-22 23:02:07 |        200 |     20023 |
| 2201 | F Ecosport          | Ford EcoSport BS6 with a new design, powerful engine,                                                                                                                      |  -12999989 | 2022-03-22 19:11:58 | 2022-03-22 19:11:58 |          2 |       220 |
| 2202 | F Endeavourt        | The Ford Endeavour has 1 Diesel Engine on offer                                                                                                                            |    5500001 | 2022-03-22 19:16:37 | 2022-03-22 19:16:37 |          2 |       221 |
| 2203 | F Evous             | FORD AN ALL-NEW EVOS AT THE 2021 AUTO SHANGHAI                                                                                                                             |    6500001 | 2022-03-22 19:18:35 | 2022-03-22 19:18:35 |          2 |       222 |
| 2204 | F Mustang           | FORD Mustan Depending upon the variant and fuel type the Mustang                                                                                                           |    8000001 | 2022-03-22 19:23:11 | 2022-03-22 19:23:11 |          2 |       223 |
| 3001 | Rc 390r             | KTM RC 390 is powered by 373.3 cc engine                                                                                                                                   |     450001 | 2022-03-22 23:02:07 | 2022-03-22 23:02:07 |        300 |     30030 |
| 3002 | Duke 250            | This Duke 250 engine generates a power of 30 PS @ 9000 rpm                                                                                                                 |     210001 | 2022-03-22 23:02:07 | 2022-03-22 23:02:07 |        300 |     30031 |
| 3003 | Duke 390            | This Duke 390 engine generates a power of 43.5 PS @ 9000 rpm and a torque of 37 Nm @ 7000 rpm.                                                                             |     410001 | 2022-03-22 23:02:07 | 2022-03-22 23:02:07 |        300 |     30032 |
| 3004 | Rc 200              | The 2022 KTM RC 200 is powered by a 199.5 cc air-cooled engine                                                                                                             |     210001 | 2022-03-22 23:02:07 | 2022-03-22 23:02:07 |        300 |     30033 |
| 3301 | L Automobil         | Italian brand and manufacturer of luxury sports cars and SUVs                                                                                                              |   10000001 | 2022-03-22 19:28:04 | 2022-03-22 19:28:04 |          3 |       330 |
| 3302 | L Huracan           | THE HURACAN HAS THE SIGNATURE LOW DOWN LAMBO DESIGN                                                                                                                        |   89000001 | 2022-03-22 19:29:56 | 2022-03-22 19:29:56 |          3 |       331 |
| 3303 | L Huracan autolambo | A VERY SIMILAR OVERALL SHAPE AS COMPARED TO THE LARGER AVENTADOR COUPE                                                                                                     |   78000001 | 2022-03-22 19:31:43 | 2022-03-22 19:31:43 |          3 |       332 |
| 3304 | L Urus              | The Urus is available in two variants Lamborghini                                                                                                                          |   90000001 | 2022-03-22 19:32:42 | 2022-03-22 19:32:42 |          3 |       333 |
| 4001 | Ninja H2r           | Maximum power with Ram Air, 240.0 kW {326 PS} / 14,000 rpm ; Maximum torque, Dimensions & Chassis.                                                                         |    8000001 | 2022-03-22 23:02:56 | 2022-03-22 23:02:56 |        400 |     40040 |
| 4002 | Ninja 400           | The Ninja® 400 sportbike offers the largest displacement in category at 399cc                                                                                              |    1150001 | 2022-03-22 23:02:56 | 2022-03-22 23:02:56 |        400 |     40041 |
| 4003 | Ninja 1000          | Ninja 1000 exhilarating engine character, the quick shifter enables clutch less upshifts and downshifts for seamless acceleration                                          |    1100001 | 2022-03-22 23:02:56 | 2022-03-22 23:02:56 |        400 |     40041 |
| 4004 | Ninja 650           | Ninja 650 ; Maximum torque, 64.0 N.m {6.5 kgf.m} / 6,700 rpm ; Dimensions & Chassis.                                                                                       |     500001 | 2022-03-22 23:02:56 | 2022-03-22 23:02:56 |        400 |     40043 |
| 4401 | R8                  | The Audi R8 The Petrol engine is 5204 cc                                                                                                                                   |   80000001 | 2022-03-22 19:40:42 | 2022-03-22 19:40:42 |          4 |       440 |
| 4402 | A3                  | The Audi A3 is the German carmakers most affordable sedan                                                                                                                  |   65000001 | 2022-03-22 19:45:27 | 2022-03-22 19:45:27 |          4 |       441 |
| 4403 | A4                  | The Audi A4 Sedan comes with a new 2.0L TFSI engine that generates 140 kW                                                                                                  |   65000001 | 2022-03-22 19:46:38 | 2022-03-22 19:46:38 |          4 |       442 |
| 4404 | A6                  | The Audi A6 Bang & Olufsen with 3D sound system, Matrix LED headlights, 0-100 in 6.8 seconds.                                                                              |   87000001 | 2022-03-22 19:47:53 | 2022-03-22 19:47:53 |          4 |       443 |
| 5001 | Classic 350         | Classic 350 is an all-new heart which beats to a unique rhythm, partnered with a new twin downtube chassis that rides strong and true                                      |     280001 | 2022-03-22 23:02:56 | 2022-03-22 23:02:56 |        500 |     50050 |
| 5002 | Classic 500         | Classic 500 Tribute Black BS IV motorcycles are handcrafted at the iconic Royal Enfield Tiruvottiyur Factory which has a legacy of more than 65                            |     310001 | 2022-03-22 23:02:56 | 2022-03-22 23:02:56 |        500 |     50051 |
| 5003 | Himalayan           | The most versatile Royal Enfield motorcycle that can take riders almost everywhere they want to go - On road or Off-road. Ride along on a journey                          |     218001 | 2022-03-22 23:02:56 | 2022-03-22 23:02:56 |        500 |     50052 |
| 5004 | Meteor 350          | With intuitive handling, standard ABS, a fantastic motor, room to spread out, and nicely finished styling, the Meteor 350 is a great motorcycle                            |     216001 | 2022-03-22 23:02:56 | 2022-03-22 23:02:56 |        500 |     50053 |
| 5501 | B Mulsanne          |  The Mulsanne is a 5 seater 8 cylinder car                                                                                                                                 |   50000001 | 2022-03-22 21:04:07 | 2022-03-22 21:04:07 |          5 |       550 |
| 5502 | B Flying supra      |  The Flying supra is a grand tourer that harnesses                                                                                                                         |   30000001 | 2022-03-22 21:09:21 | 2022-03-22 21:09:21 |          5 |       551 |
| 5503 | B Barnato           | Barnato  is a grand tourer that harnesses raw emotion.                                                                                                                     |   40000001 | 2022-03-22 21:09:21 | 2022-03-22 21:09:21 |          5 |       552 |
| 5504 | B Continental       | The Continental It is available with Automatic transmission.Depending upon the variant                                                                                     |   60000001 | 2022-03-22 21:09:21 | 2022-03-22 21:09:21 |          5 |       553 |
| 6001 | Rtr 200             | The TVS Apache RTR 200 4V represents the absolute pinnacle of race performance and technology                                                                              |     220001 | 2022-03-22 23:03:45 | 2022-03-22 23:03:45 |        600 |     60060 |
| 6002 | RR 310              | The Apache RR 310 is the flagship TVS motorcycle in India and it offers great performance.                                                                                 |     340001 | 2022-03-22 23:03:53 | 2022-03-22 23:03:53 |        600 |     60061 |
| 6003 | Scooty pep          | TVS Scooty Pep Plus - Price, Style, Features, Mileage. Available in 7 colours.                                                                                             |      62001 | 2022-03-22 23:03:56 | 2022-03-22 23:03:56 |        600 |     60062 |
| 6004 | Star city           | TVS StaR City Plus BSVI ETFi is a premium 110cc Motorcycle with designer styling and best in class features.                                                               |      80001 | 2022-03-22 23:03:59 | 2022-03-22 23:03:59 |        600 |     60063 |
| 6601 | G wagon             | The Mercedes-Benz G-Class. The Diesel engine is 2925 cc                                                                                                                    |   24000001 | 2022-03-22 21:20:45 | 2022-03-22 21:20:45 |          6 |       660 |
| 6602 | Benze CGT           |  New most expensive car on BaT surprisingly not a Porsche CGT. As a matter of fact, the just-minted record-holder                                                          |   11400001 | 2022-03-22 21:20:45 | 2022-03-22 21:20:45 |          6 |       661 |
| 6603 | Benze GT            | AMG GT R stands for the pursuit of maximum performance at all levels.                                                                                                      |   23000001 | 2022-03-22 21:20:45 | 2022-03-22 21:20:45 |          6 |       662 |
| 6604 | Benze Limousine     | No other car offers such cutting-edge technology and superior comfort. Worth the wait. Make the A-Class Limousine                                                          |    4500001 | 2022-03-22 21:20:45 | 2022-03-22 21:20:45 |          6 |       663 |
| 7001 | Dio                 |  DIO BS-VI with a sportier look and aggressive design. The advanced HET engine delivers an unmatched performance and also contributes                                      |     100001 | 2022-03-22 23:04:06 | 2022-03-22 23:04:06 |        700 |     70070 |
| 7002 | Honda Cb350         | India has officially launched its first-ever 350cc cruiser bike in the Indian market. Known as Highness CB350                                                              |     200001 | 2022-03-22 23:04:09 | 2022-03-22 23:04:09 |        700 |     70071 |
| 7003 | Hornet              | The Hornet 2.0 marks the entry of the Japanese manufacturers entry into the fierce 180cc space.                                                                            |      98001 | 2022-03-22 23:04:34 | 2022-03-22 23:04:34 |        700 |     70072 |
| 7004 | Cb shine            | Honda presents the all new Shine BS-VI with amazing eSP Technology and eco-friendly BS-VI Engine that keeps emission in check                                              |     100001 | 2022-03-22 23:04:34 | 2022-03-22 23:04:34 |        700 |     70073 |
| 7701 | i8                  | The BMW i8 is a plug-in hybrid sports car and its powertrain is a combination of a petrol engine                                                                           |   26200001 | 2022-03-22 21:32:01 | 2022-03-22 21:32:01 |          7 |       770 |
| 7702 | M4                  | BMW M4 Coupes share a top speed of 155 mph. The 0-60 mph acceleration time differs by model, with the M4 Coupe clocking                                                    |   12500001 | 2022-03-22 21:32:01 | 2022-03-22 21:32:01 |          7 |       771 |
| 7703 | M5                  | The M5 Competition’s peak output of 625hp. BMW M TwinPower Turbo.                                                                                                          |   16100001 | 2022-03-22 21:32:01 | 2022-03-22 21:32:01 |          7 |       772 |
| 7704 | M8                  | The M8 Competitions superior driving dynamics make every drive a rewarding experience. The BMW M8 Competition offers luxury that rejuvenates and performance that inspires |   21700001 | 2022-03-22 21:32:01 | 2022-03-22 21:32:01 |          7 |       773 |
| 8001 | 220f                | The true enthusiasts performance machine. This 4-Stroke, BSVI, 220cc DTS-i engine delivers 15 kW (20.4 PS) power and 18.55 Nm torque                                       |     137001 | 2022-03-22 23:04:34 | 2022-03-22 23:04:34 |        800 |     80080 |
| 8002 | pulsar 150          | Bajaj Pulsar 150 has a 149.50 cc engine, designed with patented technologies like DTS-i, for a class leading 10.3 kW (14 PS) Power and enhanced                            |     113001 | 2022-03-22 23:04:59 | 2022-03-22 23:04:59 |        800 |     80081 |
| 8003 | Ns 400              | Performance. 18 kW (24.5 PS) Power DTS-i FI Engine ; Design. Most aggressive and muscular street fighter around ; Control & Handling. Perimeter frame ; Safety.            |     250001 | 2022-03-22 23:04:59 | 2022-03-22 23:04:59 |        800 |     80082 |
| 8004 | Dominor 400         | The Dominar 400 sports an LED headlight and turn indicators. Instrumentation is fully-digital and consists of a twin-display setup.                                        |     213001 | 2022-03-22 23:04:59 | 2022-03-22 23:04:59 |        800 |     80083 |
| 8801 | Mg Astro            | THE BASE MODEL OF ASTOR IS STYLE AND THE .                                                                                                                                 |    9000001 | 2022-03-22 21:38:46 | 2022-03-22 21:38:46 |          8 |       880 |
| 8802 | Mg X motion         |  MG OFFERS A TOTAL OF FIVE PRODUCTS WHICH ARE PETROL , DIESEL AND ELECTRIC .                                                                                               |    8000001 | 2022-03-22 21:38:46 | 2022-03-22 21:38:46 |          8 |       881 |
| 8803 | Mg Hector           | MG HECTOR VARIANTS: IT IS AVAILABLE IN FOUR TRIMS: STYLE                                                                                                                   |    7100001 | 2022-03-22 21:38:46 | 2022-03-22 21:38:46 |          8 |       882 |
| 8804 | Mg Gloster          | THE BASE MODEL OF GLOSTER IS SUPER                                                                                                                                         |    2100001 | 2022-03-22 21:38:46 | 2022-03-22 21:38:46 |          8 |       883 |

### MySQL INSERTING INTO role...
```syntax
INSERT INTO role(id,Names)values(1,'Super Admin');
INSERT INTO role(id,Names)values(0011,'RR Admin');
INSERT INTO role(id,Names)values(0022,'Ford Admin');
INSERT INTO role(id,Names)values(0033,'Lambo Admin');
INSERT INTO role(id,Names)values(0044,'Audi Admin');
INSERT INTO role(id,Names)values(0055,'Bent Admin');
INSERT INTO role(id,Names)values(0066,'Benze Admin');
INSERT INTO role(id,Names)values(0077,'Bmw Admin');
INSERT INTO role(id,Names)values(0088,'Mg Admin');
INSERT INTO role(id,Names)values(10011,'Ducati Admin');
INSERT INTO role(id,Names)values(20022,'Bmw moto Admin');
INSERT INTO role(id,Names)values(30033,'Ktm Admin');
INSERT INTO role(id,Names)values(40044,'Kawasiki Admin');
INSERT INTO role(id,Names)values(50055,'RE Admin');
INSERT INTO role(id,Names)values(60066,'Tvs Admin');
INSERT INTO role(id,Names)values(70077,'Honda Admin');
INSERT INTO role(id,Names)values(80088,'Bajaj Admin');
```
SELECT * FROM role;

| Id    | Names          | status | Created_date        | Modify_date         |
|:------|:---------------|:-------|:--------------------|:--------------------|
|     1 | Super Admin    | ACTIVE | 2022-03-22 23:12:57 | 2022-03-22 23:12:57 |
|    11 | RR Admin       | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
|    22 | Ford Admin     | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
|    33 | Lambo Admin    | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
|    44 | Audi Admin     | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
|    55 | Bent Admin     | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
|    66 | Benze Admin    | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
|    77 | Bmw Admin      | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
|    88 | Mg Admin       | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
| 10011 | Ducati Admin   | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
| 20022 | Bmw moto Admin | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
| 30033 | Ktm Admin      | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
| 40044 | Kawasiki Admin | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
| 50055 | RE Admin       | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
| 60066 | Tvs Admin      | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
| 70077 | Honda Admin    | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |
| 80088 | Bajaj Admin    | ACTIVE | 2022-03-22 23:25:38 | 2022-03-22 23:25:38 |

### MySQL INSERTING INTO admin...
```syntax
INSERT INTO admin(id,Names,role_id)values(73056,'Aswin',1);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(1,'Cithra',001,5,0011);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(2,'Shyam',002,6,0022);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(3,'Prasana',003,7,0033);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(4,'Revathi',004,8,0044);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(5,'Lisha',005,9,0055);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(6,'Surya',006,10,0066);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(7,'Gajendran',007,11,0077);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(8,'Rahamath',008,12,0088);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(9,'John',100,13,10011);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(10,'Monish',200,14,20022);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(11,'Karanjeeth',300,15,30033);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(12,'Deepan',400,16,40044);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(13,'Sanjeev',500,17,50055);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(14,'Srimon',600,18,50055);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(15,'Saravana',700,19,70077);
INSERT INTO admin(id,Names,company_id,user_id,role_id)values(16,'Rohith',800,20,80088);
```
SELECT * FROM admin;

| Id    | Names      | company_id | user_id | role_id | Created_date        | Modify_date         |
|:------|:-----------|:-----------|:--------|:--------|:--------------------|:--------------------|
|     1 | Cithra     |          1 |       5 |      11 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|     2 | Shyam      |          2 |       6 |      22 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|     3 | Prasana    |          3 |       7 |      33 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|     4 | Revathi    |          4 |       8 |      44 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|     5 | Lisha      |          5 |       9 |      55 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|     6 | Surya      |          6 |      10 |      66 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|     7 | Gajendran  |          7 |      11 |      77 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|     8 | Rahamath   |          8 |      12 |      88 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|     9 | John       |        100 |      13 |   10011 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|    10 | Monish     |        200 |      14 |   20022 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|    11 | Karanjeeth |        300 |      15 |   30033 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|    12 | Deepan     |        400 |      16 |   40044 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|    13 | Sanjeev    |        500 |      17 |   50055 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|    14 | Srimon     |        600 |      18 |   50055 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|    15 | Saravana   |        700 |      19 |   70077 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
|    16 | Rohith     |        800 |      20 |   80088 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |
| 73056 | Aswin      |       NULL |    NULL |       1 | 2022-03-23 00:12:48 | 2022-03-23 00:12:48 |

### MySQL INSERTING INTO booking...
```syntax
INSERT INTO booking(id,Names,address,user_id,models_id)values(904230,'kaushik','AGS colony 2nd mainroad veleachery jasmine appt 22/23 chennai-42',1,00110);
```
SELECT * FROM booking;

| Id     | Names   | address                                                          | user_id | models_id | Created_date        | Modify_date         |
|:-------|:--------|:-----------------------------------------------------------------|:--------|:----------|:--------------------|:--------------------|
| 904230 | kaushik | AGS colony 2nd mainroad veleachery jasmine appt 22/23 chennai-42 |       1 |       110 | 2022-03-23 00:20:03 | 2022-03-23 00:20:03 |

### MySQL INSERTING INTO reviews...
```syntax
INSERT INTO reviews(id,Names,user_id,description)values(2231,'kaushik',1,'I booked an appointment for a test drive of the RR panthom I chose on the Mlg website. The purchasing process is very easy; once you are done with the paper work and finish the payment, you can take your car home, Thanks to cithra');
INSERT INTO reviews(id,Names,user_id,description)values(2232,'Aswath',3,'Mlg is a trusted dealer to buy and sell used cars. I bought a car from one of their branches about six months ago. It is running smoothly; I haven’t faced any issues so far and it looks like a new car. I am happy with the purchase.');
INSERT INTO reviews(id,Names,user_id,description)values(2233,'Haiden',4,'I found mlg the best place to sell my car. Very good valuation, Very supportive staff and totally hassle free procedure.I was able to sell my car within a day. Thanks Mlg.');
```
SELECT * FROM reviews;
| Id   | Names   | user_id | description| Created_date| Modify_date|

| 2231 | kaushik |       1 | I booked an appointment for a test drive of the RR panthom I chose on the Mlg website. The purchasing process is very easy; once you are done with the paper work and finish the payment, you can take your car home, Thanks to cithra    | 2022-03-23 00:25:33 | 2022-03-23 00:25:33 |
| 2232 | Aswath  |       3 | Mlg is a trusted dealer to buy and sell used cars. I bought a car from one of their branches about six months ago. It is running smoothly; I haven’t faced any issues so far and it looks like a new car. I am happy with the purchase.   | 2022-03-23 00:27:40 | 2022-03-23 00:27:40 |
| 2233 | Haiden  |       4 | I found mlg the best place to sell my car. Very good valuation, Very supportive staff and totally hassle free procedure.I was able to sell my car within a day. Thanks Mlg.                                                               | 2022-03-23 00:27:40 | 2022-03-23 00:27:40 |

### ALTER TABLE Vehicle_type...
```syntax
	ALTER TABLE Vehicle_type DROP column wheels;
	ALTER TABLE Vehicle_type  ADD column wheels_typ int ;
```

### UPDATE Vehicle_type...
```syntax
UPDATE Vehicle_type SET wheels_typ = 2 WHERE Id = 1;
UPDATE Vehicle_type SET wheels_typ = 4 WHERE Id = 2;
```

### LOGIN uer...
```syntax
SELECT*FROM user WHERE (Firstname="kaushik");
```
