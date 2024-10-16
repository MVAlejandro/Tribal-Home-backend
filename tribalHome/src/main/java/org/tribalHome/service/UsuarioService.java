package org.tribalHome.service;

import java.util.List;
import java.util.Optional;

//import org.tribalHome.dto.EditPassword;
import org.tribalHome.dto.EditUser;
import org.tribalHome.model.Usuario;
import org.tribalHome.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    @Autowired
	private PasswordEncoder encoder;
    
    public UsuarioService(UsuarioRepository usuarioRepository) {
    	this.usuarioRepository = usuarioRepository;
    }
    // Método para obtener todos los usuarios
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll(); // Devolvemos los usuarios de la BD
    }

    // Método para obtener un usuario por ID
    public Usuario getUsuario(Integer id) {  // Cambiado a int
        return usuarioRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("El usuario con el id ["+ id + "] no existe"));
    }

    // Método para añadir un nuevo usuario
    public Usuario addUsuario(Usuario usuario) {
    	Optional<Usuario> user = usuarioRepository.findByCorreo(usuario.getCorreo()); // Vemos si el correo ya ha sido registrado
    	if(user.isEmpty()) {
    		usuario.setContrasenia(encoder.encode(usuario.getContrasenia()));
    		return usuarioRepository.save(usuario); // Devolver el usuario añadido
    	}else {
    		System.out.println("El el correo ["+ usuario.getCorreo() +"] ya se encuentra registrado");
    		return null; // Devolver nulo
    	}  
    }

    // Método para eliminar un usuario por ID
    public Usuario deleteUsuario(Integer usuarioId) {  // Cambiado a int
        Usuario usuario = null; // Inicializamos un objeto usuario nulo
        if (usuarioRepository.existsById(usuarioId)) {
        	usuario = usuarioRepository.findById(usuarioId).get();// Si existe el usuario en la DB lo asignamos en la varibale que definimos arriba
            usuarioRepository.delete(usuario); // Eliminamos el usuario de la DB
        }
        return usuario; // Devolvemos el usuario eliminado (o null si no existía)
    }  
    
    // 	Método para editar a un usuario
	public Usuario editUser(Integer usuarioId, EditUser editUser) {
		Usuario usuario = null; // Buscamos al usuario por ID
        if (usuarioRepository.existsById(usuarioId)) {
        	usuario = usuarioRepository.findById(usuarioId).get();
            // Verificamos si la contraseña actual coincide
            if(encoder.matches(editUser.getCurrentPassword(), usuario.getContrasenia())){
                if(editUser.getNewPassword() != null)usuario.setContrasenia(encoder.encode(editUser.getNewPassword())); // Actualizamos la contraseña
                if(editUser.getNombre() != null) usuario.setNombre(editUser.getNombre());
                if(editUser.getApellidos() != null) usuario.setApellidos(editUser.getApellidos());
                if(editUser.getCodigo_postal() != null) usuario.setCodigo_postal(editUser.getCodigo_postal());
                if(editUser.getDireccion() != null) usuario.setDireccion(editUser.getDireccion());
                if(editUser.getEstado() != null) usuario.setEstado(editUser.getEstado());
                if(editUser.getTelefono() != null) usuario.setTelefono(editUser.getTelefono());
                return usuarioRepository.save(usuario);
            } else {
                throw new IllegalArgumentException("La contraseña actual no es correcta.");
            }
        }
        throw new IllegalArgumentException("Usuario no encontrado.");
	}
	
	// Método para iniciar sesión
	public Usuario loginUser(Usuario usuario) {
		Optional<Usuario> user = usuarioRepository.findByCorreo(usuario.getCorreo()); // Vemos si el correo ya ha sido registrado
    	if(!user.isEmpty()) {
    		if(encoder.matches(usuario.getContrasenia(), user.get().getContrasenia())){
    			return user.get();
    		} else {
    			System.out.println("Las contraseñas no coinciden.");
    			return null;
    		}
    	}else {
    		return null; // Devolver nulo
    	}  
	}
	
	// Método para validar registro, devuelve verdadero o falso si el correo ya se encuentra en uso
	public Boolean validarRegistro(String correo) {
		Optional<Usuario> user = usuarioRepository.findByCorreo(correo); // Vemos si el correo ya ha sido registrado
    	if(user.isEmpty()) {
    		return true;
    	}else {
    		return false;
    	}
	}
	
	public Boolean validarCambio(Integer id, EditUser editUser) {
		Optional<Usuario> user = usuarioRepository.findById(id); // Vemos si el usuario existe
		if(!user.isEmpty()) {
			if(encoder.matches(editUser.getCurrentPassword(), user.get().getContrasenia())){
				return true;
			}	
    	}
		return false;

	}
}
