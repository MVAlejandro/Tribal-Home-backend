package org.tribalHome.service;

import java.util.ArrayList;
import java.util.List;

import org.tribalHome.dto.EditPassword;
import org.tribalHome.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    // Inicializamos una lista para almacenar usuarios
    private List<Usuario> usuarios = new ArrayList<>();

    // Método para obtener todos los usuarios
    public List<Usuario> getAllUsuarios() {
        return usuarios; // Devolvemos la lista de usuarios
    }

    // Método para obtener un usuario por ID
    public Usuario getUsuario(int id) {  // Cambiado a int
        return usuarios.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    // Método para añadir un nuevo usuario
    public Usuario addUsuario(Usuario usuario) {
        usuarios.add(usuario); // Añadir el usuario a la lista
        return usuario; // Devolver el usuario añadido
    }

    // Método para eliminar un usuario por ID
    public Usuario deleteUsuario(int usuarioId) {  // Cambiado a int
        Usuario usuario = getUsuario(usuarioId); // Buscamos al usuario
        if (usuario != null) {
            usuarios.remove(usuario); // Si existe, lo eliminamos
        }
        return usuario; // Devolvemos el usuario eliminado (o null si no existía)
    }

    // Método para actualizar un usuario
    public Usuario updateUsuario(int usuarioId, Usuario usuarioActualizado) {  // Cambiado a int
        Usuario usuario = getUsuario(usuarioId); // Buscamos al usuario por ID
        if (usuario != null) {
            // Actualizamos los datos del usuario
            usuario.setNombre(usuarioActualizado.getNombre());
            usuario.setApellidos(usuarioActualizado.getApellidos());
            usuario.setCorreo(usuarioActualizado.getCorreo());
            usuario.setDireccion(usuarioActualizado.getDireccion());
            usuario.setEstado(usuarioActualizado.getEstado());
            usuario.setCodigo_postal(usuarioActualizado.getCodigo_postal());
            usuario.setTelefono(usuarioActualizado.getTelefono());
            usuario.setRol(usuarioActualizado.getRol());
        }
        return usuario; // Devolvemos el usuario actualizado (o null si no existía)
    }

    // Método para cambiar la contraseña
    public Usuario changePassword(int usuarioId, EditPassword editPassword) {  // Cambiado a int
        Usuario usuario = getUsuario(usuarioId); // Buscamos al usuario por ID
        if (usuario != null) {
            // Verificamos si la contraseña actual coincide
            if (usuario.getContrasenia().equals(editPassword.getCurrentPassword())) {
                usuario.setContrasenia(editPassword.getNewPassword()); // Actualizamos la contraseña
                return usuario; // Devolvemos el usuario actualizado
            } else {
                throw new IllegalArgumentException("La contraseña actual no es correcta.");
            }
        }
        throw new IllegalArgumentException("Usuario no encontrado.");
    }
}
