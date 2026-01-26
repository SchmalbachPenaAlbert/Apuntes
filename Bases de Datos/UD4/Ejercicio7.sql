- Ejercicios de MySQL - Semana Santa de Granada
-- Este archivo contiene la estructura de la base de datos y los ejercicios para practicar consultas SQL.

-- Estructura de la Base de Datos

-- Tabla procesion
drop database semana_santa;
CREATE DATABASE if not exists semana_santa;
USE semana_santa;
CREATE TABLE procesion (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    dia_semana VARCHAR(20) NOT NULL,
    hora_inicio TIME NOT NULL,
    barrio VARCHAR(50) NOT NULL
);

-- Tabla hermandad
CREATE TABLE hermandad (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    antiguedad INT NOT NULL,
    numero_costaleros INT NOT NULL
);

-- Tabla paso
CREATE TABLE paso (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    estilo VARCHAR(50) NOT NULL,
    peso INT NOT NULL
);

-- Tabla itinerario
CREATE TABLE itinerario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_procesion INT NOT NULL,
    punto VARCHAR(100) NOT NULL,
    hora_paso TIME NOT NULL,
    FOREIGN KEY (id_procesion) REFERENCES procesion(id)
);

-- Inserciones de Datos Iniciales

-- Inserciones en la tabla procesion
INSERT INTO procesion (nombre, dia_semana, hora_inicio, barrio) VALUES
('La Esperanza', 'Lunes Santo', '18:30:00', 'Realejo'),
('El Silencio', 'Miércoles Santo', '23:00:00', 'Centro'),
('La Aurora', 'Domingo de Ramos', '17:00:00', 'Albaicín'),
('La Soledad', 'Viernes Santo', '19:30:00', 'Sacromonte');

-- Inserciones en la tabla hermandad
INSERT INTO hermandad (nombre, antiguedad, numero_costaleros) VALUES
('Hermandad del Silencio', 1578, 90),
('Hermandad de la Aurora', 1635, 120),
('Hermandad de la Esperanza', 1945, 80),
('Hermandad de la Soledad', 1500, 100);

-- Inserciones en la tabla paso
INSERT INTO paso (nombre, estilo, peso) VALUES
('Paso del Cristo del Silencio', 'Barroco', 2000),
('Paso de la Virgen de la Aurora', 'Renacentista', 1800),
('Paso de Jesús de la Esperanza', 'Gótico', 2200),
('Paso de la Virgen de la Soledad', 'Neoclásico', 1900);

-- Inserciones en la tabla itinerario
INSERT INTO itinerario (id_procesion, punto, hora_paso) VALUES
(1, 'Plaza Nueva', '19:00:00'),
(1, 'Catedral', '20:30:00'),
(2, 'Puerta Real', '23:30:00'),
(2, 'Gran Vía', '00:15:00'),
(3, 'Carrera del Darro', '17:30:00'),
(3, 'Plaza de San Nicolás', '18:15:00'),
(4, 'Paseo de los Tristes', '20:00:00'),
(4, 'Abadía del Sacromonte', '21:30:00');

-- 1. Listar todos los nombres de las procesiones.


-- 2. Mostrar los barrios donde se realizan las procesiones, sin repetir.


-- 3. Obtener el nombre y la hora de inicio de todas las procesiones que comienzan después de las 18:00.


-- 4. Seleccionar el nombre y estilo de todos los pasos.


-- 5. Mostrar el nombre de las hermandades que tienen más de 100 costaleros.
