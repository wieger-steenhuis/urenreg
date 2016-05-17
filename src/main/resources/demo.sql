-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Machine: 127.0.0.1
-- Gegenereerd op: 17 mei 2016 om 14:11
-- Serverversie: 5.6.17
-- PHP-versie: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Databank: `demo`
--
CREATE DATABASE IF NOT EXISTS `demo` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `demo`;

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(200) DEFAULT NULL,
  `last_name` varchar(200) DEFAULT NULL,
  `phone_nr` varchar(200) DEFAULT NULL,
  `e_mail` varchar(200) DEFAULT NULL,
  `pin` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Gegevens worden geëxporteerd voor tabel `customer`
--

INSERT INTO `customer` (`id`, `first_name`, `last_name`, `phone_nr`, `e_mail`, `pin`) VALUES
(5, 'mark', 'UDR13', '0625548221', 'udr13@gmail.com', '1111'),
(6, 'Sjoerd', 'de Jong', '068877112', 'jannekeuytewaal@gmail.com', '77777'),
(7, 'Felix', 'van Loenen', '06-11238652', 'felix@digitaleservice.com', '88751'),
(8, 'Wieger', 'Steenhuis', '', 'wsteenhuis@gmail.com', ''),
(9, 'Leandro', 'D''agostino', '651', 'a@b.c', '12358'),
(10, 'Larisa', 'uit Oekraine', '069985742', 'larisa@programit.eu', '8888'),
(11, 'Ger', 'Erades', '06-5246352', 'ger@programit.nl', '11111'),
(13, 'Aaron', 'vd Akker', '', 'aaron@gmail.com', ''),
(14, 'Arno', 'C#', '', 'a.mijsberg@upcmail.nl', ''),
(15, 'Baddi', 'Hamidi', '', '', '00000'),
(16, 'Martijn', 'Gabriels', '', 'mg@yahoo.com', ''),
(17, 'Mayta', 'Braun', '', '', '');

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `records`
--

