use travel_agency;

/*DROP TRIGGER insert_trip;
DROP TRIGGER delete_trip;
DROP TRIGGER update_trip;
DROP TRIGGER insert_reservation;
DROP TRIGGER delete_reservation;
DROP TRIGGER update_reservation;
DROP TRIGGER insert_event;
DROP TRIGGER delete_event;
DROP TRIGGER update_event;
DROP TRIGGER insert_travel_to;
DROP TRIGGER delete_travel_to;
DROP TRIGGER update_travel_to;
DROP TRIGGER insert_destination;
DROP TRIGGER delete_destination;
DROP TRIGGER update_destination;*/
DELIMITER $$
-- trip ----
CREATE TRIGGER insert_trip AFTER INSERT ON trip FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,NEW.tr_id,'Insert','trip','POULOPOULOS',NOW());
END$$

CREATE TRIGGER delete_trip AFTER DELETE ON trip FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,OLD.tr_id,'Delete','trip','POULOPOULOS',NOW());
END$$

CREATE TRIGGER update_trip AFTER UPDATE ON trip FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,NEW.tr_id,'Update','trip','POULOPOULOS',NOW());
END$$

-- reservation ----
CREATE TRIGGER insert_reservation AFTER INSERT ON reservation FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,CONCAT(NEW.res_tr_id,',',NEW.res_seatnum),'Insert','reservation','POULOPOULOS',NOW());
END$$

CREATE TRIGGER delete_reservation AFTER DELETE ON reservation FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,CONCAT(OLD.res_tr_id,',',OLD.res_seatnum),'Delete','reservation','POULOPOULOS',NOW());
END$$

CREATE TRIGGER update_reservation AFTER UPDATE ON reservation FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,CONCAT(NEW.res_tr_id,',',NEW.res_seatnum),'Update','reservation','POULOPOULOS',NOW());
END$$

-- event ----
CREATE TRIGGER insert_event AFTER INSERT ON event FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,CONCAT(NEW.ev_tr_id,',',NEW.ev_start),'Insert','event','POULOPOULOS',NOW());
END$$

CREATE TRIGGER delete_event AFTER DELETE ON event FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,CONCAT(OLD.ev_tr_id,',',OLD.ev_start),'Delete','event','POULOPOULOS',NOW());
END$$

CREATE TRIGGER update_event AFTER UPDATE ON event FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,CONCAT(NEW.ev_tr_id,',',NEW.ev_start),'Update','event','POULOPOULOS',NOW());
END$$

-- travel_to ----
CREATE TRIGGER insert_travel_to AFTER INSERT ON travel_to FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,CONCAT(NEW.to_tr_id,',',NEW.to_dst_id),'Insert','travel_to','POULOPOULOS',NOW());
END$$

CREATE TRIGGER delete_travel_to AFTER DELETE ON travel_to FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,CONCAT(OLD.to_tr_id,',',OLD.to_dst_id),'Delete','travel_to','POULOPOULOS',NOW());
END$$

CREATE TRIGGER update_travel_to AFTER UPDATE ON travel_to FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,CONCAT(NEW.to_tr_id,',',NEW.to_dst_id),'Update','travel_to','POULOPOULOS',NOW());
END$$

-- destination ----
CREATE TRIGGER insert_destination AFTER INSERT ON destination FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,NEW.dst_id,'Insert','destination','POULOPOULOS',NOW());
END$$

CREATE TRIGGER delete_destination AFTER DELETE ON destination FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,OLD.dst_id,'Delete','destination','POULOPOULOS',NOW());
END$$

CREATE TRIGGER update_destination AFTER UPDATE ON destination FOR EACH ROW
BEGIN
INSERT INTO log VALUES(null,NEW.dst_id,'Update','destination','POULOPOULOS',NOW());
END$$

DELIMITER ;








