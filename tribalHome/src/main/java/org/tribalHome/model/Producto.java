package org.tribalHome.model;

import java.math.BigDecimal;

public class Producto {

    private int id_producto; // ID del producto
    private String nombre_producto;
    private String descripcion;
    private BigDecimal precio;
    private String categoria;
    private String imagen;
    private int stock;

    public Producto() {
    }

    public Producto(int id_producto, String nombre_producto, String descripcion, BigDecimal precio, String categoria, String imagen, int stock) {
        this.id_producto = id_producto;
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

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
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

    @Override
    public String toString() {
        return "Producto [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", descripcion=" + descripcion +
               ", precio=" + precio + ", categoria=" + categoria + ", imagen=" + imagen + ", stock=" + stock + "]";
    }
}
