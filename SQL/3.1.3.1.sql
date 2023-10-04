/* 3.1.3.1 */

USE travel_agency;

DROP PROCEDURE IF EXISTS addDriver;

delimiter //
CREATE PROCEDURE addDriver(driver_AT CHAR(10), driver_name VARCHAR(20), driver_lname VARCHAR(20), driver_salary INT(11), driver_license enum('A','B','C','D'), driver_route ENUM('LOCAL','ABROAD'), driver_experience TINYINT(4))
BEGIN
 DECLARE brnchId INT;
  SELECT br_code INTO brnchId FROM branch
INNER JOIN worker on branch.br_code = worker.wrk_br_code
LEFT JOIN driver on driver.drv_AT = worker.wrk_At
GROUP BY br_code
ORDER BY COUNT(drv_AT) ASC LIMIT 1;

  INSERT INTO Worker VALUES (driver_AT , driver_name , driver_lname, driver_salary,brnchId); 
  INSERT INTO Driver VALUES (driver_AT,driver_license, driver_route , driver_experience); 
  
  END//
  delimiter ;
  

  





