CREATE SCHEMA `hotelistycs` DEFAULT CHARACTER SET latin1 COLLATE latin1_bin ;

USE  hotelistycs;

CREATE TABLE `hotelistycs`.`cuenta` (
  `id_cucuentaenta` INT NOT NULL AUTO_INCREMENT,
  `tipo_cuenta` ENUM('administrador', 'recepcionista') NOT NULL,
  `contra` CHAR(8) NOT NULL,
  `user_name` VARCHAR(15) NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `apellido_pat` VARCHAR(50) NOT NULL,
  `apellido_mat` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id_cuenta`));

CREATE TABLE `hotelistycs`.`huesped` (
  `id_huesped` INT NOT NULL AUTO_INCREMENT,
  `fecha_nac` DATE NOT NULL,
  `hnombre` VARCHAR(50) NOT NULL,
  `hapellido_pat` VARCHAR(50) NOT NULL,
  `hapellido_mat` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id_huesped`));
  
CREATE TABLE `hotelistycs`.`cama` (
  `id_cama` INT NOT NULL AUTO_INCREMENT,
  `tipo_cama` ENUM('Default') NOT NULL,
  PRIMARY KEY (`id_cama`));

CREATE TABLE `hotelistycs`.`tipo_cuarto` (
  `id_tipo_cuarto` INT NOT NULL AUTO_INCREMENT,
  `tipo` ENUM('Default') NOT NULL,
  `precio_noche` DECIMAL(8,2) NOT NULL,
  PRIMARY KEY (`id_tipo_cuarto`));

CREATE TABLE `hotelistycs`.`cuarto` (
  `id_cuarto` INT NOT NULL AUTO_INCREMENT,
  `num_piso` BIT(64) NOT NULL,
  `max_huespedes` BIT(64) NOT NULL,
  `num_cuarto` SMALLINT NOT NULL,
  `estado` ENUM('disponible', 'ocupado') NOT NULL,
  `id_tipo_cuarto` INT NOT NULL,
  PRIMARY KEY (`id_cuarto`),
  INDEX `id_tipo_cuarto_idx` (`id_tipo_cuarto` ASC) VISIBLE,
  CONSTRAINT `id_tipo_cuarto`
    FOREIGN KEY (`id_tipo_cuarto`)
    REFERENCES `hotelistycs`.`tipo_cuarto` (`id_tipo_cuarto`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
    
CREATE TABLE `hotelistycs`.`cama_cuarto` (
  `id_cama_cuarto` INT NOT NULL AUTO_INCREMENT,
  `id_cama` INT NOT NULL,
  `id_cuarto` INT NOT NULL,
  PRIMARY KEY (`id_cama_cuarto`),
  INDEX `id_cama_idx` (`id_cama` ASC) VISIBLE,
  INDEX `id_ccuarto_idx` (`id_cuarto` ASC) VISIBLE,
  CONSTRAINT `id_cama`
    FOREIGN KEY (`id_cama`)
    REFERENCES `hotelistycs`.`cama` (`id_cama`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `id_ccuarto`
    FOREIGN KEY (`id_cuarto`)
    REFERENCES `hotelistycs`.`cuarto` (`id_cuarto`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE `hotelistycs`.`servicio` (
  `id_servicio` INT NOT NULL AUTO_INCREMENT,
  `tipo_servicio` VARCHAR(100) NOT NULL,
  `precio_servicio` DECIMAL(8,2) NOT NULL,
  PRIMARY KEY (`id_servicio`));
  
CREATE TABLE `hotelistycs`.`paquete` (
  `id_paquete` INT NOT NULL AUTO_INCREMENT,
  `num_cuartos` BIT(64) NOT NULL,
  `precio_paquete` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`id_paquete`));
  
CREATE TABLE `hotelistycs`.`servicio_paquete` (
  `id_servicio_paquete` INT NOT NULL AUTO_INCREMENT,
  `id_servicio` INT NOT NULL,
  `id_paquete` INT NOT NULL,
  PRIMARY KEY (`id_servicio_paquete`),
  INDEX `id_spaquete_idx` (`id_paquete` ASC) VISIBLE,
  INDEX `id_servicio_idx` (`id_servicio` ASC) VISIBLE,
  CONSTRAINT `id_spaquete`
    FOREIGN KEY (`id_paquete`)
    REFERENCES `hotelistycs`.`paquete` (`id_paquete`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `id_servicio`
    FOREIGN KEY (`id_servicio`)
    REFERENCES `hotelistycs`.`servicio` (`id_servicio`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE `hotelistycs`.`cuarto_paquete` (
  `id_cuarto_paquete` INT NOT NULL AUTO_INCREMENT,
  `id_cuarto` INT NOT NULL,
  `id_paquete` INT NOT NULL,
  PRIMARY KEY (`id_cuarto_paquete`),
  INDEX `id_cuarto_idx` (`id_cuarto` ASC) VISIBLE,
  INDEX `id_cpaquete_idx` (`id_paquete` ASC) VISIBLE,
  CONSTRAINT `id_cuarto`
    FOREIGN KEY (`id_cuarto`)
    REFERENCES `hotelistycs`.`cuarto` (`id_cuarto`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `id_cpaquete`
    FOREIGN KEY (`id_paquete`)
    REFERENCES `hotelistycs`.`paquete` (`id_paquete`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
    
CREATE TABLE `hotelistycs`.`reservacion` (
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
    REFERENCES `hotelistycs`.`cuenta` (`id_cuenta`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `id_huesped`
    FOREIGN KEY (`id_huesped`)
    REFERENCES `hotelistycs`.`huesped` (`id_huesped`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE `hotelistycs`.`reservacion_paquete` (
  `id_reservacion_paquete` INT NOT NULL AUTO_INCREMENT,
  `id_paquete` INT NOT NULL,
  `id_reservacion` INT NOT NULL,
  PRIMARY KEY (`id_reservacion_paquete`),
  INDEX `id_paquete_idx` (`id_paquete` ASC) VISIBLE,
  CONSTRAINT `id_paquete`
    FOREIGN KEY (`id_paquete`)
    REFERENCES `hotelistycs`.`paquete` (`id_paquete`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `id_reservacion`
    FOREIGN KEY (`id_reservacion_paquete`)
    REFERENCES `hotelistycs`.`reservacion` (`id_reservacion`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);  
    
INSERT INTO cuenta (tipo_cuenta, contra, user_name, nombre, apellido_pat, apellido_mat) VALUES ("administrador", "admin", "admin", "admin", "admin", "admin");
INSERT INTO cuenta (tipo_cuenta, contra, user_name, nombre, apellido_pat, apellido_mat) VALUES ("administrador", "Yomeroll", "Yomeroll", "Yomeroll", "Yomeroll", "Yomeroll");
INSERT INTO cuenta (tipo_cuenta, contra, user_name, nombre, apellido_pat, apellido_mat) VALUES ("recepcion", "Yomeroll", "Yomeroll23", "Yomeroll23", "Yomeroll23", "Yomeroll23");
DELETE FROM cuenta WHERE id_cuenta=6;    
SELECT * FROM cuenta WHERE user_name="admin";