CREATE TABLE IF NOT EXISTS `records` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `album` varchar(1000) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `artist` char(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `date_of_release` date DEFAULT NULL,
  `label` varchar(250) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `price` double(6,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Gegevens worden geëxporteerd voor tabel `records`
--

INSERT INTO `records` (`id`, `album`, `artist`, `date_of_release`, `label`, `price`) VALUES
(1, 'kjsfnm', 'henk', '2016-04-05', 'lskdfm', 13.35),
(2, 'ghjnkm,', 'ghjbknm', '2016-04-12', 'fghjnkm', 12.30),
(3, 'troep', 'suzn', '2016-04-08', 'recordcompan y', 20.00);

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `session`
--

CREATE TABLE IF NOT EXISTS `session` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subscription_id` int(11) NOT NULL,
  `date` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `subscription_id` (`subscription_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=85 ;

--
-- Gegevens worden geëxporteerd voor tabel `session`
--

INSERT INTO `session` (`id`, `subscription_id`, `date`) VALUES
(1, 42, NULL),
(2, 42, NULL),
(3, 42, NULL),
(4, 42, NULL),
(5, 42, NULL),
(6, 42, NULL),
(7, 42, NULL),
(8, 42, NULL),
(9, 42, NULL),
(10, 42, NULL),
(11, 42, NULL),
(12, 42, NULL),
(13, 42, NULL),
(14, 42, NULL),
(15, 42, NULL),
(16, 42, NULL),
(17, 42, NULL),
(18, 42, NULL),
(19, 42, NULL),
(20, 42, NULL),
(21, 42, NULL),
(22, 42, NULL),
(23, 42, NULL),
(24, 42, NULL),
(25, 43, NULL),
(26, 43, NULL),
(27, 43, NULL),
(28, 43, NULL),
(29, 43, NULL),
(30, 43, NULL),
(31, 43, NULL),
(32, 43, NULL),
(33, 43, NULL),
(34, 43, NULL),
(35, 43, NULL),
(36, 43, NULL),
(37, 43, NULL),
(38, 43, NULL),
(39, 43, NULL),
(40, 43, NULL),
(41, 43, NULL),
(42, 43, NULL),
(43, 43, NULL),
(44, 43, NULL),
(45, 43, NULL),
(46, 43, NULL),
(47, 43, NULL),
(48, 43, NULL),
(49, 44, NULL),
(50, 44, NULL),
(51, 44, NULL),
(52, 44, NULL),
(53, 44, NULL),
(54, 44, NULL),
(55, 44, NULL),
(56, 44, NULL),
(57, 44, NULL),
(58, 44, NULL),
(59, 44, NULL),
(60, 44, NULL),
(61, 44, NULL),
(62, 44, NULL),
(63, 44, NULL),
(64, 44, NULL),
(65, 44, NULL),
(66, 44, NULL),
(67, 44, NULL),
(68, 44, NULL),
(69, 44, NULL),
(70, 44, NULL),
(71, 44, NULL),
(72, 44, NULL),
(73, 45, NULL),
(74, 45, NULL),
(75, 45, NULL),
(76, 45, NULL),
(77, 45, NULL),
(78, 45, NULL),
(79, 45, NULL),
(80, 45, NULL),
(81, 45, NULL),
(82, 45, NULL),
(83, 45, NULL),
(84, 45, NULL);

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `subscription`
--

CREATE TABLE IF NOT EXISTS `subscription` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) NOT NULL,
  `trainer_id` int(11) DEFAULT NULL,
  `subscr_type` varchar(200) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cust_id` (`customer_id`),
  KEY `trainer_id` (`trainer_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=46 ;

--
-- Gegevens worden geëxporteerd voor tabel `subscription`
--

INSERT INTO `subscription` (`id`, `customer_id`, `trainer_id`, `subscr_type`, `start_date`) VALUES
(1, 5, 4, 'TWELVE', '2003-05-11'),
(24, 13, 9, 'TWELVE', '2016-05-20'),
(26, 13, 2, 'TWENTYFOUR', '2016-05-10'),
(27, 13, 1, 'TWELVE', '2016-05-01'),
(28, 13, 1, 'TWELVE', '2016-05-11'),
(29, 13, 4, 'TWENTYFOUR', '2016-05-11'),
(30, 14, 1, 'TWELVE', '2016-05-10'),
(31, 13, 8, 'TWENTYFOUR', '2016-05-18'),
(32, 8, 2, 'TWENTYFOUR', '2016-05-01'),
(33, 15, 1, 'TWENTYFOUR', '2016-05-11'),
(34, 16, 1, 'TWELVE', '2016-05-12'),
(35, 16, 7, 'TWENTYFOUR', '2016-05-17'),
(36, 13, 1, 'TWENTYFOUR', '2016-05-25'),
(37, 13, 1, 'TWENTYFOUR', '2016-05-25'),
(38, 13, 1, 'TWENTYFOUR', '2016-05-19'),
(39, 14, 5, 'TWELVE', '2016-05-11'),
(40, 14, 1, 'TWENTYFOUR', '2016-05-10'),
(41, 15, 2, 'TWENTYFOUR', '2016-05-12'),
(42, 11, 1, 'TWENTYFOUR', '2016-05-12'),
(43, 11, 1, 'TWENTYFOUR', '2016-05-05'),
(44, 17, 6, 'TWENTYFOUR', '2016-05-11'),
(45, 15, 1, 'TWELVE', '2016-05-17');

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `trainer`
--

CREATE TABLE IF NOT EXISTS `trainer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(200) DEFAULT NULL,
  `last_name` varchar(200) DEFAULT NULL,
  `phone_nr` varchar(200) DEFAULT NULL,
  `e_mail` varchar(200) DEFAULT NULL,
  `pass_word` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Gegevens worden geëxporteerd voor tabel `trainer`
--

INSERT INTO `trainer` (`id`, `first_name`, `last_name`, `phone_nr`, `e_mail`, `pass_word`) VALUES
(1, 'Tessa', 'van Tuijl', '06222551', 'tessa@sx.nl', NULL),
(2, 'erwin', 'van Erp', '06111145', 'erwin@sx.nl', NULL),
(3, 'Judith', 'van SX', '06 - 25546518', 'judithvansx@sx.co.eu', NULL),
(4, 'Henk', 'den Treenert', '06-12635265', 'h.dentreenert@sx.co.uk', NULL),
(5, 'Hendigen', 'Harry', '06-13235421', 'hendigen.h@sxsports.com', NULL),
(6, 'Gerard', '', '', 'gerard@sx.com', NULL),
(7, 'richard', 'vd merrienboer', '06 - 999999', 'richyrich@merrienboer.brab', NULL),
(8, 'alex', '4', '040 - 2114587', 'alex4you@hotmail.com', NULL),
(9, 'Wessel', 'de rugby-er', '065316512', 'wessel@scrum-it.org.co.uk', NULL),
(10, 'Louis ', 'van Gaal', '', '', NULL);

--
-- Beperkingen voor geëxporteerde tabellen
--

--
-- Beperkingen voor tabel `session`
--
ALTER TABLE `session`
  ADD CONSTRAINT `session_ibfk_1` FOREIGN KEY (`subscription_id`) REFERENCES `subscription` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Beperkingen voor tabel `subscription`
--
ALTER TABLE `subscription`
  ADD CONSTRAINT `subscription_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `subscription_ibfk_2` FOREIGN KEY (`trainer_id`) REFERENCES `trainer` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
