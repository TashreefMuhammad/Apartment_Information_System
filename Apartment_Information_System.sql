-- Creating Database --
DROP DATABASE ApartmentInformationSystem

CREATE DATABASE ApartmentInformationSystem

USE ApartmentInformationSystem


--Creating Table--

/*Entity 1 */
Create Table Resident(
	ResidentID varchar(100)  primary key,
	NID_BID varchar(50) unique not null ,
	Name varchar(50) not null,
	Citizenship bit not null,
	Flat_No varchar(10),
	Contact_No varchar(20) unique ,
	Email varchar(50) unique,
	Permanent_Address varchar(100),
	Profession varchar(30) ,
	Job_Address varchar(100),
	Current_Living  bit not null,
	Pass varchar(200) 
)

/*Entity 2 */
Create Table SecurityGuard(

	SecurityID varchar(100) primary key, 
	NID varchar(50)  unique not null,
	Name varchar(50) not null,
	Contact_No varchar(20) unique  not null,
	Present_Address varchar(100) not null,
	Permanent_Address varchar(100) not null,
	Email varchar(100) unique not null,
	Stat  bit not null,
	Pass varchar(200) not null
)

/*Entity 3 */
Create Table Manager(
	
	ManagerID varchar(100)  primary key,
	NID varchar(50)  unique not null,
	Name varchar(50) not null,
	Contact_No varchar(20) unique not null,
	Permanent_Address varchar(100) not null,
	Email varchar(100) unique not null,
	Stat  bit not null,
	Pass varchar(100) not null,
)

/*Entity 4 */
Create Table ServiceProvider(
	
	SPID varchar(100) primary key,
	Contact_No varchar(20) unique not null,
	Name varchar(50) not null,
	Present_Address varchar(100) ,
	Permanent_Address varchar(100),
	Designation varchar(30) not null,
)

/*Entity 5 */
Create Table Guest(
	GuestID varchar(100) primary key,
	Name varchar(50) not null,
	Contact_No varchar(20) unique not null
)

/* Entity 6 */
Create Table OfficialPersonnel(
	DTID varchar(100) primary key,
	ManagerID varchar(100)  FOREIGN KEY REFERENCES Manager(ManagerID),
	Organization_Name varchar(100) not null,
	Reason varchar(200) not null,
	CountPeople int not null,
	NID varchar(50) unique not null,
	Name varchar(50) not null,
	Contact_No varchar(20)unique not null,
	Profession varchar(30) not null,
	WorkInstitute varchar(50) not null
)

/* Entity 7 */
Create Table Flat(
	DTID varchar(100) primary key,
	DTIN varchar(50) not null,
	DTOUT varchar(50),
	Flat_No varchar(50) not null,
	ResidentID varchar(100)  FOREIGN KEY REFERENCES Resident(ResidentID),
)

/* Entity 8 */
Create Table GuestEntry(
	DTID varchar(100) primary key,
	SecurityID varchar(100)  FOREIGN KEY REFERENCES SecurityGuard(SecurityID),
	ResidentID varchar(100)  FOREIGN KEY REFERENCES Resident(ResidentID),
	GuestID  varchar(100)  FOREIGN KEY REFERENCES Guest(GuestID)
)

/* Entity 9 */
Create Table ServiceProviderEntry(
	DTID varchar(100) primary key,
	SPID varchar(100)  FOREIGN KEY REFERENCES  ServiceProvider(SPID),
	SecurityID varchar(100)  FOREIGN KEY REFERENCES SecurityGuard(SecurityID),
	Flat_No varchar(50) not null
)

/* Entity 10 */
Create Table ServiceDuration(
	DTID varchar(100) primary key,
	DTIN varchar(50) not null,
	SPID varchar(100)  FOREIGN KEY REFERENCES  ServiceProvider(SPID),
	Flat_No varchar(50) not null,
	DTOUT varchar(50)
)

/*Entity 11 */
Create Table Fund(
	TransactionID varchar(100) primary key,
	DateAndTime varchar(50) not null,
	TypeOfPayment varchar(50) not null,
	Amount_Paid float not null,
	ResidentID varchar(100)  FOREIGN KEY REFERENCES Resident(ResidentID) 
)

/*Entity 12 */
Create Table Transactions(
	DTID varchar(100) primary key,
	Flat_No varchar(50) not null,
	Paid_Amount float not null,
	SPID varchar(100)  FOREIGN KEY REFERENCES  ServiceProvider(SPID),
	Report varchar(100),
	ManagerID varchar(100)  FOREIGN KEY REFERENCES Manager(ManagerID)
)

/*Entity 13 */
Create Table Requests(
	DTID varchar(100) primary key,
	ResidentID varchar(100)  FOREIGN KEY REFERENCES Resident(ResidentID),
	ManagerID varchar(100)  FOREIGN KEY REFERENCES Manager(ManagerID),
	Main_Request varchar(200) not null,
	Descrip varchar(1000),
	Urgency int not null
)


