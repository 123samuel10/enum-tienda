package org.example.service.Impl;

import org.example.enums.Juguetes;
import org.example.model.Producto;
import org.example.service.Categoria;
import org.example.service.ProductoService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;

public class ProductosServiceImpl implements ProductoService {
    List<Producto>productos=new ArrayList<>();
    @Override
    public void agregar(Long id, String nombre, Categoria categoria, double cantidad, double price) {
        productos.add(new Producto(id,nombre,categoria,cantidad,price));
        productos.forEach(producto -> JOptionPane.showMessageDialog(null,"Nombre: "+producto.getNombre()+"Categoria: "+producto.getCategoria()+" Cantidad: "+producto.getCantidad()+" precio: "+producto.getPrice()));
    }

    @Override
    public void buscar(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null");
        }

        productos.stream()
                .filter(producto -> producto.getId().equals(id))
                .findFirst()
                .ifPresentOrElse(
                        productoEncontrado -> System.out.println("Producto encontrado: " + productoEncontrado.getNombre()),
                        () -> System.out.println("Producto con ID " + id + " no encontrado.")
                );
    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public void listar() {

    }

    public List<Producto> getProductos() {
        return productos;
    }
}
