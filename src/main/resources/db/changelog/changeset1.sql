--liquibase formatted sql

--changeset User1:1
CREATE TABLE `Class` (
  `idClass` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idClass`)
) ENGINE=InnoDB;

INSERT INTO `Class` VALUES (1,'Programing'),(2,'History'),(3,'Math');