use travel_agency;

CREATE INDEX times ON reservation_offers (payment_in_advance) USING BTREE;

DROP PROCEDURE IF EXISTS amount;
DELIMITER $$

CREATE PROCEDURE amount(IN a INT,IN b INT)
BEGIN
SELECT customer_name, customer_lname FROM reservation_offers FORCE INDEX (times) WHERE payment_in_advance BETWEEN a AND b;
END $$
DELIMITER ;

