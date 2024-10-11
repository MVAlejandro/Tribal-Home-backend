package org.tribalHome.dto;

public class Login {
	private String correo;
	private String contrasenia;
	
	public Login() {}

	public Login(String correo, String contrasenia) {
		this.correo = correo;
		this.contrasenia = contrasenia;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	@Override
	public String toString() {
		return "Login [correo=" + correo + ", contrasenia=" + contrasenia + "]";
	}
	
}
