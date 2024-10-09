package org.tribalHome.controller;

import java.util.List;

import org.tribalHome.model.Carrito;
import org.tribalHome.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carrito")
public class CarritoController {

    private final CarritoService carritoService;

    @Autowired
    public CarritoController(CarritoService carritoService) {
        this.carritoService = carritoService;
    }

    // Obtener todos los carritos
    @GetMapping
    public List<Carrito> getCarritos() {
        return carritoService.getAllCarritos();
    }

    // Obtener un carrito por ID
    @GetMapping("/{id_carrito}")
    public Carrito getCarrito(@PathVariable("id_carrito") int id_carrito) {
        return carritoService.getCarrito(id_carrito);
    }

    // Crear un nuevo carrito
    @PostMapping
    public Carrito addCarrito(@RequestBody Carrito carrito) {
        return carritoService.addCarrito(carrito);
    }

    // Actualizar un carrito
    @PutMapping("/{id_carrito}")
    public Carrito updateCarrito(@PathVariable("id_carrito") int id_carrito, @RequestBody Carrito carrito) {
        return carritoService.updateCarrito(id_carrito, carrito);
    }

    // Eliminar un carrito
    @DeleteMapping("/{id_carrito}")
    public Carrito deleteCarrito(@PathVariable("id_carrito") int id_carrito) {
        return carritoService.deleteCarrito(id_carrito);
    }
}
