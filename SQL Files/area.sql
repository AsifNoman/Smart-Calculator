-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 17, 2016 at 10:14 PM
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
-- Table structure for table `area`
--

CREATE TABLE `area` (
  `Id` int(4) NOT NULL,
  `Name` varchar(1000) NOT NULL,
  `Value` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `area`
--

INSERT INTO `area` (`Id`, `Name`, `Value`) VALUES
(1, 'Acre to hectre', 0.404686),
(2, 'Acre to square_cent', 40468600),
(3, 'Acre to square_feet', 43560),
(4, 'Acre to square_inch', 6272640),
(5, 'Hect to Acres', 2.47105),
(6, 'Hect to Square_cent', 100000000),
(7, 'Hect to Square_feet', 107639),
(8, 'Hect to Square inch', 15500000),
(9, 'Square_cent to Acres\r\n', 2.47105),
(10, 'Square_cent to Hect', 0.00000001),
(11, 'Square_cent to Square feet', 0.00107639),
(12, 'Square_cent to Square inch', 0.155),
(13, 'Square feet to Acres', 2.29568),
(14, 'Square feet to Hect', 0.0000092903),
(15, 'Square feet to Square Cent', 929.03),
(16, 'Square feet to Square inch', 144);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
