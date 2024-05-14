CREATE SCHEMA `hotelystic` DEFAULT CHARACTER SET latin1 COLLATE latin1_bin ;

USE  hotelystic;

CREATE TABLE `hotelystic`.`cuenta` (
  `id_cuenta` INT NOT NULL AUTO_INCREMENT,
  `tipo_cuenta` ENUM('administrador', 'recepcionista') NOT NULL,
  `contra` CHAR(8) NOT NULL,
  `user_name` VARCHAR(15) NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `apellido_pat` VARCHAR(50) NOT NULL,
  `apellido_mat` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id_cuenta`));

CREATE TABLE `hotelystic`.`huesped` (
  `id_huesped` INT NOT NULL AUTO_INCREMENT,
  `fecha_nac` DATE NOT NULL,
  `hnombre` VARCHAR(50) NOT NULL,
  `hapellido_pat` VARCHAR(50) NOT NULL,
  `hapellido_mat` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id_huesped`));
  
CREATE TABLE `hotelystic`.`cama` (
  `id_cama` INT NOT NULL AUTO_INCREMENT,
  `tipo_cama` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id_cama`));

CREATE TABLE `hotelystic`.`tipo_cuarto` (
  `id_tipo_cuarto` INT NOT NULL AUTO_INCREMENT,
  `tipo`  VARCHAR(50) NOT NULL,
  `precio_noche` DECIMAL(8,2) NOT NULL,
  PRIMARY KEY (`id_tipo_cuarto`));

CREATE TABLE `hotelystic`.`cuarto` (
  `id_cuarto` INT NOT NULL AUTO_INCREMENT,
  `num_piso` BIT(64) NOT NULL,
  `max_huespedes` BIT(64) NOT NULL,
  `num_cuarto` SMALLINT NOT NULL,
  `estado` ENUM('Disponible', 'Ocupado') NOT NULL,
  `id_tipo_cuarto` INT NOT NULL,
  PRIMARY KEY (`id_cuarto`),
  INDEX `id_tipo_cuarto_idx` (`id_tipo_cuarto` ASC) VISIBLE,
  CONSTRAINT `id_tipo_cuarto`
    FOREIGN KEY (`id_tipo_cuarto`)
    REFERENCES `hotelystic`.`tipo_cuarto` (`id_tipo_cuarto`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
    
CREATE TABLE `hotelystic`.`cama_cuarto` (
  `id_cama_cuarto` INT NOT NULL AUTO_INCREMENT,
  `id_cama` INT NOT NULL,
  `id_cuarto` INT NOT NULL,
  PRIMARY KEY (`id_cama_cuarto`),
  INDEX `id_cama_idx` (`id_cama` ASC) VISIBLE,
  INDEX `id_ccuarto_idx` (`id_cuarto` ASC) VISIBLE,
  CONSTRAINT `id_cama`
    FOREIGN KEY (`id_cama`)
    REFERENCES `hotelystic`.`cama` (`id_cama`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `id_ccuarto`
    FOREIGN KEY (`id_cuarto`)
    REFERENCES `hotelystic`.`cuarto` (`id_cuarto`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE `hotelystic`.`servicio` (
  `id_servicio` INT NOT NULL AUTO_INCREMENT,
  `tipo_servicio` VARCHAR(100) NOT NULL,
  `precio_servicio` DECIMAL(8,2) NOT NULL,
  PRIMARY KEY (`id_servicio`));
  
CREATE TABLE `hotelystic`.`paquete` (
  `id_paquete` INT NOT NULL AUTO_INCREMENT,
  `num_cuartos` BIT(64) NOT NULL,
  `precio_paquete` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`id_paquete`));
  
CREATE TABLE `hotelystic`.`servicio_paquete` (
  `id_servicio_paquete` INT NOT NULL AUTO_INCREMENT,
  `id_servicio` INT NOT NULL,
  `id_paquete` INT NOT NULL,
  PRIMARY KEY (`id_servicio_paquete`),
  INDEX `id_spaquete_idx` (`id_paquete` ASC) VISIBLE,
  INDEX `id_servicio_idx` (`id_servicio` ASC) VISIBLE,
  CONSTRAINT `id_spaquete`
    FOREIGN KEY (`id_paquete`)
    REFERENCES `hotelystic`.`paquete` (`id_paquete`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `id_servicio`
    FOREIGN KEY (`id_servicio`)
    REFERENCES `hotelystic`.`servicio` (`id_servicio`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE `hotelystic`.`cuarto_paquete` (
  `id_cuarto_paquete` INT NOT NULL AUTO_INCREMENT,
  `id_cuarto` INT NOT NULL,
  `id_paquete` INT NOT NULL,
  PRIMARY KEY (`id_cuarto_paquete`),
  INDEX `id_cuarto_idx` (`id_cuarto` ASC) VISIBLE,
  INDEX `id_cpaquete_idx` (`id_paquete` ASC) VISIBLE,
  CONSTRAINT `id_cuarto`
    FOREIGN KEY (`id_cuarto`)
    REFERENCES `hotelystic`.`cuarto` (`id_cuarto`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `id_cpaquete`
    FOREIGN KEY (`id_paquete`)
    REFERENCES `hotelystic`.`paquete` (`id_paquete`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
    
CREATE TABLE `hotelystic`.`reservacion` (
  `id_reservacion` INT NOT NULL AUTO_INCREMENT,
  `num_noches` INT NOT NULL,
  `checkin` TIME NULL,
  `checkout` TIME NULL,
  `fecha_llegada` DATE NOT NULL,
  `fecha_salida` DATE NOT NULL,
  `num_padultas` BIT(64) NOT NULL,
  `num_pmenores` BIT(64) NOT NULL,
  `forma_pago` SET('efectivo', 'debito', 'credito', 'trasnferencia') NOT NULL,
  `id_cuenta` INT NOT NULL,
  `id_huesped` INT NOT NULL,
  PRIMARY KEY (`id_reservacion`),
  INDEX `id_cuenta_idx` (`id_cuenta` ASC) VISIBLE,
  INDEX `id_huesped_idx` (`id_huesped` ASC) VISIBLE,
  CONSTRAINT `id_cuenta`
    FOREIGN KEY (`id_cuenta`)
    REFERENCES `hotelystic`.`cuenta` (`id_cuenta`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `id_huesped`
    FOREIGN KEY (`id_huesped`)
    REFERENCES `hotelystic`.`huesped` (`id_huesped`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE `hotelystic`.`reservacion_paquete` (
  `id_reservacion_paquete` INT NOT NULL AUTO_INCREMENT,
  `id_paquete` INT NOT NULL,
  `id_reservacion` INT NOT NULL,
  PRIMARY KEY (`id_reservacion_paquete`),
  INDEX `id_paquete_idx` (`id_paquete` ASC) VISIBLE,
  CONSTRAINT `id_paquete`
    FOREIGN KEY (`id_paquete`)
    REFERENCES `hotelystic`.`paquete` (`id_paquete`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `id_reservacion`
    FOREIGN KEY (`id_reservacion_paquete`)
    REFERENCES `hotelystic`.`reservacion` (`id_reservacion`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);  

SET SQL_SAFE_UPDATES= 0;
SET SQL_SAFE_UPDATES= 1;    
INSERT INTO cuenta (tipo_cuenta, contra, user_name, nombre, apellido_pat, apellido_mat) VALUES ("administrador", "admin", "admin", "admin", "admin", "admin");
INSERT INTO cuenta (tipo_cuenta, contra, user_name, nombre, apellido_pat, apellido_mat) VALUES ("administrador", "Yomeroll", "Yomeroll", "Yomeroll", "Yomeroll", "Yomeroll");
INSERT INTO cuenta (tipo_cuenta, contra, user_name, nombre, apellido_pat, apellido_mat) VALUES ("administrador", "Yomeroll", "Yomeroll23", "Sebastián", "Cortés", "Benrey");
INSERT INTO cuenta (tipo_cuenta, contra, user_name, nombre, apellido_pat, apellido_mat) VALUES ("recepcion", "Yomeroll", "Yomeroll23", "Yomeroll23", "Yomeroll23", "Yomeroll23");

SELECT * FROM cuenta WHERE tipo_cuenta="administrador" or  user_name="Yomeroll";

DELETE FROM cuenta WHERE user_name="Yomeroll";    
SELECT * FROM cuenta WHERE user_name="admin";

