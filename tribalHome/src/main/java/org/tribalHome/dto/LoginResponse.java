package org.tribalHome.dto;

import org.tribalHome.model.Usuario;

public class LoginResponse {
	
	private Token token;
	private Usuario usuario;
	
	public LoginResponse(Token token, Usuario usuario) {
        this.token = token;
        this.usuario = usuario;
    }

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
