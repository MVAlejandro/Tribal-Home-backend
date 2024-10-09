package org.tribalHome.service;

import java.util.List;
import java.util.ArrayList;

import org.tribalHome.model.Producto;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    private List<Producto> productos = new ArrayList<>();
    private int nextId = 1; // Manejador de ID

    // Obtener todos los productos
    public List<Producto> getAllProductos() {
        return productos;
    }

    // Obtener un producto por ID
    public Producto getProducto(int id) {
        return productos.stream().filter(p -> p.getId_producto() == id).findFirst().orElse(null);
    }

    // Agregar un nuevo producto
    public Producto addProducto(Producto producto) {
        producto.setId_producto(nextId++); // Asignar ID único
        productos.add(producto);
        return producto;
    }

    // Eliminar un producto por ID
    public Producto deleteProducto(int id) {
        Producto producto = getProducto(id);
        if (producto != null) {
            productos.remove(producto);
        }
        return producto;
    }

    // Actualizar un producto por ID
    public Producto updateProducto(int id, Producto productoActualizado) {
        Producto producto = getProducto(id);
        if (producto != null) {
            producto.setNombre_producto(productoActualizado.getNombre_producto());
            producto.setDescripcion(productoActualizado.getDescripcion());
            producto.setPrecio(productoActualizado.getPrecio());
            producto.setCategoria(productoActualizado.getCategoria());
            producto.setImagen(productoActualizado.getImagen());
            producto.setStock(productoActualizado.getStock());
        }
        return producto;
    }
}
