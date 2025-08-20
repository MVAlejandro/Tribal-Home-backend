package org.tribalHome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tribalHome.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
