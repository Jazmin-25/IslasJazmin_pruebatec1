-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 05-02-2025 a las 18:39:52
-- Versión del servidor: 9.1.0
-- Versión de PHP: 8.3.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empleados`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE IF NOT EXISTS `empleado` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `APELLIDO` varchar(255) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `CARGO` varchar(255) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `FECHAINICIO` varchar(255) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `NOMBRE` varchar(255) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `SALARIO` double DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`ID`, `APELLIDO`, `CARGO`, `FECHAINICIO`, `NOMBRE`, `SALARIO`) VALUES
(1, 'Garcia Castro ', 'Contador', '01-02-2022', 'Laura', 12.5),
(2, 'Bautista Martinez ', 'Contador ', '01-02-2022', 'Alfredo', 12.5),
(3, 'Islas Garcia', 'Analista Programador', '03-02-2025', 'Ariadna', 17.36),
(4, 'Hernandez Chavez', 'Jefe de Área', '11-08-2017', 'Marisol', 18.36),
(5, 'Cruz Sierra', 'Instructor', '15-07-202', 'Angel', 15.555),
(6, 'Pineda Gallego ', 'Instructor', '15-07-202', 'Zamir', 15.555),
(7, 'Hernandez Garcia  ', 'Analista Programador  ', '01-02-2022', 'Paola ', 12.5),
(8, 'Gutierrez Hernandez ', 'Analista Programador  ', '01-02-2022', 'Marisol ', 12.5),
(9, 'Navarro Domingo ', 'Analista Programador  ', '01-02-2022', 'Sara  ', 12.5),
(10, 'Hernandez Castro ', 'Contador', '01-02-2022', 'Mariana', 12.5),
(11, 'Hernandez Nava ', 'Instructor', '15-07-202', 'Luisina', 15.555),
(12, 'Hernandez Nava ', 'Auxiliar de Nomina', '15-07-202', 'Monica', 15.555),
(13, 'Valencia Hernandez ', 'Reclutadora', '01-02-2022', 'Claudia  ', 12.5),
(14, 'Gomez Hernandez ', 'Cordinadora RH', '01-02-2022', 'Isabel  ', 12.5),
(15, 'Sanchez Chavez', 'Lider de Proyecto', '11-08-2017', 'Marisol', 18.36),
(16, 'Paramo Chavez', 'Gerente', '11-08-2011', 'Pedro', 18.36),
(17, 'Rulfo', 'Reclutador', '11-08-2011', 'Juan', 10.36);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
