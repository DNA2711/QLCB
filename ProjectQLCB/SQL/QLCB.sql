create database QLCB;
use QLCB;
create table tbCanBo(
	SoTK int primary key,
	Hoten nvarchar(max),
	GT nvarchar(max),
	Diachi nvarchar(max),
	Luong float
);
select * from tbCanBo
alter table tbCanBo alter column Luong int 