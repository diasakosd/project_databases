/* 3.1.3.3 */
 
USE travel_agency;

DROP PROCEDURE IF EXISTS delete_admin;

delimiter //
CREATE PROCEDURE delete_admin (first_name VARCHAR(20), last_name VARCHAR(20))
BEGIN
DECLARE admin_type ENUM('LOGISTICS','ADMINISTRATIVE','ACCOUNTING');
DECLARE admin_AT CHAR(10);
SELECT adm_type,adm_AT INTO admin_type,admin_AT FROM worker
    INNER JOIN admin ON admin.adm_AT = worker.wrk_AT
    WHERE worker.wrk_name = first_name AND worker.wrk_lname = last_name;
    
    IF admin_type = 'LOGISTICS' THEN
        DELETE FROM worker WHERE wrk_AT=admin_AT;
    ELSEIF admin_type = 'ACCOUNTING' THEN
        DELETE FROM worker WHERE wrk_AT=admin_AT;
    ELSE
    SELECT 'We cannot delete an administrator';
    END IF;
    
END//
delimiter ;



