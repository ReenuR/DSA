-- Write your PostgreSQL query statement below
select MAX(salary) As SecondHighestSalary
from Employee
where salary < (Select MAX(salary) From Employee)

