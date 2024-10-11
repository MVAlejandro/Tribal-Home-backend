package org.tribalHome.controller;

import java.util.List;

import org.tribalHome.dto.EditUser;
import org.tribalHome.dto.Login;
//import org.tribalHome.dto.EditUser;
import org.tribalHome.model.Usuario;
import org.tribalHome.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/usuarios/") // http://localhost:8080/api/usuarios/
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Obtener todos los usuarios
    @GetMapping
    public List<Usuario> getUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    // Obtener un usuario específico
    @GetMapping(path = "{usuarioId}")
    public Usuario getUsuario(@PathVariable("usuarioId") Integer usuarioId) {  // Cambiado a int
        return usuarioService.getUsuario(usuarioId);
    }

    // Añadir un nuevo usuario
    @PostMapping(path = "/registro")
    public Usuario addUsuario(@RequestBody Usuario usuario) {
        return usuarioService.addUsuario(usuario);
    }

    // Eliminar un usuario
    @DeleteMapping(path = "{usuarioId}")
    public Usuario deleteUsuario(@PathVariable("usuarioId") Integer usuarioId) {  // Cambiado a int
        return usuarioService.deleteUsuario(usuarioId);
    }

//    // Actualizar la información de un usuario
//    @PutMapping(path = "{usuarioId}")
//    public Usuario updateUsuario(@RequestBody Usuario usuario,
//                                 @PathVariable("usuarioId") int usuarioId) {  // Cambiado a int
//        return usuarioService.updateUsuario(usuarioId, usuario);
//    }
//
//    // Cambiar la contraseña del usuario
//    @PutMapping(path = "{usuarioId}/change-password")
//    public Usuario changePassword(@PathVariable("usuarioId") int usuarioId,  // Cambiado a int
//                                  @RequestBody EditPassword editPassword) {
//        return usuarioService.changePassword(usuarioId, editPassword);
//    }
    
//     Prueba pendiente 
    
    // Cambiar la contraseña del usuario
    @PutMapping(path = "{usuarioId}/edit-usuario")
    public Usuario editUser(@PathVariable("usuarioId") Integer usuarioId,  // Cambiado a int
                                  @RequestBody EditUser editUser) {
        return usuarioService.editUser(usuarioId, editUser);
    }
    
    // Obtener un usuario por sus datos de registro
    @GetMapping(path = "/login")
    public Usuario loginUser(@RequestBody Login login) {
    	return usuarioService.loginUser(login);
    }
}
