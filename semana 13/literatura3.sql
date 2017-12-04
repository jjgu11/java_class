-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2017 a las 03:46:41
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `literatura2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autores`
--

CREATE TABLE IF NOT EXISTS `autores` (
`idAutor` int(6) NOT NULL,
  `Autor` varchar(255) NOT NULL,
  `Anacimiento` int(4) NOT NULL,
  `Afallecimiento` int(4) NOT NULL,
  `Lugarnacimiento` varchar(255) NOT NULL,
  `Vida` text NOT NULL,
  `Estilo` text NOT NULL,
  `refEpoca` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `autores`
--

INSERT INTO `autores` (`idAutor`, `Autor`, `Anacimiento`, `Afallecimiento`, `Lugarnacimiento`, `Vida`, `Estilo`, `refEpoca`) VALUES
(1, 'Arcipreste de Hita', 1280, 1351, 'Alcala de Henares', 'Fue clerigo y ejercio de arcipreste en Hita, actual provincia de Guadalajara. Se conocen muy pocos datos de su biografia, apenas su nombre y el de uno de los protagonistas de su libro, Ferran Garcia.', 'Fue creador de una obra miscelanea predominantemente narrativa en verso que constituye una de las obras literarias mas importantes de la literatura medieval española, el Libro de buen amor.', 'EDAD MEDIA'),
(2, 'Jorge Francisco Isidoro Luis Borges Acevedo', 1899, 1986, 'Buenos Aires, Argentina', 'fue un erudito escritor argentino, considerado uno de los autores más destacados de la literatura del siglo XX. Publicó ensayos breves, cuentos y poemas.', 'En 1961 comparte con Samuel Beckett el Premio Formentor, otorgado por el Congreso Internacional de Editores. Desde 1964 publica indistintamente en verso y en prosa. Borges utiliza un singular estilo literario, basado en la interpretación de conceptos como los de tiempo, espacio, destino o realidad.', 'RENACIMIENTO'),
(3, 'Gabriel José de la Concordia García Márquez', 1927, 2014, 'Aracataca, Colombia', 'Fue conocido familiarmente y por sus amigos como Gabito (hipocorístico guajiro de Gabriel), o por su apócope Gabo, desde que Eduardo Zalamea Borda, subdirector del diario El Espectador, comenzara a llamarlo así.5?\r\n\r\nEstá relacionado de manera inherente con el realismo mágico y su obra más conocida, la novela Cien años de soledad, es considerada una de las más representativas de este movimiento literario e incluso se considera que por el éxito de la novela es que tal término se aplica a la literatura surgida a partir de los años 1960 en América Latina.6?7?En 2007, la Real Academia Española y la Asociación de Academias de la Lengua Española lanzaron una edición popular conmemorativa de esta novela, por considerarla parte de los grandes clásicos hispánicos de todos los tiempos.8?', 'Hijo de Gabriel Eligio García y Luisa Santiaga Márquez, nació en Aracataca, departamento del Magdalena, Colombia, «el domingo 6 de marzo de 1927 a las nueve de la mañana...», como refiere el propio escritor en sus memorias.5?', 'REALISMO'),
(4, 'Pablo Neruda', 1904, 1973, 'Parral, Chile', 'Pablo Neruda, seudónimo de Ricardo Eliécer Neftalí Reyes Basoalto (Parral, Región del Maule; 12 de julio de 1904-Santiago, Región Metropolitana de Santiago; 23 de septiembre de 1973), fue un poeta chileno, considerado entre los más destacados e influyentes artistas de su siglo; «el más grande poeta del siglo XX en cualquier idioma», según Gabriel García Márquez.1?\r\n\r\nEntre sus múltiples reconocimientos, destacan el Premio Nobel de Literatura en 1971 y un doctorado honoris causa por la Universidad de Oxford. «Ningún poeta del hemisferio occidental de nuestro siglo admite comparación con él», ha escrito el crítico literario Harold Bloom,2? quien lo considera uno de los veintiséis autores centrales del canon de la literatura occidental de todos los tiempos.3?', 'Hacia 1921, con diecisiete años de edad, comenzó a firmar definitivamente sus trabajos con el seudónimo de Pablo Neruda, esencialmente con el propósito de evitar el malestar del padre por tener un hijo poeta.7? Si bien Neruda nunca aclaró el origen de su nombre artístico, nunca desmintió, e incluso apoyó, la conjetura de que lo habría escogido en honor al escritor checo Jan Neruda,[cita requerida] del cual leyó un cuento por esos años que le causó una honda impresión. Sin embargo, la obra de Jan se publicó entre 1857 y 1883, y es poco probable que Neruda haya tenido acceso a traducciones en 1921 —en lugar de esto, se presume que su apodo está inspirado más bien en un personaje de la novela de Arthur Conan Doyle titulada Estudio en escarlata (1887), donde, en el capítulo IV, el personaje Sherlock Holmes dice ir a escuchar un concierto de Norman-Neruda, una famosa violinista, Guillermina María Francisca Neruda, casada con el músico sueco Ludwig Norman, conociéndosela entonces como Wilma Norman-Neruda', 'BARROCO'),
(5, 'Mario Benedetti', 1920, 2009, 'Paso de los Toros', 'Mario Benedetti (Paso de los Toros, 14 de septiembre de 1920-Montevideo, 17 de mayo de 2009)1? fue un escritor, poeta, dramaturgo y periodista uruguayo integrante de la generación del 45, a la que pertenecen también Idea Vilariño y Juan Carlos Onetti, entre otros. Su prolífica producción literaria incluyó más de ochenta libros, algunos de los cuales fueron traducidos a más de veinte idiomas.', 'Mario Benedetti nació el 14 de septiembre de 1920 en Paso de los Toros, Uruguay. Fue hijo de Brenno Benedetti y Matilde Farrugia. Residió en Paso de los Toros junto a su familia durante los primeros dos años de su vida. La familia luego se trasladó a Tacuarembó por asuntos de negocios. Tras una fallida estadía en ese sitio (donde fueron víctimas de una estafa2?),', 'GENERACION 27'),
(6, 'Rafael Alberti Merello', 1902, 1999, 'El Puerto de Santa', 'Rafael Alberti Merello (El Puerto de Santa María, Cádiz, 16 de diciembre de 1902-ibídem, 28 de octubre de 1999) fue un escritor español, especialmente reconocido como poeta, miembro de la generación del 27. Está considerado uno de los mayores literatos de la llamada Edad de Plata de la literatura española.1? Cuenta en su haber con numerosos premios y reconocimientos.', 'Miembro activo del Partido Comunista de España, se exilió tras la Guerra Civil. Vuelto a España tras la instauración de la monarquía, fue nombrado Hijo Predilecto de Andalucía en 1983 y Doctor Honoris Causa por la Universidad de Cádiz en 1985.', 'GENERACION 98'),
(7, 'Octavio Irineo Paz', 1914, 1998, 'Ciudad de México, México', 'Octavio Irineo Paz Lozano2? (Ciudad de México, 31 de marzo de 1914-Ib., 19 de abril de 1998) fue un poeta, ensayista y diplomático mexicano, premio nobel de literatura en 1990. Se le considera uno de los más influyentes escritores del siglo XX y uno de los grandes poetas hispanos de todos los tiempos.', 'Octavio Paz nació el 31 de marzo de 1914, durante la Revolución mexicana. Apenas unos meses despues, al unirse su padre al movimiento zapatista junto con Antonio Díaz Soto y Gama, su madre lo llevó a vivir a la casa del abuelo paterno, Ireneo Paz, en Mixcoac, entonces un poblado cercano a la Ciudad de México. Ahí radicaron hasta que Octavio Paz Solórzano tuvo que asilarse en Los Ángeles con la representación de Emiliano Zapata ante los Estados Unidos, cargo que mantuvo hasta 1919, año del asesinato de Zapata.', 'NEOCLASICO'),
(8, 'Carlos Fuentes', 1928, 2012, 'Panamá, Panamá', 'Carlos Fuentes Macías (Panamá, 11 de noviembre de 1928-Ciudad de México, 15 de mayo de 20122?3?) fue un escritor, intelectual y diplomático mexicano, uno de los autores más destacados de su país y de las letras hispanoamericanas, autor de novelas como La región más transparente, La muerte de Artemio Cruz, Aura, Cambio de piel y Terra Nostra y de ensayos como La nueva novela hispanoamericana, Cervantes o la crítica de la lectura, El espejo enterrado, Geografía de la novela y La gran novela latinoamericana, entre otros', 'Recibió, entre otros, el Premio Rómulo Gallegos en 1977, el Cervantes en 1987, y el Príncipe de Asturias de las Letras en 1994. Y fue nombrado gran oficial de la Legión de Honor en 2003 y en 2009 caballero gran cruz de la Orden de Isabel la Católica. Fue nombrado miembro honorario de la Academia Mexicana de la Lengua en agosto de 20014? y doctor honoris causa por varias universidades, entre ellas Harvard, Cambridge y Nacional de México.', 'REALISMO'),
(9, 'Gabriela Mistral', 1889, 1957, 'Vicuña, Chile', 'Gabriela Mistral, seudónimo de Lucila de María del Perpetuo Socorro Godoy Alcayaga1? (Vicuña, 7 de abril de 1889-Nueva York, 10 de enero de 1957), fue una poetisa, diplomática y pedagoga chilena. Una de las principales figuras de la poesía y literatura chilena y latinoamericana, fue la primera iberoamericana2? premiada con el Nobel:3? ganó el de Literatura en 1945.', 'Hija de Juan Jerónimo Godoy Villanueva, profesor de ascendencia diaguita,5? y de Petronila Alcayaga Rojas, de ascendencia vasca,6? Gabriela Mistral nació en Vicuña, ciudad en la que hoy existe un museo7? dedicado a ella en la calle donde nació y que actualmente lleva su nombre. ', 'RENACIMIENTO'),
(10, 'Adolfo Bioy Casares', 1914, 1999, 'Recoleta, Buenos ', 'Adolfo Bioy Casares (Buenos Aires; 15 de septiembre de 1914-Ib.; 8 de marzo de 1999) fue un escritor argentino que frecuentó las literaturas fantástica, policial y de ciencia ficción', 'Es considerado uno de los escritores más importantes de su país y de la literatura en español, habiendo recibido el Premio Internacional Alfonso Reyes y el Premio Miguel de Cervantes, ambos en 1990. Colaboró literariamente en varias ocasiones con Jorge Luis Borges, y este consideró a Bioy como uno de los más notables escritores argentinos. Fue esposo de la escritora Silvina Ocampo.', 'ROMANTICISMO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `epoca`
--

CREATE TABLE IF NOT EXISTS `epoca` (
`idEpoca` int(6) NOT NULL,
  `Epoca` varchar(255) NOT NULL,
  `Tiempocomprendido` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `epoca`
--

INSERT INTO `epoca` (`idEpoca`, `Epoca`, `Tiempocomprendido`) VALUES
(1, 'EDAD MEDIA', 'SIGLOS X A XIV'),
(2, 'RENACIMIENTO', 'SIGLO XV'),
(3, 'BARROCO', 'SIGLOS XVI Y XVII'),
(4, 'NEOCLASICO', 'SIGLOS XVIII'),
(5, 'ROMANTICISMO', 'SIGLO XIX, PRIMERA MITAD'),
(6, 'REALISMO', 'SIGLO XIX, SEGUNDA MITAD'),
(7, 'GENERACION 98', 'DE 1890 A 1920'),
(8, 'GENERACION 27', 'DE 1920 A 1940'),
(9, 'ACTUAL', 'DE 1940 HASTA HOY');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `genero`
--

CREATE TABLE IF NOT EXISTS `genero` (
`idGenero` int(6) NOT NULL,
  `Genero` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `genero`
--

INSERT INTO `genero` (`idGenero`, `Genero`) VALUES
(1, 'NOVELA'),
(2, 'POESIA'),
(3, 'TEATRO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `obras`
--

CREATE TABLE IF NOT EXISTS `obras` (
`idObra` int(6) NOT NULL,
  `Titulo` varchar(255) NOT NULL,
  `Anho1edicion` int(4) NOT NULL,
  `Argumento` text NOT NULL,
  `Critica` text NOT NULL,
  `relAutor` varchar(255) NOT NULL,
  `relEpoca` varchar(255) NOT NULL,
  `relGenero` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `obras`
--

INSERT INTO `obras` (`idObra`, `Titulo`, `Anho1edicion`, `Argumento`, `Critica`, `relAutor`, `relEpoca`, `relGenero`) VALUES
(1, 'libro del buen amor', 1330, 'El libro contiene una coleccion heterogenea de diversos materiales unidos en torno a una pretendida narracion autobiografica de asuntos amorosos del propio auutor.', 'Es una composicion extensa y variada de 1728 estrofas. Esta considerada de forma unanime como una de las cumbres literarias españolas de cualquier tiempo y no solo de la edad media', 'Arcipreste de Hita', 'EDAD MEDIA', 'POESIA'),
(2, 'El proceso', 1920, 'Escrito a principios del siglo XX, esta obra ha ejercido una influencia incuestionable en la escuela del absurdo, representada entre otros, por autores de la talla de Sartre, Camus o Beckett. En esta historia, que narra la tormentosa situación que atraviesa un hombre acusado en un oscuro proceso, Kafka relata las preocupaciones y ansiedades del siglo que habría de llegar: la soledad del hombre en un mundo cadente de ley superior, en un futuro incomprensible y sin esperanza.', 'Como ya dije en mi reseña de La metamorfosis, no me gusta nada la forma de escribir de Kafka y, con El Proceso, me reafirmo más que nunca. Denso, sin tiempo para respirar con diálogos separados del resto del texto, todo seguido, todo sin sentido.', 'Adolfo Bioy Casares', 'ROMANTICISMO', 'NOVELA'),
(3, 'El contrato social', 1762, 'Publicado en 1762, esta obra de Rousseau afirma el principio de la soberanía popular: desde su aparición, fue un punto de inflexión para la modernidad y se ha convertido, hasta la fecha, en uno de los textos más importantes de filosofía política.', 'Para la crítica moderna el más grande enemigo de Jean-Jacques Rousseau es el famoso autor de El Contrato Social. ... Rousseau es para la modernidad el gran pensador del siglo XVIII francés. Un ser indiscutiblemente extraordinario a quien propios y extraños lo reconocen por su gran fama y celebridad.', 'Carlos Fuentes', 'RENACIMIENTO', 'POESIA'),
(4, 'Así habló Zaratustra ', 1883, 'Desde su publicación en 1883, está considerada como una obra filosófica magistral y transgresora. El personaje Zaratustra inicia a los hombres en el nuevo concepto de superhombre, la meta para que cada individuo sea absolutamente libre, también del poder de Dios. Para lograr el estatuto de hombre nietzscheano las personas deben forjar sus propios valores y objetivos, despojándose de los viejos ideales (la verdad, la bondad, la belleza, la justicia…), valores que según el autor, habrían esclavizado su conciencia.', 'Zaratustra nos invita a repensar la realidad y los valores en los que se cimenta todo lo que nos rodea. Por momentos se hace tedioso, pero vale la pena saborearlo de a poco. Sin duda Nietzsche ha sido una de las mentes mas elevadas que hayan transitado por este mundo, y este libro es el resumen de su pensamiento.', 'Gabriela Mistral', 'REALISMO', 'NOVELA'),
(5, 'El príncipe', 1513, ' Alimentada por la rica experiencia del secretario florentino Nicolás Maquiavelo, esta obra de 1513 puede considerarse tanto un tratado político, como una reflexión histórica sobre el poder, los medios que permiten alcanzarlo y conservarlo, así como las causas que pueden conllevar su pérdida. La anatomía sin tapujos acerca de la relación entre gobernante y gobernados sigue siendo, cinco siglos después, un referente para el análisis político de nuestros días.', 'El Príncipe Feliz, es un cuento que se caracteriza por la aparición de una nueva corriente literaria y cuyo autor es Oscar Wilde. En esta reseña se examinan los aspectos de esta obra como lo es su argumento, la problemática que presenta, el estilo que el escritor maneja, entre otros.', 'Gabriel José de la Concordia García Márquez', 'NEOCLASICO', 'POESIA'),
(6, 'La divina comedia', 1563, ' A lo largo de los versos de La Divina Comedia, su autor se convierte en un espectador y protagonista que narra su purificación personal a lo largo de un recorrido por tres mundos (Infierno, Purgatorio y Paraíso). Esta obra maestra de la literatura italiana e universal, está plagada de símbolos y metáforas, cuya representación resulta tremendamente original y visual a lo largo de las páginas de su adaptación en cómic.', 'Dante Alighieri (1235-1321) representa el fin de la época Medieval y el inicio del Renacimiento. Su obra principal, La Divina Comedia, se compone de tres partes; El Infierno, El Purgatorio y El Paraíso. ... Su obra principal, La Divina Comedia, se compone de tres partes; El Infierno, El Purgatorio y El Paraíso.', 'Jorge Francisco Isidoro Luis Borges Acevedo', 'GENERACION 98', 'TEATRO');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `autores`
--
ALTER TABLE `autores`
 ADD PRIMARY KEY (`idAutor`), ADD UNIQUE KEY `Autor` (`Autor`), ADD KEY `refEpoca` (`refEpoca`);

--
-- Indices de la tabla `epoca`
--
ALTER TABLE `epoca`
 ADD PRIMARY KEY (`idEpoca`), ADD UNIQUE KEY `Epoca` (`Epoca`);

--
-- Indices de la tabla `genero`
--
ALTER TABLE `genero`
 ADD PRIMARY KEY (`idGenero`), ADD UNIQUE KEY `Genero` (`Genero`);

--
-- Indices de la tabla `obras`
--
ALTER TABLE `obras`
 ADD PRIMARY KEY (`idObra`), ADD UNIQUE KEY `Titulo` (`Titulo`), ADD KEY `relAutor` (`relAutor`,`relEpoca`,`relGenero`), ADD KEY `relGenero` (`relGenero`), ADD KEY `relEpoca` (`relEpoca`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `autores`
--
ALTER TABLE `autores`
MODIFY `idAutor` int(6) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `epoca`
--
ALTER TABLE `epoca`
MODIFY `idEpoca` int(6) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT de la tabla `genero`
--
ALTER TABLE `genero`
MODIFY `idGenero` int(6) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `obras`
--
ALTER TABLE `obras`
MODIFY `idObra` int(6) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `autores`
--
ALTER TABLE `autores`
ADD CONSTRAINT `autores_ibfk_1` FOREIGN KEY (`refEpoca`) REFERENCES `epoca` (`Epoca`);

--
-- Filtros para la tabla `obras`
--
ALTER TABLE `obras`
ADD CONSTRAINT `obras_ibfk_1` FOREIGN KEY (`relAutor`) REFERENCES `autores` (`Autor`),
ADD CONSTRAINT `obras_ibfk_2` FOREIGN KEY (`relGenero`) REFERENCES `genero` (`Genero`),
ADD CONSTRAINT `obras_ibfk_3` FOREIGN KEY (`relEpoca`) REFERENCES `epoca` (`Epoca`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
