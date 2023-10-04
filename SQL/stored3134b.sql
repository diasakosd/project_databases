use travel_agency;

CREATE INDEX times1 ON reservation_offers (customer_lname) USING BTREE;
DROP PROCEDURE IF EXISTS prosfora;
DELIMITER $$
CREATE PROCEDURE prosfora(IN lname VARCHAR(20))
BEGIN
DECLARE finishedFlag INT;
DECLARE clname varchar(20);
DECLARE id INT;
DECLARE cname varchar(20);
DECLARE plithos INT;
DECLARE plcursor CURSOR FOR 
SELECT off_id,customer_name,customer_lname,count(*) FROM reservation_offers WHERE customer_lname=lname GROUP BY customer_name,off_id;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET finishedFlag=1;
CREATE TEMPORARY TABLE temp_table(off INT,name varchar(20),last VARCHAR(20),number INT);
OPEN plcursor; 
SET finishedFlag=0;
FETCH plcursor INTO id,cname,clname,plithos;
WHILE (finishedFlag=0) DO
IF(plithos>1) THEN
INSERT INTO temp_table VALUES(id,cname,clname,plithos);
ELSEIF(plithos=1) THEN
SELECT off_id,customer_name,customer_lname FROM reservation_offers WHERE customer_lname=lname;
END IF;
FETCH plcursor INTO id,cname,clname,plithos;
END WHILE; 
SELECT * FROM temp_table;
DROP TABLE temp_table;
END $$
DELIMITER ;

