CREATE DATABASE  IF NOT EXISTS `wm` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `wm`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: wm
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `estados`
--

DROP TABLE IF EXISTS `estados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estados` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `sigla` varchar(2) NOT NULL,
  `regiao` enum('Norte','Nordeste','Centro-Oeste','Sudeste','Sul') NOT NULL,
  `populacao` decimal(5,2) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nome` (`nome`),
  UNIQUE KEY `sigla` (`sigla`)
) ENGINE=InnoDB AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estados`
--

LOCK TABLES `estados` WRITE;
/*!40000 ALTER TABLE `estados` DISABLE KEYS */;
INSERT INTO `estados` VALUES (1,'Acre','AC','Norte',0.83),(2,'Alagoas','AL','Nordeste',3.38),(3,'Amapá','AP','Norte',0.80),(4,'Amazonas','AM','Norte',4.06),(8,'Bahia','BA','Nordeste',15.34),(9,'Ceará','CE','Nordeste',9.02),(10,'Distrito Federal','DF','Centro-Oeste',3.04),(11,'Espírito Santo','ES','Sudeste',4.02),(12,'Goiás','GO','Centro-Oeste',6.78),(13,'Maranhão','MA','Nordeste',7.00),(14,'Mato Grosso','MT','Centro-Oeste',3.34),(15,'Mato Grosso do Sul','MS','Centro-Oeste',2.71),(16,'Minas Gerais','MG','Sudeste',21.12),(17,'Pará','PA','Norte',8.36),(18,'Paraíba','PB','Nordeste',4.03),(19,'Paraná','PR','Sul',11.32),(20,'Pernambuco','PE','Nordeste',9.47),(21,'Piauí','PI','Nordeste',3.22),(22,'Rio de Janeiro','RJ','Sudeste',16.72),(23,'Rio Grande do Norte','RN','Nordeste',3.51),(24,'Rio Grande do Sul','RS','Sul',11.32),(25,'Rondônia','RO','Norte',1.81),(26,'Roraima','RR','Norte',0.52),(27,'Santa Catarina','SC','Sul',7.01),(28,'São Paulo','SP','Sudeste',45.10),(29,'Sergipe','SE','Nordeste',2.29),(30,'Tocantins','TO','Norte',1.55);
/*!40000 ALTER TABLE `estados` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-18  0:38:28
