use travel_agency;
 -- drop table log; --
CREATE TABLE log(
N int(11) NOT NULL AUTO_INCREMENT,
what_row varchar(30) NOT NULL,
act ENUM('Insert','Delete','Update') NOT NULL,
What_table ENUM('trip','reservation','event','travel_to','destination') NOT NULL,
who_it varchar(20) NOT NULL,
clock datetime NOT NULL,
PRIMARY KEY(N)
);