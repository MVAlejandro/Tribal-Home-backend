package org.tribalHome.controller;

import java.util.List;

import org.tribalHome.model.Carrito;
import org.tribalHome.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carrito")
@CrossOrigin(origins = "http://127.0.0.1:5500")
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
    public Carrito getCarrito(@PathVariable("id_carrito") Integer id_carrito) {
        return carritoService.getCarrito(id_carrito);
    }
    
    // Obtener un carrito por ID de Usuario
    @GetMapping("usuario/{id_usuario}")
    public List<Carrito> getCarritoUsuario(@PathVariable("id_usuario") Integer id_usuario) {
        return carritoService.getCarritoUsuario(id_usuario);
    }

    // Crear un nuevo carrito
    @PostMapping
    public Carrito addCarrito(@RequestBody Carrito carrito) {
        return carritoService.addCarrito(carrito);
    }

    // Actualizar un carrito
    @PutMapping("/actualizar/{id_carrito}")
    public Carrito updateCarrito(@PathVariable("id_carrito") Integer id_carrito, @RequestBody Carrito carrito) {
        return carritoService.updateCarrito(id_carrito, carrito);
    }

    // Eliminar un carrito
    @DeleteMapping("/eliminar/{id_carrito}")
    public Carrito deleteCarrito(@PathVariable("id_carrito") Integer id_carrito) {
        return carritoService.deleteCarrito(id_carrito);
    }
}
