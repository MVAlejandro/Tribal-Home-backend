package org.tribalHome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", nullable = false, unique = true)
    private Integer id_usuario; // Este será el ID que se autoincrementa
	@Column(nullable = false)
    private String nombre;
	@Column(nullable = false)
    private String apellidos;
	@Column(nullable = false)
    private String estados;
	@Column(nullable = false)
    private String codigo_postal;
	@Column(nullable = false)
    private String direccion;
	@Column(nullable = false)
    private String telefono;
	@Column(nullable = false, unique = true)
    private String correo;
	@Column(nullable = false)
    private String contrasenia;
	@Column(nullable = false)
    private String rol;

    // Constructor vacío
    public Usuario() {
    }

    // Constructor con parámetros (sin incluir id, porque se asigna automáticamente)
    public Usuario(String nombre, String apellidos, String estado, String codigo_postal,
                   String direccion, String telefono, String correo, String contrasenia, String rol) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estados = estado;
        this.codigo_postal = codigo_postal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    // Getters y Setters

    public Integer getId() {
        return id_usuario;
    }

    // No se provee un setter para id porque queremos que se autoincremente

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
        return estados;
    }

    public void setEstado(String estado) {
        this.estados = estado;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id_usuario + ", nombre=" + nombre + ", apellidos=" + apellidos +
               ", estado=" + estados + ", codigo_postal=" + codigo_postal + ", direccion=" + direccion + 
               ", telefono=" + telefono + ", correo=" + correo + ", contrasenia=" + contrasenia + ", rol=" + rol + "]";
    }
}
