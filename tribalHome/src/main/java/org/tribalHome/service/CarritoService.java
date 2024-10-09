package org.tribalHome.service;

import java.util.ArrayList;
import java.util.List;

import org.tribalHome.model.Carrito;
import org.springframework.stereotype.Service;

@Service
public class CarritoService {

    private List<Carrito> carritos = new ArrayList<>();

    // Constructor que pre-pobla la lista de carritos
    public CarritoService() {
        // Predefinimos los carritos con datos simulados
        carritos.add(new Carrito(2, 900.00, "pendiente", 1, 1));
        carritos.add(new Carrito(3, 600.00, "pago", 1, 3));
        carritos.add(new Carrito(5, 2500.00, "pago", 9, 1));
        carritos.add(new Carrito(2, 18000.00, "pendiente", 9, 3));
        carritos.add(new Carrito(4, 498.00, "pago", 5, 2));
    }

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
        }
        return carrito; // Devolver el carrito actualizado
    }
}
