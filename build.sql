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
insert into p_pt_user(user_name, role) values('xiaogang20000909', 0);

create table p_pt_question (
    id bigint(20) not null auto_increment,
    no int(10) not null default -1,
    html_name varchar(100) not null default "" comment '题目对应的前端文件名',
    data_table varchar(50) not null default "" comment '题目答题数据存储的后端数据表名',
    primary key(id),
    key data_table(data_table)
);
-- insert into p_pt_question(no, html_name, data_table) values(-1, 'index.html', 'p_pt_air_controller_data');
-- insert into p_pt_question(no, html_name, data_table) values(-1, 'hello.html', 'p_pt_tickets_sale_data');
insert into p_pt_question(no, html_name, data_table) values(-1, 'tickets_sale_t1', 'p_pt_tickets_sale_data');
insert into p_pt_question(no, html_name, data_table) values(-1, 'tickets_sale_t2', 'p_pt_tickets_sale_data');
insert into p_pt_question(no, html_name, data_table) values(-1, 'tickets_sale_t3', 'p_pt_tickets_sale_data');
insert into p_pt_question(no, html_name, data_table) values(1, 'air_controller_t1', 'p_pt_air_controller_data');
insert into p_pt_question(no, html_name, data_table) values(2, 'air_controller_t2', 'p_pt_air_controller_data');
insert into p_pt_question(no, html_name, data_table) values(3, 'cat_feed_t1', 'p_pt_cat_feed_data');
insert into p_pt_question(no, html_name, data_table) values(4, 'cat_feed_t2', 'p_pt_cat_feed_data');
insert into p_pt_question(no, html_name, data_table) values(5, 'perfume_maker_t1', 'p_pt_perfume_maker_data');
insert into p_pt_question(no, html_name, data_table) values(6, 'perfume_maker_t2', 'p_pt_perfume_maker_data');
insert into p_pt_question(no, html_name, data_table) values(7, 'projection_controller_t1', 'p_pt_projection_controller_data');
insert into p_pt_question(no, html_name, data_table) values(8, 'projection_controller_t2', 'p_pt_projection_controller_data');
insert into p_pt_question(no, html_name, data_table) values(9, 'water_dispenser_t1', 'p_pt_water_dispenser_data');
insert into p_pt_question(no, html_name, data_table) values(10, 'water_dispenser_t2', 'p_pt_water_dispenser_data');
insert into p_pt_question(no, html_name, data_table) values(11, 'video_player_t1', 'p_pt_video_player_data');
insert into p_pt_question(no, html_name, data_table) values(12, 'video_player_t2', 'p_pt_video_player_data');
insert into p_pt_question(no, html_name, data_table) values(13, 'big_air_controller_t1', 'p_pt_big_air_controller_data');
insert into p_pt_question(no, html_name, data_table) values(14, 'big_air_controller_t2', 'p_pt_big_air_controller_data');
insert into p_pt_question(no, html_name, data_table) values(15, 'flower_garden_t1', 'p_pt_flower_garden_data');
insert into p_pt_question(no, html_name, data_table) values(16, 'flower_garden_t2', 'p_pt_flower_garden_data');
insert into p_pt_question(no, html_name, data_table) values(17, 'flashlight_t1', 'p_pt_flashlight_data');
insert into p_pt_question(no, html_name, data_table) values(18, 'flashlight_t2', 'p_pt_flashlight_data');
insert into p_pt_question(no, html_name, data_table) values(19, 'rice_cooker_t1', 'p_pt_rice_cooker_data');
insert into p_pt_question(no, html_name, data_table) values(20, 'rice_cooker_t2', 'p_pt_rice_cooker_data');
insert into p_pt_question(no, html_name, data_table) values(21, 'coffee_machine_t1', 'p_pt_coffee_machine_data');
insert into p_pt_question(no, html_name, data_table) values(22, 'coffee_machine_t2', 'p_pt_coffee_machine_data');
insert into p_pt_question(no, html_name, data_table) values(23, 'fruit_tea_t1', 'p_pt_fruit_tea_data');
insert into p_pt_question(no, html_name, data_table) values(24, 'fruit_tea_t2', 'p_pt_fruit_tea_data');
insert into p_pt_question(no, html_name, data_table) values(25, 'camera_controller_t1', 'p_pt_camera_controller_data');
insert into p_pt_question(no, html_name, data_table) values(26, 'camera_controller_t2', 'p_pt_camera_controller_data');

