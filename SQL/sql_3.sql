/*query 실행하기*/
select * 
from food_orders  

select * from payments 
/*select * from customers */ 

/*칼럼명 지정*/
select restaurant_name as "음식점", addr address FROM food_orders;
select order_id ord_no, price '가격', quantity '수량' from food_orders;
SELECT name `이름`, email `e-mail` FROM customers;

/* 조건절 where */
select * from customers where age = 21;
select * from customers where gender = 'male'

select * from food_orders where cuisine_type = 'Korean'
/* 문장을 한줄씩 요약하기 여러 sql문 실핼할때 각문장의 끝에 ;붙이기 */
select * 
from payments 
where pay_type='card'

/* 비교연산 */
select *
from customers 
where age >= 21 

/* 같지않다 <> */
select * 
from customers
where gender <> 'male'

/* 필터링 between 사이 in(포함) like 같지않지만 비슷한 조건으로 추가하기 */
select *
from customers
where age between 21 and 23

select *
from customers
where age in (21, 25, 27)

select *
from customers
where name in ('윤주아', '정현준')

select *
from customers
where name like '김%'

select * 
from customers
where email like '%p%'

select *
from customers
where name like '%우'

select *
from customers 
where age >= 40

select *
from food_orders
where price < 15000

select * 
from food_orders
where price between 20000 and 30000

select *
from food_orders 
where restaurant_name like 'B%'

/* 논리연산 */
select * 
from customers
where age >= 21  
and gender='male'

select *
from food_orders
where cuisine_type = 'Korean'
and price >= 30000

select *
from payments
where pay_type='card'
or vat <= 0.2 

/* 
 에러메세지
 테이블 명을 다르게 찍을때 -> 테이블 존재하지 않는 메세지
 컬럼명을 다르게 찍을때 -> 필드명이 잘못됬다는 메세지 
 필터링 조건 줄때 문자에 ''작은따옴표을 안할때 에러 메세지  
 */

/* 상품준비시간이 20~30분사이인, 한국음식점과 식당명과 고객번호 조회하기 
   조회해야할 칼럼 특정하기 
   사이 조건 between
   특정 조건 지정 = 
   복수의 조건 지정 and
 */
select * from food_orders

select restaurant_name, customer_id  
from food_orders where cuisine_type = 'Korean' and food_preparation_time between 20 and 30

/* 데이터 조회 엑셀함수 */
select *
from food_orders 

select food_preparation_time, delivery_time, food_preparation_time + delivery_time as total_time 
from food_orders 

select sum(food_preparation_time), avg(delivery_time), food_preparation_time + delivery_time as total_time 
from food_orders

select * from customers

select avg(age) as avg_of_age
from customers 

select count(1) count_of_orders,
       count(distinct customer_id) count_of_customers
from food_orders  

select count(1) as total_count
from payments

select count(distinct pay_type) as count_of_paytype
from payments 

select min(price) min_price, max(price) max_price 
from food_orders 

select min(quantity) as min_quantity,
max(quantity) as max_quantity 
from food_orders

select count(1) as cnt_orders
from food_orders 
where price >= 30000 

select avg(price) as average_price 
from food_orders 
where cuisine_type = 'Korean' 

select cuisine_type, sum(price) sum_of_price 
from food_orders 
group by cuisine_type 

/* select cuisine_type, sum(price) sum_of_price 
from food_orders */

select restaurant_name, max(price) max_price 
from food_orders 
group by restaurant_name 

select pay_type, max(date) rescent_date 
from payments 
group by pay_type 

select cuisine_type, sum(price) sum_of_price 
from food_orders 
group by cuisine_type 
order by sum(price) desc

select restaurant_name, max(price) max_price
from food_orders 
group by restaurant_name 
order by max(price) desc

select * 
FROM  customers 
order by gender, name

