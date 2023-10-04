use travel_agency;

-- DROP TRIGGER change_trip;
DELIMITER $$
CREATE TRIGGER change_trip BEFORE UPDATE ON trip
FOR EACH ROW
BEGIN
DECLARE res_id INT;
SET @res_id=NULL;
SELECT res_tr_id INTO @res_id FROM reservation WHERE res_tr_id=OLD.tr_id;
IF @res_id not like 'NULL' THEN 
	IF TIME(NEW.tr_departure)<>TIME(OLD.tr_departure) THEN
		SIGNAL SQLSTATE VALUE '45000'
		SET MESSAGE_TEXT = 'You can not change the departure time';
	ELSEIF TIME(NEW.tr_return)<>TIME(OLD.tr_return) THEN
		SIGNAL SQLSTATE VALUE '45000'
		SET MESSAGE_TEXT = 'You can not change the return time';
    ELSEIF NEW.tr_cost<>OLD.tr_cost THEN
		SIGNAL SQLSTATE VALUE '45000'
		SET MESSAGE_TEXT = 'You can not change the trip cost';
    END IF;
END IF;
END$$
DELIMITER ;