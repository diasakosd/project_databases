use travel_agency;
DROP PROCEDURE IF EXISTS employee_info;
DELIMITER $$

CREATE PROCEDURE employee_info(branch_code INT(11))
BEGIN

DECLARE total float(11,2);
DECLARE total_char varchar(20);
drop temporary table if exists temp_table;
SELECT SUM(wrk_salary) INTO total FROM worker where wrk_br_code=branch_code;
CREATE TEMPORARY TABLE temp_table AS (SELECT wrk_name ,wrk_lname, wrk_salary FROM worker WHERE wrk_br_code=branch_code);
ALTER TABLE temp_table ADD COLUMN Total_Payout VARCHAR(255) DEFAULT '';
SET total_char = CONVERT(total, CHAR(20));
UPDATE temp_table
SET Total_Payout = total_char
LIMIT 1;
select * from temp_table;
drop table temp_table;
END $$
DELIMITER ;