select cuisine_type, sum(delivery_time) as total_dlievery_time
from food_orders 
where day_of_the_week = 'Weekend'
group by cuisine_type 
order by sum(delivery_time) desc

select age, count(name) count_of_name 
from customers 
where age between 20 and 40
group by age 
order by age 

select cuisine_type, min(price) min_price, max(price) max_price
from food_orders
group by cuisine_type 
order by min(price) desc

/* replace(칼럼명, 값이름, 바뀐값이름) */
select restaurant_name "원래 상점명",
       replace(restaurant_name, 'Blue', 'Pink') "바뀐 상점명"
from food_orders 
where restaurant_name like '%Blue Ribbon%'

select addr from food_orders;
select addr, 
       replace(addr, "용인시", "용인특례시") "변경주소"
from food_orders;

select addr, 
     replace(addr, "문곡리", "문가리") "바뀐주소"
from food_orders 
where addr like '%문곡리%'

/* substr(조회및 칼럼, 시작위치, 글자수) */
select addr "원래 주소",
   substr(addr, 1, 2) "시도"
from food_orders 
where addr like '%서울특별시%'

select substr(addr, 7,9) "구"
from food_orders
where addr like "%서울특별시%"


/* concat(불이고싶은값1, 붙이고싶은값2, ...) */
select restaurant_name "원래이름",
   addr "원래주소",
   concat(restaurant_name, '-', cuisine_type) "음식 타입별 음식점",
   concat('[', substring(addr, 1,2), ']', restaurant_name)
from food_orders 
where addr like '%서울%'

select restaurant_name "음식점이름",
       addr "주소",
       concat('[{', substring(addr,1,2), '}]', restaurant_name)
from food_orders
where addr like "%용인%"

select substr(addr, 1, 2) "지역",
   cuisine_type,
   avg(price) "평균금액"
from food_orders
where addr like '서울%'
group by 1,2 /* group by substr(addr,1,2) cusine_type */

select substr(email, 10) "도메인",
      count(1) "고객수",
      avg(age) "평균연령"
from customers 
group by 1 

select concat('[', substr(addr, 1, 2) ,']', restaurant_name, " (", cuisine_type, ")") "음식점",
     count(1) "주문건수"
from food_orders 
group by 1 

select concat('[', substr(addr, 1, 2) ,']', restaurant_name, " (", cuisine_type, ")") "음식점",
     count(1) "주문건수"
from food_orders 
where addr like "%경기%"
group by 1 


/* if(조건식, 충족, 미충족) */
select restaurant_name,
       cuisine_type "원래 음식 타입",
       if(cuisine_type="Korean", "한식", "기타") "음식 타입"
from food_orders 

select addr "원래주소",
       if(addr like '%평택군%', replace(addr, "문곡리", "문가리"), addr) "바뀐주소"
from food_orders 
where addr like "%문곡리%"

select substring(if(email like "%gmail%", replace(email, 'gmail', '@gmail'), email), 10) "이메일 도메인",
     count(customer_id) "고객 수",
     avg(age) "평균 연령"
from customers 
group by 1

select * from food_orders

select case when price between 10000 and 19999 then "10000원대"
            when price between 20000 and 29999 then "20000원대"
            when price between 30000 and 39999 then "30000원대"
            when price between 40000 and 49999 then "40000원대"
            else "50000원대 이상" end "가격대별음식점",
            addr
from food_orders
where addr like "%서울%"

/* case when 조건1 then 값(수식)1 
        when 조건2 then 값(수식)2 
        else 값(수삭)3 
   end
 */
select case when cuisine_type='Korean' then '한식'
            when cuisine_type in ('Japanese', 'Chinese') then '아시아'
            else '기타'
            end "음식 타입",
        cuisine_type     
from food_orders

select order_id,
       price,
       quantity,
       case when quantity=1 then price
            when quantity>=2 then price/quantity end "음식 단가"
from food_orders 