--  Data Entry --


INSERT INTO Resident(ResidentID, NID_BID, Name, Citizenship,Flat_No,Contact_No,Email,Permanent_Address,Profession,Job_Address,Current_Living,Pass) VALUES 
('1RID','3425678426', 'Shah Alam Tasin','True','A1','01921363894','shahalamtasin12@gmail.com','3/4 South Street Road,Mirpur 2,Dhaka','Software Engineer','Kanka Tower,Gulshan 2,Dhaka','True',HASHBYTES('MD5','01921363894')),
('2RID','3859204934', 'Shams Al Ahsan','False','A1',NULL,NULL,NULL,NULL,NULL,'True',NULL),
('3RID','2134234564', 'Arafat Uddin','True','A2','01745363894','arafatuddin21@gmail.com','22/C Polashi,Lalbagh,Dhaka','Gynecologist','Square Hospital,Panthapath,Dhaka','True',HASHBYTES('MD5','01745363894')),
('4RID','1943950476', 'Tashreef Mahmud','True','','01813637954','tashreef14@gmail.com','Doctor Goli,Malibagh,Dhaka','Teacher','Dhaka University,Dhaka','False',HASHBYTES('MD5','01813637954')),
('5RID','4325678532', 'Tasnid Swaad','True','D1','01642063894','shahalam.tasin@gmail.com','Comilla cantonment road,Comilla,Bangladesh','Actor','FDC Mor,Moghbazar','True',HASHBYTES('MD5','01642063894'))


INSERT INTO SecurityGuard(SecurityID,NID,Name,Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass)VALUES
('1SID','5122398725','Akter Mohammad','01936258458','Hashem Ali Road,Jatrabari,Dhaka','Ismail Road,Choddogram,Comilla','aktermd34@gmail.com','TRUE',HASHBYTES('MD5','01936258458')),
('2SID','6395284725','Kawsar Ahmed','01714853958','Taltola Market,Khilgao,Dhaka','Rajshahi Railway Station Road,Rajshahi','kawsercool12@gmail.com','False',HASHBYTES('MD5','01714853958')),
('3SID','5321823125','Ilias Ali','01956548328','Muhgda Hospital Road,Mughda,Dhaka','Porsuram,Feni','iliasbhai21@gmail.com','TRUE',HASHBYTES('MD5','01956548328')),
('4SID','1254869325','Safayet Haque','01935375448','Shahjahanpur Colony,Shahjahanpur,Dhaka','Moylapota Road,Khulna','safayethaque@gmail.com','TRUE',HASHBYTES('MD5','01935375448')),
('5SID','2598746321','Rafat Uddin','01675362532','Manda Hajari School Goli ,Manda,Dhaka','Shahjalal Majar Road,Sylhet','rafatuddin32@gmail.com','False',HASHBYTES('MD5','01675362532'))


INSERT INTO Guest(GuestID,Name,Contact_No) VALUES 
('1GID','Murad Mia','01523698749'),
('2GID','Anika Ibnat','01935824123'),
('3GID','Sadman Ayon','01671239548'),
('4GID','Yusuf Ahmed','01589643271'),
('5GID','Mushfiq Hossain','01785964263')


INSERT INTO Manager(ManagerID,NID,Name,Contact_No,Permanent_Address,Email,Stat,Pass) VALUES
('1MID','2193749287','Mahir Khan','01534625845','Choddogram,Comilla','mahirkhan4@gmail.com','False',HASHBYTES('MD5','01534625845')),
('2MID','3249379204','Kabir Ullah','01718438309','Kuet Road,Khulna','kabirullah71@gmail.com','True',HASHBYTES('MD5','01718438309')),
('3MID','5387392734','Dabnath Shah','01673984930','Sitakundo,Chittagong','dabnath3436@gmail.com','False',HASHBYTES('MD5','01673984930')),
('4MID','8448923043','Hashem Kader','01934783920','Bajra Shahi Moshjid Road,Noakhali','hashemkader@gmail.com','False',HASHBYTES('MD5','01934783920'))


INSERT into ServiceProvider(SPID,Contact_No,Name,Present_Address,Permanent_Address,Designation) VAlUES
('1SPID','01596347896','Sumon Sarker','7 No Road,Dhanmondi,Dhaka',NULL,'Home Tutor'),
('2SPID','01963216544','Sakhina Sultana','Cinema Hall Road,Farmgate,Dhaka','Abdullahpur,Gazipur','House Maid'),
('3SPID','01891231698','Jarina Khatun','Begun Bari,Tejgao,Dhaka','Horinath Road,Mymensingh','House Maid'),
('4SPID','01778884949','Farhan Akter','Truck Stand,Tejgao,Dhaka',NULL,'DOT Network'),
('5SPID','01896654932','Ali Mohammad','Railgate,Tejgao,Dhaka',NULL,'Ali Cable Network')


