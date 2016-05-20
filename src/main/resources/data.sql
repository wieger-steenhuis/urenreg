DROP SCHEMA IF EXISTS `data`;
CREATE SCHEMA  IF NOT EXISTS `data` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `data`;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;


CREATE TABLE IF NOT EXISTS `trainer` (
  `id`         INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(200)     DEFAULT NULL,
  `last_name`  VARCHAR(200)     DEFAULT NULL,
  `phone_nr`   VARCHAR(200)     DEFAULT NULL,
  `e_mail`     VARCHAR(200)     DEFAULT NULL,
  `pass_word`  VARCHAR(200)     DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1
  AUTO_INCREMENT = 11;

INSERT INTO `trainer` (`id`, `first_name`, `last_name`, `phone_nr`, `e_mail`, `pass_word`) VALUES
  (1, 'Tessa', 'van Tuijl', '06222551', 'tessa@sx.nl', NULL),
  (2, 'erwin', 'van Erp', '06111145', 'erwin@sx.nl', NULL),
  (3, 'Judith', 'van SX', '06 - 25546518', 'judithvansx@sx.co.eu', NULL),
  (4, 'Henk', 'den Treenert', '06-12635265', 'h.dentreenert@sx.co.uk', NULL),
  (5, 'Hendigen', 'Harry', '06-13235421', 'hendigen.h@sxsports.com', NULL);

CREATE TABLE IF NOT EXISTS `customer` (
  `id`         INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(200)     DEFAULT NULL,
  `last_name`  VARCHAR(200)     DEFAULT NULL,
  `phone_nr`   VARCHAR(200)     DEFAULT NULL,
  `e_mail`     VARCHAR(200)     DEFAULT NULL,
  `pin`        VARCHAR(200)     DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1
  AUTO_INCREMENT = 18;

INSERT INTO `customer` (`id`, `first_name`, `last_name`, `phone_nr`, `e_mail`, `pin`) VALUES
  (1, 'mark', 'UDR13', '0625548221', 'udr13@gmail.com', '1111'),
  (2, 'Sjoerd', 'de Jong', '068877112', 'jannekeuytewaal@gmail.com', '77777'),
  (3, 'Felix', 'van Loenen', '06-11238652', 'felix@digitaleservice.com', '88751'),
  (4, 'Wieger', 'Steenhuis', '', 'wsteenhuis@gmail.com', ''),
  (5, 'Leandro', 'D''agostino', '651', 'a@b.c', '12358'),
  (6, 'Larisa', '', '069985742', 'larisa@programit.eu', '8888'),
  (7, 'Ger', 'Erades', '06-5246352', 'ger@programit.nl', '11111'),
  (8, 'Aaron', 'vd Akker', '', 'aaron@gmail.com', '');

CREATE TABLE IF NOT EXISTS `subscription` (
  `id`          INT(11) NOT NULL AUTO_INCREMENT,
  `customer_id` INT(11) NOT NULL,
  `trainer_id`  INT(11)          DEFAULT NULL,
  `subscr_type` VARCHAR(200)     DEFAULT NULL,
  `start_date`  DATE             DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cust_id` (`customer_id`),
  KEY `trainer_id` (`trainer_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1
  AUTO_INCREMENT = 48;

INSERT INTO `subscription` (`id`, `customer_id`, `trainer_id`, `subscr_type`, `start_date`) VALUES
  (1, 5, 4, 'TWELVE', '2016-05-05');

CREATE TABLE IF NOT EXISTS `session` (
  `id`              INT(11) NOT NULL AUTO_INCREMENT,
  `subscription_id` INT(11) NOT NULL,
  `date`            VARCHAR(200)     DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `subscription_id` (`subscription_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1
  AUTO_INCREMENT = 109;

INSERT INTO `session` (`id`, `subscription_id`, `date`) VALUES
  (1, 1, NULL),
  (2, 1, NULL),
  (3, 1, NULL),
  (4, 1, NULL),
  (5, 1, NULL),
  (6, 1, NULL),
  (7, 1, NULL),
  (8, 1, NULL),
  (9, 1, NULL),
  (10, 1, NULL),
  (11, 1, NULL),
  (12, 1, NULL);

ALTER TABLE `session`
  ADD CONSTRAINT `session_ibfk_1` FOREIGN KEY (`subscription_id`) REFERENCES `subscription` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `subscription`
  ADD CONSTRAINT `subscription_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `subscription_ibfk_2` FOREIGN KEY (`trainer_id`) REFERENCES `trainer` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