select case when age between 10 and 19 and gender = 'male' then '10대 남성' 
            when age between 10 and 19 and gender = 'female' then '10대 여성'
            when age between 20 and 29 and gender = 'male' then '20대 낭성'
            when age between 20 and 29 and gender = 'female' then '20대 여성'
            end "고객 분류",
        name, 
        age, 
        gender    
from customers 
where age between 10 and 29 

select restaurant_name,
       order_id,
       delivery_time,
       price,
       addr,
       case when delivery_time > 25 then price*0.052*(if(addr like "%경기%", 1.1,1))
            when delivery_time > 30 then price*0.14*(if(addr like "%경기%", 1.1, 1))
            else 0 end "수수료"
from food_orders
where addr like "%경기%"

select restaurant_name,
       price/quantity "단가",
       cuisine_type, 
       order_id,
       case when (price/quantity < 5000) and cuisine_type = 'Korean' then '한식1'
            when (price/quantity between 5000 and 15000) and cuisine_type='Korean' then '한식2'
            when (price/quantity > 15000) and cuisine_type = 'Korean' then '한식3'
            when (price/quantity <5000) and cuisine_type in ('Japanese', 'Chinese', 'Thai', 'Vietnamese', 'Indian') then '아시아식1'
            when (price/quantity between 5000 and 15000) and cuisine_type in ('Japanese', 'Chinese', 'Thai', 'Vietnamese', 'Indian') then '아시아식2'
            when (price/quantity > 15000) and cuisine_type in ('Japanese', 'Chinese', 'Thai', 'Vietnamese', 'Indian') then '아시아식3'
            when (price/quantity <5000) and cuisine_type not in ('Korean', 'Japanese', 'Chinese', 'Thai', 'Vietnamese', 'Indian') then '기타1'
            when (price/quantity between 5000 and 15000) and cuisine_type not in ('Korean', 'Japanese', 'Chinese', 'Thai', 'Vietnamese', 'Indian') then '기타2'
            when (price/quantity > 15000) and cuisine_type not in ('Korean', 'Japanese', 'Chinese', 'Thai', 'Vietnamese', 'Indian') then '기타3' end "식당 그룹"
from food_orders           

select case when delivery_time>30 then price*0.1*if(addr like '%서울%', 1.1, 1)
            when delivery_time between 26 and 30 then price*0.05*if(addr like '%서울%', 1.1, 1)
            else 0 end "수수료",
            restaurant_name,
            order_id,
            price,
            delivery_time,
            addr
from food_orders 

select case when day_of_the_week = 'weekday' then 3000*if(quantity>3, 1.2, 1)
            when day_of_the_week = 'weekend' then 3500*if(quantity>3, 1.2, 1)
            else 0 end "배달할증료",
            restaurant_name,
            order_id,
            day_of_the_week,
            quantity
from food_orders 

select  order_id,
        restaurant_name,
        day_of_the_week,
        delivery_time, 
        case when day_of_the_week = 'Weekday' then if(delivery_time >= 25, 'Late', 'On-time')
             when day_of_the_week = 'Weekend' then if(delivery_time >= 30, 'Late', 'On-Time')
             else 0 end "지연여부"
from food_orders

/* 서브쿼리 */
select price/quantity 
from 
(
select price, quantity 
from food_orders 
) a

select order_id, restaurant_name, if(over_time>=0, over_time, 0) over_time
from (
select order_id, restaurant_name, food_preparation_time-25 over_time
from food_orders 
) a

select order_id, restaurant_name, if(over_time>=0, over_time, 0) over_time
from
(
select order_id, restaurant_name, delivery_time-20 over_time
from food_orders
) a

select restaurant_name, 
       price_per_plate*ratio_of_add "수수료"
