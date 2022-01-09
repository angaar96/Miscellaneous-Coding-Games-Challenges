# Write your MySQL query statement below
SELECT C.Name As Customers
FROM Customers C
WHERE NOT EXISTS
(SELECT O.customerId FROM Orders O WHERE O.customerId = C.id)