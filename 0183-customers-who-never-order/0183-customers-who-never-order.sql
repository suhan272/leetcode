# Write your MySQL query statement 
SELECT c.name as Customers from Customers as c left join Orders as o on c.id=o.customerId where o.customerId is NULL;