from
(
select restaurant_name, 
       case when price_per_plate<5000 then 0.005
            when price_per_plate between 5000 and 19999 then 0.01
            when price_per_plate between 20000 and 29999 then 0.02
            else 0.03 end ratio_of_add,
       price_per_plate 
from 
(
  select restaurant_name, avg(price/quantity) price_per_plate
  from food_orders 
  group by 1
) a
) b


select restaurant_name, 
       sido,
       avg_delivery_time, 
       case when avg_delivery_time <= 20 then '<=20'
            when avg_delivery_time > 20 and avg_delivery_time<= 30 then '20<x<=30'
            else '>30' end delivery_time_segment 
from
(
select restaurant_name, 
       substr(addr, 1, 2) sido,
       avg(delivery_time) avg_delivery_time
from food_orders 
group by 1,2
) a

select cuisine_type,
       total_quantity,
       count_res,
       case when count_res>=5 and total_quantity>=30 then 0.005
            when count_res>=5 and total_quantity<30 then 0.008 
            when count_res<5 and total_quantity>=30 then 0.01 
            when count_res<5 and total_quantity<30 then 0.02 end rate 
from 
(
select cuisine_type,
      sum(quantity) total_quantity,
      count(distinct restaurant_name) count_res
from food_orders 
group by 1
) a

select restaurant_name, 
       sum_price,
       sum_quantity,
       case when sum_quantity <=5 then 0.1 
            when sum_quantity >15 and sum_price >=300000 then 0.005 
            else 0.01 end discount_rate
from
(
select restaurant_name,
       sum(price) sum_price,
       sum(quantity) sum_quantity
from food_orders 
group by 1
)a

/* 공통된 칼럼이 order_id가 있다 그 기준으로 조인을 합니다 */
select * 
from food_orders left join payments 
on food_orders.order_id = payments.order_id

/* 공통 */
select * 
from food_orders inner join payments 
on food_orders.order_id = payments.order_id

select f.order_id , 
      f.customer_id,
      f.restaurant_name,
      f.price,
      c.name,
      c.age,
      c.gender
from food_orders f left join customers c
on f.customer_id = c.customer_id 

select f.order_id,
       f.restaurant_name,
       f.price,
       p.pay_type,
       p.vat
from food_orders f left join payments p on f.order_id = p.order_id  
where cuisine_type = 'Korean' 

select distinct c.name, 
       c.age, 
       c.gender,
       f.restaurant_name
from food_orders f left JOIN customers c on f.customer_id = c.customer_id  
order by c.name 

/* inner join에 의해 다른테이블의 연산아 가능하다 */
SELECT f.order_id,
       f.price,
       p.vat,
       f.price * p.vat vat2
FROM food_orders f
INNER JOIN payments p ON f.order_id = p.order_id

select cuisine_type,
       sum(price) price,
       sum(price*discount_rate) discounted_price
(
SELECT f.cuisine_type, 
       f.price, 
       c.age, 
       (c.age-50)*0.005 discount_rate
FROM food_orders f LEFT JOIN customers c ON f.customer_id = c.customer_id
WHERE c.age >= 50
) As a
group by 1
order by sum(price*discount_rate) desc 


select distinct c.name,
       c.age,
       c.gender,
       f.restaurant_name
from food_orders f left join customers c on f.customer_id=c.customer_id
where c.name is null
order by c.name

SELECT 
    a.cuisine_type,
    SUM(a.price) AS price,
    SUM(a.price * a.discount_rate) AS discounted_price
FROM (
    SELECT 
        f.order_id, 
        f.price,
        f.cuisine_type, 
        c.age,
        (c.age - 50) * 0.005 AS discount_rate
    FROM food_orders f
    LEFT JOIN customers c ON f.customer_id = c.customer_id
    WHERE c.age >= 50
) AS a
GROUP BY a.cuisine_type
ORDER BY discounted_price DESC

