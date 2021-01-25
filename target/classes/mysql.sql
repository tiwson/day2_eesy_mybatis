CREATE DATABASE eesy_mybatis;
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
`id` int(11) NOT NULL auto_increment,
`username` varchar(32) NOT NULL COMMENT '用户名称',
`birthday` datetime NOT NULL COMMENT '生日',
`sex` char(1) NULL COMMENT '性别',
`address` varchar(255) NULL COMMENT '地址',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `user` (`id`,`username`,`birthday`,`sex`,`address`) values(41,'老王','2018-02-27 17:47:08','男','广东省广州市');
insert into `user` (`id`,`username`,`birthday`,`sex`,`address`) values(42,'李四','2018-02-27 17:47:08','男','广东省佛山市');
insert into `user` (`id`,`username`,`birthday`,`sex`,`address`) values(43,'老陈','2018-02-27 17:47:08','男','广东省肇庆市');
