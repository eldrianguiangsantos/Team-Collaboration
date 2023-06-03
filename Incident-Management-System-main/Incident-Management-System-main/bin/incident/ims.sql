-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 03, 2023 at 09:08 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ims`
--

-- --------------------------------------------------------

--
-- Table structure for table `accident_details`
--

CREATE TABLE `accident_details` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL,
  `typeOfAccident` text NOT NULL,
  `natureOfAccident` text NOT NULL,
  `causeOfAccident` text NOT NULL,
  `timeReported` text NOT NULL,
  `responseTime` text NOT NULL,
  `timeArrived` text NOT NULL,
  `shiftTime` text NOT NULL,
  `day` text NOT NULL,
  `plaza` text NOT NULL,
  `exactLocation` text NOT NULL,
  `locationBetweenNB` text NOT NULL,
  `locationBetweenSB` text NOT NULL,
  `laneOccupied` text NOT NULL,
  `vehicle` text NOT NULL,
  `plateNumber` text NOT NULL,
  `plateNumberdriverName` text NOT NULL,
  `driverAge` text NOT NULL,
  `driverLicenseNumber` text NOT NULL,
  `minorCasualty` text NOT NULL,
  `majorCasualty` text NOT NULL,
  `numberOfInjuries` int(11) NOT NULL,
  `numberOfFatal` int(11) NOT NULL,
  `dtpToVehicle` text NOT NULL,
  `dtpToTplex` text NOT NULL,
  `otherDetails` text NOT NULL,
  `week` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;