select restaurant_name, 
       case when price_groups <= 5000 then 'price_group1'
            when price_groups between 5000 and 10000 then 'price_group2'
            when price_groups between 10000 and 30000 then 'price_group3'
            when price_groups > 30000 then 'price_group4'
            end "price_group",
       case when age_groups < 30 then 'age_group1'
            when age_groups between 30 and 39 then 'age_group2'
            when age_groups between 40 and 49 then 'age_group3'
            else 'age_group4' end "age_group"
from
(
select food.restaurant_name, avg(price) price_groups,  avg(age) age_groups
from food_orders food left join customers cus on food.customer_id = cus.customer_id  
group by 1
) a
order by restaurant_name

/* subquery 
 select col1, sepcial 
 from (
    select col1, col2 sepcial 
    from table1 
 ) a
 두테이블 결합 join
 */

select restaurant_name, 
       avg(rating) avg_rating,
       avg(if(rating<>'Not given', rating, null)) avg_rating2
from food_orders
group by restaurant_name 

select a.order_id,
       a.customer_id,
       a.restaurant_name,
       a.price,
       b.name,
       b.age,
       b.gender, 
       coalesce(b.age, 20) "null 제거"
from food_orders a left join customers b on a.customer_id = b.customer_id
where b.customer_id is not null

select name, 
       age,
       case when age < 15 then 15
            when age >= 80 then 80
            else age end re_age 
from customers

select name, 
       age,
       case when age < 15 then 15
            when age >= 80 then 80
            else age end "범위를 지정해주는 age" 
from customers

select restaurant_name, 
        max(if(hh='15', cnt_order, 0)) "15",
        max(if(hh='16', cnt_order, 0)) "16",
        max(if(hh='17', cnt_order, 0)) "17",
        max(if(hh='18', cnt_order, 0)) "18",
        max(if(hh='19', cnt_order, 0)) "19",
        max(if(hh='20', cnt_order, 0)) "20"
from
(
select f.restaurant_name,
       substr(p.time, 1, 2) hh,
       count(1) cnt_order       
from food_orders f inner join payments p on f.order_id = p.order_id
where substr(p.time, 1, 2) between 15 and 20 
group by 1,2
) a
group by 1
order by 7 desc 

select restaurant_name,
       max(if(hour='12', cnt_order, 0)) "12",
       max(if(hour='13', cnt_order, 0)) "13",
       max(if(hour='14', cnt_order, 0)) "14",
       max(if(hour='15', cnt_order, 0)) "15",
       max(if(hour='16', cnt_order, 0)) "16",
       max(if(hour='17', cnt_order, 0)) "17",
       max(if(hour='18', cnt_order, 0)) "18",
       max(if(hour='19', cnt_order, 0)) "19",
       max(if(hour='20', cnt_order, 0)) "20",
       max(if(hour='21', cnt_order, 0)) "21",
       max(if(hour='22', cnt_order, 0)) "22"
from
(
select f.restaurant_name,
       substr(p.time,1,2) hour,
       count(1) cnt_order
from food_orders f inner join payments p on f.order_id = p.order_id
where substr(p.time,1,2) between 12 and 22 
group by 1, 2
) a
group by 1
order by 12 desc

select age,
       max(if(gender='male', cnt_order, 0)) "male",
       max(if(gender='female', cnt_order, 0)) "female"
from
(
select gender,
       case when age between 10 and 19 then 10
            when age between 20 and 29 then 20
            when age between 30 and 39 then 30
            when age between 40 and 49 then 40
            when age between 50 and 59 then 50 end age,
       count(1) cnt_order 
from food_orders f inner join customers c on f.customer_id = c.customer_id
where age between 10 and 59 
group by 1,2
) a
group by 1
order by 1 desc 

/* 심화 */
SELECT cuisine_type,
       restaurant_name,
       cnt_order,
       ranking
from
(
select cuisine_type,
       restaurant_name,
       cnt_order,
       rank() over(partition by cuisine_type order by cnt_order desc) ranking
from
(
select cuisine_type,
       restaurant_name,
       count(1) cnt_order
from food_orders  
group by 1, 2
) a
) b
where ranking <= 3

