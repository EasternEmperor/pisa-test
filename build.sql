create database pisa_test;
use pisa_test;
create table p_pt_user (
    id bigint(20) not null auto_increment,
    user_name varchar(100) not null,
    role int(2) not null default 0 comment '用户类型: 1管理员，0答题者',
    primary key(id),
    unique key(user_name)
);
insert into p_pt_user(user_name, role) values('xiaoming20000101', 1);

create table p_pt_question (
    id bigint(20) not null auto_increment,
    no int(10) not null default -1,
    html_name varchar(100) not null default "" comment '题目对应的前端文件名',
    primary key(id)
);
insert into p_pt_question(no, html_name) values(0, 'index.html');

create table p_pt_user_answer (
    id bigint(20) not null auto_increment,
    user_name varchar(100) not null,
    ith_answer int(2) not null default 0,
    test_begin timestamp not null default current_timestamp,
    test_end timestamp not null default current_timestamp,
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
insert into p_pt_user_answer(user_name) values('xiaoming20000101');
alter table p_pt_user_answer add index uk_user_name_ith(user_name, ith_answer);

create table p_pt_air_controller_data (
    id bigint(20) not null auto_increment,
    user_name varchar(100) not null,
    ith_answer int(2) not null default 0,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp not null default current_timestamp,
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
insert into p_pt_air_controller_data(user_name) values('xiaoming20000101');