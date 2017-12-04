-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-11-2017 a las 03:41:42
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `literatura`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autores`
--

CREATE TABLE IF NOT EXISTS `autores` (
`id_autor` int(6) NOT NULL,
  `autor` varchar(255) NOT NULL,
  `aNacimiento` int(4) NOT NULL,
  `aFallecimiento` int(4) NOT NULL,
  `lNacimiento` varchar(255) NOT NULL,
  `vida` text NOT NULL,
  `estilo` text NOT NULL,
  `refEpoca` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `epoca`
--

CREATE TABLE IF NOT EXISTS `epoca` (
`id_epoca` int(6) NOT NULL,
  `Epoca` varchar(255) NOT NULL,
  `tComprendido` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `obras`
--

CREATE TABLE IF NOT EXISTS `obras` (
`id_obra` int(6) NOT NULL,
  `titulo` varchar(255) NOT NULL,
  `aEdicion` int(4) NOT NULL,
  `argumentos` text NOT NULL,
  `critica` text NOT NULL,
  `relAutor` varchar(255) NOT NULL,
  `relEpoca` varchar(255) NOT NULL,
  `relGenero` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `autores`
--
ALTER TABLE `autores`
 ADD PRIMARY KEY (`id_autor`), ADD UNIQUE KEY `autor` (`autor`);

--
-- Indices de la tabla `epoca`
--
ALTER TABLE `epoca`
 ADD PRIMARY KEY (`id_epoca`), ADD UNIQUE KEY `Epoca` (`Epoca`);

--
-- Indices de la tabla `obras`
--
ALTER TABLE `obras`
 ADD PRIMARY KEY (`id_obra`), ADD UNIQUE KEY `titulo` (`titulo`), ADD KEY `relAutor` (`relAutor`,`relEpoca`,`relGenero`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `autores`
--
ALTER TABLE `autores`
MODIFY `id_autor` int(6) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `epoca`
--
ALTER TABLE `epoca`
MODIFY `id_epoca` int(6) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `obras`
--
ALTER TABLE `obras`
MODIFY `id_obra` int(6) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
