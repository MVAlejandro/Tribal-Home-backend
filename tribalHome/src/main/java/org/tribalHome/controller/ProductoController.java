package org.tribalHome.controller;

import java.util.List;

import org.tribalHome.model.Producto;
import org.tribalHome.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/productos/") // http://localhost:8080/api/productos/
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> getProductos() {
        return productoService.getAllProductos();
    }

    @GetMapping(path = "{productoId}")
    public Producto getProducto(@PathVariable("productoId") int productoId) { // Cambiar Long a int
        return productoService.getProducto(productoId);
    }

    @PostMapping
    public Producto addProducto(@RequestBody Producto producto) {
        return productoService.addProducto(producto);
    }

    @DeleteMapping(path = "{productoId}")
    public Producto deleteProducto(@PathVariable("productoId") int productoId) { // Cambiar Long a int
        return productoService.deleteProducto(productoId);
    }

    @PutMapping(path = "{productoId}")
    public Producto updateProducto(@RequestBody Producto producto,
                                   @PathVariable("productoId") int productoId) { // Cambiar Long a int
        return productoService.updateProducto(productoId, producto);
    }
}
