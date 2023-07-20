package org.example.controller;

import org.example.Main;
import org.example.enums.Bebe;
import org.example.enums.Juguetes;
import org.example.service.Categoria;
import org.example.service.Impl.ProductosServiceImpl;

import javax.swing.*;

public class ProductoController {
    ProductosServiceImpl productosService=new ProductosServiceImpl();




    public void agregarProducto() {
        Long id = Math.round(Math.random() * 100) + 1;
        String tipoProducto = JOptionPane.showInputDialog("Ingrese el tipo de producto (Juguetes o Bebe):");

        Categoria categoria;
        if (tipoProducto.equalsIgnoreCase("Juguetes")) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto (CARRO, MATO, BARBIE, MUÑECA):");
            Juguetes juguete = Juguetes.valueOf(nombre.toUpperCase());
            double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad:"));
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:"));
            categoria = juguete;
            productosService.agregar(id, nombre, categoria, cantidad, precio);
        } else if (tipoProducto.equalsIgnoreCase("Bebe")) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto (TETETO, AGUA):");
            Bebe bebe = Bebe.valueOf(nombre.toUpperCase());
            double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad:"));
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:"));
            categoria = bebe;
            productosService.agregar(id, nombre, categoria, cantidad, precio);
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de producto no válido. Ingrese 'Juguetes' o 'Bebe'.");
        }


    }
    public ProductosServiceImpl getProductosService() {
        return productosService;
    }
}
