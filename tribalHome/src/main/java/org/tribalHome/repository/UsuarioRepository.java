package org.tribalHome.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tribalHome.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	Optional<Usuario> findByCorreo(String correo);
}
