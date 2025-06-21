/*
tutorial
고객 테이블 
데이터 베이스 테이블
다섯개 레코드 일곱개의 열(ID, 고객이름, 연락처, 주소, 도시, 우편번호, 국가)
select - 데이터 추출
update - 데이터 갱신
delete - 데이터 삭제 
insert into - 새 데이터 삽입
create database - 새 데이터베이스를 만든다
alter table = 테이블 수정
drop table - 테이블 삭제
create index - 인덱스(검색키)만들기
drop index - 인덱스 삭제
테이블에서 데이터 반환
select문은 데이터베이스에서 데이터 선택하는데 반환
syntax 
select col1, col2
from table1, table2
*/
/* *는 모든 열을 반환합니다 */
select * from Customers;
select CustomerName, City from Customers;
/* distinct문장은 서로 다른(값만)반환하는데 사용됩니다 중복제거*/
select distinct Country from Customers;
/* 구분없는 선택 */
select Country from Customers;
/*구분있게 선택하자 */
select distinct CustomerName from Customers;
/* 카운트 디센트 국가의 수 */
select Count(distinct Country) from Customers;
select Count(*) as DistinctCountries
from (select distinct Country from Customers);
/* 개수 구하기 */
select count(distinct Country) from Customers;
/* 
select col1, col2 from table where condition
where절 레코드를 필터링하는데 사용됩니다 멕시코 고객을 선택하시오*/
select * from Customers Where Country ='Mexico';
/* 텍스트 필드와 숫자 필드
텍스트 값 주변에 단일 따옴표를 필요로 합니다 그러나 숫자필드는 따옴표로 묶어서 안된다
 */
select * from Customers Where CustomersID=1;
/* 조항의 운영자 where =검색을 필터링하는 연산자 모든 고객아이디가 80보다 큽니다
where조항
= > < >- <= <> Between Like In
*/
select * from Customers Where CountryID > 80;
/* 제품테이블 products */
/* 키워드별 주문 오름차순과 내림차순 정렬하는데 사용됩니다
제품테이블에 가격을 정렬하시오
select col1, col2 from table order by col1, col2 ase|desc
desc 내림차순
*/
select * from Customers where CystomerID > 50;
select * from products order by Price;
select * from products order by Price desc;
/* 고객 아이디를 정렬하세요 */
select * from products order by CustomerID;

/* 알파벳 순으로 주문해보자 문자열(영어)*/
select * from products order by ProductName;
select * from products order by ProductName;

/* 여러열로 정렬 */
select * from products order by Country, CustomerName;

/* 모두 사용 모든 국가 데이블에 오름차순 정렬하고 고객이름에 내림차순으로 정렬하자 */
select * from Customers order by Country Asc, CustomerName Desc;
select * from Customers order by ContactName desc;

/* AND 
스페인에서 G로 시작하는 고객이름을 반품하려는 경우 조건을 세우세요.
select col1, col2 where table where condtion1 AND condtion2 AND condtion3 ...;
모든 조건이 참인지 기록을 표시합니다 
OR
조건중 하나라도 참일 경우 기록을 표시합니다 
*/
SELECT * FROM Customers WHERE Country = 'spain' AND CustomerName LIKE 'G%';
/* 고객테이블에서 리우데자이네루와 50번초과고객이 브라인인 고객을 추출하시오.*/
select * from Customers Where Country = 'Brazil' AND City = 'Rio de Janeiro' AND CustomerID > 50;
/*결합 
스페인에서 G또는 R로 시작하는 모든 고객을 선택합니다
*/
select * from Customers Where Country = 'spain' AND (CustomerName LIKE 'G%' OR CustomerName LIKE 'R%');
/* 스페인 출신이며 G로 시작합니다 문자 R로 시작합니다 */
select * from Customers Where Country = 'spain' AND (CustomerName LIKE 'G%' OR CustomerName LIKE 'R%');

SELECT * FROM customers WHERE Country = 'Germany' AND (CustomerName LIKE 'S%' OR CustomerName LIKE '%n');
/* OR연산자 where절에서 하나이상이 포함 
스페인에서 모든 고객을 반품하련느 경우 여러 조건에 따라 레코드를 필터링하는데 사용
select col1, col2 from table where condtion1 OR condtion2 OR condtion3 ...;
*/
/* 독일 또는 스페인에서 모든 고객을 선택하세요 */
select * from Customers Where Country = 'GerMany' OR Country = 'Spain';

SELECT * FROM Customers WHERE Country = 'France' OR Country = 'UK';

/* NOT연산자는 다른 연산자와 결합하여 부정적인 결과라고도불리는 반대결과를 제공하는데 사용됩니다 
국적이 스페인이 아닌 고객을 선택하시오
select col1, col2 from table where not condtion;
*/
select * from Customers Where Not Country = 'spain';
/* A로 시작하지 않는 고객을 선택합니다 */
select * from Customers Where CustomerName Not LIKE 'A%';

SELECT * FROM Customers WHERE CustomerName NOT LIKE '%A%';

/* 사이가 아님 
고객과 함께 고객 선택ID는 10에서 60사이가 아닙니다
*/
select * from Customers Where CustomerID Not Between 10 And 60;

SELECT * FROM Customers WHERE CustomerID NOT BETWEEN 30 AND 50; 
/*포함되지 않음 
파리나 런던출신이 아닌 고객을 선택하시오
*/
select * from Customers Where City Not In('Paris', 'London');

SELECT * FROM Customer WHERE City NOT IN("NewYork", "frankfruit");
/* CustomerID가 50이하인 고객을 선택합니다 */
select * from Customers Where Not CustomerID > 50;

/* 50이상 */
select * from Customers Where CustomerID > 50;

SELECT * FROM customers WHERE CustomerID > 60;
/* 삽입 inset into 새 래코드를 삽입하는데 사용 
insert into table (col1, col2, col3, ...)
values(value1, value2, value3, ...);
sal쿼리에서 열이름을 저장할 필요없다 
값의 순서가 표의 열과 같은 순서인지 확인하세요 insert into
insert into table 
values (value1, value2, value3, ...);
*/

