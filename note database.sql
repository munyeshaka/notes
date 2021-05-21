-- phpMyAdmin SQL Dump
-- version 3.4.10.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 21, 2021 at 11:40 AM
-- Server version: 5.5.20
-- PHP Version: 5.3.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `note`
--

-- --------------------------------------------------------

--
-- Table structure for table `notes`
--

CREATE TABLE IF NOT EXISTS `notes` (
  `id_note` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `date_note` date DEFAULT NULL,
  `txtfoto` mediumtext NOT NULL,
  `user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_note`),
  KEY `fk_user` (`user`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `notes`
--

INSERT INTO `notes` (`id_note`, `title`, `date_note`, `txtfoto`, `user`) VALUES
(1, 'Yesu araganje', '2021-05-10', 'Yesu araganje\nYesu araganje\nYesu araganje', 15),
(2, 'Yesu araganje kandi', '2021-05-11', 'Yesu araganje kandi\nYesu arahambaye kandi\nYesu arakomakomeye kandi', 15),
(3, 'Aimable', '2021-05-10', 'Umusore MUNYESHAKA', 1),
(4, 'asdfgnm', '2021-05-07', 'aaaaaaaaaaaaaaa\r\nbbbbbbbbbbbbbbbbbbbb\r\ncccccccccccccccccccccccccc\r\nddddddddddddddddddddddddddd\r\neeeeeeeeeeeeeeeeeeeeeeeeeeeee', 16),
(5, 'zamda', '2021-05-10', 'zamda kwa Vanilla', 15),
(6, 'Genda', '2021-05-11', 'Genda ubeho ndabivuze genda ubeho', 1),
(7, 'Yesu araganje kandi', '2021-05-10', 'Yesu nuwambere kandi \nYesu ni number one\n\nukwo yarari ejo nunomusi nikwari nikwazokwama\nibihe bidashira', 1),
(12, 'Hello', '2021-05-11', 'Hello biu', 17),
(13, 'hewe', '2021-05-11', 'hewe', 17),
(14, 'aa', '2021-05-11', 'aaaa', 15),
(15, 'hellooooooooo', '2021-05-21', 'hey halooooo', 9);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`) VALUES
(1, 'Aimable', '157'),
(2, 'Aimable', '157'),
(3, 'Beni', '162'),
(4, 'Alain', '160'),
(5, 'Jean', '123'),
(6, 'Pierre', '111'),
(7, 'Elodie', '222'),
(8, 'Divine', '80'),
(9, 'Datus', '120'),
(10, 'Beracca', '214'),
(11, 'Divine', '8080'),
(12, 'Ange', '123'),
(13, 'Manisha', '123'),
(14, 'Mani', '123'),
(15, 'Mimi', '27'),
(16, 'Innocent', '123'),
(17, 'abc', '111');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `notes`
--
ALTER TABLE `notes`
  ADD CONSTRAINT `fk_user` FOREIGN KEY (`user`) REFERENCES `user` (`id_user`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
