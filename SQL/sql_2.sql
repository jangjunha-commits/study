/* CREATE DATABASE문
새 SQL데이터베이스 만드는 데 사용된다
 */
/*CREATE DATABASE databasename; */
/* testDB데이터 베이스 만들기 */
CREATE DATABASE testDB;
/* 데이터베이스 목록 확인 SHOW DATABASE */
/*DROP DATABASE 데이터 베이스를 삭제 */
/* DROP DATABASE databasename; */
/* testDB 삭제 하기 */
/* DROP DATABASE testDB */
/* 서버용 sql백업 데이터베이스 명세서 
BACKUP DATABASE문 SQL sERVER에서 기존 SQL데이터 베이스의 전체 백업을 생성하는데 사용됩니다 
 */
/*BACKUP DATABASE databasename TO DISK = 'filepath'; */
/* 미분문이 포함된 sql백업 벡압이후 변경된 데이터 베이스 부분만 백업합니다 
BACTUP DATABASE databasename TO DIST = 'filepath' WITH DIFFERNTIAL;
백업 데이터베이스 예제
BACKUP DATABASE testDB
TO DISK = 'D:\backups\testDB.bak';
차등예제를 사용한 백업
BACKUP DATABASE testDB
TO DISK = 'D:\backups\testDB.bak'
WITH DIFFERENTIAL;
*/

/* CREATE TABLE문 새테이블을 만드는세 사용됩느다
CREATE TABLE table {
   col1 datatype,
   col2 datatype,
   col3 datatype,
   ...
};
열 매개변수는 테이블의 열이름을 저장합니다
데이터 유형 매개변수는 열이 보유할 수 있는 데이터 유형을 지정합니다 
다섯개의 열로 구성된 Persons 라는 테이블을 만듭니다 PersonID 성 이름 주소 및 도시
 */
/*CREATE TABLE Persons {
   PersonID int,
   LastName varchar(255),
   FirstName varchar(255),
   Address varchar(255),
   City varchar(255)
};
*/
/* 
다른 테이블을 사용하여 테이블 만들기 
create table new_table as select col1, col2, ... from existing_table where ...;
TestTable이라는 새테이블을 만듭니다 
*/
/* CREATE TABLE TestTable AS SELECT customername, contactname FROM customers; */
/*
Drop 테이블 문
데이터베이스에서 기존 테이블을 삭제
DROP TABLE table;
기존테이블 shippers를 삭제합니다
DROP TABLE shippers;
절단 테이블
TRUNCATE TABLE 문은 테이블 내부의 데이터를 삭제하는데 사용되지만 테이블을 삭제되지 않습니다
TRUNCATE TABLE table;

ALTER테이블 문
기존테이블에 열추가 삭제 또는 수정하는데 사용
기존테이블에 다양한 제약 조건을 주추가하거나 삭제하는데 사용됩니다 
열추가 
alter table table_name
add colnum_name datatype;
sql은 고객 테이블에 이메일 열을 추가합니다
ALTER TABLE Customers 
ADD Email varchar(255);

변경테이블 - 드롭 칼럼
alter table tale_name
drop column col_name

고객 테이블에서 이메일 열을 삭제합니다
ALTER TABLE Customers
DROP COLUMN Email;

alter table - 열이름 변경
ALTET TABLE table
Rename COUMN old_name to new_name

테이블 열이름을 변경하려면 다음 구문을 사용합니다 
EXEC sp_name 'table_name.old_name', 'new_name', 'COLUMN';

ALTER TABLE - 데이터유형 변경/수정
ALTER TABLE table 
ALTER COLUMN col_name datatype

사람들 표를 보세요
Person테이블에 DateOfBirth라는 열을 추가하고자 합니다
ALTER TABLE Persons 
ADD DateOfBirth date;

데이터 유형 변경 예제
Persons표에서 DataOfBirth라는 열의 데이터 유형을 변경하고자 합니다
ALTER TABLE Persons
ALTER COLUMN DateOfBirth year;

드룹 칼럼 예시
사람들 표에서 생년월일 이라는 열을 삭제
ALTER TABLE Persons
DROP COLUMN DateOfBirth;

제약 조건 생성
테이블 만들때 제약조건을 지정할수 있다
CREATE TABLE문 또는 테이블 생성된후 ALTER TABLE 진술
CREATE TABLE table {
  col1 datatype constraint,
  col2 datatype constraint,
  col3 datatype constraint,
  ...
};
제약조건
not-null : 열이 null값을 가질수 없도록 보장합니다
unique - 열이 있는 모든 값이 다름을 보장합니다 
primary key - a의 조합 그리고 unique 테이블 각행을 고유하게 식별합니다 
foregin key - 테이블 간의 링크를 라괴하는 작업을 방지합니다
check - 열의 값을 특정 조건을 만족하도록 보장합니다
default - 값이 지정되지 않는 경우 열의 기본값을 설정합니다
check index - 데이터베이스에서 데이터를 매우빠르게 생성하고 검색하는데 사용됩니다 

sql null제약 조건 
not null제약조건은 열이 null값을 받아들이지 않도록 강제합니다 
필드에 항상 값을 포함하도록 강제하므로, 이필드에 값을 추가하지 않고는 새 레코드를 삽입하거나 레코드를 업데이트 할수 없다
CREATE TABLE  Presons {
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255) NOT NULL,
    Age int
};

NOT NULL Persons테이블이 이미 생성된 경우 Age열에 대한 제약조건 sql
ALTER TABLE Persons 
ALTER COLUMN Age int NOT NULL

CREATE TABLE Persons {
   ID int NOT NULL,
   LastName varchar(255) NOT NULL,
   FirstName varchar(255),
   Age int,
   UNIQUE (ID)
};

UNIQUE 제약 조건, 그리고 정의하기 위해 UNIQUE 여러 열에 대한 제약조건을 다음 SQL구문
CREATE TABLE Persons {
   ID int NOT NULL,
   LastName varchar(255) NOT NULL,
   FirstName varchar(255),
   Age int,
   CONSTRAINT UC_Person UNIQUE (ID, LastName)
};

제약조건
ALTER TABLE Persons 
ADD UNIQUE (ID);

ALTER TABLE Persons
DROP CONSTRAINT UC_Person UNIQUE (ID, LastName)

ALTER TABLE Person
DROP INDEX UC_Person

ALTER TABLE Persons 
DROP CONSTRAINT UC_Person;

기본키 제약 조건
primary key 제약 조건은 표의 각 레코드를 고유하게 식별합니다 
unique값이 포함되어야 하며 null값을 포함할수 없습니다
테이블은 하나의 키만 가질수 있으며 테이블에서 이 기본키는 단일 또는 다중열로 구성될수 있다
사람 테이블 생성될때 ID 열 표시
CREATE TABLE Persons {
   ID int NOT NULL,
   LastName varchar(255) NOT NULL,
   FirstName varchar(255),
   Age int,
   Primary key (ID)
};

CREATE TABLE Persons {
   ID int NOT NULL,
   LastName varchar(255) NOT NULL,
   FirstName varchar(255),
   Age int,
   Constraint PK_Person  Primary key (ID, LastName)
};

alter 테이블의 기본키
ALTER TABLE Persons
ADD PRIMARY KEY (ID);

ALTER TABLE Persons
ADD CONSTRAINT PK_Person PRIMARY KEY (ID, LastName);

ALTER TABLE Persons
DROP PRIMARY KEY (ID);

ALTER TABLE Persons
DROP CONSTRAINT PK_Person PRIMARY KEY;
*/

