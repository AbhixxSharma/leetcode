# Write your MySQL query statement below
Select score ,  DENSE_RANK() OVER(order by score DESC) as `rank`
from Scores