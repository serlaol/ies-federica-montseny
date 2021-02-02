CREATE DATABASE if not exists gestionanimales;

USE gestionanimales;

SHOW DATABASES;

SHOW TABLES;

/*
	Creación de la tabla de mascotas
*/

CREATE TABLE IF NOT EXISTS pets (
	name_ varchar(20),
    owner_ VARCHAR(20),
    species VARCHAR(20),
    sex CHAR(1),
    birth DATE,
    death DATE
);

DESCRIBE pets;

/*
	Creación de la tabla de empleados
*/
CREATE TABLE IF NOT EXISTS empleados ( 
	id INT, 
    nombre VARCHAR(30), 
    edad int
);

SHOW tables;

DESCRIBE empleados;

/* 
	IMPORTANTE: REALIZAR COPIAS DE SEGURIDAD 
	DE LA BASE DE DATOS
*/

/* Cuidado con esta instrucción
Comentamos para que no se elimine la tabla */

/*DROP TABLE empleados;*/

ALTER TABLE nombre_tabla RENAME TO nuevo_nombre_tabla;                      

ALTER TABLE empleados RENAME TO employees;             		

/*
	Cuidado con esta instrucción
    porque elimina los datos de una tabla
*/
/*TRUNCATE TABLE employees;*/

ALTER TABLE employees ADD (
	oficina int
);

DESCRIBE employees;

ALTER TABLE employees ADD (
	jefe VARCHAR(20),
    departamento BIT
);

/*
	Cuidado al eliminar un campo, porque eliminas 
	los datos del mismo
*/

ALTER TABLE nombre_tabla 
	DROP nombre_columna, 
	DROP nombre_columna;

ALTER TABLE employees					
DROP jefe,
DROP departamento;

DESCRIBE employees;

ALTER TABLE employees ADD (
	boss VARCHAR(2),
    departamento BIT
);

/*
DEFINICIÓN

ALTER TABLE nombre_tabla 
MODIFY columna1 tipo_dato [ restricciones de columna1], 
MODIFY columna2 tipo_dato [ restricciones de columna2],
...;*/ 

ALTER TABLE employees 
MODIFY boss VARCHAR(20), 
MODIFY departamento BIT;
 
	






