/* 3.1.3.2 */

USE travel_agency;

DROP PROCEDURE IF EXISTS GetTripInfo;

delimiter //
CREATE PROCEDURE GetTripInfo(branch_code INT(11), date1 DATETIME, date2 DATETIME)
BEGIN
SELECT tr_id as trip,tr_cost, tr_maxseats AS maxseat, COUNT(res_tr_id) AS reservations, tr_maxseats - COUNT(res_tr_id) AS free_seats , guide_worker.wrk_name AS guide_name, guide_worker.wrk_lname AS guide_surname, driver_worker.wrk_name AS driver_name, driver_worker.wrk_lname AS driver_surname, tr_departure AS departure_date, tr_return AS return_date  
FROM trip
INNER JOIN driver ON trip.tr_drv_AT = driver.drv_AT
INNER JOIN guide ON trip.tr_gui_AT = guide.gui_AT
INNER JOIN worker as guide_worker ON guide_worker.wrk_AT=guide.gui_AT
INNER JOIN worker as driver_worker ON driver_worker.wrk_AT=driver.drv_AT
INNER JOIN reservation ON trip.tr_id =  reservation.res_tr_id
WHERE tr_departure BETWEEN date1 AND date2 AND tr_br_code = branch_code group by res_seatnum;
 END//
delimiter ;



