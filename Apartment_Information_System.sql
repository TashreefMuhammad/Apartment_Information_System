--Creating Table--

/*Entity 1 */
Create Table Resident(
	ResidentID varchar(100)  primary key,
	NID_BID varchar(50) unique not null ,
	Name varchar(50) not null,
	Citizenship bit not null,
	Flat_No varchar(10) not null,
	Contact_No varchar(20) unique ,
	Email varchar(50) unique,
	Permanent_Address varchar(100) not null,
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

--  Data Entry --

INSERT INTO Resident(ResidentID, NID_BID, Name, Citizenship,Flat_No,Contact_No,Email,Permanent_Address,Profession,Job_Address,Current_Living,Pass) VALUES 
('1RID','3425678426', 'Shah Alam Tasin','True','A1','01921363894','shahalamtasin12@gmail.com','3/4 South Street Road,Mirpur 2,Dhaka','Software Engineer','Kanka Tower,Gulshan 2,Dhaka','True',HASHBYTES('MD5','01921363894')),
('2RID','3859204934', 'Shams Al Ahsan','False','A1',' ','','',' ',' ','True',''),
('3RID','2134234564', 'Arafat Uddin','True','A2','01745363894','arafatuddin21@gmail.com','22/C Polashi,Lalbagh,Dhaka','Gynecologist','Square Hospital,Panthapath,Dhaka','True',HASHBYTES('MD5','01745363894')),
('4RID','1943950476', 'Tashreef Mahmud','True','B3','01813637954','tashreef14@gmail.com','Doctor Goli,Malibagh,Dhaka','Teacher','Dhaka University,Dhaka','False',HASHBYTES('MD5','01813637954')),
('5RID','4325678532', 'Tasnid Swaad','True','D1','01642063894','tasnidswaad1920@gmail.com','Comilla cantonment road,Comilla,Bangladesh','Actor','FDC Mor,Moghbazar','True',HASHBYTES('MD5','01642063894'))


INSERT INTO SecurityGuard(SecurityID,NID,Name,Contact_No,Present_Address,Permanent_Address,Email,Stat,Pass)VALUES
('1SID','5122398725','Akter Mohammad','01936258458','Hashem Ali Road,Jatrabari,Dhaka','Ismail Road,Choddogram,Comilla','aktermd34@gmail.com','TRUE',HASHBYTES('MD5','01936258458')),
('2SID','6395284725','Kawsar Ahmed','01714853958','Taltola Market,Khilgao,Dhaka','Rajshahi Railway Station Road,Rajshahi','kawsercool12@gmail.com','False',HASHBYTES('MD5','01714853958')),
('3SID','5321823125','Ilias Ali','01956548328','Muhgda Hospital Road,Mughda,Dhaka','Porsuram,Feni','iliasbhai21@gmail.com','TRUE',HASHBYTES('MD5','01956548328')),
('4SID','1254869325','Safayet Haque','01935375448','Shahjahanpur Colony,Shahjahanpur,Dhaka','Moylapota Road,Khulna','safayethaque@gmail.com','TRUE',HASHBYTES('MD5','01935375448')),
('5SID','2598746321','Rafat Uddin','01675362532','Manda Hajari School Goli ,Manda,Dhaka','Shahjalal Majar Road,Sylhet','rafatuddin32@gmail.com','False',HASHBYTES('MD5','01936258458'))


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
('1SPID','01596347896','Sumon Sarker','7 No Road,Dhanmondi,Dhaka','','Home Tutor'),
('2SPID','01963216544','Sakhina Sultana','Cinema Hall Road,Farmgate,Dhaka','Abdullahpur,Gazipur','House Maid'),
('3SPID','01891231698','Jarina Khatun','Begun Bari,Tejgao,Dhaka','Horinath Road,Mymensingh','House Maid'),
('4SPID','01778884949','Farhan Akter','Truck Stand,Tejgao,Dhaka','','DOT Network'),
('5SPID','01896654932','Ali Mohammad','Railgate,Tejgao,Dhaka','','Ali Cable Network')


--  Viewing all entered Data --

SELECT * FROM Resident
SELECT * FROM SecurityGuard
SELECT * FROM Guest
SELECT * FROM Manager
SELECT * FROM ServiceProvider


--  Deleting Table with all Entries --

Drop table Guest 
Drop table ServiceProvider
Drop table Resident
Drop table SecurityGuard
Drop table Manager