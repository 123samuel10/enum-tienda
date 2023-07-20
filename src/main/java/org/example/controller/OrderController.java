package org.example.controller;

import org.example.model.Customer;
import org.example.model.Producto;
import org.example.service.Impl.OrderServiceImpl;
import org.example.service.Impl.ProductosServiceImpl;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;

public class OrderController {
    OrderServiceImpl orderService=new OrderServiceImpl();
    private Long id;
    private String status;
    private LocalDate orderDate;
    private List<Producto> productos;
    private Customer customer;
    public void venta(ProductosServiceImpl productosService){
        Long id= Math.round(Math.random()*100)+1;
        String status=JOptionPane.showInputDialog("ingrese el status");
        LocalDate dia=LocalDate.now();
        orderService.venta(id,status,dia,productosService.getProductos(),customer);

    }
}
