package org.tribalHome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tribalHome.model.Carrito;

import java.util.List;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Integer>{
	List<Carrito> findByUsuarioId(Integer usuarioId);

}
