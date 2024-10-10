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
-- INSERTS a la tabla producto
INSERT INTO producto VALUES (null, 'Enfriador de vino', 'Elegante enfriador de mármol ideal para mantener la temperatura de tu botella de vino.', 450.00, 'Decoración', './assets/muebles/deco-1.png', 40),
    (null, 'Enfriador de vino', 'Elegante enfriador de mármol ideal para mantener la temperatura de tu botella de vino.', 450.00, 'Decoración', './assets/muebles/deco-2.png', 1000),
    (null, 'Jarrón cerámica', 'Jarrón pequeño en cerámica de gres esmaltada. Modelo con diseño irregular.', 500.00, 'Decoración', './assets/muebles/deco-3.png', 1000),
    (null, 'Jarrón cerámica', 'Jarrón pequeño en cerámica de gres esmaltada. Modelo con diseño irregular.', 500.00, 'Decoración', './assets/muebles/deco-4.png', 1000),
    (null, 'Jarra cerámica', 'Jarra en cerámica con pico vertedor y asa de diseño orgánico.', 650.00, 'Decoración', './assets/muebles/deco-5.png', 20),
    (null, 'Jarra cerámica', 'Jarra en cerámica con pico vertedor y asa de diseño orgánico.', 650.00, 'Decoración', './assets/muebles/deco-6.png', 15),
    (null, 'Maceta con pedestal en metal', 'Maceta con pedestal en metal pintado, ideal tanto para interiores como exteriores.', 250.00, 'Decoración', './assets/muebles/product-6.png', 12),
    (null, 'Maceta de cerámica con barniz jaspeado', 'Maceta en cerámica, modelo con un divertido acabado de burbujas y barniz jaspeado que aporta una apariencia única a cada pieza', 300.00, 'Decoración', './assets/muebles/product-7.png', 13),
    (null, 'Maceta de concreto', 'Maceta de concreto con un diseño moderno y un acabado texturizado que aporta una apariencia única a cada pieza.', 200.00, 'Decoración', './assets/muebles/product-8.png', 33),
    (null, 'Cesto de yute trenzado', 'Cesto hecho a mano en yute con dos asas superiores.', 600.00, 'Almacenamiento', './assets/muebles/deco-7.png', 25),
    (null, 'Cesto en yute', 'Cesto para ropa en yute con dos asas superiores.', 800.00, 'Almacenamiento', './assets/muebles/deco-8.png', 25),
    (null, 'Cesto de algodón', 'Cesto de almacenamiento en tejido grueso de algodón con dos asas superiores.', 400.00, 'Almacenamiento', './assets/muebles/deco-9.png', 25),
    (null, 'Funda de cojín en mezcla de lino', 'Funda de cojín clásica en tejido de lino y algodón color verde.', 249.00, 'Decoración', './assets/muebles/image-1.png', 15),
    (null, 'Funda de cojín en terciopelo', 'Funda de cojín en terciopelo color gris oscuro de algodón con zíper oculto.', 249.00, 'Decoración', './assets/muebles/image-2.png', 15),
    (null, 'Funda de cojín con flecos en terciopelo', 'Funda de cojín en terciopelo color gris con borde de flecos y zíper oculto.', 249.00, 'Decoración', './assets/muebles/image-3.png', 15),
    (null, 'Mesa de centro con cajón de vidrio', 'Mesa de centro, auxiliar o de café con estante y cajón de vidrio. Diseño moderno y versátil, elaborado en mdf y vidrio estriado.', 1500.00, 'Muebles', './assets/muebles/mueble-1.png', 9),
    (null, 'Aparador multiusos nórdico', 'Aparador moderno estilo nórdico con amplios espacios de almacenamiento y se adapta a cualquier decoración con sus tonos blancos y café.', 2500.00, 'Muebles', './assets/muebles/mueble-2.png', 10),
    (null, 'Aparador puertas de vidrio', 'Aparador moderno de mdf con puertas de vidrio, diseño color café claro adaptable a cualquier tipo de decoración.', 1500.00, 'Muebles', './assets/muebles/mueble-3.png', 6),
    (null, 'Aparador ratán de 3 puertas', 'Aparador de mdf multiusos gran espacio de almacenamiento. Diseño en ratán con colores claros, ideal para obtener un estilo decorativo cálido.', 3000.00, 'Muebles', './assets/muebles/mueble-4.png', 8),
    (null, 'Mueble para tv minimalista', 'Mueble de tv estilo minimalista cuenta con 2 puertas laterales y 2 entrepaños central, hecho a base de mdf de tonalidad clara.', 1500.00, 'Muebles', './assets/muebles/mueble-5.png', 8),
    (null, 'Mueble para tv', 'Mueble de tv rack con estantes y puertas, elaborado en mdf y tratamiento térmico y barnizado, colores claros, ideal para obtener un estilo decorativo cálido y artesanal.', 2000.00, 'Muebles', './assets/muebles/mueble-6.png', 9),
    (null, 'Librero nórdico', 'Elegante librero vertical de gran almacenamiento con dos estantes, dos cajones y una puerta. Estilo nórdico de diseño minimalista en tonos de madera clara y blanco.', 1500.00, 'Muebles', './assets/muebles/mueble-7.png', 11),
    (null, 'Armario de madera tradicional', 'Armario de madera práctico y versátil, se adapta a diversas necesidades de almacenamiento con un diseño clásico.', 6000.00, 'Muebles', './assets/muebles/mueble-8.png', 10),
    (null, 'Aparador moderno', 'Elegante aparador nórdico, diseñado para aportar estilo y funcionalidad a tu hogar, de acabado en tonos claros y líneas minimalistas.', 3000.00, 'Muebles', './assets/muebles/mueble-9.png', 15);

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

