-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 16, 2019 at 06:46 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `world`
--

-- --------------------------------------------------------

--
-- Table structure for table `Student`
--

CREATE TABLE `Student` (
  `id` int(20) NOT NULL,
  `firstName` varchar(20) NOT NULL,
  `quantity` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Student`
--

INSERT INTO `Student` (`id`, `firstName`, `quantity`) VALUES
(6, 'Rin', 11),
(10, 'phojmu', 0),
(11, 'eRZKzq', 0),
(12, 'YxxXDc', 0),
(13, 'AWGdLo', 0),
(14, 'KMBVVs', 0),
(15, 'WNlfvs', 0),
(16, 'kHxTTK', 0),
(17, 'YbFKhF', 0),
(18, 'JaWsse', 0),
(19, 'CyckWr', 0),
(20, 'rmcnxQ', 0),
(21, 'FipfeI', 0),
(22, 'EMNklc', 0),
(23, 'HlWqbM', 0),
(24, 'eXmCpB', 0),
(25, 'jTOLkf', 0),
(26, 'quVdqO', 0),
(27, 'otVCXm', 0),
(28, 'cCDBOW', 0),
(29, 'ROyfpx', 0),
(30, 'eRjpgI', 6),
(31, 'kxmaOy', 8),
(32, 'cQVygQ', 2),
(33, 'RvakKK', 9),
(34, 'TBzNPN', 8),
(35, 'OuKohQ', 8),
(36, 'InfKSb', 0),
(37, 'tdhDjg', 4),
(38, 'NIAzFs', 3),
(39, 'ZegBEo', 1),
(40, 'UsZpjn', 9),
(41, 'UrIoJG', 1),
(42, 'bxjKdo', 9),
(43, 'MluFRh', 0),
(44, 'drOnFQ', 2),
(45, 'gfsRUN', 7),
(46, 'QSLSSd', 9),
(47, 'XfcTQs', 7),
(48, 'fiMKJP', 1),
(49, 'kkelpP', 1),
(50, 'ofmfxY', 6),
(51, 'pepsi', 43),
(52, 'coke', 72),
(53, 'maggie', 20),
(54, 'butter', 20),
(55, 'mobile', 27),
(56, 'hewlett packard', 9999),
(57, 'mobile', 23),
(58, 'Coke', 20),
(59, 'butter', 72),
(60, 'Nike shoes', 29),
(61, 'niWubB', 1),
(62, 'IYLoFr', 9),
(63, 'XPJmuE', 0),
(64, 'IlFLun', 5),
(65, 'dSnYra', 4),
(66, 'DALDYq', 2),
(67, 'rSTsWb', 5),
(68, 'vcxXoN', 4),
(69, 'iqByni', 3),
(70, 'GIrEBz', 4),
(71, 'tLeSTW', 1),
(72, 'AACZzX', 7),
(73, 'TXkPYo', 9);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Student`
--
ALTER TABLE `Student`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Student`
--
ALTER TABLE `Student`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=74;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