select cuisine_type,
       restaurant_name,
       cnt_order,
       food_rank
from
(
select cuisine_type,
       restaurant_name,
       cnt_order,
       rank() over(partition by cuisine_type order by cnt_order desc) food_rank
from
(
select cuisine_type,
       restaurant_name,
       count(1) cnt_order
from food_orders 
group by 1, 2
) a
) b 
where food_rank limit 5

select cuisine_type,
       restaurant_name, 
       cnt_order,
       /* 누적합 */
       sum(cnt_order) over(partition by cuisine_type) sum_cuisine_type,
       sum(cnt_order) over(partition by cuisine_type order by cnt_order) cum_cuisine_type 
from
(
select cuisine_type,
       restaurant_name,
       count(1) cnt_order
from food_orders  
group by 1, 2
)a
order by cuisine_type, cnt_order 



/* 날짜 */
select date,
       date(date) change_date 
from payments 

select date(date) date_type,
       date_format(date(date), '%Y') "년",
       date_format(date(date), '%m') "월",
       date_format(date(date), '%d') "일",
       date_format(date(date), '%w') "요일"
from payments 

select date_format(date(date), "%Y") "년",
       date_format(date(date), "%m") "월",
       date_format(date(date), "%Y%m") "년월",
       count(1) "주문건수"
from food_orders f inner join payments p on f.order_id = p.order_id 
where date_format(date(date), "%m") = '03'
group by 1,2,3 
order by 1

select date_format(date(date), "%Y") "년",
       date_format(date(date), "%m") "월",
       date_format(date(date), "%Y%m") "년월"
from food_orders f inner join payments p on f.order_id = p.order_id 

select date_format(date(date), "%Y") "년",
       date_format(date(date), "%m") "월",
       date_format(date(date), "%Y%m") "년월",
       count(1) "주문건수"
from food_orders f inner join payments p on f.order_id = p.order_id 
group by 1,2

select date_format(date(date), "%Y") "년",
       date_format(date(date), "%m") "월",
       date_format(date(date), "%Y%m") "년월",
       count(1) "주문건수"
from food_orders f inner join payments p on f.order_id = p.order_id 
where date_format(date(date), "%m") = '06'
group by 1,2
order by 1

select cuisine_type, 
       max(if(age=10, order_count, 0)) "10대",
       max(if(age=20, order_count, 0)) "20대",
       max(if(age=30, order_count, 0)) "30대",
       max(if(age=40, order_count, 0)) "40대",
       max(if(age=50, order_count, 0)) "50대"
from
(
select f.cuisine_type, 
       case when age between 10 and 19 then 10
            when age between 20 and 29 then 20
            when age between 30 and 39 then 30
            when age between 40 and 49 then 40
            when age between 50 and 59 then 50
            end age,
        count(1) order_count    
from food_orders f inner join customers c on f.customer_id = c.customer_id
where age between 10 and 59 
group by 1 2
) a 
group by 1

/* sql 달이기반 */
select * from users

/* “김”씨로 시작하는 이용자들 수(user_id)를 세어 보기로 했습니다. */
select count(distinct user_id) name_cnt 
from users 
where name like "김%"

/* created_at: 익명화된 유저들의 아이디(varchar255)
average_points: 유저가 획득한 날짜별 평균 포인트(int), 반올림 필수
*/
select * from point_users

select 
       date(created_at) created_at,
       round(avg(point),3) avg_points
from point_users
group by created_at 


/* users 테이블에는 있지만 point_users에는 없는 
user는 포인트가 없으므로 0 으로 처리
포인트 기준으로 내림차순 정렬 */
select u.user_id, u.email,
       COALESCE(p.point, 0)
from users u left join point_users p 
on u.user_id = p.user_id  
order by point desc





