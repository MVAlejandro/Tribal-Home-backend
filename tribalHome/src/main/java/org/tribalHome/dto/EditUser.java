package org.tribalHome.dto;

public class EditUser {
	
	private String nombre;
    private String apellidos;
    private String estado;
    private String codigo_postal;
    private String direccion;
    private String telefono;
	private String currentContrasenia; // Contraseña actual
    private String newContrasenia; // Nueva contraseña

    // Constructor vacío
    public EditUser() {}

    // Constructor con parámetros
    public EditUser(String nombre, String apellidos, String estado, String codigo_postal, String direccion,
			String telefono, String currentContrasenia, String newContrasenia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.estado = estado;
		this.codigo_postal = codigo_postal;
		this.direccion = direccion;
		this.telefono = telefono;
		this.currentContrasenia = currentContrasenia;
		this.newContrasenia = newContrasenia;
	}


    // Getters y Setters
    public String getCurrentPassword() {
        return currentContrasenia;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentContrasenia = currentPassword;
    }

    public String getNewPassword() {
        return newContrasenia;
    }

    public void setNewPassword(String newPassword) {
        this.newContrasenia = newPassword;
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
				+ currentContrasenia + ", newContrasenia=" + newContrasenia + "]";
	}

	
}
