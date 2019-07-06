-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema cafe_management_system
--

CREATE DATABASE IF NOT EXISTS cafe_management_system;
USE cafe_management_system;

--
-- Definition of table `daily_sale`
--

DROP TABLE IF EXISTS `daily_sale`;
CREATE TABLE `daily_sale` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `reference` varchar(45) NOT NULL,
  `cost_meals` varchar(45) NOT NULL,
  `cost_drinks` varchar(45) NOT NULL,
  `s_charge` varchar(45) NOT NULL,
  `tax` varchar(45) NOT NULL,
  `amount` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daily_sale`
--

/*!40000 ALTER TABLE `daily_sale` DISABLE KEYS */;
INSERT INTO `daily_sale` (`id`,`reference`,`cost_meals`,`cost_drinks`,`s_charge`,`tax`,`amount`,`date`) VALUES 
 (1,'4368','200','50','25.0','37.5','312.5','03-07-2019'),
 (2,'4368','100','70','','','','03-07-2019'),
 (3,'3811','150','140','29.0','43.5','362.5','04-35-2019'),
 (4,'3811','150','140','29.0','43.5','362.5','04-35-2019'),
 (5,'3811','150','140','29.0','43.5','362.5','04-35-2019'),
 (6,'3811','150','75','22.5','33.75','281.25','04-35-2019'),
 (7,'2425','210','90','30.0','45.0','375.0','04-41-2019'),
 (8,'2425','300','50','35.0','52.5','437.5','04-41-2019'),
 (9,'3482','','','','','','04-29-2019'),
 (10,'4988','200','60','26.0','39.0','325.0','04-31-2019'),
 (11,'2685','','','','','','04-49-2019'),
 (12,'2461','','','','','','04-41-2019'),
 (13,'2072','350','125','47.5','71.25','593.75','04-17-2019'),
 (14,'4267','200','50','25.0','37.5','312.5','04-58-2019'),
 (15,'5100','','','','','','04-00-2019'),
 (16,'1556','','','','','','04-02-2019'),
 (17,'5305','','','','','','04-04-2019'),
 (18,'2539','140','50','19.0','28.5','237.5','04-08-2019'),
 (19,'1325','200','50','25.0','37.5','312.5','04-10-2019'),
 (20,'2555','350','50','40.0','60.0','500.0','04-18-2019'),
 (21,'3256','200','60','26.0','39.0','325.0','10-12-2019'),
 (22,'3640','600','175','77.5','116.25','968.75','10-02-2019'),
 (23,'3767','','','','','','10-02-2019'),
 (24,'3250','140','120','26.0','39.0','325.0','13-02-2019');
/*!40000 ALTER TABLE `daily_sale` ENABLE KEYS */;


--
-- Definition of table `drinks`
--

DROP TABLE IF EXISTS `drinks`;
CREATE TABLE `drinks` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `item` varchar(45) NOT NULL,
  `price` varchar(45) NOT NULL,
  `total` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `drinks`
--

/*!40000 ALTER TABLE `drinks` DISABLE KEYS */;
INSERT INTO `drinks` (`id`,`item`,`price`,`total`) VALUES 
 (1,'Cola','30','120'),
 (2,'7 Up','25','50'),
 (3,'Pepsi','35','175'),
 (4,'RC Cola','20','40'),
 (5,'speed','30','');
/*!40000 ALTER TABLE `drinks` ENABLE KEYS */;


--
-- Definition of table `meals`
--

DROP TABLE IF EXISTS `meals`;
CREATE TABLE `meals` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `item` varchar(45) NOT NULL,
  `price` varchar(45) NOT NULL,
  `total` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `meals`
--

/*!40000 ALTER TABLE `meals` DISABLE KEYS */;
INSERT INTO `meals` (`id`,`item`,`price`,`total`) VALUES 
 (1,'Burger','100','200'),
 (2,'Pitza','150','600'),
 (3,'Roll','50','100'),
 (4,'Chiken','70','140'),
 (6,'Noodls','50','100'),
 (7,'nuget','25','');
/*!40000 ALTER TABLE `meals` ENABLE KEYS */;


--
-- Definition of table `user_admin`
--

DROP TABLE IF EXISTS `user_admin`;
CREATE TABLE `user_admin` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `uname` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_admin`
--

/*!40000 ALTER TABLE `user_admin` DISABLE KEYS */;
INSERT INTO `user_admin` (`id`,`uname`,`pass`) VALUES 
 (1,'admin','123'),
 (2,'arif','123');
/*!40000 ALTER TABLE `user_admin` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
