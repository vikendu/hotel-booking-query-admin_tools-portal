create database hotel_manage;
use hotel_manage;
create table cust_detail(cust_id char(20) Primary key, name char(20),id_proof char(20), city char(20), room_type char(20),chk_in char(20),chk_out char(20));
insert into cust_detail values('1001','Brushwood','Passport','Los Angeles','Regular','11-11-2015','13-11-2015');
insert into cust_detail values('1002','Barry','Passport','Dublin','Deluxe','12-11-2015','14-11-2015');
insert into cust_detail values('1003','Taylor','Visa','Los Angeles','Deluxe+','15-11-2015','17-11-2015');
insert into cust_detail values('1004','Rahul','Visa','Nevada','Deluxe','15-11-2015','17-11-2015');
select * from cust_detail;
