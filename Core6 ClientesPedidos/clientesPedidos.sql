-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema clientesPedidos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema clientesPedidos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `clientesPedidos` DEFAULT CHARACTER SET utf8 ;
USE `clientesPedidos` ;

-- -----------------------------------------------------
-- Table `clientesPedidos`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clientesPedidos`.`clientes` (
  `id_cliente` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(100) NOT NULL,
  `telefono` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`id_cliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `clientesPedidos`.`pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clientesPedidos`.`pedidos` (
  `id_pedido` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `total` FLOAT NOT NULL,
  `clientes_id_cliente` INT NOT NULL,
  PRIMARY KEY (`id_pedido`, `clientes_id_cliente`),
  INDEX `fk_pedidos_clientes_idx` (`clientes_id_cliente` ASC) VISIBLE,
  CONSTRAINT `fk_pedidos_clientes`
    FOREIGN KEY (`clientes_id_cliente`)
    REFERENCES `clientesPedidos`.`clientes` (`id_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
