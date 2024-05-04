CREATE DATABASE hotelistycs;
USE hotelistycs;

CREATE TABLE `usuario` (
  `id_Usuario` INT NOT NULL AUTO_INCREMENT,
  `Usuario` VARCHAR(15) NOT NULL,
  `nombre_U` VARCHAR(45) NOT NULL,
  `Apellido_PU` VARCHAR(45) NOT NULL,
  `Apellido_MU` VARCHAR(45) NOT NULL,
  `password` CHAR(8) NOT NULL,
  `tipo_Usuario` ENUM('Administrador', 'Recepcionista') NOT NULL,
  PRIMARY KEY (`id_Usuario`));
  
  INSERT INTO usuario
  VALUES (1,"Admin","Admin","Admin","Admin","Admin123","Administrador");
  
  