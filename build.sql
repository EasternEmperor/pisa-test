create database pisa_test;
use pisa_test;
create table User (
    id bigint(20) not null auto_increment,
    userName varchar(100) not null,
    role int(2) not null default 0,
    primary key(id),
    unique key(userName)
);
insert into User(userName, role) values('xiaoming20000101', 1);

create table Question (
    id bigint(20) not null auto_increment,
    no int(10) not null default -1,
    html_id int(10) not null default 0,
    primary key(id)
);

create table UserManagement (
    id bigint(20) not null auto_increment,
    userName varchar(100) not null,
    ithAnswer int(2) not null default 0,
    testBegin timestamp not null default current_timestamp,
    testEnd timestamp not null default current_timestamp,
    primary key(id)
);
insert into UserManagement(userName, ithAnswer) values('xiaoming20000101', 1);

create table AirControllerData (
    id bigint(20) not null auto_increment,
    userName varchar(100) not null,
    ithAnswer int(2) not null default 0,
    event varchar(50) not null default "",
    eventType varchar(10) not null default "",
    eventStartTime timestamp not null default current_timestamp,
    primary key(id)
);
insert into AirControllerData(userName, ithAnswer) values('xiaoming20000101', 1);