USE tribalHome;

-- INSERTS a la tabla usuario
INSERT INTO usuario VALUES (null, 'Jose Alberto', 'Rivera Lara', 'México', '55238', 'Abedules Mz.1', '5581872363', 'joseariverala12@gmail.com', 'Contrasenia1+', 'cliente'),
	(null, 'Alejandro', 'Martínez Vargas', 'México', '56100', 'Cerrada 16 de Septiembre', '5611477897', 'alejandromv.2212@gmail.com', 'Contrasenia2.', 'admin'),
	(null, 'Kristopher', 'Jaramillo Vega', 'México', '56585', 'Chabacano Mz. 34', '5611706572', 'kristopher12@gmail.com', 'Contrasenia3?', 'admin'),
	(null, 'Dafne Paola', 'Sandoval Sánchez', 'México', '54740', 'Atlanta 28', '5536465968', 'dafne25@gmail.com', 'Contrasenia4$', 'admin'),
	(null, 'Fernando', 'Ramírez Sánchez', 'México', '55280', 'Valle de Tormes', '5539912382', 'soler3258@gmail.com', 'Contrasenia5...', 'cliente'),
	(null, 'Luis Fernando', 'Cruz Coronel', 'Ciudad de México', '09850', 'Santa Martha 8', '5631515692', 'fernando.coronel.dev@gmail.com', 'Nomelase24++', 'admin'),
	(null, 'Iván', 'Orozco Hernández', 'México', '55270', 'Adolfo Lopéz Mateos 33', '5512479260', 'ivanorozcohdez1@gmail.com', 'ElKrisamaaFer<3', 'admin'),
	(null, 'Ricardo Adrian', 'Alfaro Garcia', 'México', '52282', 'Santa Matilde Mz. 19 Lt. 27', '7222605510', '7222605510@gmail.com', 'TribalHome#_#5', 'admin'),
	(null, 'Juan Carlos', 'Valencia', 'Ciudad de México', '5555', 'Av Generation México', '5500000000', 'elbuenJC@gmail.com', 'Parangaricutirimicuaro1+', 'cliente');
-- INSERTS a la tabla producto
INSERT INTO producto VALUES (null, 'Enfriador de vino', 'Elegante enfriador de mármol ideal para mantener la temperatura de tu botella de vino.', 450.00, 'Decoración', './assets/muebles/deco-1.png', 1000),
	(null, 'Armario de madera tradicional', 'Armario de madera práctico y versátil, se adapta a diversas necesidades de almacenamiento con un diseño clásico.', 6000.00, 'Muebles', './assets/muebles/mueble-8.png', 10),
    (null, 'Cesto de yute trenzado', 'Cesto hecho a mano en yute con dos asas superiores.', 600.00, 'Almacenamiento', './assets/muebles/deco-7.png', 25),
    (null, 'Funda de cojín en mezcla de lino', 'Funda de cojín clásica en tejido de lino y algodón color verde.', 249.00, 'Decoración', './assets/muebles/image-1.png', 5),
    (null, 'Aparador multiusos nórdico', 'Aparador moderno estilo nórdico con amplios espacios de almacenamiento y se adapta a cualquier decoración con sus tonos blancos y café.', 2500.00, 'Muebles', './assets/muebles/mueble-2.png', 500);
-- INSERTS a la tabla carrito
INSERT INTO carrito VALUES (null, 1, 1, 2, 900.00, 'pendiente'),
	(null, 1, 3, 1, 600.00, 'pago'),
    (null, 9, 5, 1, 2500.00, 'pago'),
    (null, 9, 2, 3, 18000.00, 'pendiente'),
    (null, 5, 4, 2, 498.00, 'pago');

-- Obtención de datos para comprobar su correcta inserción
SELECT * FROM usuario;
SELECT * FROM producto;
SELECT * FROM carrito;

