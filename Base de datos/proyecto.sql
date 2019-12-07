-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-12-2019 a las 00:13:44
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.2.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bus`
--

CREATE TABLE `bus` (
  `id_bus` int(11) NOT NULL,
  `placa` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `conductor` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `anfitrion` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_user` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_host` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bus_parada`
--

CREATE TABLE `bus_parada` (
  `id_buspar` int(11) NOT NULL,
  `id_bus` int(11) NOT NULL,
  `id_parada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `chat`
--

CREATE TABLE `chat` (
  `id_chat` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `in_message` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `out_message` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `msg_date` date DEFAULT NULL,
  `tx_user` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_host` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `informacion`
--

CREATE TABLE `informacion` (
  `id_informacion` int(11) NOT NULL,
  `informacion` varchar(3500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `imagen` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_tipoi` int(11) NOT NULL,
  `tx_user` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_host` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parada`
--

CREATE TABLE `parada` (
  `id_parada` int(11) NOT NULL,
  `viaj_suben` int(11) DEFAULT NULL,
  `viaj_bajan` int(11) DEFAULT NULL,
  `latitud` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `longitud` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `calle` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_ruta` int(11) NOT NULL,
  `tx_user` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_host` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ruta`
--

CREATE TABLE `ruta` (
  `id_ruta` int(11) NOT NULL,
  `inicio` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fin` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_pdf` int(10) NOT NULL,
  `id_video` int(10) NOT NULL,
  `tx_user` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_host` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarifa`
--

CREATE TABLE `tarifa` (
  `id_tarifa` int(11) NOT NULL,
  `tarifa` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `precio_diurno` decimal(5,2) DEFAULT NULL,
  `precio_nocturno` decimal(5,2) DEFAULT NULL,
  `tx_user` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_host` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_informacion`
--

CREATE TABLE `tipo_informacion` (
  `id_tipoi` int(10) NOT NULL,
  `informacion` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ubicacion`
--

CREATE TABLE `ubicacion` (
  `id_ubicacion` int(10) NOT NULL,
  `latitud` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `longitud` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `calle` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_usuario` int(11) NOT NULL,
  `tx_user` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_host` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `url`
--

CREATE TABLE `url` (
  `id_url` int(10) NOT NULL,
  `nombre` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `url` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_user` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_host` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `nombre` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `apellido` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `telefono` int(30) DEFAULT NULL,
  `tx_user` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_host` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tx_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bus`
--
ALTER TABLE `bus`
  ADD PRIMARY KEY (`id_bus`);

--
-- Indices de la tabla `bus_parada`
--
ALTER TABLE `bus_parada`
  ADD PRIMARY KEY (`id_buspar`,`id_bus`,`id_parada`),
  ADD KEY `id_bus` (`id_bus`),
  ADD KEY `id_parada` (`id_parada`);

--
-- Indices de la tabla `chat`
--
ALTER TABLE `chat`
  ADD PRIMARY KEY (`id_chat`,`id_usuario`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `informacion`
--
ALTER TABLE `informacion`
  ADD PRIMARY KEY (`id_informacion`,`id_tipoi`),
  ADD KEY `id_tipoi` (`id_tipoi`);

--
-- Indices de la tabla `parada`
--
ALTER TABLE `parada`
  ADD PRIMARY KEY (`id_parada`,`id_ruta`),
  ADD KEY `id_ruta` (`id_ruta`);

--
-- Indices de la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD PRIMARY KEY (`id_ruta`,`id_pdf`,`id_video`),
  ADD KEY `id_pdf` (`id_pdf`),
  ADD KEY `id_video` (`id_video`);

--
-- Indices de la tabla `tarifa`
--
ALTER TABLE `tarifa`
  ADD PRIMARY KEY (`id_tarifa`);

--
-- Indices de la tabla `tipo_informacion`
--
ALTER TABLE `tipo_informacion`
  ADD PRIMARY KEY (`id_tipoi`);

--
-- Indices de la tabla `ubicacion`
--
ALTER TABLE `ubicacion`
  ADD PRIMARY KEY (`id_ubicacion`,`id_usuario`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `url`
--
ALTER TABLE `url`
  ADD PRIMARY KEY (`id_url`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bus`
--
ALTER TABLE `bus`
  MODIFY `id_bus` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `bus_parada`
--
ALTER TABLE `bus_parada`
  MODIFY `id_buspar` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `chat`
--
ALTER TABLE `chat`
  MODIFY `id_chat` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `informacion`
--
ALTER TABLE `informacion`
  MODIFY `id_informacion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `parada`
--
ALTER TABLE `parada`
  MODIFY `id_parada` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ruta`
--
ALTER TABLE `ruta`
  MODIFY `id_ruta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tarifa`
--
ALTER TABLE `tarifa`
  MODIFY `id_tarifa` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_informacion`
--
ALTER TABLE `tipo_informacion`
  MODIFY `id_tipoi` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ubicacion`
--
ALTER TABLE `ubicacion`
  MODIFY `id_ubicacion` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `url`
--
ALTER TABLE `url`
  MODIFY `id_url` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bus_parada`
--
ALTER TABLE `bus_parada`
  ADD CONSTRAINT `bus_parada_ibfk_1` FOREIGN KEY (`id_bus`) REFERENCES `bus` (`id_bus`),
  ADD CONSTRAINT `bus_parada_ibfk_2` FOREIGN KEY (`id_parada`) REFERENCES `parada` (`id_parada`);

--
-- Filtros para la tabla `chat`
--
ALTER TABLE `chat`
  ADD CONSTRAINT `chat_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);

--
-- Filtros para la tabla `informacion`
--
ALTER TABLE `informacion`
  ADD CONSTRAINT `informacion_ibfk_1` FOREIGN KEY (`id_tipoi`) REFERENCES `tipo_informacion` (`id_tipoi`);

--
-- Filtros para la tabla `parada`
--
ALTER TABLE `parada`
  ADD CONSTRAINT `parada_ibfk_1` FOREIGN KEY (`id_ruta`) REFERENCES `ruta` (`id_ruta`);

--
-- Filtros para la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD CONSTRAINT `ruta_ibfk_1` FOREIGN KEY (`id_pdf`) REFERENCES `url` (`id_url`),
  ADD CONSTRAINT `ruta_ibfk_2` FOREIGN KEY (`id_video`) REFERENCES `url` (`id_url`);

--
-- Filtros para la tabla `ubicacion`
--
ALTER TABLE `ubicacion`
  ADD CONSTRAINT `ubicacion_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
