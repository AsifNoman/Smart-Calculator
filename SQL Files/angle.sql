-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 17, 2016 at 10:28 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 7.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `unitconversion`
--

-- --------------------------------------------------------

--
-- Table structure for table `angle`
--

CREATE TABLE `angle` (
  `Id` int(10) NOT NULL,
  `Name` varchar(1000) NOT NULL,
  `Value` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `angle`
--

INSERT INTO `angle` (`Id`, `Name`, `Value`) VALUES
(1, 'Deg to Grad', 1.11111),
(2, 'Deg to Rad', 0.0174533),
(3, 'Grad to Deg', 0.9),
(4, 'Grad to Rad', 0.015708),
(5, 'Rad to Deg', 57.2958),
(6, 'Rad to Grad', 63.662);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