/* 외부키
foregine key 사람에서 주문테이블이 생성될때 id열 
 */
/*
create table Orders {
    OrderID int NOT NULL,
    OrderNumber int NOT NULL,
    primary key (OrderID),
    foregin key (PersonID) Reference Persons(PersonID)
    
}

 create table Orders {
   OrderID int not null primary key,
   OrderNumber int not null,
   PersonID int foreign key reference Persons(PersonID)

외부 키
foregin key 사람에 대한 제약주문 테이블이 이미 생성된 경우
alter table Orders 
add foregin key (PersonID) references Persons(PersonID)

외부키 제약 조건 삭제
alter table Orders
drop foregin key fk_PersonOrder;

alter table Orders
drop constraint fk_personOrder;
}

체크
check 사람 테이블에 생성될때 연령 열에 대한 제약 check제약 조건
사람의 나이가 18세 이상이어야합니다 
create table Persons {
   ID int not null,
   LastName varchar(255) not null,
   FirstName varchar(255),
   Age int,
   Check (age >= 18)
};

create table Persons {
  id int not null,
  Lname varchar(255) not null,
  fname varchar(255),
  age int,
  city varchar(255),
  constraint chk_person check (age >= 18 and city = 'sandnes')
};

alter테이블 sql확인
alter table Persons
add check (age>=18)

alter table Persons
add constraint chk_person check (age>-18 and city='sandnes');

확인 제약 조건 삭제
alter table person
drop constraint chk_personage;

alter table persone
drop check chk_personage;

기본제약 조건
default 제약 조건은 열의 기본값을 설정하는데 사용됩니다
기본값이 다른 갓이 지정되지 않는 경우 모든 새래코드에 추가됩니다 

Person테이블이 생성될대 city 열의 값
create table Persons {
   Id int not null,
   LastName varchar(255) not null,
   firstName varchar(255),
   age int,
   city varcahr(255) default 'sandnes'
};

defualt 제약 조건은 다음과 함수를 사용하여 시스템 값을 삽입하는 데 사용할수 있다
create table Orders {
   id int not null,
   OrderNumber int not null,
   OrderDate data default getdate()
};

alter table Persons 
alter city set default 'sandnes';

altet table Persons
add constraint df_city
default 'sandnes' for city

드롭하기
altet table Persons
altet city drop default;

altet table Persons
altet column city drop default;

인덱스 
구문 생성
create index index_name on table_name (col1, col2, ...);

고유인덱스만들기
create unique index index_name
on table_name (col1, col2, ....);

인덱스 생성 예제
create index idx_lastname
on Persons (LastName);

열조합의 인덱스를 만들고 싶다면 괄호아넹 쉼표로 구분하여 열이름을 나열할수 있다
create index idx_pname on person (lname, fname);

drop index문
drop index index_name on table;

drop index talbe.index_name;

alter table table
drop index index_name;

sql server구문
create table Persons (
   Personid int identity(1,1) primary key,
   lastname varchar(255) not null,
   fname varchar(255),
   age int
);

identity 자동 increment 기능을 수행하는 키워드
indentity는 1이며 1씩 증가합니다 
Personid 열이 값이 10에서 시작하여 5만큼 증가하도록 지정하려면 같이 변경합니다
indentity(10,5)

create table Persons (
    Personid autoincrement primary key,
    lastname varchar(255) not null,
    firstname varchar(255),
    age int
);

autoincrement 자동 increment기능을 수행한 키워드 
기본적으로 시작값은 autoincrement는 1이며 새로은 기록마다 1씩 증가합니다 

insert into Persons (Fistname, lastName)
values('Lars', 'Monsen');

날짜 
date - format yyyy-mm-dd
datetime - yyyy-mm-dd hh:mi:ss
timestamp = yyyy-mm-dd hh:mi:ss
year - format yyyy or yy

주문날짜가 2008-11-11인 레코드를 선택하고자합니다
select * from Orders Where Orderdate = '2008-11-11';

create view문
결과 집합을 기반으로 한 가상 테이블입니다
실제 테이블처럼 행과 열이 포함되어 있습니다 
데이터베이스에 있는 하나이상의 실제 테이블의 필드입니다
create view 진술

구문 생성
create view view_name as 
select col1, col2, ..
from table
where condtion;

브라질에서 온 모든 고객을 표시하는 보기를 생성합니다 
create view [Brazil Customers] as select customerName, ContactName from Customers where Country = 'Brazil';

select * from [Brazil Customers];

제품표에서 평균가격보다 높은 가격으로 모든 제품을 선택하는 보기를 생성합니다 
create view [Person Above Average price] as select ProductName, Price from Products where Price > (select avg(Price) from Products);

select * from [Product Above Average Price];

보기 업데이트
create or replace view진술
create or replace view view_name as select col1, col2, ... from table where condtion;

브라질 고객 보기에 도시열을 추가합니다
create or replace view [brazil customers] as 
select customername, contactname, city 
from cusotmers
where country = 'brazil';

보기삭제
브라질 고객 보기를 삭제합니다
drop view [Breazil Customers]

웹페이지의 sql
select 변수 (txTuserID)
txtUserID = getRequestString("UserID");
txtSql = "select * from Users where UserID = " + txtUserID;

1=1기반으로 sql주입은 항상 참입니다
select * from Users where UestId = 105 Or 1=1;

select UserId, Name, Password From users Where UserID = 105 or 1=1;

uName = getReuqestString("username");
uPass = getRequestString("userPawwsord");

sql = 'select * from Users where Name = "" + uName + "" and Pass = "" + uPass + '"'
select * from Users where name="John Doe" And Pass = "myPass";
select * from Users Where Name = "" or = ""="" and Pass = "" or ""=""

select * from Users;
Drop table Suppliers

데이터 유형
문자열 데이터 유형
char(size) varchar(size) binary(size) varbinary(size)
tinyblob(size) tinytext text(size) blob(size) mediumrext 
emduimblok longtext longblob enum(val1, val2, val3) set(val1, val2, val3)
숫자 데이터 유형
bit(size) tinyint(size) bool boolean smallint(size) mediumint(size) int(size) integer(size) 
float(size d) double(size d) doubleprecision(size d) decimal(size d) dec(size d)
날짜 및 시간 데이터 유형
date datetime(fsp) timestamp(fsp) time(fsp) year 
서버 데이터 유형
char(n) varchar(n) varchar(max) nchar(n) nvarchar(n) nvarcahr(max) binary(n) varbinary(n) varbinary(max)

숫자 데이터 유형
bit tinyint smallint int bigint decimal(p,s) numerical(p,s) smallmoney float(n) 
real

액세스 데이터 유형
text memo byte integer long single double currency autonumber bate/time yes/no ole object hyperlink lookup wizard

*/