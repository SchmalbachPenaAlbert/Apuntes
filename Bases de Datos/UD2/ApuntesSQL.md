# Apuntes SQL

Ejemplos de como escribir SQL

## A tener en cuenta

### Tipos de datos

* int:
* varchar:
* date:
* time:
* decimal:

### Enteros: bigint, int, smallint y tinyint

Normalmente usaremos int para los enteros, aunque a veces, para optimizar la tabla al máximo valor, usaremos otros tipos de int:
* bigint:
* int:
* smallint:
* tinyint:

## Ejemplos

### Crear una tabla

El siguiente ejemplo meustra como crear dos tabla. Una llamada cleintes y otra llamada Reservas. 
La tabla Reservas incluye **5 columnas propias** y **una columna (llave) de la otra tabla**, clientes.

```SQL
create table Clientes (id int primary key, nombre varchar(12), direccion
varchar(30), telefono varchar(9));

create table Reservas (codigo int primary key, fecha date, hora time, duracion smallint, idCliente int, foreign key (idCliente) references Clientes (id));
```