use travel_agency;
DROP PROCEDURE IF EXISTS branch_info;
DELIMITER $$

CREATE PROCEDURE branch_info(branch_code int(11))
BEGIN
drop temporary table if exists temp_table1;
drop temporary table if exists temp_table2;

CREATE TEMPORARY TABLE temp_table1 AS(
SELECT br_code as Branch,br_street as Street ,br_num as St_Number ,br_city as City ,wrk_name as ADMIN_FNAME ,wrk_lname as ADMIN_LNAME FROM branch
INNER JOIN manages ON br_code=mng_br_code
INNER JOIN admin ON mng_adm_AT=adm_AT
INNER JOIN worker ON adm_AT=wrk_AT WHERE br_code=branch_code AND adm_type='ADMINISTRATIVE' group by br_code order by br_code asc);

CREATE TEMPORARY TABLE temp_table2 AS(SELECT br_code,count(tr_cost) as Reservations ,sum(tr_cost) as Total_Ammount FROM branch
LEFT JOIN trip ON br_code=tr_br_code
LEFT JOIN reservation ON tr_id=res_tr_id WHERE br_code=branch_code group by br_code order by br_code asc);

SELECT temp_table1.*, temp_table2.Reservations,temp_table2.Total_Ammount
FROM temp_table1
JOIN temp_table2
ON temp_table1.Branch = temp_table2.br_code;

DROP TABLE temp_table1;
DROP TABLE temp_table2;
END $$
DELIMITER ;
