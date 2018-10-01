--liquibase formatted sql

--changeset User1:2
CREATE TABLE `Student` (
  `idStudent` int(11) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Age` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idStudent`)
) ENGINE=InnoDB;

INSERT INTO `Student` VALUES (1,'Pasha','20'),(2,'John Doe','21'),(3,'Vasya','24'),(4,'Ira','22');