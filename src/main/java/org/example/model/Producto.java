package org.example.model;

import org.example.enums.Juguetes;
import org.example.service.Categoria;

public class Producto {
    private Long id;
    private String nombre;
    private Categoria categoria;
    private double cantidad;
    private Double price;

    public Producto(Long id,String nombre,Categoria categoria,double cantidad,Double price){
        this.id=id;
        this.nombre=nombre;
        this.categoria=categoria;
        this.cantidad=cantidad;
        this.price=price;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setCategoria(Juguetes categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
