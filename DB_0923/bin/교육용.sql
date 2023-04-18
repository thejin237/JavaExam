--회원정보테이블
create table tbl_member_002(
    usemo number(6) not null PRIMARY key,
    name varchar(20),
    phone1 char(3),
    phone2 char(4),
    phone3 char(4),
    gender char(1),
    birthday char(6),
    regdate char(8)
);
drop table tbl_member_002;
insert into tbl_member_002(usemo, name, phone1, phone2, phone3, gender, birthday, regdate) values(100001, '김한국', '010','1111','1111','M','750201','20171201');
select * from tbl_member_002;

--도서대출테이블
create table tbl_booklent_002(
    lenno number(4) not null primary key,
    usemo number(6) not null,
    bookno number(3),
    outdate char(10),
    indate char(10)
);

--도서정보테이블
create table tbl_bookcode_002(
    bookno number(3) not null primary key,
    bookname varchar(40),
    amount char(2),
    regdate char(10)
);