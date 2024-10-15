package org.tribalHome.controller;

import java.util.List;

import org.tribalHome.dto.EditUser;
import org.tribalHome.model.Usuario;
import org.tribalHome.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/usuarios/") // http://localhost:8080/api/usuarios/
@CrossOrigin(origins = "http://127.0.0.1:5500")
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

    // Busca un usuario por correo y devuelve true o false
    @GetMapping(path = "/validar-registro")
    public Boolean existCorreo(@RequestParam(required = false) String correo) {
    	return usuarioService.validarRegistro(correo);
    }
    
    // Cambiar los datos del usuario
    @PutMapping(path = "{usuarioId}/edit-usuario")
    public Usuario editUser(@PathVariable("usuarioId") Integer usuarioId,  // Cambiado a int
                                  @RequestBody EditUser editUser) {
        return usuarioService.editUser(usuarioId, editUser);
    }
    
}

