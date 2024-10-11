package org.tribalHome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carrito")
public class Carrito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_carrito", nullable = false, unique = true)
    private Integer id_carrito;
	@Column(nullable = false)
    private Integer cantidad;
	@Column(nullable = false)
    private Double precio_total;
	@Column(nullable = false)
    private String estado;
	@Column(name = "usuario_id_usuario", nullable = false)
    private Integer usuarioId;
	@Column(nullable = false)
    private Integer producto_id_producto;

    // Constructor vacío
    public Carrito() {}

    // Constructor con parámetros
    public Carrito(Integer cantidad, Double precio_total, String estado, Integer usuario_id_usuario, Integer producto_id_producto) {
        this.cantidad = cantidad;
        this.precio_total = precio_total;
        this.estado = estado;
        this.usuarioId = usuario_id_usuario;
        this.producto_id_producto = producto_id_producto;
    }

    // Getters y Setters
    public Integer getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(Integer id_carrito) {
        this.id_carrito = id_carrito;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(Double precio_total) {
        this.precio_total = precio_total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getUsuario_id_usuario() {
        return usuarioId;
    }

    public void setUsuario_id_usuario(Integer usuario_id_usuario) {
        this.usuarioId = usuario_id_usuario;
    }

    public Integer getProducto_id_producto() {
        return producto_id_producto;
    }

    public void setProducto_id_producto(Integer producto_id_producto) {
        this.producto_id_producto = producto_id_producto;
    }
}
