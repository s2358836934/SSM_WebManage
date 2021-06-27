-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `rootuser`
--

DROP TABLE IF EXISTS `rootuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rootuser` (
  `user` varchar(16) NOT NULL,
  `password` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rootuser`
--

LOCK TABLES `rootuser` WRITE;
/*!40000 ALTER TABLE `rootuser` DISABLE KEYS */;
INSERT INTO `rootuser` VALUES ('root','123');
/*!40000 ALTER TABLE `rootuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_user` (
  `id` int NOT NULL,
  `userName` varchar(16) DEFAULT NULL,
  `website_num` int NOT NULL DEFAULT '0',
  `website_access_num` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` VALUES (1,'马思纯',733,556),(2,'霍建华',6,135),(3,'李现',11,886);
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_website`
--

DROP TABLE IF EXISTS `t_website`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_website` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `url` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `type_id` int DEFAULT NULL,
  `access_num` int DEFAULT NULL,
  `last_access_date` datetime NOT NULL,
  `create_date` datetime NOT NULL,
  `create_user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=232 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_website`
--

LOCK TABLES `t_website` WRITE;
/*!40000 ALTER TABLE `t_website` DISABLE KEYS */;
INSERT INTO `t_website` VALUES (2,'腾讯','tecent.com',2,521,'2021-05-08 13:42:20','2020-12-29 14:50:47',2),(3,'37网游','37.com',3,454,'2021-05-08 13:27:55','2020-12-21 15:47:53',3),(12,'网易云','12',3,5,'2021-05-08 13:26:50','2020-12-26 19:56:51',2),(13,'aaa','aaa',2,6,'2021-05-08 12:52:08','2020-12-26 19:56:51',2),(16,'dd','dd',3,3,'2020-12-26 19:56:51','2020-12-14 16:00:00',2),(17,'kl','kl',2,3,'2020-08-09 04:03:12','2020-08-09 04:03:12',3),(21,'q','q',1,3,'2020-12-26 19:56:51','2020-12-09 16:00:00',3),(23,'RR','RR',2,3,'2020-12-26 19:56:51','2020-12-30 16:00:00',1),(100,'gggg','gggg',3,0,'2020-08-09 04:03:12','2020-12-03 01:34:12',2),(123,'百度','www.baidu.com',2,0,'2020-08-09 04:03:12','2020-08-09 04:03:12',2),(231,'123','123',2,0,'2020-08-09 04:03:12','2020-12-03 01:34:12',2);
/*!40000 ALTER TABLE `t_website` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_website_type`
--

DROP TABLE IF EXISTS `t_website_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_website_type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `typeName` varchar(16) DEFAULT NULL,
  `website_num` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_website_type`
--

LOCK TABLES `t_website_type` WRITE;
/*!40000 ALTER TABLE `t_website_type` DISABLE KEYS */;
INSERT INTO `t_website_type` VALUES (1,'视频',3),(2,'新闻',3),(3,'游戏',2);
/*!40000 ALTER TABLE `t_website_type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-08 21:47:27
