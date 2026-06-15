# Write your MySQL query statement below
select e.unique_id, ee.name from Employees ee
 left join EmployeeUNI e
 on e.id=ee.id
 