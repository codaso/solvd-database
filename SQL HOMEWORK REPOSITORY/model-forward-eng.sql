-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema olympic_games_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema olympic_games_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `olympic_games_db` DEFAULT CHARACTER SET utf8mb3 ;
USE `olympic_games_db` ;

-- -----------------------------------------------------
-- Table `olympic_games_db`.`country`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `olympic_games_db`.`country` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 26
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `olympic_games_db`.`stats`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `olympic_games_db`.`stats` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `gender` VARCHAR(10) NULL,
  `birthdate` DATE NULL,
  `height` DOUBLE NULL,
  `weight` DOUBLE NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `olympic_games_db`.`player`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `olympic_games_db`.`player` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NOT NULL,
  `lastname` VARCHAR(20) NOT NULL,
  `stats_id` INT NULL DEFAULT NULL,
  `country_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_player_stats1_idx` (`stats_id` ASC) VISIBLE,
  INDEX `fk_player_country1_idx` (`country_id` ASC) VISIBLE,
  CONSTRAINT `fk_player_stats1`
    FOREIGN KEY (`stats_id`)
    REFERENCES `olympic_games_db`.`stats` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_player_country1`
    FOREIGN KEY (`country_id`)
    REFERENCES `olympic_games_db`.`country` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 44
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `olympic_games_db`.`sport_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `olympic_games_db`.`sport_type` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `season` VARCHAR(10) NULL DEFAULT 'summer',
  `is_single_player` TINYINT NULL DEFAULT 0,
  `female_only` TINYINT NULL DEFAULT 0,
  `mix_genders` TINYINT NULL DEFAULT 0,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `olympic_games_db`.`sport`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `olympic_games_db`.`sport` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(25) NOT NULL,
  `sport_type_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_sport_sport_type1_idx` (`sport_type_id` ASC) VISIBLE,
  CONSTRAINT `fk_sport_sport_type1`
    FOREIGN KEY (`sport_type_id`)
    REFERENCES `olympic_games_db`.`sport_type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 26
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `olympic_games_db`.`city`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `olympic_games_db`.`city` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `country_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_city_country1_idx` (`country_id` ASC) VISIBLE,
  CONSTRAINT `fk_city_country1`
    FOREIGN KEY (`country_id`)
    REFERENCES `olympic_games_db`.`country` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `olympic_games_db`.`game`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `olympic_games_db`.`game` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `sport_id` INT NULL DEFAULT NULL,
  `game_code` FLOAT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_game_sport1_idx` (`sport_id` ASC) VISIBLE,
  CONSTRAINT `fk_game_sport1`
    FOREIGN KEY (`sport_id`)
    REFERENCES `olympic_games_db`.`sport` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `olympic_games_db`.`stadium`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `olympic_games_db`.`stadium` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `total_players` INT NULL,
  `city_id` INT NULL DEFAULT NULL,
  `game_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_stadium_city1_idx` (`city_id` ASC) VISIBLE,
  INDEX `fk_stadium_game1_idx` (`game_id` ASC) VISIBLE,
  CONSTRAINT `fk_stadium_city1`
    FOREIGN KEY (`city_id`)
    REFERENCES `olympic_games_db`.`city` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_stadium_game1`
    FOREIGN KEY (`game_id`)
    REFERENCES `olympic_games_db`.`game` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `olympic_games_db`.`game_service`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `olympic_games_db`.`game_service` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `game_code` FLOAT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `olympic_games_db`.`orders_game`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `olympic_games_db`.`orders_game` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `record_time` VARCHAR(15) NULL,
  `placement` INT NULL,
  `result` VARCHAR(5) NULL,
  `game_id` INT NULL DEFAULT NULL,
  `game_service_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_orders_game_game1_idx` (`game_id` ASC) VISIBLE,
  INDEX `fk_orders_game_game_service1_idx` (`game_service_id` ASC) VISIBLE,
  CONSTRAINT `fk_orders_game_game1`
    FOREIGN KEY (`game_id`)
    REFERENCES `olympic_games_db`.`game` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_orders_game_game_service1`
    FOREIGN KEY (`game_service_id`)
    REFERENCES `olympic_games_db`.`game_service` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `olympic_games_db`.`medals`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `olympic_games_db`.`medals` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `player_id` INT NULL DEFAULT NULL,
  `gold` INT NULL DEFAULT 0,
  `silver` INT NULL DEFAULT 0,
  `bronze` INT NULL DEFAULT 0,
  `total_points` INT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  INDEX `fk_medals_player1_idx` (`player_id` ASC) VISIBLE,
  CONSTRAINT `fk_medals_player1`
    FOREIGN KEY (`player_id`)
    REFERENCES `olympic_games_db`.`player` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `olympic_games_db`.`player_has_game`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `olympic_games_db`.`player_has_game` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `player_id` INT NOT NULL,
  `game_id` INT NOT NULL,
  PRIMARY KEY (`id`, `player_id`, `game_id`),
  INDEX `fk_player_has_game_game1_idx` (`game_id` ASC) VISIBLE,
  INDEX `fk_player_has_game_player1_idx` (`player_id` ASC) VISIBLE,
  CONSTRAINT `fk_player_has_game_player1`
    FOREIGN KEY (`player_id`)
    REFERENCES `olympic_games_db`.`player` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_player_has_game_game1`
    FOREIGN KEY (`game_id`)
    REFERENCES `olympic_games_db`.`game` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
