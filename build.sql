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
    data_table varchar(50) not null default "" comment '题目答题数据存储的后端数据表名',
    primary key(id),
    key data_table(data_table)
);
insert into p_pt_question(no, html_name, data_table) values(-1, 'index.html', 'p_pt_air_controller_data');
insert into p_pt_question(no, html_name, data_table) values(-1, 'hello.html', 'p_pt_tickets_sale_data');

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
insert into p_pt_user_answer(user_name, ith_answer) values('xiaoming20000101', 1);

create table p_pt_air_controller_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 0,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp not null default current_timestamp,
    event_number int(10) not null default 0 comment '事件对应的顺序',
    top_setting varchar(10) not null default 'NULL' comment 'top control设置的大小',
    central_setting varchar(10) not null default 'NULL' comment 'central control设置的大小',
    bottom_setting varchar(10) not null default 'NULL' comment 'bottom control设置的大小',
    temp_value varchar(100) not null default 'NULL' comment '温度大小',
    humid_value varchar(10) not null default 'NULL' comment '湿度大小',
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
insert into p_pt_air_controller_data(html_name,user_name) values('index.html', 'xiaoming20000101');

create table p_pt_tickets_sale_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 0,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp not null default current_timestamp,
    event_number int(10) not null default 0 comment '事件对应的顺序',
    network varchar(10) not null default 'NULL' comment '选择乘坐的交通网络',
    fare_type varchar(10) not null default 'NULL' comment '全票还是优惠票',
    ticket_type varchar(10) not null default 'NULL' comment '购票类型：单次票还是日票',
    number_trips varchar(10) not null default 'NULL' comment '乘车次数',
    primary key (id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
insert into p_pt_tickets_sale_data(html_name, user_name) values('hello.html','xiaoming20000101');