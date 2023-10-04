use travel_agency;
DROP PROCEDURE IF EXISTS total_bonus;

DELIMITER $$

CREATE PROCEDURE total_bonus(branch_code int(11))
BEGIN
DECLARE total float(11,2);
DECLARE total_char varchar(20);
SELECT SUM(wrk_salary) INTO total FROM worker where wrk_br_code=branch_code;
CREATE TEMPORARY TABLE temp_table4( br_c int (11),Total_Payout VARCHAR(255) DEFAULT '');
INSERT INTO temp_table4 VALUES(branch_code,total);
CREATE TEMPORARY TABLE temp_table3 AS(SELECT br_code ,sum(tr_cost) as Total_Ammount FROM branch
LEFT JOIN trip ON br_code=tr_br_code
LEFT JOIN reservation ON tr_id=res_tr_id WHERE br_code=branch_code group by br_code order by br_code asc);

SELECT temp_table3.*, temp_table4.Total_Payout
FROM temp_table3
JOIN temp_table4
ON temp_table3.br_code = temp_table4.br_c;
DROP TABLE temp_table3;
DROP TABLE temp_table4;
END$$
DELIMITER ;