INSERT into OfficialPersonnel(DTID,ManagerID,Organization_Name,Reason,CountPeople,NID,Name,Contact_No,Profession,WorkInstitute)VALUES
('1600425287485OP','2MID','Election Commission','Census',3,'2514369878','Khairul Bashar','01936524875','Teacher','Government Boys School'),
('1600425631113OP','2MID','Dhaka City Corporation','Collecting Tax',3,'2698531478','Mizanul Karim','01752165984','Officer','Dhaka City Corporation')


INSERT into Flat(DTID,DTIN,DTOUT,Flat_No,ResidentID)VALUES
('1600426484049FL','2020-09-18 16:54:44',NULL,'A1','1RID'),
('1600426582146FL','2020-09-18 16:56:22',NULL,'A1','2RID'),
('1600426628580FL','2020-09-18 16:57:08',NULL,'A2','3RID'),
('1600426671388FL','2020-09-18 16:57:51','2020-09-18 17:01:56','B3','4RID'),
('1600426950197FL','2020-09-18 17:02:30',NULL,'D1','5RID')


INSERT into GuestEntry(DTID,SecurityID,ResidentID,GuestID)VALUES
('1600427319631GE','1SID','1RID','1GID'),
('1600427333477GE','3SID','3RID','2GID'),
('1600427340338GE','1SID','3RID','3GID'),
('1600427353000GE','4SID','1RID','4GID'),
('1600427370744GE','3SID','5RID','5GID')


INSERT into ServiceProviderEntry(DTID,SPID,SecurityID,Flat_No)VALUES
('1600427949919SPE','1SPID','1SID','A1'),
('1600427962423SPE','2SPID','4SID','A2'),
('1600427971223SPE','3SPID','3SID','B3'),
('1600427979430SPE','5SPID','3SID','D1')


INSERT into ServiceDuration(DTID,DTIN,Flat_No,SPID,DTOUT)VALUES
('1600428224139SD','2020-09-18 17:23:44','A1','1SPID','2020-09-18 17:46:54'),
('1600429518842SD','2020-09-18 17:45:18','A2','2SPID',NULL),
('1600429539094SD','2020-09-18 17:45:39','B3','3SPID','2020-09-18 17:47:03'),
('1600429556252SD','2020-09-18 17:45:56','D1','4SPID','2020-09-18 17:47:14')


INSERT into Fund(TransactionID,DateAndTime,TypeOfPayment,Amount_Paid,ResidentID)VALUES
('7HS3FF2BYG','2020-09-17 15:12:14','bKash','512.30','1RID'),
('4I57JV03TO','2020-09-14 14:35:41','Rocket','1000.00','3RID'),
('4HR21POI35','2020-09-15 13:25:23','Rocket','450.00','3RID'),
('32POY84BG2','2020-09-18 18:21:53','Nagad','1400.50','5RID')


INSERT into Transactions(DTID,Flat_No,Paid_Amount,SPID,Report,ManagerID)VALUES
('1600432352896TR','A1','300.00','5SPID',NULL,'2MID'),
('1600432361699TR','A2','300.00','4SPID',NULL,'2MID'),
('1600432373165TR','D1','300.00','5SPID',NULL,'2MID')


INSERT into Requests(DTID,ResidentID,ManagerID,Main_Request,Descrip,Urgency)VALUES
('1600432700392RQ','1RID',NULL,'Need Electrician','One of the fan is not spinning in a room','3'),
('1600433237031RQ','3RID','2MID','Need Mechanics','Gas Leakage','5'),
('1600433247393RQ','5RID','2MID','Need Plumber','One of the pipes in the kitchen','2')


--  Viewing all entered Data --

SELECT * FROM Resident
SELECT * FROM SecurityGuard
SELECT * FROM Guest
SELECT * FROM Manager
SELECT * FROM OfficialPersonnel
SELECT * FROM Flat
SELECT * FROM Fund
SELECT * FROM ServiceProviderEntry
SELECT * FROM ServiceDuration
SELECT * FROM GuestEntry
SELECT * FROM Requests
SELECT * FROM Transactions
SELECT * FROM ServiceProvider

--  Deleting Table with all Entries --
/*
Drop table Guest 
Drop table ServiceProvider
Drop table Resident
Drop table SecurityGuard
Drop table Manager
Drop table OfficialPersonnel 
Drop table Flat
Drop table Fund
Drop table ServiceProviderEntry
Drop table ServiceDuration
Drop table GuestEntry 
Drop table Requests
Drop table Transactions*/



SELECT * FROM Manager Where Contact_No = '01718438309' AND Pass = HASHBYTES('MD5','01718438309')

update Manager set Stat=1 where Contact_No='01718438309'

Select Count(*) from Guest