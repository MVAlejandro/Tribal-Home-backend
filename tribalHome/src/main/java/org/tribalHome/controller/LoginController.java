package org.tribalHome.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tribalHome.Config.JwtFilter;
import org.tribalHome.dto.LoginResponse;
import org.tribalHome.dto.Token;
import org.tribalHome.model.Usuario;
import org.tribalHome.service.UsuarioService;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping(path = "/api/login/")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class LoginController {
	private final UsuarioService usuarioService;
	
	@Autowired
	public LoginController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping
	public ResponseEntity<LoginResponse>  loginUser(@RequestBody Usuario usuario) throws ServletException {
		Usuario user = usuarioService.loginUser(usuario);
		if(user != null) {
			System.out.println("Usuario válido " +  usuario.getCorreo());
			Token token = new Token(generateToken(usuario.getCorreo(), user.getRol()));
			// Devolvemos el token y el usuario
			return ResponseEntity.ok(new LoginResponse(token, user));
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
	}

	private String generateToken(String email, String rol) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, 12);
		
		return Jwts.builder().setSubject(email).claim("role", rol)
				.setIssuedAt(new Date())
				.setExpiration(calendar.getTime())
				.signWith(SignatureAlgorithm.HS256, JwtFilter.secret)
				.compact();
	}

}