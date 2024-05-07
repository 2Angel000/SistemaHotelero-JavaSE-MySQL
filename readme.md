SHOW DATABASES;

CREATE DATABASE IF NOT EXISTS hoteldb;

USE hoteldb;

SHOW TABLES;

CREATE TABLE IF NOT EXISTS habitacion (
    id INT NOT NULL AUTO_INCREMENT,
    habitacion VARCHAR(10),
    tipo_habitacion VARCHAR(20),
    no_camas VARCHAR(3),
    no_personas VARCHAR(3),
    precio DOUBLE(10,2),
    descripcion VARCHAR(100),
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS registro (
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(45),
    telefono VARCHAR(10),
    habitacion_id INT,
    precio VARCHAR(10),
    checkin DATETIME,
    checkout DATETIME,
    PRIMARY KEY(id),
    FOREIGN KEY (habitacion_id) REFERENCES habitacion(id)
);

CREATE TABLE IF NOT EXISTS solicitud (
    id INT NOT NULL AUTO_INCREMENT,
    fecha DATE,
    servicio VARCHAR(20),
    area VARCHAR(20),
    descripcion VARCHAR(100),
    estado VARCHAR(20),
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS empleado (
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(20),
    apellido VARCHAR(20),
    telefono VARCHAR(10),
    registro DATE,
    tipo_empleado ENUM('Recepcionista', 'Recursos Humanos', 'Mucama', 'Mantenimiento', 'Gerente', 'Guardia', 'Intendente') NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS usuario(
	id INT NOT NULL AUTO_INCREMENT,
    empleado_id INT,
    usuario VARCHAR(10),
    clave VARCHAR(20),
    PRIMARY KEY(id),
    UNIQUE(usuario),
    FOREIGN KEY(empleado_id) REFERENCES empleado(id)
);

-- trigger
DELIMITER //
CREATE TRIGGER after_insert_empleado 
AFTER INSERT ON empleado 
FOR EACH ROW 
BEGIN 
    DECLARE tipo_empleado_prefix CHAR(2); 

    -- Determinar empleado 
    IF NEW.tipo_empleado = 'Recepcionista' THEN 
        SET tipo_empleado_prefix = 'RE'; 
    ELSEIF NEW.tipo_empleado = 'Recursos Humanos' THEN 
        SET tipo_empleado_prefix = 'RH'; 
    ELSEIF NEW.tipo_empleado = 'Mucama' THEN 
        SET tipo_empleado_prefix = 'MU'; 
    ELSEIF NEW.tipo_empleado = 'Mantenimiento' THEN 
        SET tipo_empleado_prefix = 'MA'; 
    ELSEIF NEW.tipo_empleado = 'Gerente' THEN 
        SET tipo_empleado_prefix = 'GE'; 
    ELSEIF NEW.tipo_empleado = 'Guardia' THEN 
        SET tipo_empleado_prefix = 'GU'; 
    ELSEIF NEW.tipo_empleado = 'Intendente' THEN 
        SET tipo_empleado_prefix = 'IN'; 
    ELSE 
        SET tipo_empleado_prefix = 'OT'; 
    END IF; 

    -- Generar nombre de usuario 
    SET @usuario = CONCAT(tipo_empleado_prefix, LEFT(NEW.nombre, 2), LEFT(NEW.apellido,2)); 

    -- Generar contraseña 
    SET @random_string = MD5(RAND()); -- Genera una cadena aleatoria
    SET @random_string = SUBSTRING(@random_string, 1, 8); -- Tomar solo los primeros 8 caracteres de la cadena aleatoria
    SET @clave = CONCAT(LEFT(NEW.nombre, 2), LEFT(NEW.apellido, 2), @random_string);  -- Combinar los primeros 4 caracteres del nombre y apellido con la cadena aleatoria

    -- Insertar en tabla usuario 
    INSERT INTO usuario(empleado_id, usuario, clave) 
    VALUES(NEW.id, @usuario, @clave); 

END;
//
DELIMITER ;

-- Trigger para eliminar usuario después de eliminar empleado
DELIMITER //
CREATE TRIGGER after_delete_empleado 
AFTER DELETE ON empleado 
FOR EACH ROW 
BEGIN 
    -- Eliminar usuario correspondiente al empleado eliminado
    DELETE FROM usuario WHERE empleado_id = OLD.id;
END;
//
DELIMITER ;

-- Trigger para eliminar usuario antes de eliminar empleado
DELIMITER //

CREATE TRIGGER before_delete_empleado 
BEFORE DELETE ON empleado 
FOR EACH ROW 
BEGIN 
    -- Eliminar usuario correspondiente al empleado que se va a eliminar
    DELETE FROM usuario WHERE empleado_id = OLD.id;
END;
//
DELIMITER ;



show tables;
show triggers;

-- Inserts para la tabla 'habitacion'
INSERT INTO habitacion (habitacion, tipo_habitacion, no_camas, no_personas, precio, descripcion)
VALUES ('HB-1', 'Individual','1', '1', '550', 'ninguna'),
       ('HB-2', 'Doble', '2', '2', '1000', 'vista al mar');

-- Inserts para la tabla 'registro'
INSERT INTO registro (nombre, telefono, habitacion_id, precio, checkin, checkout) 
VALUES ('Juan Perez', '7471232425', 1, 1000, '2024-04-25 12:00:00', '2024-04-27 12:00:00'),
       ('Maria Lopez', '7471589688', 2, 550, '2024-04-26 14:00:00', '2024-04-28 10:00:00');

-- Inserts para la tabla 'solicitud'
INSERT INTO solicitud (fecha, servicio, area, descripcion, estado) 
VALUES ('2024-04-25', 'Limpieza', 'Habitaciones', 'Limpiar habitación 101', 'Pendiente'),
       ('2024-04-26', 'Mantenimiento', 'Fontanería', 'Reparar fuga en habitación 201', 'En proceso');

-- Inserts para la tabla 'empleado'
INSERT INTO empleado (nombre, apellido, telefono, registro, tipo_empleado) 
VALUES ('Luis', 'Gonzalez', '7471001520', '2024-04-20', 'Recepcionista'),
       ('Ana', 'Martinez', '7471552236', '2024-04-21', 'Mucama');

-- Resultados después de los inserts
SELECT * FROM habitacion;
SELECT * FROM registro;
SELECT * FROM solicitud;
SELECT * FROM empleado;
SELECT * FROM usuario;

DROP DATABASE hotelDB;
-- ALTER TABLE habitacion
-- MODIFY COLUMN no_camas VARCHAR(3),
-- MODIFY COLUMN no_personas VARCHAR(3),
-- MODIFY COLUMN precio DOUBLE(10,2);

-- ALTER TABLE registro
-- DROP COLUMN precio;

-- ALTER TABLE habitacion
-- DROP COLUMN estado;


