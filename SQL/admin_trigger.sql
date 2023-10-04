use travel_agency;
-- DROP TRIGGER admin_trigger;
DELIMITER $$
CREATE TRIGGER admin_trigger BEFORE DELETE ON worker
FOR EACH ROW
BEGIN
DECLARE type ENUM('LOGISTICS','ADMINISTRATIVE','ACCOUNTING');
SELECT adm_type INTO type FROM worker
   LEFT JOIN admin ON admin.adm_AT = worker.wrk_AT
    WHERE worker.wrk_AT = OLD.wrk_AT;
    IF(type LIKE 'ADMINISTRATIVE') THEN
    SIGNAL SQLSTATE VALUE '45000'
		SET MESSAGE_TEXT = 'You can not delete an ADMINISTRATIVE';
        END IF;
        END $$
        DELIMITER ;