-- phpMyAdmin SQL Dump
-- version 5.1.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Mar 02, 2023 at 04:16 PM
-- Server version: 5.7.24
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `food`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(15);

-- --------------------------------------------------------

--
-- Table structure for table `object_food`
--

CREATE TABLE `object_food` (
  `id` int(20) NOT NULL,
  `category` int(11) NOT NULL,
  `compound` varchar(255) DEFAULT NULL,
  `description` text,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `weight` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `object_food`
--

INSERT INTO `object_food` (`id`, `category`, `compound`, `description`, `image`, `name`, `price`, `weight`) VALUES
(5, 1, 'мука, молоко, яйцо куриное, масло растительное, сахар, сода, соль.', 'Румяные, солнечные блины станут украшением любого праздничного стола, а также непременно порадуют всю Вашу семью в обычный день. Лучшие ингредиенты, безупречное приготовление и великолепный вкус! Дополнительно к блинам можно заказать сладкие и сытные добавки. Блины от Jack\'s — идеальные блины для любого застолья.', 'r1.jpg', 'Блины без начинки «Масленичные стопочки»', 2690, 3000),
(12, 1, 'блинчики, грибы шампиньоны, сыр Пармезан, сливки, лук репчатый, сыр Чечил, укроп, специи.', 'Фантастически вкусные элегантные блинные мешочки с нежным жюльеном из грибов.', 'r2.jpg', 'Блинные мешочки «Ни хрена себе» с жюльеном из грибов 15/26 шт.', 1490, 825),
(13, 1, '', 'Ассорти «блинных мешочков»: (1) с жюльеном из грибов с пармезаном (5 шт.); (2) с жюльеном из индейки (5 шт.); (3) с жюльеном из говяжьего языка (5 шт.) и «блинных улиток» (4) с начинкой из сёмги с творожным сыром, яйцом, майонезом и укропом (6 шт.)', 'r3.jpg', '«Блинные закуски» ассорти 21/31 шт.', 1490, 825),
(14, 1, 'говядина, мука, молоко, масло растительное, яйцо куриное, масло сливочное, лук репчатый, сливки, сметана, специи, петрушка.', 'Блинчики с начинкой из говяжьего фарша с луком и зеленью. Подаются со сметаной.', 'r4.jpg', 'Блины с говяжьим фаршем «МитБлинс» 10/30 шт.', 1490, 360);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `object_food`
--
ALTER TABLE `object_food`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `object_food`
--
ALTER TABLE `object_food`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
