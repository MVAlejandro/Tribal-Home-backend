package org.tribalHome.controller;

import java.util.List;

import org.tribalHome.model.Producto;
import org.tribalHome.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins= "http://127.0.0.1.5500")
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    // Obtener todos los productos
    @GetMapping
    public List<Producto> getProductos() {
        return productoService.getAllProductos();
    }

    // Obtener un producto por ID
    @GetMapping("/{id_producto}")
    public Producto getProducto(@PathVariable("id_producto") int id_producto) {
        return productoService.getProducto(id_producto);
    }

    // Crear un nuevo producto
    @PostMapping("/agregar")
    public Producto addProducto(@RequestBody Producto producto) {
        return productoService.addProducto(producto);
    }

    // Actualizar un producto
    @PutMapping("/{id_producto}")
    public Producto updateProducto(@PathVariable("id_producto") int id_producto, @RequestBody Producto producto) {
        return productoService.updateProducto(id_producto, producto);
    }

    // Eliminar un producto
    @DeleteMapping("/{id_producto}")
    public Producto deleteProducto(@PathVariable("id_producto") int id_producto) {
        return productoService.deleteProducto(id_producto);
    }
}
