# Write your MySQL query statement below
SELECT  s.product_id,p.product_name from product p
left join Sales s
on s.product_id=p.product_id
-- where sale_date between '2019-01-01'  and '2019-03-31' 
group by p.product_id, p.product_name
having  MIN(s.sale_date) >= '2019-01-01'
   AND MAX(s.sale_date) <= '2019-03-31';