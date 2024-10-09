package org.tribalHome.service;

import java.util.ArrayList;
import java.util.List;

import org.tribalHome.model.Carrito;
import org.springframework.stereotype.Service;

@Service
public class CarritoService {

    private List<Carrito> carritos = new ArrayList<>(); // Almacena los carritos en memoria (para pruebas)

    // Método para obtener todos los carritos
    public List<Carrito> getAllCarritos() {
        return carritos;
    }

    // Método para obtener un carrito por ID
    public Carrito getCarrito(int id) {
        return carritos.stream().filter(c -> c.getId_carrito() == id).findFirst().orElse(null);
    }

    // Método para añadir un nuevo carrito
    public Carrito addCarrito(Carrito carrito) {
        carritos.add(carrito); // Añadir el carrito a la lista
        return carrito; // Devolver el carrito añadido
    }

    // Método para eliminar un carrito por ID
    public Carrito deleteCarrito(int id_carrito) {
        Carrito carrito = getCarrito(id_carrito); // Buscar el carrito
        if (carrito != null) {
            carritos.remove(carrito); // Si existe, lo eliminamos
        }
        return carrito; // Devolvemos el carrito eliminado o null si no existía
    }

    // Método para actualizar un carrito
    public Carrito updateCarrito(int id_carrito, Carrito carritoActualizado) {
        Carrito carrito = getCarrito(id_carrito); // Buscar el carrito por ID
        if (carrito != null) {
            // Actualizamos los detalles del carrito
            carrito.setCantidad(carritoActualizado.getCantidad());
            carrito.setPrecio_total(carritoActualizado.getPrecio_total());
            carrito.setEstado(carritoActualizado.getEstado());
            carrito.setUsuario_id_usuario(carritoActualizado.getUsuario_id_usuario());
            carrito.setProducto_id_producto(carritoActualizado.getProducto_id_producto());
        }
        return carrito; // Devolver el carrito actualizado
    }
}
