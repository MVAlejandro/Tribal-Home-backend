package org.tribalHome.dto;

public class EditUser {
	
	private String nombre;
    private String apellidos;
    private String estado;
    private String codigo_postal;
    private String direccion;
    private String telefono;
	private String currentPassword; // Contraseña actual
    private String newPassword; // Nueva contraseña

    // Constructor vacío
    public EditUser() {}

    // Constructor con parámetros
    public EditUser(String nombre, String apellidos, String estado, String codigo_postal, String direccion,
			String telefono, String currentPassword, String newPassword) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.estado = estado;
		this.codigo_postal = codigo_postal;
		this.direccion = direccion;
		this.telefono = telefono;
		this.currentPassword = currentPassword;
		this.newPassword = newPassword;
	}


    // Getters y Setters
    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }    

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "EditUser [nombre=" + nombre + ", apellidos=" + apellidos + ", estado=" + estado + ", codigo_postal="
				+ codigo_postal + ", direccion=" + direccion + ", telefono=" + telefono + ", currentContrasenia="
				+ currentPassword + ", newContrasenia=" + newPassword + "]";
	}

	
}
