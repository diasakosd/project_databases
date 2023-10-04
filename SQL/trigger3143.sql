use travel_agency;

-- DROP TRIGGER low_pay;
DELIMITER $$
CREATE TRIGGER low_pay BEFORE UPDATE ON worker
FOR EACH ROW
BEGIN
IF(NEW.wrk_salary<OLD.wrk_salary) THEN
	SIGNAL SQLSTATE VALUE '45000'
	SET MESSAGE_TEXT = 'You can not lower the salary of a worker';
END IF;
END$$
DELIMITER ;