/* 고객 테이블에 새 레코드를 삽입합니다 */
insert into Customers(CustomerName, ContactName, Address, City, PostalCode, Country)
values('Cardianl', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');

/* 지정된 열에서만 삽입 
새레코드 삽입 CustomerName, City 및 Country 열에만 데이터를 삽입합니다 (Customer)ID는 자동으로 업데이트 합니다 
*/
insert into Customers(CustomerName, City, Country)
Values('Cardinal', 'Stavanger', 'Norway');

INSERT INTO Customers(CustomerName, City, Country, PostCode) VALUES('Cardnel', 'Paris', 'France', '4489');
/* 여러 행 삽입 하나의 문장에 여러행을 삽입하는 것도 가능합니다 insert inot 문장 그러나 여러값을 포함합니다 
inset into 테이블명(칼렁명1, 칼럼명2, 칼럼명3, ...)
values(칼럼값1, 칼럼값2, 칼럼값3, ...);
*/
insert into Customers(CustomerName, ContactName, Address, City, PostalCode, Country)
Values('Creasy Burder', 'Per Olsen', 'Gatevein 15', 'Sandnes', '4306', 'Norway'),
('Chris Then', 'Final', 'Streetload 19B', 'London', 'L1 0A2', 'UK');

INSERT INTO Customers(City, Country, Address) VALUES('Kopenhagan', 'Denmark', 'NorthEU'); 
/* Null값 값이 없는 필드입니다 테이블의 필드가 선택사항인 경우, 이 필드에 값을 추가하지 않고도 새레코드를 삽입하거나 레코드를 업데이터 할수 있다 
0값이나 공백이 포함된 필드는 다릅니다 Null값을 가진 필드는 레코드 생성중 비어 있는 필드입니다 
Null값을 테스트 하는 방법
= < <> 같은 비교연산자를 사용하여 Null값을 테스트 하는 것을 불가능 합니다 
Is Null 그리고 Is Not Null 대신 연산자
Is Null 구문
select colname from tablename where colnames Is Null
Null구문이 아닙니다
select colname from tablename where colnames Is Not Null
*/
/* is null연산자 
빈값을 테스트하는데 사용됩니다 
주소 필드에서 null값을 가진 모든 고객을 나열합니다 
 */
select CustmerName, ContactName, Address from Customers Where Address Is Null;

/* 주소 필드에서 비어있지 않는 값을 테스트하는데 사용됩니다 */
select CustomerName, ContactName, Address from Customers Where Address Is Not Null;

SELECT CustomerName, Address FROM Customers WHERE Address IS NOT NULL;
/* update 표의 기존기록을 수정하는데 사용됩니다 
update table set col1= value1, col2 = value2, ...
where condtion;
테이블에서 레코드를 업데이트 할때 where의 절 update 진술 where 절은 업데이터해야할 레코드를 지정합니다 
where조항 테이블에 있는 모든 레코드가 업데이트 됩니다 
*/ 
/* 업데이트 테이블  
첫번째 고객(고객)을 업데이트 합니다 신분증 = 1) 새로운 연락처와  새로운 도시
update 테이블 set 칼럼명 = 값 where 조건;
*/
Update Customers Set ContactName = 'Alfred Schmidt', City = 'Frankfrut' Where CustomerID = 1;

/* 여러 레코드 업데이트 where 업데이트할 레코드 수 결정하는 조항 
멕시코인 모든 레코드에 대해 ContactName을 Juan으로 업데이터 합니다
*/
Update Customers
Set ContactName = 'Juan' 
Where Country = 'Mexico';

UPDATE Customers SET City = 'Mardrid', ContactName = 'Air Spain' WHERE CustomeerID = 10;
/* 업데이트 경고 
레코드를 업데이트 할때 where조항 모든 기록 업데이트 
Update table Set col = val; where절 생략 
*/
Update Customers 
Set ContactName = 'Juan';

UPDATE Customers SET Country = 'Mexico' WHERE City = 'MaxicoCity';
/* delete문은 테이블의 기존 레코드를 삭제하는데 사용됩니다 
delete from table where condtion;
표에서 레코드 삭제할때 주의하세요 where절 delete 진술 그 where절은 삭제해야할 레코드를 지정합니다 
생략하면 where절 조항, 테이블에 있는 모든 레코드가 삭제됩니다 
 */
/* 고객 테이블에서 고객 Alfreds Futterkiste를 삭제합니다 */
delete from Customers Where CustomerName = 'Alfreds Futterkiste';
DELETE FROM Customers WHERE PostNumber = '4457';

/* 
모든 레코드 삭제
delete from table
delete from Customers; 고객 테이블의 모든 행을 삭제합니다 
drop table Customers; 테이블을 완전히 삭제 
DROP TABLE Customers;
*/

/* sql select top절 
반환할  레코드수를 지정하는데 사용됩니다 
수천개의 레코드가 있는 큰 테이블에서 유용합니다 많은 레코드를 반환하면 성능에 영향을 미칠수 있습니다 
*/

/* 고객 테이블의 처음 3개 레코드만 선택하시오. 
select top조항 limit오라클 제한된수의 레코드를 선택하는 조항 fetch first n rows only 그리고 rownum
*/
/*select TOP 3 * from Customers; */
/*
sql server / ms 엑세스 구문
select top number|percent col_name(s)
from table 
where condition;

mysql구문
select column_name(s)
from table
where condtion
limit number;
*/

/* 제한 
고객 테이블에 처음 3개 레코드를 선택합니다 
*/
select * from Customers limit 3;

SELECT * FROM Customers LIMIT 5;
/* 먼저 가져오기 */
/*select * from Customers Fetch First 3 Rows Only; */

/* 상위 백분율 예제 처음 50%의 레코드를 선택합니다 */
/*select top 50 percent * from Customers; */

/* oracle */
/* select * from Customers Fetch First 50 Percent Rows Only; */

/*where 절 추가 Sql Server/MsAccess 경우*/
/*select top 3 * from Customers Where Country = "Germany";*/

/* Mysql */
select * from Customers Where Country = "Germany" Limit 3;

/* 키워드별 주문 추가 */
/*select top 3 * from Customers Order by CustmerName Desc;*/

/* mysql */
select * from Custmers Order by CustomerName Desc Limit 3;

/* 집계함수 
집합함수는 종종 다음과 함께 사용 -> group by절 select진술 group by 절 결과 집합을 값 그룹으로 나누고 집합함수를 사용하여 각 그룹에 대해 
단일값을 반환할수 있다 sql집계함수
min() max() count() sum() avg()
*/

/* min() 열이 가장 작은값 
max() 열이 가장 큰값 
select min(col) from table where condtion;
select max(col) from table where condtion;
*/
select min(Price) from products;
select max(Price) from products;

/* 열이름 설정(알리어)
열에 설명적인 이름을 붙이려면 다음을 사용 as 키워드 
 */
select min(Price) As SmallestPrice
from products;

/* 그룹 By와 함께 min()사용 
min()함수와 group by 제품 표의 각 카테고리에 대한 최소 가격을 반환하는 조항
*/
select min(Price) As SmallestPrice, CategoryID 
from products
Group by CategoryID;

SELECT MAX(Price) AS LargestPrice, CategoryIDs
FROM products GROUP BY CategoryID;
/* count()함수는 지정된 기준과 일치하는 행의 수를 반환합니다 */
/* 총 행수 찾기 products 테이블 
select count(col_name) from table where condtion;
*/
select Count(*) from products;

/* 열지정 별표 기호 대신 열이름을 지정할수 있다 (*) 대신 열이름을 지정하는 경우 (*) Null값은 계산되지 않는다 */
/* 제품수 찾기 ProductName null아닙니다 */
select count(ProductName) from products;

/* where절 추가 */
select Count(ProductID) from products Where Price > 20;

/*중복 무시 */
select Count(Distinct Price) From products;

/*별칭사용 */
/*select Count(*) As [Number of records]
From products; */

/* Count를 그룹By와 함께 사용 */
/*select Count(*) As [Number of records], CategoryID 
from products 
group by CategoryID; */

/* sum() 기능 
select sum(colname)
from table
where condtion;
*/
select sum(quantity) from OrderDetails;

/* where절 경우 */
select sum(quantity) from OrderDetails where ProductID = 11;

/* As 사용 */
select sum(quantity) As total from OrderDetails;

SELECT SUM(quantitu * 20) AS SUM FROM OrderDetails WHERE ProductID = 10;

/* Grup by와 함께 sum()사용 */
/*select OrderID, Sum(quantity) As [Total Quantity] from OrderDetails Group by OrderID; */

/* Sum() 표현식 포함 
각 제품이 OrderDetails 열은 10달러 입니다 각 수량에 10을 곱하면 총 수익을 달러로 구할수 있다
*/
select sum(Quantity * 10) From OrderDetails;

/* 합류하다 OrderDetails 와 함께 Products, 그리고 사용 sum() 총금액 찾기 */
select sum(Price * Quantity) from OrderDetails left join Products On OrderDetails.ProductID = Products.ProductID;

SELECT SUM(Price * Quantity) FROM OrderDetails LEFT JOIN Producs ON OrderDetails.ProductID = Products.ProductID;

/* sql like 연산자 
like연산자 - where절 지정된 패턴 검색하는 절
% 0,하나또는 여러문자 나타냅니다 
_하나 단일 문자 나타냅니다 
 */
/* 문자 a로 시작하는 모든 고객을 선택합니다 
select col1, col2 from table where colnumN like pattern;
*/
select * from Customers Where CustmerName Like 'a%'; 
 
/* 와일드 카드 _ 단일문자 
문자나 숫자는 무엇이든 될수 있지만, 각각 _는 하나 단 하나의 문자를 나타냅니다 
L로 시작하는 와일드 카드 문자 하나, 'nd', 그리고 와일드 카드 문자 두개로 시작하는 도시에서 모든 고객을 돌려보네세요 
 */ 
select * from Customers Where City Like 'L_nd__';

/* L자가 있는 도시 모든 고객을 돌려보내세요. */
select * from Custmers Where City Like '%L%'; 

/* 특정문자나 구로 시작하는 레코드로 반환 다음 추가 % 편지나 구절끝에 */
select * from Custmers Where CustomerName Like 'La%';

SELECT * FROM Customers WHERE City LIKE 'P_r_s' AND City LIKE '%f%' OR Country LIKE 'f%e' AND Country LIKE '%k';
 
/* a로시작하거나 b로 시작하는 모든 고객에게 반품하세요 
주의 논리 연산자 적을때 칼럼명 기재 
*/
select * from Customers Where CustomerName Like 'a%' OR CustomerNmae Like 'b%';

/* a로 끝나는 모든 고객에게 반품하세요 */
select * from Customers Where CustomerName Like '%a';

/* a로 시작하여 s로 끝나는 모든 고객을 반환합니다 */
select * from Customers Where CustomerName Like 'a%s'

/*포함하다 특정문자나 구문이 포함된 레코드를 반환하려면 (전후 %string%) 
% 편지나 구절 전후 모두 또는이라는 문구가 포함된 모든 고객에게 반품하기 */
select * from Customers Where CustomerName Like '%or%';

/* 와일드 카드 포함 %그리고 _ 다른 와일드 카드 함께 사용할수 있다 */
/* a로 시작하여 길이가 3자 이상인 모든 고객에게 반품합니다 */
select * from Customers Where CustomerName Like 'a___%';

/* 두번째 위치에 있는 r이 있는 모든 고객을 반홥합니다 */
select * from Custmers Where CustomerName Like '_r%';

SELECT * FROM Customers WHERE CustomerName LIKE 'b__s%';
/* 와일드 카드 없음 와일드 카드가 지정되지 않는 경우 결과를 반환하려면 구문이 정확히 일치해야합니다 
스페인에서 모든 고객을 반품합니다 
*/
select * from Custmers Where Country Like 'Spain';

/* 와일드 카드 문자 
와일드 카드 문자는 문자열에서 하나 이상의 문자를 대체하는데 사용됩니다
like교환 like연산자 -> where열에서 지정된 패턴을 검색하는 절
a로 시작하는 모든 고객에게 반품합니다 
*/
select * from Customers Where CustomerName Like 'a%';

/* %와일드카드사용하기 
아무 숫자의 문자라도 나타내며 심지어는 0자도 포함됩니다 
패턴 es로 끝나는 모든 고객에게 반품하세요
 */
select * from Customers Where CustomerName Like '%es';
/* mer를 포함한 모든 고객에게 밤품하세요 */
select * from Customers Where CustomerName Like '%mer%';

/* 와일드 카드 사용 _ 와일트 카드는 단일문자를 나타냅니다 
문자나 숫자는 무엇이든 될수 있지만, 각각 _는 하나, 단 하나의 문자를 나타냅니다
모든 고객에게 다음과 같은 혜택을 제공합니다 City 어떤 문자로 시작해서 온돈으로 이어집니다
 */
select * from Customers Where City Like '_ondon';
/* 모든 고객에게 다음곽 같은 혜택을 제공하빈다 City "L"로 시작하여 새 글자로 시작하여 "on"으로 끝납니다 */
select * from Customers Where City Like 'L___on';

/* 와일드 카드 사용하기 
[] 와일드 카드 내부에 있는 캐릭터중 하나라도 일치하는 결과를 반환합니다 b s p 
'b' 's' 또는 'p'로 시작하는 모든 고객에게 반품합니다 
[bsp]%
 */
select * from Customers Where CustomerName Like '[bsp]%';
/* customers테이블에서 데이터에 칼럼에 b또는 s또는 p로 시작하는 칼럼명을 가져와라 */

SELECT * FROM Customers WHERE Address LIKE '[sdo]%';
/* 와일드카드사용하기 -와일드 카드 사용하면 내부에 다양한 문자를 지정할수 있습니다 
[]와일드 카드
'a' 'b' 'c' 'd' 'e' 또는 'f'로 시작하는 모든 고객에게 반품합니다
a~f -> [a-f] 
 */ 
select * from Customers Where CustomerName Like '[a-f]%'; 

SELECT * FROM Customers WHERE CustomerName LIKE '[a-z]%';
 
/* 와일드카드 결합 모든 와일드 카드 예) % 그리고 _, 다른와일드 카드와 함께 사용 */ 
/* a로시작하여 갈아가 3자이상인 모든 고객을 반품합니다. */
select * from Customers Where CustomerName Like 'a___%';

/* 두번째 위치에 r이 있는 모든 고객을 반환합니다 */
select * from Customers Where CustomerName Like '_r%';

/* 와일드 카드 없음 
스페인에서 모든 고객을 반품합니다 
 */
select * from Custmers Where Country Like 'Spain';

/* IN연산자를 사용하면 다음과 같은 여러값을 지정할수 있다 Where조항 
IN 연산자는 여러개의 약자 입니다 OR조건들
 */
 /* 독일 프랑스 또는 영국에서 모든 고객을 반품합니다 */
select * from Customers Where Country In("Germany", "France", "UK");

SELECT * FROM Customers WHERE Country IN("Germany", "Spain");
/* 구문
select col_name(s) from table Where col_name In (val1, val2, val3, ...);
 */
 
/* 포함되지 않음 Not In */
/* 독일 프랑스 영국 출신이 아닌 모든고객을 반품하세요. */
select * from Customers Where Country Not In ('Germany', 'France', 'UK');

/* In(선택) In서브쿼리가 있는 where조항 
서브쿼리 사용하면 서브쿼리 결과에 있는 메인쿼리의 모든 레코드를 반환할수 있다 
 */
/* 주문 테이블에 주문이 있는 모든 고객에게 반품합니다 
select 선택 from 테이블 where 칼렁명 in (select문);
*/
select * from Customers Where CustomerID In (select CustomerID from Orders);

/* 포함되지 않는 선택 74개의 레코드를 반환했으며, 이는 주문하지 않는 고객이 17명이라는 것을 의미합니다 */
/* 주문테이블에 주문하지 않는 모든 고객에게 반품합니다 */
select * from Customers Where CustomerID Not In (select CustomerID from Orders);

SELECT * FROM Customers WHERE CustomerID NOT IN (SELECT CustomerID FROM Orders);
/* between 연산자는 주어진 범위내의 값을 선택합니다. 값은 숫자 텍스트 또는 날짜일수 있다 
between 연산자는 포괄적입니다 : 시작값과 끝값이 포함됩니다 
구문
select col_name(s) from table where col_name between val1 and val2;
가격이 10에서 20사이인 모든 제품을 선택합니다 
*/ 
select * from Customers Where Price Between 10 and 20;

/* 사이가 아님 범위를 벗어난 제품을 표시하려면 다음을 사용한다 not between */
select * from Customers Where Price Not Between 10 and 20;

SELECT * FROM Customers WHERE Price NOT BETWEEN 30 AND 40;
/* in과 사이 sql문은 가격이 10과 20사이인 모든 제품을 선택합니다 또한 카테고리ID는 1,2또는 3이어야합니다 
카테고리 ID는 int형이다 
*/
select * from Products Where Price between 10 and 20 and CustomerID In (1,2,3);

/* 텍스트 값 사이 
Carnavon Tiger와 Mozarella di Giovanni 사이에서 ProductName이 알파벳순으로 있는 모든 제품을 선택합니다 
 */
select * from Products Where ProductName Between 'Carnavon Tigers' And 'Mozarella di Giovanni' Order by ProductName;

/* Carnarbon Tigers와 세프안톤이 케이준 시즈닝 중 ProductName이포함된 모든 제춤을 선택합니다 */
select * from Products Where ProductName Between 'Carnarvon Tigers' And "Chef Anton's Cajun Srasoing" order by productName;

/*텍스트 값 사이에 없음 */
select * from Products Where ProductName Not Between 'Carnaron Tigers' And 'Mozzarella di Giovanni'
order by ProductName;

/* 날짜 사이 
01-7월-1996에서 31-7월-1996 사이의 OrderDate를 가진 모든 주문을 선택합니다 
#07/01/1996# #07/31/1996#
#월/일/년도#
*/
select * from Orders Where OrderDate Between #07/01/1996# And #07/31/1996#;
/* 다른 방법 */
select * from Orders Where OrderDate Between '1996-07-01' And '1996-07-31';

SELECT * FROM Orders WHERE OrderDate BETWEEN '2020-01-01' AND '2025-01-01';

/* 별칭 
테이블의 열에서 임시 이름읇 부여하는데 사용됩니다 
As키워드 
구문
select col_name as alisa_name
from table 
*/
select CustomerID As ID from Customers;

/* As 선택사항 */
select CustomerID ID from Customers;

SELECT CustomerID CusID , ContactName Cname FROM Customers;
/* 열에 대한 별칭 
고객을 위한 두가지 별칭을 생성합니다ID 열과 CustomerName 열에대한 열
*/
select CustomerID As ID, CustomerName As Customer from customers;

/* 공백문자와 함께 별칭사용 
하나이상의 공백을 포함하려면 My Great Products 가명을 대괄호나 큰따옴표로 둘러 싸세요.
공백문자가 있는 별칭에 [대괄호]사용하기 
*/
select ProductName As [My Great Products] from Products;

/* 공백문자가 있는 별칭에 두개의 따옴표를 사용합니다 */
select ProductName As "My Great Products" from Products;

/* 열연결 
열(주소, 우편번호, 도시 및 국가)를 결합한 주소라는 별칭을 생성합니다
*/
select CustomerName, Addresss + ',' + PostalCode + ' ' + City + ', ' + Country As Address from Customers;
select CustomerName, Concat(Address, ', ', PostalCode, ', ', City, ', ', Country) As Address from Customers;

SELECT CustomerName, Concat(Address, ',', PostalCode, ',', City, ',', Country) As Concat FROM customers;

/* 고객 테이블을 개인으로 참조하세요 */
select * from Customers  As Persons;
/* 고객의 모든주문을 고객과 함께 선택합니다ID=4 (뿔주위), 우리는 '고객'과 '주문'테이블을 사용하여 각각 'c'와 'o'의 테이블 별칭을 제공합니다 
 */
select o.OrderId, o.OrderDate, c.CustomerName from Customers As c, Orders As o Where c.CustomerName = 'Around the Horn' And c.CustomerID = o.customerID;
select Orders.OrderId, Orders.OrderDate, Custoemrs.CustomerName from Customers, Orders Where Customers.CustomerID = Orders.CustomerID;

SELECT Ord.OrderId, Ord.OrderDate, Cus.CustomerName FROM Customers As Cus, Orders AS Ord WHERE Cus.CustomerName = 'Around the Horn' AND Cus.CustomerID = Ord.CustomerID;
 
/* JOIN절은 두개이상의 테이블 사이의 관련열을 기준으로 행을 결합하는데 사용됩니다 
고객을 주목하세요 
고객을 주목하세요 주문표의 ID열은 고객을 나타냅니다 고객 표의 ID 위의 두테이블 관계는 고객입니다 ID열 
inner join, 두테이블에서 모두에서 일치하는 값을 가진 레코드를 선택합니다 
 */
select Orders.OrderID, Customers.CustomerName from Orders Inner Join Customers On Orders.CustomerID=Customers.CustomerID;  
/*
다양한 유형의 join
innter join - 두테이블 모두에서 일치하는 값을 가진 레코드로 반환합니다 
left (outer) join - 왼쪽 테이블 모든 레코드와 오른쪽 테이블이 일치하는 레코들르 반환합니다
right (outer) join - 오른쪽 테이블 모든 레코드와 왼쪽 테이블이 일치하는 레코들로 반환합니다 
Full join - 왼쪽 또는 오른쪽 테이블에 일치하는 레코드가 있을때 모든 레코드를 반환합니다 
*/
SELECT Orders.OrderID, Customers.CustomerName FROM Orders INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID; 
/* 내부조인 
inner join 키워드 두테이블 모두에서 일치하는 값을 가진 레코드 선택합니다 
우리는 다음을 사용하여 제품표와 카테고리 표를 결합할것입니다 CategoryID 두테이블 필드 
inner join 키워드는 두 테이블 모두에서 일치하는 행만 반환합니다 즉 카테고리가 없는 제품이 있는 경우 ID또는 카테고리
포함카데고리 표에 없는 ID결과에서 해당기록에 반환되지 않습니다.
구문
select col_name(s)
from table1
inner join table2
on table1.col_name = table2.col_name;
*/
select ProductID, ProductName, CategoryName from products Inner join Categories On Products.CategoryID = Categories.CategoryID;
/* 열이름 짓기 
테이블 이름 지정
*/
select Products.ProductID, Products.ProductName, Category.CategoryName from Products Inner join Category On Products.CategoryID = Category.CategoryID;

/* 조인또는 내부조인 
join그리고 inner join 동일한 결과를 반환합니다 
inner 기본 조인 유형 -> join파서는 실제로 글을씁니다 -> inner join
join -> inner join과 동일합니다 
*/
select P.productID, P.ProductName, C.CategoryName from Products as P inner join Categories as C On P.CategoryID = C.CategoryID;

SELECT P.productID , P.PorudctName, C.CatagoryName FROM products AS P INNER JOIN Catagoryies AS C ON P.CatregotyID = C.CategoryID;
/* 세개의 테이블에 참여하기 
고객 및 배송업체 정보가 포함된 모든 주문을 선택합니다 
select 선택된테이블.칼럼명 from 3개 테이블 inner join 각각 
*/
select Orders.OrderID, Customers.CustomerName, Shippers.ShipperName 
from ((Orders inner join Customers On Orders.CustomerID = Customers.CustomerID) 
Inner join Shippers On Orders.ShpperID = Shippers.ShipperID);

SELECT Orders.OrderID, Customers.CustomerID, Shippers.ShipperName FROM((Orders INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID)
INNER JOIN Shippers ON Orders.ShipperID = Shippers.ShipperID);
/* left조인 키워드 
왼쪽 테이블에서 모든 레코드듣 반환하고 오른쪽 테이블에서 일치하는 레코드 반환합니다 
일치하지 않는 경우 오른쪽에서 0개의 기록이 나옵니다 
select col_name(s) from table1 left join table2 on table1.col_name = table2.col_name;
left join키워드는 오른쪽 테이블(주문)에 일치하는 항목이 없더라도 왼쪽테이블(고객)의 모든 레코드를 반환합니다 
 */
select Customers.CustomerName, Orders.OrderID from Customers left join Orders On Customers.CustomerID = Orders.CustomerID Order by Customers.CustomerName;

SELECT Customers.CustomerName, Orders.OrderID FROM Customers LEFT JOIN Orders ON Cutomers.CustomerID = Orders.CustomerID Order By Customers.CustomerName; 
/* right join 키워드 
오른쪽 테이블에서 모든 레코드를 반환하고 윈쪽 테이블에서 일치하는 레코드를 반환합니다 
결과는 일치하지 않는 경우 왼쪽에서 0개의 기록이 됩니다 
구문
select col_name(s) from table1 right join table2 On table1.col_name = table2.col_name;
모든 직원과 그들이 주문했을수 있는 모든 주문을 반환합니다 
right join은 인쪽 테이블에 일치하는 항목이 없더라도 오른쪽 테이블의 모든 레코드를 반환합니다 
 */ 
select Orders.OrderID, Employees.LastName, Employees.FirstName from Orders right join Employees On Orders.EmployeeID = Employees.EmployeeID
order by Orders.OrderID;

SELECT Orders.OrderID, Employees.LastName, Employess.FirstName FROM Orders RIGHT JOIN Employees ON Orders.EmployeeID = Employees.EmployeeID;
/* 전체외부 조인 키워드 
full outer join 키워드는 왼쪽 또는 오른쪽 테이블 레코드에 일치하는 경우 모든 레코드를 반환합니다 
full outer join 그리고 full join과 동일합니다 
구문
select com_name(s) from tabel1 full outer join talbe2 on table1.col_name = table2.col_name
where condtion;
full outer join 키워드는 다른 테이블이 일치하는지 여부에 관계없이 두 테이블이 모든 일치하는 
레코드를 반환합니다 따라서 고객 주문에 일치하지 않는 행이 있거나 주문에 일치하지 않는 행이 있는 경우 해당 행도 나열됩니다
모든 고객과 모든 주문을 선택합니다 
*/
select Customers.CustomerName, Orders.OrderID from Customers full outer join Orders On Customers.CustomerID=Orders.CustomerID order by Customers.CustomerName;
SELECT Customers.CustomerName, Orders.OrderID FROM Customers FULL OUTER JOIN Orders ON Customers.CustomerID=Orders.CustomerID ORDER BY Customers.CustomerName;
 
/* 셀프조인 
일반조인이지만 테이블은 스스로 조인됩니다 
구문
select col_name(s)
from table T1, table T2 
where condtion;
T1과 T2 같은 테이블의 서로 다른 테이블 별칭입니다 
셀포 조인 예제
sql 같은 도시 출신 고객과 일치합니다
 */
 
select A.customerName As CustomerName1, B.CustomerName as CustomerName2, A.City from Customers A,  Customers B
Where A.customerID <> B.customerID And A.City = B.City Order by A.City;

/* union 연산자 
union연산자는 두개이상의 결과 집합을 결합하는데 사용됩니다 select 진술들 
모든 select 내부 진술 union 열수가 같아야합니다 
열에서 유사한 데이터 유형도 있어야합니다 
모든 열의 select 문장도 같은 순서여야 합니다 
구문
select col_name(s) from table1 union col_name(s) from table2;
 */
 /* 유니온 올 구문 union연산자는 기본적으로 고유한 값을 선택해야만합니다 중복값을 허용하려면 다음을 사용합니다 union all 
 select col_name(s) from table1 
 union all
 select col_name(s) from table2
 */
 /* 고객과 공급업체 표 모두에서 도시를 반환합니다 별도의 값만 */
select City from Customers union select City from Suppliers Order by City;

/* 중복값도 반환합니다 */
select City from Cutomers union all select City from Suppliers Order by City;

SELECT City FROM Customers UNION SELECT City FROM Suppliers ORDER BY City;
SELECT City FROM Customers UNION ALL SELECT City FROM Suppliers ORDER BY City;

/* 고객과 공급업체 표 모두에서 독일 도시(별도의 값만)을 반환합니다 
고객 테이블 Customers 
공급 업체 Suppliers
*/
select City, Country From Customers Where Country = "Germany" Union select City, Country From Suppliers Where Country = 'Germany' Order by City;

/* 고객과 공급언체 표 모두에서 독일 도시(줄복 값도 포함)을 반환합니다 */
select City, Country From Customers Where Country = "Germany" Union All select City, Country From Suppliers Where Country = "Germany" Order by City;
/* 또다른 Union예시 */
select 'Customer' As Type, ContactName, City, Country from Customers Union select 'Supplier', ContactName, City, Country from Suppliers;
select 'Customer' As Type, ContactName, Coty, Country from Customers Union All select 'Supplier', ContactName, City, Country from Suppliers;

/* 그릅 By문 
group by문 각 국가의 고객수 찾기와 같이 동일한 값을 가진 행을 요약행으로 그룹화한다
집합함수와 함께 사용됩니다 (Count() Max() Min() Sum() Avg()) 결과 집합을 하나 이상열로 그룹화합니다
구문
select col_name(s)
from table
where condtion
group by col_name(s)
order by col_name(s);
 */
/* 각 국가의 고객수를 나열합니다 */
select count(CustomerID), Country from Customers Group by Country;
/* 각 국가의 고객수를 높음에서 낮음으로 정렬한 목록입니다 */
select count(CustomerID), Country from Customers Group by Country Order by Count(CustomersID) Desc;

/* 조인 예제외 함께 그룹화 
각 배송업체가 보낸 주문수를 나열합니다 
 */
select Shippers.ShipperName, Count(Orders.OrderID) As NumberOfOrders from Orders left join Shippers On Orders.ShipperID = Shippers.ShipperID Group by ShiperName;
SELECT Shippers.ShipperName, Count(Orders.OrderID) As NumberOfOrders FROM Orders LEFT JOIN Shippers ON Orders.ShipperID = Shippers.ShipperID GROuP BY ShiperName;
/* Having절
where키워드 집계 함수와 함께 사용할수 없다
구문
select col_name(s)
from table
where condtion 
group by col_name(s)
having condtion
order by col_name(s); 
 */
/* 각 국가의 고객수를 나열합니다 고객수가 5명이상인 국가만 포함됩니다 */ 
select count(CustomerID), Country from Customers Group by Country Having Count(CustomerID) > 5;
/* 각 국가의 고객수를 높음에서 낮음으로 정렬한 목록입니다(고객수가 5명이상인 국가만 포함) */
select Count(CustomerID), Country from Customer Group by Country having (CustomerID) > 5 order by Count(CustomerID) Desc; 
/* 10개 이상의 주문을 등록한 직원을 나열합니다 */
select Employees.LastName, Count(Orders.OrderID) As NumberOfOrders from (Orders inner join Employees On Orders.EmployeeID = Employees.EmpolyeeID)
group by LastName Having Count(Orders.OrderID > 10;
/* Davolio 또는 Fuller가 25개 이상의 주문을 등록했는지 여부를 나열합니다 */
select Employees.LastName, Count(Orders.OrderID) As NumberOfOrders from Orders inner join Employees 
On Orders.EmployeeID = Employees.EmployeeID 
where LastName = 'Davolio' Or LastName = 'Fuller' 
Group by LastName 
Having Count(Orders.OrderID) > 25;

SELECT Employees.LastName, Count(Orders.OrderID) AS OrdersNumbers 
FROM Orders INNER JOIN Employees 
ON Orders.EmployeeID = Employees.EmployeeID
WHERE LastName = 'Diavlovo' OR LastName = 'Andantae' GROUP BY LastName HAVING Count(Orders.OrderID) > 30;  
/* Exists연산자 
Exists 연산자는 하위쿼리에서 레코드의 존재여부를 테스트 하는데 사용됩니다 
Exists 운영자는 하위쿼리가 하나 이상의 레코드를 반환하면 True가 반환합니다 
구문
select col_name(s) 
from table
where exists
(select col_name from table where condtion)
 */ 

/* 존재 예시
true를 반환하고 제품가격이 20미만인 공급업체를 나열합니다 
 */ 
 select SupplierName from Suppliers Where Exists (select ProductName From Products Where Products.SupplierID=Suppliers.supplierID And Price < 20);
 
/* ture반환하고 제춤가격이 22인 공급업체르 나열합니다 */
select SupplierName from Suppliers Where Exists (select ProductName From Products Where Products.SupplierID=Supplier.supplierID And Price = 22);

SELECT SupplierName FROM Suppliers WHERE EXISTS (SELECT ProductName FROM Products WHERE Products.SupplierID=Suppliers.supplierID AND Price = 30);
/* any all 연산자 
any 운영자 -> 결과적으로 부울값을 반환합니다 
하위 쿼리값중 하나라도 조건을 충족하면 true가 반환합니다 
any범위내의 값중 하나에 대해 연산이 참일경우 조건이 참이 된것을 의미함
select col_name(s)
from table
where col_name operator any (select col_name from table where condtion);
연산자는 표준 비교 연산자 (=, <>, !=, >, >, >=, <<, <=
all 운영자
결과적으로 부울값을 반환합니다
모든 하위 쿼리 값이 조건을 충적하면 true반환합니다 
select where그리고 having 진술들
all 해당조건은 범위내의 모든 값에 대해 연산이 참일때만 참이 된다는 것을 의미한다 
select All col_name(s) from table where condtion;
위치 또는 위치를 포함한 모든 구문
select col_name(s) from table where col_name operator All (select com_name from table where condtion);
 */
 
 /* any예제 
 OrderDetatils 테이블에서 수량이 10개인 레코드를 발견하면 ProductName응 나열합니다 (수량 열에 10개의 값이 있으므로 true가 반환됩니다)
 */
 select ProductName From Products Where ProductID = Any (select ProductID From OrderDefatils Where Quantity = 10);
 
 /* OrderDetails테이블에서 수향이 99보다 큰 레코드를 발견한 경우 ProductName를 발견합니다(수량 열에 99보다 큰값이 있으므로 true값이 반환된다) */
 select ProductName From Products Where ProductID = Any (select ProductID From OrderDetails Where Quantity > 99);
 
 /* OrderDetails테이블에서 수량이 1000보다 큰 레코드를 발견한 경우 ProductName을 나열하빈다(수량 열에 1000보다 큰 값이 없으므로 이는 거짓으로 반환됩니다) */
 select ProductName From Products Where ProductID = Any (select ProductID From Orderdetails Where Quantity > 1000);
 
SELECT ProductName FROM Products WHERE ProductID = ANY (SELECT ProductID FROM OrderDetails WHeRE Quantity > 2000);
 /* 모든 예제 
 모든 제품이름이 나열되어 있다 
 */
 select All ProductName From Products Where TRUE;
 
SELECT ALL ProductName FROM Products WHERE FALSE;
 /* OrderDetails테이블의 모든 레코드에 수량이 10개인 경우 ProductName을 나열합니다 수량열에서 10의 값뿐만아니라 다양한 값이 있기 때문에 당연히 거짓으로 반환됩니다 */
 select ProductName From Products Where ProductID = All (select ProductID From OrderDetails Where Quantity=10);
 
/* into문 
하나의 테이블에서 새테이블로 데이터를 복사합니다 
모든열을 새 테이블로 복사합니다 
select * into newtable [in externaldb] from oldtable where condtion;
일부 열만 새테이블에 복사합니다 
select col1, col2, col3, ... into newtable [in externaldb] from oldtable where condtion;
 */
 
 /* 고객의 백업 사본을 생성합니다  */
 select * Into CustomerBackup2017
 from Customers;
 
SELECT * INTO CustomerID FROM Customers;
 
 /* in테이블을 다른 데이터베이스의 세 테이블로 복사하는 조항 */
select * into CustomerBackup2017 In 'Backup.mdb' From Customers;

/* 몇개의 열만 새테이블에 복사합니다 */
select CustomerName, ContactName Into CustomersBackup2017 From Customers;

/* 독일 고객만 세테이블에 복사합니다 */
select * Into CustomerGermay From Customers Where Country = "Germany";

SELECT * INTO FranceInformation FROM Customers WHERE Country = 'France' AND City IN ('Paris');
SELECT * INTO Norway IN 'Norway.mdb' From Customers;
 /* 여러테이블의 데이터를 새테이블로 복사합니다 */
 select Customers.CustomerName, Orders.OrderID Into CustomersOrdersBackup2025 from Customers left outer join Orders On Customers.CustomerID = Orders.CustomersID;
 
SELECT C.customerName, O.orderID INTO CustomerOrdertable2025 From Customers As C LEFT OUTER JOIN Orders As O On Customers.CustomerID = Orders.CustomerID;
 /* select into는 다른스키마 사용하여 새로운 빈테이블을 만드는데도 사용할수 있다 
 그냥 추가하기 where 퀴리가 데이터를 반환라지 않도록 하는 조항
 */
select * into new_table from Customers Where 1=0;

/* insert into select문은 한테이블에서 데이터를 복사하여 다른 테이블에 삽입합니다 
insert into select 문은 소스 테이블과타겟 테이블의 데이터 유형이 일치해야합니다 
대상테이블의 기존 기록은 영향 받지 않습니다
구문 삽입
insert into table2 select * from table1 where condition;
 한테이블에서 다른 테이블로 일부 열만 복사합니다
 insert into table2(col1, col2, col3, ...)
 select col1, col2, col3, ....
 from table1
 where condition;
 */ 
 
 /* 일부 예제에 sql삽입 
 공급업체를 고객을 복사합니다(데이터로 채워지지 않는 열에는 Null이 포함됩니다);
 */
insert into Customers(CustomerName, City, Country) select SupplierName, City, Country From Suppliers;

/* 공급업체를 고객에 복사합니다(모든열 채우기) */
insert into Customers(CustomerName, ContactName, Address, City, PostalCode, Country) select SupplierName, ContactName, Address, City , PostalCode, Country From Suppliers;
 
/* 독일 공급업체만 고객에 복사합니다 */
insert into Customers(CustomerName, City, Country) select SupplierName, City, Country From Suppliers Where Country="Germany"; 
 
INSERT INTO Customers(CustomerName, ConcatName, Address, City, PostalCode, Country) SELECT SupplierName, ContactName, Address, City, PostalCode, Country FROM Suppliers;
INSERT INTO Customers(CustomerName, City) SELECT SupplierName, City FROM Suppliers;
 /* Case표현식 
 Case식은 조건을 거치며 첫번째 조건이 충족되면 값을 반환합니다 (if-them~else 문) 조건이 사실이 되면 읽기를 멈추고 결과를 반환합니다 
 조건이 성립하지 않으면 다음값을 반환합니다 Else조항 
 없는 경우 else부품과 조건이 성립하지 않으면 null 반환합니다 
 case구문
 case 
    when condtion1 then result1
    when condtion2 then result2
    when condtion3 then result3
end;
 */
 /* 케이스 예시 
 sql조건을 거치며 첫번째 조건이 충족되면 값을 반환합니다 
 */
select OrderID, Quantity,
Case 
    When Quantity > 30 Then 'The quantity is greater than 30'
    When Quantity = 30 Then 'The quantity is 30'
    When Quantity < 30 Then 'The quantity is lower than 30'
    Else 'The quantity is under 30'
End As QuantityText
From OrderDetails;

SELECT CustomerID, 
CASE
    WHEN CustomerID > 40 THEN 'the customerID is grester than 40 calss A'
    WHEN CustomerID > 30 THEN 'the customerID is greater than 30 class B'
    WHEN CustomerID >= 10 AND CusotmerID < 30 THEN 'the customerID is between 10 and 30 class C'
    ELSE 'null class D'
 END As CustomerID
 FROM Cusotmers;
 
/* 도시별 고객을 주문합니다 그리고 도시가 null인 경우 국가별로 정렬합니다 */
 select CustomerName, City, Country From Customers Order by (Case When City Is Null Then Country Else City End);
 
SELECT CustomerName, City FROM Customers ORDER BY (CASE WHEN City IS NOT NULL THEN Country ELSE City END);
 
 /* Null함수 ifnul() isnul() coalesce() nvl() */
/* UnitsOnOrder 열이 선택사항이며 null값을 포함할수 있다고 가정합니다 
 */
select ProductName, UnitePrice * (UnitsInStock + UnitsOnOrder) from Products;
/* sql ifnull()함수를 사용하면 식이 null인경우 대체 값을 반환할수 있다 
 */
select ProductName, UnitPrice * (UnitsInStock + IFNull(UbitsOnOrder, 0)) from Products;
/* CoalEsce()함수 */
select ProductName, UnitPrice * (UnitsInStock + coalesce(UnitsOnOrder, 0)) from Products;

/* Ms 엑시스 IsNull()함수는 표현식이 null값이면 true(-1)을 반환하고 그렇지 않으면 false(0)을 반환합니다 */
select ProductName, UnitPrice * (UnitsInStock + IIF(IsNull(UbitsOnOrder), 0, UnitsOnOrder)) from Products;

/* 오라클 NVL()함수 */
select ProductName, UnitPrice * (UnitsInStock + NVL(UnitsOnOrder, 0)) from Products;

/* 저장절차 
저장 프로시저는 코드를 반복해서 재사용할수 있도록 준비된 sql코드입니다 
sql쿼리를 반복해서 작성하는 경우 저장 프로시저로 저장한 다음 호출하여 실행합니다 
저장된 절차에 매개변수를 전달할수 있으므로 전달된 매개변수값에 따라 저장된 절차가 작동할수 있다
구문
Create Procedure procedure_name As sql_statement GO;
저장된 절차 실행
Exec procedure_name; 
*/

/* 저장 프로시저 예제 
Customers 테이블에서 모든 레코드를 선택하는 SelectAllCustomers 라는 저장 프로시저를 생성합니다 
 */
Create Procedure SelectAllCustomers As Select * from Customers GO;
/* 위에 저장된 절차를 다음과 같이 실행 */
Exec SelectAllCustomers;

CREATE PROCEDURE SelectCustomer AS SELECT * FROM Customers GO;
EXEC SelectCustomer;

/* 하나의 매개변수가 있는 저장 프로시저 
고객 테이블에서 특정 도시의 고객을 선택하는 저장 프로시저를 생성합니다
*/
Create Procedure SelectAllCustomers @City nvarchar(30) As Select * from Customers Where City = @City GO;
Exec SelectAllCustomers @City = 'London';

/* 여러 매개변수가 있는 저장 프로시저 
여러 매개변수를 설정하는 것은 매우 쉽습니다 
각 매개변수와 데이터 유형을 쉼표로 구분하여 나열하기만 하면됩니다 
고객 테이블에서 특정 우편번로를 가진 특정 도시의 고객을 선택하는 저장 절차를 만듭니다 
*/
Create Procedure SelectAllCustomers @City nvarchar(30), @PostalCode nvarchar(10) As Select * from Customers Where City = @City And PostalCode = @PostalCode GO;
Exec SelectAllCustomers @City = 'London', @PostalCode = 'WA1 1DP';

CREATE PROCEDURE selectsql @City NAVARCHAR(30), @postalCode NAVACHAR(20) AS SELECT * FROM Cusotmers WHERE City = @City AND PostalCode = @PostalCode Go;
EXEC selectaql @City = 'London', @PostalCode = 'WA1 1DP';
/* 한줄 주석 
--
줄끝사이의 텍스트는 무시됩니다 
*/
-- select all;
select * from Customers;

/* 다중줄 주석 */
/* 
select * from Customers Where (CustomerName Like 'L%' Or CustomerName Like 'R%' Or CustomerName Like 'S%' OR CustomerName Like 'T%') And Country = 'USA'
Order by CustomerName;
*/

/* 연산자 
산술 연산자 + - * / % 
비트와이즈 연산자 & | ^ 
비교 연산자 =(equal to) > < >= <= <>(not equal to)
복합 연산자 += -= *= /= %= &= ^-= |*= 
논리 연산자 all and any between exists in like not or some
 */
 
 

 

 