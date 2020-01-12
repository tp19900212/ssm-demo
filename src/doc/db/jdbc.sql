create database if NOT EXISTS jdbcStudy character set utf8 collate utf8_general_ci;
use jdbcStudy;

-- 用于jdbc的curd测试
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
                      `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
                      `user_name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
                      `pass_word` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
                      `email` varchar(60) DEFAULT NULL COMMENT '邮箱',
                      `birthday` date DEFAULT NULL COMMENT '生日（yyyy-MM-dd）',
                      `sex` tinyint(4) DEFAULT NULL COMMENT '性别（0:女 1:男）',
                      `create_time` datetime DEFAULT NULL COMMENT '创建时间（yyyy-MM-dd HH:mm:ss）',
                      `update_time` datetime DEFAULT NULL COMMENT '修改时间（yyyy-MM-dd HH:mm:ss）',
                      `ts` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',
                      PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user ( user_name, pass_word, email, birthday, sex, create_time)
VALUES
( '苏莱曼尼', '123456', 'iran@163.com', '1957-03-11', 1, now()),
( '特朗普', '654321', 'usa@163.com', '1946-06-14', 0, now()),
( '习大大', '888888', 'chaina@163.com', '1953-06-15', 1, now());

-- 测试数据库隔离级别
drop TABLE if exists `account`;
create table account(
                      id int primary key auto_increment,
                      name varchar(40),
                      money float
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into account(name,money) values('A',1000);
insert into account(name,money) values('B',1000);
insert into account(name,money) values('C',1000);