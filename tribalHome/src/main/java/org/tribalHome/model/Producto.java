package org.tribalHome.model;

public class Producto {
	
	private static int totalProductos = 0; // Contador estático para autoincrementar el ID
	
    private int id_producto;
    private String nombre_producto;
    private String descripcion;
    private double precio;
    private String categoria;
    private String imagen;
    private int stock;

    // Constructor vacío
    public Producto() {
    	this.id_producto = ++totalProductos;
    }

    // Constructor con parámetros
    public Producto(String nombre_producto, String descripcion, double precio, String categoria, String imagen, int stock) {
    	this(); // Llama al constructor vacío para asignar el ID autoincrementable   
        this.nombre_producto = nombre_producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.imagen = imagen;
        this.stock = stock;
    }

    // Getters y Setters
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
