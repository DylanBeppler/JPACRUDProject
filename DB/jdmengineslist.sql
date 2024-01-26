-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema JDM_Engines
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `JDM_Engines` ;

-- -----------------------------------------------------
-- Schema JDM_Engines
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `JDM_Engines` ;
USE `JDM_Engines` ;

-- -----------------------------------------------------
-- Table `jdm_engines`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `jdm_engines` ;

CREATE TABLE IF NOT EXISTS `jdm_engines` (
  `id` INT(10) NOT NULL AUTO_INCREMENT,
  `engine_code` VARCHAR(45) NOT NULL,
  `size` INT NOT NULL,
  `number_cylinders` INT NOT NULL,
  `power` VARCHAR(45) NULL,
  `unit_of_power` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS badluckclub@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'badluckclub'@'localhost' IDENTIFIED BY 'badluckclub';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'badluckclub'@'localhost';
GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'badluckclub'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `jdm_engines`
-- -----------------------------------------------------
START TRANSACTION;
USE `JDM_Engines`;
INSERT INTO `jdm_engines` (`id`, `engine_code`, `size`, `number_cylinders`, `power`, `unit_of_power`) VALUES (1, 'ca18det', 1.8, 4, '175', 'hp');
INSERT INTO `jdm_engines` (`id`, `engine_code`, `size`, `number_cylinders`, `power`, `unit_of_power`) VALUES (2, 'sr20det', 2.0, 4, '205', 'hp');
INSERT INTO `jdm_engines` (`id`, `engine_code`, `size`, `number_cylinders`, `power`, `unit_of_power`) VALUES (3, 'rb20det', 2.0, 6, '215', 'ps');
INSERT INTO `jdm_engines` (`id`, `engine_code`, `size`, `number_cylinders`, `power`, `unit_of_power`) VALUES (4, 'rb25det', 2.5, 6, '250', 'hp');
INSERT INTO `jdm_engines` (`id`, `engine_code`, `size`, `number_cylinders`, `power`, `unit_of_power`) VALUES (5, 'rb26det', 2.6, 6, '276', 'hp');
INSERT INTO `jdm_engines` (`id`, `engine_code`, `size`, `number_cylinders`, `power`, `unit_of_power`) VALUES (6, '1jzgte', 2.5, 6, '280', 'ps');
INSERT INTO `jdm_engines` (`id`, `engine_code`, `size`, `number_cylinders`, `power`, `unit_of_power`) VALUES (7, '2jzgte', 3.0, 6, '320', 'hp');
INSERT INTO `jdm_engines` (`id`, `engine_code`, `size`, `number_cylinders`, `power`, `unit_of_power`) VALUES (8, '3sgte', 2.0, 4, '182', 'hp');
INSERT INTO `jdm_engines` (`id`, `engine_code`, `size`, `number_cylinders`, `power`, `unit_of_power`) VALUES (9, '4age', 1.6, 4, '120', 'hp');

COMMIT;

