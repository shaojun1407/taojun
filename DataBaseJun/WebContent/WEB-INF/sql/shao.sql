-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.18-1 - (Debian)
-- 服务器操作系统:                      Linux
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 shao 的数据库结构
CREATE DATABASE IF NOT EXISTS `shao` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `shao`;

-- 导出  表 shao.account 结构
CREATE TABLE IF NOT EXISTS `account` (
  `acct_num` int(11) DEFAULT NULL,
  `amount` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.account 的数据：~2 rows (大约)
DELETE FROM `account`;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` (`acct_num`, `amount`) VALUES
	(1, 1.00),
	(2, 2.00);
/*!40000 ALTER TABLE `account` ENABLE KEYS */;

-- 导出  表 shao.article 结构
CREATE TABLE IF NOT EXISTS `article` (
  `aid` int(11) NOT NULL,
  `title` text NOT NULL,
  `content` text NOT NULL,
  `uid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.article 的数据：~6 rows (大约)
DELETE FROM `article`;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` (`aid`, `title`, `content`, `uid`) VALUES
	(1, '文章1', '文章1内容', 1),
	(2, '文章2', '文章2内容', 1),
	(3, '文章3', '文章3内容', 2),
	(4, '文章4', '文章4内容', 3),
	(5, '文章5', '文章5内容', 3),
	(6, '日志1', '日志1内容', 1),
	(7, '日志2', '日志2内容', 2);
/*!40000 ALTER TABLE `article` ENABLE KEYS */;

-- 导出  过程 shao.avgstuage 结构
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `avgstuage`()
begin select avg(age) from stu; end//
DELIMITER ;

-- 导出  表 shao.bittest 结构
CREATE TABLE IF NOT EXISTS `bittest` (
  `test_field` bit(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.bittest 的数据：~2 rows (大约)
DELETE FROM `bittest`;
/*!40000 ALTER TABLE `bittest` DISABLE KEYS */;
INSERT INTO `bittest` (`test_field`) VALUES
	(b'1011'),
	(b'0011');
/*!40000 ALTER TABLE `bittest` ENABLE KEYS */;

-- 导出  表 shao.blog 结构
CREATE TABLE IF NOT EXISTS `blog` (
  `bid` int(11) NOT NULL,
  `title` text NOT NULL,
  `content` text NOT NULL,
  `uid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.blog 的数据：~4 rows (大约)
DELETE FROM `blog`;
/*!40000 ALTER TABLE `blog` DISABLE KEYS */;
INSERT INTO `blog` (`bid`, `title`, `content`, `uid`) VALUES
	(1, '日志1', '日志1内容', 1),
	(2, '文章2', '文章2内容', 1),
	(3, '日志3', '日志3内容', 2),
	(4, '文章3', '文章3内容', 2),
	(5, '文章5', '文章5内容', 3);
/*!40000 ALTER TABLE `blog` ENABLE KEYS */;

-- 导出  表 shao.date_test 结构
CREATE TABLE IF NOT EXISTS `date_test` (
  `d1` datetime DEFAULT NULL,
  `d2` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.date_test 的数据：~0 rows (大约)
DELETE FROM `date_test`;
/*!40000 ALTER TABLE `date_test` DISABLE KEYS */;
INSERT INTO `date_test` (`d1`, `d2`) VALUES
	('2017-10-31 11:23:16', '2017-10-31 11:23:16');
/*!40000 ALTER TABLE `date_test` ENABLE KEYS */;

-- 导出  表 shao.decimaltest 结构
CREATE TABLE IF NOT EXISTS `decimaltest` (
  `a` decimal(2,1) DEFAULT NULL,
  `b` decimal(2,1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.decimaltest 的数据：~0 rows (大约)
DELETE FROM `decimaltest`;
/*!40000 ALTER TABLE `decimaltest` DISABLE KEYS */;
INSERT INTO `decimaltest` (`a`, `b`) VALUES
	(5.0, 3.2);
/*!40000 ALTER TABLE `decimaltest` ENABLE KEYS */;

-- 导出  表 shao.doubletest 结构
CREATE TABLE IF NOT EXISTS `doubletest` (
  `a` double DEFAULT NULL,
  `b` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.doubletest 的数据：~0 rows (大约)
DELETE FROM `doubletest`;
/*!40000 ALTER TABLE `doubletest` DISABLE KEYS */;
INSERT INTO `doubletest` (`a`, `b`) VALUES
	(5, 3.2);
/*!40000 ALTER TABLE `doubletest` ENABLE KEYS */;

-- 导出  表 shao.edu 结构
CREATE TABLE IF NOT EXISTS `edu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(12) NOT NULL,
  `from_data` date NOT NULL DEFAULT '0000-00-00',
  `to_data` date NOT NULL DEFAULT '0000-00-00',
  `degree` tinyint(1) NOT NULL DEFAULT '0',
  `school_name` varchar(100) NOT NULL,
  `school_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `school_id` (`school_id`),
  CONSTRAINT `FK_edo_school` FOREIGN KEY (`school_id`) REFERENCES `school` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- 正在导出表  shao.edu 的数据：~5 rows (大约)
DELETE FROM `edu`;
/*!40000 ALTER TABLE `edu` DISABLE KEYS */;
INSERT INTO `edu` (`id`, `stu_id`, `from_data`, `to_data`, `degree`, `school_name`, `school_id`) VALUES
	(1, 1, '1990-07-01', '1995-09-01', 1, 'hfyz', 1),
	(2, 2, '1990-07-01', '1995-09-01', 1, 'hfyz', 2),
	(3, 3, '1990-07-01', '1995-09-01', 2, '168', 2),
	(4, 4, '1990-07-01', '1995-09-01', 1, 'hfyz', 2),
	(5, 5, '1990-07-01', '1995-09-01', 1, 'hfyz', 2);
/*!40000 ALTER TABLE `edu` ENABLE KEYS */;

-- 导出  表 shao.enum_test 结构
CREATE TABLE IF NOT EXISTS `enum_test` (
  `en` enum('one','two','three') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.enum_test 的数据：~2 rows (大约)
DELETE FROM `enum_test`;
/*!40000 ALTER TABLE `enum_test` DISABLE KEYS */;
INSERT INTO `enum_test` (`en`) VALUES
	('one'),
	('two');
/*!40000 ALTER TABLE `enum_test` ENABLE KEYS */;

-- 导出  表 shao.floattest 结构
CREATE TABLE IF NOT EXISTS `floattest` (
  `a` float DEFAULT NULL,
  `b` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.floattest 的数据：~3 rows (大约)
DELETE FROM `floattest`;
/*!40000 ALTER TABLE `floattest` DISABLE KEYS */;
INSERT INTO `floattest` (`a`, `b`) VALUES
	(5, 3.2),
	(6, 3.3),
	(7, 4.5);
/*!40000 ALTER TABLE `floattest` ENABLE KEYS */;

-- 导出  过程 shao.handledemo 结构
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `handledemo`()
begin declare continue handler for sqlstate '23000' set @x2=1; set @x=1; insert into t values(1); set @x=2; insert into t values(1); set @x=3; end//
DELIMITER ;

-- 导出  表 shao.m 结构
CREATE TABLE IF NOT EXISTS `m` (
  `count` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.m 的数据：~3 rows (大约)
DELETE FROM `m`;
/*!40000 ALTER TABLE `m` DISABLE KEYS */;
INSERT INTO `m` (`count`, `price`) VALUES
	(10, 3),
	(20, 6),
	(15, 4);
/*!40000 ALTER TABLE `m` ENABLE KEYS */;

-- 导出  函数 shao.namebyid 结构
DELIMITER //
CREATE DEFINER=`root`@`localhost` FUNCTION `namebyid`() RETURNS char(50) CHARSET utf8
return (select name from stu  where id=4)//
DELIMITER ;

-- 导出  表 shao.school 结构
CREATE TABLE IF NOT EXISTS `school` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `address` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- 正在导出表  shao.school 的数据：~3 rows (大约)
DELETE FROM `school`;
/*!40000 ALTER TABLE `school` DISABLE KEYS */;
INSERT INTO `school` (`id`, `name`, `address`) VALUES
	(1, '合肥合肥一中', 'hf'),
	(2, '合肥168', 'hf'),
	(3, '六安一中', 'la');
/*!40000 ALTER TABLE `school` ENABLE KEYS */;

-- 导出  表 shao.set_test 结构
CREATE TABLE IF NOT EXISTS `set_test` (
  `st` set('one','two','three') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.set_test 的数据：~7 rows (大约)
DELETE FROM `set_test`;
/*!40000 ALTER TABLE `set_test` DISABLE KEYS */;
INSERT INTO `set_test` (`st`) VALUES
	('one'),
	('two'),
	('one,two'),
	('three'),
	('one,three'),
	('two,three'),
	('one,two,three');
/*!40000 ALTER TABLE `set_test` ENABLE KEYS */;

-- 导出  表 shao.stu 结构
CREATE TABLE IF NOT EXISTS `stu` (
  `age` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `cell` varchar(12) NOT NULL,
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- 正在导出表  shao.stu 的数据：~18 rows (大约)
DELETE FROM `stu`;
/*!40000 ALTER TABLE `stu` DISABLE KEYS */;
INSERT INTO `stu` (`age`, `name`, `cell`, `id`) VALUES
	(22, 'lisi', '1234567890', 1),
	(26, 'wangwu', '12345678901', 2),
	(27, 'zhaogao', '556787768', 3),
	(24, 'xiaoer', '898989877', 4),
	(26, 'wangbing', '123456734401', 5),
	(24, 'gongben', '345533455676', 6),
	(24, 'xiaoga', '2348989877', 7),
	(27, 'liwu', '43567887656', 8),
	(25, 'zhaowu', '1234444455', 9),
	(-1, 'zhaosi', '13454567677', 10),
	(27, 'zhaogao', '55678773468', 12),
	(28, 'lijun', '55678777468', 14),
	(28, 'jack', '18256043569', 15),
	(28, 'jack', '18256043569', 16),
	(28, 'tom', '18256043569', 17),
	(28, 'tim', '18256043569', 18),
	(26, 'tia', '18256043569', 19),
	(40, 'hanfei', '18256082569', 20);
/*!40000 ALTER TABLE `stu` ENABLE KEYS */;

-- 导出  表 shao.student 结构
CREATE TABLE IF NOT EXISTS `student` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.student 的数据：~4 rows (大约)
DELETE FROM `student`;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`id`, `name`) VALUES
	(1, 'zhangsan'),
	(2, 'lisi'),
	(3, 'wangwu'),
	(4, 'zhaoliu');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;

-- 导出  视图 shao.stu_class 结构
-- 创建临时表以解决视图依赖性错误
CREATE TABLE `stu_class` (
	`name` VARCHAR(100) NULL COLLATE 'utf8_general_ci',
	`class` VARCHAR(50) NULL COLLATE 'utf8_general_ci'
) ENGINE=MyISAM;

-- 导出  视图 shao.stu_class2 结构
-- 创建临时表以解决视图依赖性错误
CREATE TABLE `stu_class2` (
	`id` INT(11) NULL,
	`name` VARCHAR(100) NULL COLLATE 'utf8_general_ci',
	`class` VARCHAR(50) NULL COLLATE 'utf8_general_ci'
) ENGINE=MyISAM;

-- 导出  表 shao.stu_info 结构
CREATE TABLE IF NOT EXISTS `stu_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `s_id` int(11) DEFAULT NULL,
  `class` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- 正在导出表  shao.stu_info 的数据：~4 rows (大约)
DELETE FROM `stu_info`;
/*!40000 ALTER TABLE `stu_info` DISABLE KEYS */;
INSERT INTO `stu_info` (`id`, `s_id`, `class`) VALUES
	(1, 1, '1ban'),
	(2, 2, '2ban'),
	(3, 3, '3ban'),
	(4, 4, '4ban');
/*!40000 ALTER TABLE `stu_info` ENABLE KEYS */;

-- 导出  表 shao.t 结构
CREATE TABLE IF NOT EXISTS `t` (
  `sl` int(10) unsigned NOT NULL,
  PRIMARY KEY (`sl`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.t 的数据：~0 rows (大约)
DELETE FROM `t`;
/*!40000 ALTER TABLE `t` DISABLE KEYS */;
INSERT INTO `t` (`sl`) VALUES
	(1);
/*!40000 ALTER TABLE `t` ENABLE KEYS */;

-- 导出  表 shao.tch 结构
CREATE TABLE IF NOT EXISTS `tch` (
  `age` int(11) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.tch 的数据：~0 rows (大约)
DELETE FROM `tch`;
/*!40000 ALTER TABLE `tch` DISABLE KEYS */;
/*!40000 ALTER TABLE `tch` ENABLE KEYS */;

-- 导出  表 shao.teacher 结构
CREATE TABLE IF NOT EXISTS `teacher` (
  `name` varchar(100) DEFAULT NULL COMMENT '教师姓名',
  `age` int(100) DEFAULT NULL COMMENT '教师年龄'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教师信息表';

-- 正在导出表  shao.teacher 的数据：~0 rows (大约)
DELETE FROM `teacher`;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;

-- 导出  表 shao.teacherinfo 结构
CREATE TABLE IF NOT EXISTS `teacherinfo` (
  `age` int(11) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.teacherinfo 的数据：~0 rows (大约)
DELETE FROM `teacherinfo`;
/*!40000 ALTER TABLE `teacherinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `teacherinfo` ENABLE KEYS */;

-- 导出  表 shao.test1 结构
CREATE TABLE IF NOT EXISTS `test1` (
  `a1` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.test1 的数据：~8 rows (大约)
DELETE FROM `test1`;
/*!40000 ALTER TABLE `test1` DISABLE KEYS */;
INSERT INTO `test1` (`a1`) VALUES
	(1),
	(3),
	(1),
	(7),
	(1),
	(8),
	(4),
	(4);
/*!40000 ALTER TABLE `test1` ENABLE KEYS */;

-- 导出  表 shao.test2 结构
CREATE TABLE IF NOT EXISTS `test2` (
  `a2` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.test2 的数据：~8 rows (大约)
DELETE FROM `test2`;
/*!40000 ALTER TABLE `test2` DISABLE KEYS */;
INSERT INTO `test2` (`a2`) VALUES
	(1),
	(3),
	(1),
	(7),
	(1),
	(8),
	(4),
	(4);
/*!40000 ALTER TABLE `test2` ENABLE KEYS */;

-- 导出  表 shao.test3 结构
CREATE TABLE IF NOT EXISTS `test3` (
  `a3` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`a3`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- 正在导出表  shao.test3 的数据：~5 rows (大约)
DELETE FROM `test3`;
/*!40000 ALTER TABLE `test3` DISABLE KEYS */;
INSERT INTO `test3` (`a3`) VALUES
	(2),
	(5),
	(6),
	(9),
	(10);
/*!40000 ALTER TABLE `test3` ENABLE KEYS */;

-- 导出  表 shao.test4 结构
CREATE TABLE IF NOT EXISTS `test4` (
  `a4` int(11) NOT NULL AUTO_INCREMENT,
  `b4` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`a4`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- 正在导出表  shao.test4 的数据：~10 rows (大约)
DELETE FROM `test4`;
/*!40000 ALTER TABLE `test4` DISABLE KEYS */;
INSERT INTO `test4` (`a4`, `b4`) VALUES
	(1, 3),
	(2, 0),
	(3, 1),
	(4, 2),
	(5, 0),
	(6, 0),
	(7, 1),
	(8, 1),
	(9, 0),
	(10, 0);
/*!40000 ALTER TABLE `test4` ENABLE KEYS */;

-- 导出  表 shao.tinyint_unsigned 结构
CREATE TABLE IF NOT EXISTS `tinyint_unsigned` (
  `a` tinyint(4) DEFAULT NULL,
  `b` tinyint(3) unsigned DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  shao.tinyint_unsigned 的数据：~4 rows (大约)
DELETE FROM `tinyint_unsigned`;
/*!40000 ALTER TABLE `tinyint_unsigned` DISABLE KEYS */;
INSERT INTO `tinyint_unsigned` (`a`, `b`) VALUES
	(100, 200),
	(127, 255),
	(-1, 255),
	(-128, 255),
	(-128, 0);
/*!40000 ALTER TABLE `tinyint_unsigned` ENABLE KEYS */;

-- 导出  表 shao.transaction_test 结构
CREATE TABLE IF NOT EXISTS `transaction_test` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- 正在导出表  shao.transaction_test 的数据：~9 rows (大约)
DELETE FROM `transaction_test`;
/*!40000 ALTER TABLE `transaction_test` DISABLE KEYS */;
INSERT INTO `transaction_test` (`id`, `name`) VALUES
	(1, 'andy'),
	(2, 'tom'),
	(3, 'jack'),
	(5, 'jim'),
	(6, 'tim'),
	(8, 'him'),
	(11, 'john'),
	(12, 'lee'),
	(13, 'kee'),
	(14, 'gee');
/*!40000 ALTER TABLE `transaction_test` ENABLE KEYS */;

-- 导出  视图 shao.v_m 结构
-- 创建临时表以解决视图依赖性错误
CREATE TABLE `v_m` (
	`count` INT(11) NULL,
	`price` INT(11) NULL,
	`sum` BIGINT(21) NULL
) ENGINE=MyISAM;

-- 导出  视图 shao.v_m2 结构
-- 创建临时表以解决视图依赖性错误
CREATE TABLE `v_m2` (
	`c` INT(11) NULL,
	`s` BIGINT(21) NULL
) ENGINE=MyISAM;

-- 导出  触发器 shao.ins_num 结构
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `ins_num` BEFORE INSERT ON `account` FOR EACH ROW set @sum=@sum+new.amount//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- 导出  触发器 shao.testref 结构
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `testref` BEFORE INSERT ON `test1` FOR EACH ROW begin insert into text2 set a2=new.a1; delete from text3 where a3=new.a1; update text4 set b4=b4+1 where a4=new.a1; end//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- 导出  视图 shao.stu_class 结构
-- 移除临时表并创建最终视图结构
DROP TABLE IF EXISTS `stu_class`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `stu_class` AS select `s`.`name` AS `name`,`i`.`class` AS `class` from (`student` `s` join `stu_info` `i`) where (`s`.`id` = `i`.`s_id`);

-- 导出  视图 shao.stu_class2 结构
-- 移除临时表并创建最终视图结构
DROP TABLE IF EXISTS `stu_class2`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `stu_class2` AS select `stu_info`.`s_id` AS `id`,`student`.`name` AS `name`,`stu_info`.`class` AS `class` from (`student` join `stu_info`) where (`stu_info`.`s_id` = `stu_info`.`s_id`);

-- 导出  视图 shao.v_m 结构
-- 移除临时表并创建最终视图结构
DROP TABLE IF EXISTS `v_m`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_m` AS select `m`.`count` AS `count`,`m`.`price` AS `price`,(`m`.`count` * `m`.`price`) AS `sum` from `m`;

-- 导出  视图 shao.v_m2 结构
-- 移除临时表并创建最终视图结构
DROP TABLE IF EXISTS `v_m2`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_m2` AS select `m`.`count` AS `c`,(`m`.`count` * `m`.`price`) AS `s` from `m`;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
