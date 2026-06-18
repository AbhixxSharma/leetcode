# Write your MySQL query statement below
-- SELECT p.product_id,Round(SUM(p.price*u.units)/sum(u.units),0)as average_price
-- from  Prices p
-- left join UnitsSold u
-- on p.prodict_id=u.product_id
-- group by product_id

SELECT
    p.product_id,
    ROUND(
        IFNULL(SUM(p.price * u.units) / SUM(u.units), 0),
        2
    ) AS average_price
FROM Prices p
LEFT JOIN UnitsSold u
    ON p.product_id = u.product_id
   AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id;
