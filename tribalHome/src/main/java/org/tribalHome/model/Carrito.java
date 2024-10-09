package org.tribalHome.model;

public class Carrito {

    private int id_carrito;
    private int cantidad;
    private double precio_total;
    private String estado;
    private int usuario_id_usuario;
    private int producto_id_producto;

    // Constructor vacío
    public Carrito() {
    }

    // Constructor con parámetros
    public Carrito(int id_carrito, int cantidad, double precio_total, String estado, int usuario_id_usuario, int producto_id_producto) {
        this.id_carrito = id_carrito;
        this.cantidad = cantidad;
        this.precio_total = precio_total;
        this.estado = estado;
        this.usuario_id_usuario = usuario_id_usuario;
        this.producto_id_producto = producto_id_producto;
    }

    // Getters y Setters
    public int getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(int id_carrito) {
        this.id_carrito = id_carrito;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getUsuario_id_usuario() {
        return usuario_id_usuario;
    }

    public void setUsuario_id_usuario(int usuario_id_usuario) {
        this.usuario_id_usuario = usuario_id_usuario;
    }

    public int getProducto_id_producto() {
        return producto_id_producto;
    }

    public void setProducto_id_producto(int producto_id_producto) {
        this.producto_id_producto = producto_id_producto;
    }
}
