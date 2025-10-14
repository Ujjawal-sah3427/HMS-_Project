CREATE DATABASE HOSPITAL_MANAGEMENT_SYSTEM;
USE HOSPITAL_MANAGEMENT_SYSTEM;



CREATE TABLE login (
 
    username VARCHAR(50),
    password VARCHAR(50)
);
insert into login value ("admin",12345);

CREATE TABLE patient_info(
first_name varchar(40),
last_name varchar(40),
time varchar(20),
gender varchar(20),
Email varchar(30),
phone_number numeric,
address varchar(30),
diseases varchar(30),
room_number varchar(30)
);

select * from patient_info;

CREATE TABLE Rooms(
room_number varchar(20),
avalibality varchar(40),
price varchar(10),
room_type varchar(100)
);
select * from Rooms;
insert into Rooms values("100","Availabil","500","G Bed 1");
insert into Rooms values("101","Availabil","500","G Bed 2");
insert into Rooms values("102","Availabil","500","G Bed 3");
insert into Rooms values("103","Availabil","500","G Bed 4");
insert into Rooms values("200","Availabil","1500","Private Room");
insert into Rooms values("201","Availabil","1500","Private Room");
insert into Rooms values("202","Availabil","1500","Private Room");
insert into Rooms values("203","Availabil","1500","Private Room");
insert into Rooms values("300","Availabil","3500","ICU Bed 1");
insert into Rooms values("301","Availabil","3500","ICU Bed 2");
insert into Rooms values("302","Availabil","3500","ICU Bed 3");
insert into Rooms values("303","Availabil","3500","ICU Bed 4");
insert into Rooms values("304","Availabil","3500","ICU Bed 5");
insert into Rooms values("305","Availabil","3500","ICU Bed 6");

create table Departments(
Departments_name varchar(100),
Department_no int
);
INSERT INTO Departments (Departments_name, Department_no) VALUES
('Emergency', 1),
('Outpatient(OPD)', 2),
('ICU', 3),
('Inpatient(IPD)', 4),
('Cardiology', 5),
('Neurology', 6),
('Gynaecology', 7),
('General Surgery', 8),
('Dermatology', 9),
('Ophthalmology', 10);

















    
    
   
 
