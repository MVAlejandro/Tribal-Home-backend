package org.tribalHome.service;

import java.util.ArrayList;
import java.util.List;

import org.tribalHome.dto.EditPassword;
import org.tribalHome.model.Usuario;
import org.tribalHome.model.Usuario.Rol;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    // Inicializamos una lista para almacenar usuarios
    private List<Usuario> usuarios = new ArrayList<>();
    
    public UsuarioService() {
    	usuarios.add(new Usuario("Jose Alberto", "Rivera Lara", "México", "55238", "Abedules Mz.1", "5581872363", "joseariverala12@gmail.com", "Contrasenia1+", Rol.USUARIO));
    	usuarios.add(new Usuario("Alejandro", "Martínez Vargas", "México", "56100", "Cerrada 16 de Septiembre", "5611477897", "alejandromv.2212@gmail.com", "Contrasenia2", Rol.ADMIN));
    	usuarios.add(new Usuario("Dafne Paola", "Sandoval Sánchez", "México", "54740", "Atlanta 28", "5536465968", "dafne25@gmail.com", "Contrasenia4$", Rol.ADMIN));
    	usuarios.add(new Usuario("Fernando", "Ramírez Sánchez", "México", "55280", "Valle de Tormes", "5539912382", "soler3258@gmail.com", "Contrasenia5...", Rol.USUARIO));
    	usuarios.add(new Usuario("Luis Fernando", "Cruz Coronel", "Ciudad de México", "09850", "Santa Martha 8", "5631515692", "fernando.coronel.dev@gmail.com", "Nomelase24++", Rol.ADMIN));
    	usuarios.add(new Usuario("Kristopher", "Jaramillo Vega", "México", "56585", "Chabacano Mz. 34", "5611706572", "kristopher12@gmail.com", "Contrasenia3?", Rol.ADMIN));
    	usuarios.add(new Usuario("Iván", "Orozco Hernández", "México", "55270", "Adolfo Lopéz Mateos 33", "5512479260", "ivanorozcohdez1@gmail.com", "ElKrisamaaFer<3", Rol.ADMIN));
    	usuarios.add(new Usuario("Ricardo Adrian", "Alfaro Garcia", "México", "52282", "Santa Matilde Mz. 19 Lt. 27", "7222605510", "7222605510@gmail.com", "TribalHome#_#5", Rol.ADMIN));
    	usuarios.add(new Usuario("Juan Carlos", "Valencia", "Ciudad de México", "5555", "Av Generation México", "5500000000", "elbuenJC@gmail.com", "Parangaricutirimicuaro1+", Rol.USUARIO));	
    }
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