create table p_pt_user_answer (
    id bigint(20) not null auto_increment,
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    test_begin timestamp(3) not null default current_timestamp(3),
    test_end timestamp(3) not null default current_timestamp(3),
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_user_answer(user_name) values('xiaoming20000101');
-- insert into p_pt_user_answer(user_name, ith_answer) values('xiaoming20000101', 1);
-- insert into p_pt_user_answer(user_name, ith_answer) values('xiaogang20000909', 1);

create table p_pt_air_controller_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp(3) not null default current_timestamp(3),
    event_number int(10) not null default 0 comment '事件对应的顺序',
    top_setting varchar(10) not null default 'NULL' comment 'top control设置的大小',
    central_setting varchar(10) not null default 'NULL' comment 'central control设置的大小',
    bottom_setting varchar(10) not null default 'NULL' comment 'bottom control设置的大小',
    temp_value varchar(100) not null default 'NULL' comment '温度大小',
    humid_value varchar(10) not null default 'NULL' comment '湿度大小',
    diagram_state varchar(100) not null default 'NULL' comment '用户答案',
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_air_controller_data(html_name,user_name) values('index.html', 'xiaoming20000101');
-- insert into p_pt_air_controller_data(html_name,user_name) values('index.html', 'xiaogang20000909');

create table p_pt_tickets_sale_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp(3) not null default current_timestamp(3),
    event_number int(10) not null default 0 comment '事件对应的顺序',
    network varchar(10) not null default 'NULL' comment '选择乘坐的交通网络',
    fare_type varchar(10) not null default 'NULL' comment '全票还是优惠票',
    ticket_type varchar(10) not null default 'NULL' comment '购票类型：单次票还是日票',
    number_trips varchar(10) not null default 'NULL' comment '乘车次数',
    primary key (id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_tickets_sale_data(html_name, user_name) values('hello.html','xiaoming20000101');
-- insert into p_pt_tickets_sale_data(html_name, user_name) values('hello.html','xiaogang20000909');

create table p_pt_cat_feed_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp(3) not null default current_timestamp(3),
    event_number int(10) not null default 0 comment '事件对应的顺序',
    top_setting varchar(10) not null default 'NULL' comment 'top control设置的大小',
    central_setting varchar(10) not null default 'NULL' comment 'central control设置的大小',
    bottom_setting varchar(10) not null default 'NULL' comment 'bottom control设置的大小',
    food_value varchar(100) not null default 'NULL' comment '食物量大小',
    water_value varchar(10) not null default 'NULL' comment '出水量大小',
    diagram_state varchar(100) not null default 'NULL' comment '用户答案',
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_cat_feed_data(html_name, user_name) values('cat.html','xiaoming20000101');
-- insert into p_pt_cat_feed_data(html_name, user_name) values('cat.html','xiaogang20000909');

create table p_pt_perfume_maker_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp(3) not null default current_timestamp(3),
    event_number int(10) not null default 0 comment '事件对应的顺序',
    top_setting varchar(10) not null default 'NULL' comment 'top control设置的大小',
    central_setting varchar(10) not null default 'NULL' comment 'central control设置的大小',
    bottom_setting varchar(10) not null default 'NULL' comment 'bottom control设置的大小',
    concentration_value varchar(100) not null default 'NULL' comment '浓度大小',
    last_time_value varchar(10) not null default 'NULL' comment '留存时间大小',
    diagram_state varchar(100) not null default 'NULL' comment '用户答案',
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_perfume_maker_data(html_name, user_name) values('perfume.html','xiaoming20000101');
-- insert into p_pt_perfume_maker_data(html_name, user_name) values('perfume.html','xiaogang20000909');

create table p_pt_projection_controller_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp(3) not null default current_timestamp(3),
    event_number int(10) not null default 0 comment '事件对应的顺序',
    top_setting varchar(10) not null default 'NULL' comment 'top control设置的大小',
    central_setting varchar(10) not null default 'NULL' comment 'central control设置的大小',
    bottom_setting varchar(10) not null default 'NULL' comment 'bottom control设置的大小',
    definition_value varchar(100) not null default 'NULL' comment '清晰度大小',
    projection_value varchar(10) not null default 'NULL' comment '画片大小',
    diagram_state varchar(100) not null default 'NULL' comment '用户答案',
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_projection_controller_data(html_name, user_name) values('projection.html','xiaoming20000101');
-- insert into p_pt_projection_controller_data(html_name, user_name) values('projection.html','xiaogang20000909');

create table p_pt_water_dispenser_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp(3) not null default current_timestamp(3),
    event_number int(10) not null default 0 comment '事件对应的顺序',
    top_setting varchar(10) not null default 'NULL' comment 'top control设置的大小',
    central_setting varchar(10) not null default 'NULL' comment 'central control设置的大小',
    bottom_setting varchar(10) not null default 'NULL' comment 'bottom control设置的大小',
    volume_value varchar(100) not null default 'NULL' comment '出水总量大小',
    temp_value varchar(10) not null default 'NULL' comment '出水温度大小',
    speed_value varchar(10) not null default 'NULL' comment '出水速度大小',
    diagram_state varchar(100) not null default 'NULL' comment '用户答案',
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_water_dispenser_data(html_name, user_name) values('dispenser.html','xiaoming20000101');
-- insert into p_pt_water_dispenser_data(html_name, user_name) values('dispenser.html','xiaogang20000909');

create table p_pt_video_player_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp(3) not null default current_timestamp(3),
    event_number int(10) not null default 0 comment '事件对应的顺序',
    top_setting varchar(10) not null default 'NULL' comment 'top control设置的大小',
    central_setting varchar(10) not null default 'NULL' comment 'central control设置的大小',
    bottom_setting varchar(10) not null default 'NULL' comment 'bottom control设置的大小',
    speed_value varchar(100) not null default 'NULL' comment '播放速度大小',
    volume_value varchar(10) not null default 'NULL' comment '音量大小',
    quality_value varchar(10) not null default 'NULL' comment '画质大小',
    diagram_state varchar(100) not null default 'NULL' comment '用户答案',
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_video_player_data(html_name, user_name) values('video.html','xiaoming20000101');
-- insert into p_pt_video_player_data(html_name, user_name) values('video.html','xiaogang20000909');

create table p_pt_big_air_controller_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp(3) not null default current_timestamp(3),
    event_number int(10) not null default 0 comment '事件对应的顺序',
    top_setting varchar(10) not null default 'NULL' comment 'top control设置的大小',
    central_setting varchar(10) not null default 'NULL' comment 'central control设置的大小',
    bottom_setting varchar(10) not null default 'NULL' comment 'bottom control设置的大小',
    temp_value varchar(100) not null default 'NULL' comment '温度大小',
    humid_value varchar(10) not null default 'NULL' comment '湿度大小',
    wind_value varchar(10) not null default 'NULL' comment '风量大小',
    diagram_state varchar(100) not null default 'NULL' comment '用户答案',
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_big_air_controller_data(html_name, user_name) values('bigair.html','xiaoming20000101');
-- insert into p_pt_big_air_controller_data(html_name, user_name) values('bigair.html','xiaogang20000909');

create table p_pt_flower_garden_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp(3) not null default current_timestamp(3),
    event_number int(10) not null default 0 comment '事件对应的顺序',
    top_setting varchar(10) not null default 'NULL' comment 'top control设置的大小',
    central_setting varchar(10) not null default 'NULL' comment 'central control设置的大小',
    bottom_setting varchar(10) not null default 'NULL' comment 'bottom control设置的大小',
    last_setting varchar(10) not null default 'NULL' comment 'last control设置的大小',
    temp_value varchar(100) not null default 'NULL' comment '温度大小',
    water_value varchar(10) not null default 'NULL' comment '水分大小',
    fertilizer_value varchar(10) not null default 'NULL' comment '养料大小',
    diagram_state varchar(100) not null default 'NULL' comment '用户答案',
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_flower_garden_data(html_name, user_name) values('garden.html','xiaoming20000101');
-- insert into p_pt_flower_garden_data(html_name, user_name) values('garden.html','xiaogang20000909');

create table p_pt_flashlight_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp(3) not null default current_timestamp(3),
    event_number int(10) not null default 0 comment '事件对应的顺序',
    top_setting varchar(10) not null default 'NULL' comment 'top control设置的大小',
    central_setting varchar(10) not null default 'NULL' comment 'central control设置的大小',
    bottom_setting varchar(10) not null default 'NULL' comment 'bottom control设置的大小',
    last_setting varchar(10) not null default 'NULL' comment 'last control设置的大小',
    distance_value varchar(100) not null default 'NULL' comment '照射距离大小',
    brightness_value varchar(10) not null default 'NULL' comment '亮度大小',
    area_value varchar(10) not null default 'NULL' comment '范围大小',
    diagram_state varchar(100) not null default 'NULL' comment '用户答案',
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_flashlight_data(html_name, user_name) values('flashlight.html','xiaoming20000101');
-- insert into p_pt_flashlight_data(html_name, user_name) values('flashlight.html','xiaogang20000909');

create table p_pt_rice_cooker_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp(3) not null default current_timestamp(3),
    event_number int(10) not null default 0 comment '事件对应的顺序',
    top_setting varchar(10) not null default 'NULL' comment 'top control设置的大小',
    central_setting varchar(10) not null default 'NULL' comment 'central control设置的大小',
    bottom_setting varchar(10) not null default 'NULL' comment 'bottom control设置的大小',
    last_setting varchar(10) not null default 'NULL' comment 'last control设置的大小',
    hardness_value varchar(100) not null default 'NULL' comment '硬度大小',
    sweetness_value varchar(10) not null default 'NULL' comment '香甜度大小',
    cook_time_value varchar(10) not null default 'NULL' comment '煮饭时间大小',
    diagram_state varchar(100) not null default 'NULL' comment '用户答案',
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_rice_cooker_data(html_name, user_name) values('cooker.html','xiaoming20000101');
-- insert into p_pt_rice_cooker_data(html_name, user_name) values('cooker.html','xiaogang20000909');

create table p_pt_coffee_machine_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp(3) not null default current_timestamp(3),
    event_number int(10) not null default 0 comment '事件对应的顺序',
    top_setting varchar(10) not null default 'NULL' comment 'top control设置的大小',
    central_setting varchar(10) not null default 'NULL' comment 'central control设置的大小',
    bottom_setting varchar(10) not null default 'NULL' comment 'bottom control设置的大小',
    last_setting varchar(10) not null default 'NULL' comment 'last control设置的大小',
    capacity_value varchar(100) not null default 'NULL' comment '容量大小',
    bitterness_value varchar(10) not null default 'NULL' comment '苦涩度大小',
    sweetness_value varchar(10) not null default 'NULL' comment '甜度大小',
    consistence_value varchar(10) not null default 'NULL' comment '浓稠度大小',
    diagram_state varchar(100) not null default 'NULL' comment '用户答案',
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_coffee_machine_data(html_name, user_name) values('coffee.html','xiaoming20000101');
-- insert into p_pt_coffee_machine_data(html_name, user_name) values('coffee.html','xiaogang20000909');

create table p_pt_fruit_tea_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp(3) not null default current_timestamp(3),
    event_number int(10) not null default 0 comment '事件对应的顺序',
    top_setting varchar(10) not null default 'NULL' comment 'top control设置的大小',
    central_setting varchar(10) not null default 'NULL' comment 'central control设置的大小',
    bottom_setting varchar(10) not null default 'NULL' comment 'bottom control设置的大小',
    last_setting varchar(10) not null default 'NULL' comment 'last control设置的大小',
    capacity_value varchar(100) not null default 'NULL' comment '容量大小',
    temp_value varchar(10) not null default 'NULL' comment '温度大小',
    sweetness_value varchar(10) not null default 'NULL' comment '甜度大小',
    pulp_value varchar(10) not null default 'NULL' comment '果肉数量大小',
    diagram_state varchar(100) not null default 'NULL' comment '用户答案',
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_fruit_tea_data(html_name, user_name) values('fruittea.html','xiaoming20000101');
-- insert into p_pt_fruit_tea_data(html_name, user_name) values('fruittea.html','xiaogang20000909');

create table p_pt_camera_controller_data (
    id bigint(20) not null auto_increment,
    html_name varchar(100) not null default '' comment '题目对应的前端文件名',
    user_name varchar(100) not null,
    ith_answer int(2) not null default 1,
    event varchar(50) not null default '' comment '操作事件',
    event_type varchar(10) not null default '' comment '事件类型',
    event_start_time timestamp(3) not null default current_timestamp(3),
    event_number int(10) not null default 0 comment '事件对应的顺序',
    top_setting varchar(10) not null default 'NULL' comment 'top control设置的大小',
    central_setting varchar(10) not null default 'NULL' comment 'central control设置的大小',
    bottom_setting varchar(10) not null default 'NULL' comment 'bottom control设置的大小',
    last_setting varchar(10) not null default 'NULL' comment 'last control设置的大小',
    brightness_value varchar(100) not null default 'NULL' comment '亮度大小',
    definition_value varchar(10) not null default 'NULL' comment '清晰度大小',
    virtualization_value varchar(10) not null default 'NULL' comment '虚化程度大小',
    range_value varchar(10) not null default 'NULL' comment '取景范围大小',
    diagram_state varchar(100) not null default 'NULL' comment '用户答案',
    primary key(id),
    key uk_user_name_ith_answer(user_name, ith_answer)
);
-- insert into p_pt_camera_controller_data(html_name, user_name) values('camera.html','xiaoming20000101');
-- insert into p_pt_camera_controller_data(html_name, user_name) values('camera.html','xiaogang20000909');