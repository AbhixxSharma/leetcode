# Write your MySQL query statement below
Select  u.name ,  Sum(t.amount) as balance from Users u
left join Transactions t
on u.account=t.account
GROUP BY u.account, u.name
HAVING SUM(t.amount) > 10000;

