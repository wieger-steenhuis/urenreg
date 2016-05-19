SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;


CREATE TABLE IF NOT EXISTS `customer` (
  `id`         INT(11) NOT NULL AUTO_INCREMENT,
  `e_mail`     VARCHAR(255)     DEFAULT NULL,
  `first_name` VARCHAR(255)     DEFAULT NULL,
  `last_name`  VARCHAR(255)     DEFAULT NULL,
  `phone_nr`   VARCHAR(255)     DEFAULT NULL,
  `pin`        VARCHAR(255)     DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1
  AUTO_INCREMENT = 9;

TRUNCATE TABLE `customer`;
INSERT INTO `customer` (`id`, `e_mail`, `first_name`, `last_name`, `phone_nr`, `pin`) VALUES
  (1, 'udr13@gmail.com', 'mark', 'UDR13', '0625548221', '1111'),
  (2, 'jannekeuytewaal@gmail.com', 'Sjoerd', 'de Jong', '068877112', '77777'),
  (3, 'felix@digitaleservice.com', 'Felix', 'van Loenen', '06-11238652', '88751'),
  (4, 'wsteenhuis@gmail.com', 'Wieger', 'Steenhuis', '', ''),
  (5, 'a@b.c', 'Leandro', 'D''agostino', '651', '12358'),
  (6, 'larisa@programit.eu', 'Larisa', '', '069985742', '8888'),
  (7, 'ger@programit.nl', 'Ger', 'Erades', '06-5246352', '11111'),
  (8, 'aaron@gmail.com', 'Aaron', 'vd Akker', '', '');


CREATE TABLE IF NOT EXISTS `trainer` (
  `id`         INT(11) NOT NULL AUTO_INCREMENT,
  `e_mail`     VARCHAR(255)     DEFAULT NULL,
  `first_name` VARCHAR(255)     DEFAULT NULL,
  `last_name`  VARCHAR(255)     DEFAULT NULL,
  `pass_word`  VARCHAR(255)     DEFAULT NULL,
  `phone_nr`   VARCHAR(255)     DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1
  AUTO_INCREMENT = 6;

TRUNCATE TABLE `trainer`;
INSERT INTO `trainer` (`id`, `e_mail`, `first_name`, `last_name`, `pass_word`, `phone_nr`) VALUES
  (1, 'tessa@sx.nl', 'Tessa', 'van Tuijl', NULL, '06222551'),
  (2, 'erwin@sx.nl', 'erwin', 'van Erp', NULL, '06111145'),
  (3, 'judithvansx@sx.co.eu', 'Judith', 'van SX', NULL, '06 - 25546518'),
  (4, 'h.dentreenert@sx.co.uk', 'Henk', 'den Treenert', NULL, '06-12635265'),
  (5, 'hendigen.h@sxsports.com', 'Hendigen', 'Harry', NULL, '06-13235421');

CREATE TABLE IF NOT EXISTS `subscription` (
  `id`          INT(11) NOT NULL AUTO_INCREMENT,
  `start_date`  VARCHAR(255)     DEFAULT NULL,
  `subscr_type` VARCHAR(255)     DEFAULT NULL,
  `customer_id` INT(11)          DEFAULT NULL,
  `trainer_id`  INT(11)          DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `subscription_ibfk_1` (`customer_id`),
  KEY `subscription_ibfk_2` (`trainer_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1
  AUTO_INCREMENT = 6;

TRUNCATE TABLE `subscription`;
INSERT INTO `subscription` (`id`, `start_date`, `subscr_type`, `customer_id`, `trainer_id`) VALUES
  (1, '2016-05-05', 'TWELVE', 5, 4);

CREATE TABLE IF NOT EXISTS `session` (
  `id`              INT(11) NOT NULL AUTO_INCREMENT,
  `date`            VARCHAR(255)     DEFAULT NULL,
  `subscription_id` INT(11)          DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `session_ibfk_1` (`subscription_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = latin1
  AUTO_INCREMENT = 97;

TRUNCATE TABLE `session`;
INSERT INTO `session` (`id`, `date`, `subscription_id`) VALUES
  (1, NULL, 1),
  (2, NULL, 1),
  (3, NULL, 1),
  (4, NULL, 1),
  (5, NULL, 1),
  (6, NULL, 1),
  (7, NULL, 1),
  (8, NULL, 1),
  (9, NULL, 1),
  (10, NULL, 1),
  (11, NULL, 1),
  (12, NULL, 1);

ALTER TABLE `session`
  ADD CONSTRAINT `session_ibfk_1` FOREIGN KEY (`subscription_id`) REFERENCES `subscription` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_jv7dc9msf41obyr459ww5x546` FOREIGN KEY (`subscription_id`) REFERENCES `subscription` (`id`);

ALTER TABLE `subscription`
  ADD CONSTRAINT `subscription_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `subscription_ibfk_2` FOREIGN KEY (`trainer_id`) REFERENCES `trainer` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_25s692po480f2ggj5gkgks5rn` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `FK_psqlv5oqjd22exegd8rp9idhr` FOREIGN KEY (`trainer_id`) REFERENCES `trainer` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
