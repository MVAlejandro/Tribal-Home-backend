package org.tribalHome.service;

import java.util.List;

import org.tribalHome.model.Producto;
import org.tribalHome.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
	
	private final ProductoRepository productoRepository; 
    

    // Constructor que pre-pobla la lista de productos
	@Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // Método para obtener todos los productos
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    // Método para obtener un producto por ID
    public Producto getProducto(Integer id) {
        return productoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("El producto con el id [" + id + "] no existe"));
    }

    // Método para añadir un nuevo producto
    public Producto addProducto(Producto producto) {
        productoRepository.save(producto); // Se agrega el producto a la BD        
        return producto; // Devolver el producto añadido
    }

    // Método para eliminar un producto por ID
    public Producto deleteProducto(Integer id_producto) {
        Producto producto = null; // Inicializamos un objeto producto nulo
        if (productoRepository.existsById(id_producto)) {
        	producto = productoRepository.findById(id_producto).get(); // Si existe el producto en la DB lo asignamos en la varibale que definimos arriba
            productoRepository.delete(producto); // Eliminamos el producto de la DB
        }
        return producto; // Devolvemos el producto eliminado o null si no existía
    }

    // Método para actualizar un producto
    public Producto updateProducto(Integer id_producto, Producto productoActualizado) {
        Producto producto = null; // Inicializamos un objeto producto nulo
        if (productoRepository.existsById(id_producto)) {// Buscar el producto por ID
        	producto = productoRepository.findById(id_producto).get(); // Si existe el producto en la DB lo asignamos en la varibale que definimos arriba
            // Actualizamos los detalles del producto
        	if(productoActualizado.getNombre_producto() != null) producto.setNombre_producto(productoActualizado.getNombre_producto());
        	if(productoActualizado.getDescripcion() != null) producto.setDescripcion(productoActualizado.getDescripcion());
        	if(productoActualizado.getPrecio() != null) producto.setPrecio(productoActualizado.getPrecio());
        	if(productoActualizado.getCategoria() != null) producto.setCategoria(productoActualizado.getCategoria());
        	if(productoActualizado.getImagen() != null) producto.setImagen(productoActualizado.getImagen());
        	if(productoActualizado.getStock() != null) producto.setStock(productoActualizado.getStock());
        	productoRepository.save(producto);
        }
        return producto; // Devolver el producto actualizado
    }
}
