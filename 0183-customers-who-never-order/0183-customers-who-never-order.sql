# Write your MySQL query statement below
SELECT name as Customers 
FROM Customers 
WHERE Customers.id != ALL (SELECT c.id  
    FROM Customers c
    JOIN Orders o
    ON c.id = o.customerId )

