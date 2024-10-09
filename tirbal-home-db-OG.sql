-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`usuario` (
  `id_usuario` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  `apellidos` VARCHAR(100) NOT NULL,
  `estados` VARCHAR(50) NOT NULL,
  `codigo_postal` CHAR(5) NOT NULL,
  `direccion` VARCHAR(255) NOT NULL,
  `telefono` CHAR(10) NOT NULL,
  `correo` VARCHAR(200) NOT NULL,
  `contrasenia` VARCHAR(100) NOT NULL,
  `rol` ENUM('admin', 'cliente') NOT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE INDEX `correo_UNIQUE` (`correo` ASC) VISIBLE,
  UNIQUE INDEX `telefono_UNIQUE` (`telefono` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`producto` (
  `id_producto` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre_producto` VARCHAR(100) NOT NULL,
  `descripcion` TEXT NOT NULL,
  `precio` DECIMAL(10,2) UNSIGNED NOT NULL,
  `categoria` VARCHAR(100) NOT NULL,
  `imagen` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_producto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`carrito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`carrito` (
  `id_carrito` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `usuario_id_usuario` INT UNSIGNED NOT NULL,
  `producto_id_producto` INT UNSIGNED NOT NULL,
  `cantidad` INT UNSIGNED NOT NULL,
  `precio_total` DECIMAL UNSIGNED NOT NULL,
  `estado` ENUM('pendiente', 'pago') NOT NULL,
  PRIMARY KEY (`id_carrito`, `usuario_id_usuario`, `producto_id_producto`),
  INDEX `fk_carrito_usuario1_idx` (`usuario_id_usuario` ASC) VISIBLE,
  INDEX `fk_carrito_producto1_idx` (`producto_id_producto` ASC) VISIBLE,
  CONSTRAINT `fk_carrito_usuario1`
    FOREIGN KEY (`usuario_id_usuario`)
    REFERENCES `mydb`.`usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_carrito_producto1`
    FOREIGN KEY (`producto_id_producto`)
    REFERENCES `mydb`.`producto` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
