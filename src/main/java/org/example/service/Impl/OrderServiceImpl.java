package org.example.service.Impl;

import org.example.model.Customer;
import org.example.model.Order;
import org.example.model.Producto;
import org.example.service.OrderService;

import javax.swing.*;
import java.awt.image.TileObserver;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    List<Order> orders = new ArrayList<>();

    @Override
    public void venta(Long id, String status, LocalDate orderDate, List<Producto> productos, Customer customer) {
        orders.add(new Order(id, status, orderDate, productos, customer));

        // Calculamos el total para la orden recién agregada
        if (customer==null && productos==null){
            JOptionPane.showMessageDialog(null,"tienen que crear el cliente y productos, Para poder realizar la compra");
        }else {
            double total = calcularTotal(productos);
            JOptionPane.showMessageDialog(null, "El total es: " + total);
        }

    }

    // Método para calcular el total de una lista de productos en una orden
    private double calcularTotal(List<Producto> productos) {
        return productos.stream()
                .mapToDouble(producto -> producto.getCantidad() * producto.getPrice())
                .sum();
    }
}
