package org.example;

import org.example.controller.CustomerController;
import org.example.controller.OrderController;
import org.example.controller.ProductoController;
import org.example.service.Impl.OrderServiceImpl;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean bandera=true;
        CustomerController customerController=new CustomerController();
        ProductoController productoController=new ProductoController();
        OrderController orderController=new OrderController();


        while (bandera) {
            switch (JOptionPane.showInputDialog("1.agregarCliente\n2.buscarCliente\n3.eliminarCliente\n4.listarCliente\n5.agregar productos\n6.venta")) {
                case "1":
                    customerController.agregarCliente();
                    break;
                case "2":
                    customerController.buscarCliente();
                    break;
                case "3":
                    customerController.eliminarCliente();

                    break;
                case "4":
                    customerController.listar();

                    break;
                case "5":
                    productoController.agregarProducto();
                    break;
                case "6":
                    orderController.venta(productoController.getProductosService());
                    break;



            }
        }
    }
    }