# Write your MySQL query statement below
select name as Customers from Customers c
where NOT EXISTS(select * from Orders o where o.customerId=c.id)
