CREATE TABLE [dbo].[Employee] (
[Employee_ID] int NOT NULL primary Key,
[Last_Name] nvarchar(25) NOT NULL,
[First_Name] nvarchar(25) NOT NULL,
[Job_Title] nvarchar(50) NOT NULL,
[E_mail] nvarchar(50) NOT NULL,
[Phone_Number] nvarchar(12) NOT NULL,
[Address] nvarchar(100) NOT NULL,
[City] nvarchar(25) NOT NULL,
[State] nvarchar(2) NOT NULL,
[Zip] nvarchar(12) NOT NULL,
[Certification] bit NOT NULL,
[Notes] nvarchar(max),
[Employed] bit NOT NULL,
[Password] nvarchar)

CREATE TABLE [dbo].[Equipment] (
[Equipment_ID] int NOT NULL IDENTITY(1,1) primary key ,
[Equipment_Type] nvarchar(255) NOT NULL
)

CREATE TABLE [dbo].[Customer] (
[VID] int NOT NULL primary key ,
[Last_Name] nvarchar(25) NOT NULL,
[First_Name] nvarchar(25) NOT NULL,
[MI]nvarchar(1),
[Email] nvarchar(50) NOT NULL,
[Phone_Number] nvarchar(12) NOT NULL,
[Password] nvarchar
)

CREATE TABLE [dbo].[Ticket] (
[Ticket#] int NOT NULL primary key IDENTITY(1,1),
[Description] nvarchar(max) NOT NULL,
[Summary] nvarchar(510),
[Due_Date] datetime,
[Closed] datetime ,
[Serial_Number] nvarchar(20) NOT NULL,
[Asigned_To] int foreign key references Employee(Employee_ID),
[Customer] int NOT NULL foreign key references Customer(VID),
[Equipment] int NOT NULL foreign key references Equipment(Equipment_ID),
[Date_Closed] datetime,
[Date_Created] datetime,
[Last_Updated] datetime,
[Date_Opened] datetime,
[Notes] nvarchar(max)
,
)





