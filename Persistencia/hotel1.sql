-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-07-2019 a las 00:46:32
-- Versión del servidor: 10.3.16-MariaDB
-- Versión de PHP: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `numHabi` int(11) NOT NULL,
  `descripcion` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`numHabi`, `descripcion`) VALUES
(121, 'cama sencilla'),
(122, 'cama doble'),
(123, 'cama sencilla'),
(124, 'cama doble'),
(125, 'doble cama sencilla'),
(126, 'doble cama doble'),
(211, 'cama sencilla'),
(212, 'cama sencilla'),
(213, 'cama doble'),
(214, 'cama doble'),
(215, 'doble cama sencilla'),
(216, 'doble cama doble');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `telefono` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `nombre`, `telefono`) VALUES
(1026236, 'daniel  vargas', '3201574123'),
(52709511, 'elizabeth rodriguez', '3144330391'),
(102236217, 'alejandro martines', '314365201'),
(102621436, 'maria vargas', '3125324823');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_has_reserva`
--

CREATE TABLE `persona_has_reserva` (
  `persona_id` int(11) NOT NULL,
  `reserva_ref_reserva` int(11) NOT NULL,
  `reserva_Persona` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `ref_reserva` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `tipoHosp` varchar(45) NOT NULL,
  `cantPer` int(11) NOT NULL,
  `cantDias` int(11) NOT NULL,
  `TotalPagar` int(11) NOT NULL,
  `reservacol` varchar(45) NOT NULL,
  `habitacion_numHabi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`numHabi`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `persona_has_reserva`
--
ALTER TABLE `persona_has_reserva`
  ADD PRIMARY KEY (`persona_id`,`reserva_ref_reserva`,`reserva_Persona`),
  ADD KEY `fk_persona_has_reserva_reserva1_idx` (`reserva_ref_reserva`,`reserva_Persona`),
  ADD KEY `fk_persona_has_reserva_persona_idx` (`persona_id`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`ref_reserva`),
  ADD KEY `fk_reserva_habitacion1_idx` (`habitacion_numHabi`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `persona_has_reserva`
--
ALTER TABLE `persona_has_reserva`
  ADD CONSTRAINT `fk_persona_has_reserva_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_persona_has_reserva_reserva1` FOREIGN KEY (`reserva_ref_reserva`) REFERENCES `reserva` (`ref_reserva`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `fk_reserva_habitacion1` FOREIGN KEY (`habitacion_numHabi`) REFERENCES `habitacion` (`numHabi`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
