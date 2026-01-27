DROP DATABASE IF EXISTS andalucia_db;

CREATE DATABASE IF NOT EXISTS andalucia_db CHARACTER
SET
    utf8mb4 COLLATE utf8mb4_unicode_ci;

USE andalucia_db;

-- Crear la tabla personas con estructura adecuada
CREATE TABLE personas (
    id INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    sexo ENUM ('M', 'H') NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    provincia VARCHAR(100) NOT NULL,
    municipio VARCHAR(150) NOT NULL,
    nivel_estudios VARCHAR(50),
    situacion_laboral VARCHAR(50),
    ingresos_anuales INT,
    estado_civil VARCHAR(20),
    num_hijos INT,
    nivel_socioeconomico VARCHAR(20),
    ocupacion VARCHAR(50)
);

LOAD DATA INFILE '/var/lib/mysql-files/andalucia.csv' INTO TABLE personas FIELDS TERMINATED BY ',' ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 ROWS;

-- Ejercicios

--1. Muestra la media de salario agrupada por ocupación


--2. Muestra la media de salarios en cada provincia


--3. Muestra la media de edad de cada nivel socioeconómico


--4. Dime la edad de las personas de menos de 60 años ordenadas por situación laboral.


--5. Muestra el nombre de la persona parada de más edad.


--6. Dime la moda de Edad de cada municipio.


--7. Dime la provincia con la máxima edad media.


--8. Dime la media de hijos de personas con menos de 30 años.


--9. Muestra el valor de numero de hijos que más se repite entre las mujeres.


--10. Dime la media de edad de las mujeres sin hijos de Sevilla provincia


--11. Dime la media de las modas del campo edad.


--12. Dime la provincia con menor edad media de las personas paradas.


--13. Órdename los municipios por numero total de hijos en cada uno.


--14. ordena las provincias por mayor número medio de hijos por mujer (tasa de natalidad)


--15. Dime los municipios que no superan la tasa de reemplazo (más de 2 hijos por mujer) pero tienen un salario medio mayor a 3000


--16. Dime la provincia con la moda de edad más alta.
