package org.tribalHome.service;

import java.util.List;

import org.tribalHome.model.Carrito;
import org.tribalHome.repository.CarritoRepository;
import org.tribalHome.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoService {

	private final CarritoRepository carritoRepository;
	private final ProductoRepository productoRepository;
	
	@Autowired
    public CarritoService(CarritoRepository carritoRepository, ProductoRepository productoRepository) {
        this.carritoRepository = carritoRepository;
        this.productoRepository = productoRepository;
    }

    // Método para obtener todos los carritos
    public List<Carrito> getAllCarritos() {
        return carritoRepository.findAll();
    }

    // Método para obtener un carrito por ID
    public Carrito getCarrito(Integer id) {
        return carritoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("El carrito con el id [" + id + "] no existe"));
    }
    
    // Método para obtener un carrito por ID de Usuario
    public List<Carrito> getCarritoUsuario(Integer id_usuario) {
    	return carritoRepository.findByUsuarioId(id_usuario);
    }

    // Método para añadir un nuevo carrito
    public Carrito addCarrito(Carrito carrito) {
    	Double precio = 0.00;
    	if(productoRepository.existsById(carrito.getProducto_id_producto())) {
    		precio = productoRepository.findById(carrito.getProducto_id_producto()).get().getPrecio();
    		carrito.setPrecio_total(carrito.getCantidad() * precio);
    	}
    	
    	carritoRepository.save(carrito);
        return carrito; // Devolver el carrito añadido
    }

    // Método para eliminar un carrito por ID
    public Carrito deleteCarrito(Integer id_carrito) {
        Carrito carrito = null;
        if (carritoRepository.existsById(id_carrito)) {
            carrito = carritoRepository.findById(id_carrito).get(); // Si existe, lo eliminamos
            carritoRepository.delete(carrito); // Eliminamos el carrito de la DB
        }
        return carrito; // Devolvemos el carrito eliminado o null si no existía
    }

    // Método para actualizar un carrito
    public Carrito updateCarrito(Integer id_carrito, Carrito carritoActualizado) {
        Carrito carrito = null; // Buscar el carrito por ID
        Double precio = 0.00;
        if (carritoRepository.existsById(id_carrito)) {
        	carrito = carritoRepository.findById(id_carrito).get();
            // Actualizamos los detalles del carrito
        	if(carritoActualizado.getCantidad() != null) carrito.setCantidad(carritoActualizado.getCantidad());
        	if(productoRepository.existsById(carrito.getProducto_id_producto())) {
        		precio = productoRepository.findById(carrito.getProducto_id_producto()).get().getPrecio();
        		carrito.setPrecio_total(carritoActualizado.getCantidad() * precio);
        	}
        	if(carritoActualizado.getEstado() != null) carrito.setEstado(carritoActualizado.getEstado());
        	carritoRepository.save(carrito);
        }
        return carrito; // Devolver el carrito actualizado
    }
}
