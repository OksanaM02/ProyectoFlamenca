-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-05-2023 a las 23:24:56
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `CODIGO` int(11) NOT NULL,
  `DESCRIPCION` varchar(100) DEFAULT NULL,
  `PRECIO` int(11) DEFAULT NULL,
  `CANTIDAD` int(11) DEFAULT NULL,
  `FOTO` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`CODIGO`, `DESCRIPCION`, `PRECIO`, `CANTIDAD`, `FOTO`) VALUES
(1, 'Falda-top marrón y chaquetilla negra', 1100, 2, '1.jpg'),
(2, 'Falda de flecos negra y chaquetilla flock verde', 1250, 1, '2.jpg'),
(3, 'Pantalón y chaquetilla flock marrón', 1200, 3, '3.jpg'),
(4, 'Traje de flamenca flock marrón', 1550, 1, '4.jpg'),
(5, 'Traje de flamenca flock verde y chaqueta', 1600, 2, '5.jpg'),
(6, 'Traje de flamenca negro Dolce', 1070, 1, '6.jpg'),
(7, 'Traje de flamenca rosita bordados cortes cintura', 1120, 3, '7.jpg'),
(8, 'Traje de flamenca azulón con bordado maquillaje ', 1350, 2, '8.jpg'),
(9, 'Traje de flamenca coral bordado fucsia entero', 1550, 1, '9.jpg'),
(10, 'Traje de flamenca manzana bordado fucsia en escote', 1250, 2, '10.jpg'),
(11, 'Traje de flamenca lunar lino azulon y chaquetilla', 1100, 3, '11.jpg'),
(12, 'Traje de flamenca para niña morado con lunares', 1050, 1, '12.jpg'),
(13, 'Traje flamenca plumeti rojo de vuelo', 1450, 2, '13.jpg'),
(14, 'Traje flamenca bordado rosa', 1400, 1, '14.jpg'),
(15, 'Traje flamenca bordado celeste', 1250, 1, '15.jpg'),
(16, 'Traje flamenca verde de vuelo y mangas fruncidas', 1100, 1, '16.jpg'),
(17, 'Traje flamenca caqui', 900, 3, '17.jpg'),
(18, 'Falda flamenca negra y chaqueta lunares ', 600, 2, '18.jpg'),
(19, 'Falda flamenca volantes desde cintura ', 840, 3, '19.jpg'),
(20, 'Vestico coctail fucsia flecos negros', 450, 1, '20.jpg'),
(21, 'Traje de flamenca plumeti fucsia lunares', 1160, 2, '21.jpg'),
(22, 'Traje de flamenca falda volantes verde', 1260, 2, '22.jpg'),
(23, 'Traje de flamenca malva bordados morado', 1050, 1, '23.jpg'),
(24, 'Traje de flamenca blondas rosita', 1300, 0, '24.jpg'),
(25, 'Traje de flamenca rojo de guipur', 1010, 3, '25.jpg'),
(26, 'Traje de flamenca estampado con mangas transparentes de tul', 1100, 2, '26.jpg'),
(27, 'Traje de flamenca beige con transparencias', 1250, 1, '27.jpg'),
(28, 'Falda flamenca negra con blusa de leopardo', 1040, 1, '28.jpg'),
(29, 'Traje de flamenca beige con volante en escote', 1150, 1, '29.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `NOMBRE` varchar(20) NOT NULL,
  `CONTRASEÑA` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`NOMBRE`, `CONTRASEÑA`) VALUES
('oksanita', '1234');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`NOMBRE`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
