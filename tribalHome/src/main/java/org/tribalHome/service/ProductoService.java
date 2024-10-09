package org.tribalHome.service;

import java.util.ArrayList;
import java.util.List;

import org.tribalHome.model.Producto;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    private List<Producto> productos = new ArrayList<>();

    // Constructor que pre-pobla la lista de productos
    public ProductoService() {
        // Predefinimos los productos con datos simulados
        productos.add(new Producto(1, "Enfriador de vino", "Elegante enfriador de mármol ideal para mantener la temperatura de tu botella de vino.", 450.00, "Decoración", "./assets/muebles/deco-1.png", 1000));
        productos.add(new Producto(2, "Armario de madera tradicional", "Armario de madera práctico y versátil, se adapta a diversas necesidades de almacenamiento con un diseño clásico.", 6000.00, "Muebles", "./assets/muebles/mueble-8.png", 10));
        productos.add(new Producto(3, "Cesto de yute trenzado", "Cesto hecho a mano en yute con dos asas superiores.", 600.00, "Almacenamiento", "./assets/muebles/deco-7.png", 25));
        productos.add(new Producto(4, "Funda de cojín en mezcla de lino", "Funda de cojín clásica en tejido de lino y algodón color verde.", 249.00, "Decoración", "./assets/muebles/image-1.png", 5));
        productos.add(new Producto(5, "Aparador multiusos nórdico", "Aparador moderno estilo nórdico con amplios espacios de almacenamiento y se adapta a cualquier decoración con sus tonos blancos y café.", 2500.00, "Muebles", "./assets/muebles/mueble-2.png", 500));
    }

    // Método para obtener todos los productos
    public List<Producto> getAllProductos() {
        return productos;
    }

    // Método para obtener un producto por ID
    public Producto getProducto(int id) {
        return productos.stream().filter(p -> p.getId_producto() == id).findFirst().orElse(null);
    }

    // Método para añadir un nuevo producto
    public Producto addProducto(Producto producto) {
        productos.add(producto); // Añadir el producto a la lista
        return producto; // Devolver el producto añadido
    }

    // Método para eliminar un producto por ID
    public Producto deleteProducto(int id_producto) {
        Producto producto = getProducto(id_producto); // Buscar el producto
        if (producto != null) {
            productos.remove(producto); // Si existe, lo eliminamos
        }
        return producto; // Devolvemos el producto eliminado o null si no existía
    }

    // Método para actualizar un producto
    public Producto updateProducto(int id_producto, Producto productoActualizado) {
        Producto producto = getProducto(id_producto); // Buscar el producto por ID
        if (producto != null) {
            // Actualizamos los detalles del producto
            producto.setNombre_producto(productoActualizado.getNombre_producto());
            producto.setDescripcion(productoActualizado.getDescripcion());
            producto.setPrecio(productoActualizado.getPrecio());
            producto.setCategoria(productoActualizado.getCategoria());
            producto.setImagen(productoActualizado.getImagen());
            producto.setStock(productoActualizado.getStock());
        }
        return producto; // Devolver el producto actualizado
    }
}
