--liquibase formatted sql

--changeset User1:3
CREATE TABLE `student_classes` (
  `idStudent` int(11) NOT NULL,
  `idClass` int(11) NOT NULL,
  PRIMARY KEY (`idStudent`,`idClass`),
  KEY `fk_student_classes_2_idx` (`idClass`),
  CONSTRAINT `fk_student_classes_1` FOREIGN KEY (`idStudent`) REFERENCES `Student` (`idStudent`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_classes_2` FOREIGN KEY (`idClass`) REFERENCES `Class` (`idClass`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB;

INSERT INTO `student_classes` VALUES (1,1),(2,1),(3,1),(4,1),(3,2),(4,2),(2,3),(3,3);