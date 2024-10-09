package org.tribalHome.model;

public class Usuario {

    private static int totalUsuarios = 0; // Contador estático para autoincrementar el ID

    private int id; // Este será el ID que se autoincrementa
    private String nombre;
    private String apellidos;
    private String estado;
    private String codigo_postal;
    private String direccion;
    private String telefono;
    private String correo;
    private String contrasenia;
    private Rol rol;

    public enum Rol {
        ADMIN, USUARIO, INVITADO
    }

    // Constructor vacío
    public Usuario() {
        this.id = ++totalUsuarios; // Cada nuevo usuario tendrá un ID único e incremental
    }

    // Constructor con parámetros (sin incluir id, porque se asigna automáticamente)
    public Usuario(String nombre, String apellidos, String estado, String codigo_postal,
                   String direccion, String telefono, String correo, String contrasenia, Rol rol) {
        this(); // Llama al constructor vacío para asignar el ID autoincrementable     
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estado = estado;
        this.codigo_postal = codigo_postal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    // Getters y Setters

    public int getId() {
        return id;
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos +
               ", estado=" + estado + ", codigo_postal=" + codigo_postal + ", direccion=" + direccion + 
               ", telefono=" + telefono + ", correo=" + correo + ", contrasenia=" + contrasenia + ", rol=" + rol + "]";
    }
}
