package org.example.controller;

import org.example.service.Impl.CustomerServiceImpl;

import javax.swing.*;

public class CustomerController {
    private Long id;
    private String name;
    private Integer tier;
    CustomerServiceImpl customerService=new CustomerServiceImpl();
    public void agregarCliente(){
        Long id= Math.round(Math.random()*100)+1;
        String name=JOptionPane.showInputDialog("ingrese el nombre del cliente");
        Integer tier= Integer.parseInt(JOptionPane.showInputDialog("ingrese el nivel"));
        customerService.agregarCliente(id,name,tier);
    }

    public void buscarCliente(){
        Long id= Long.valueOf(JOptionPane.showInputDialog("ingrese el id del cliente, para buscar."));
        customerService.buscar(id);
    }
    public void eliminarCliente(){
        Long id =Long.valueOf(JOptionPane.showInputDialog("ingrese el id del cliente, para eliminar"));
        customerService.eliminar(id);
    }
    public void listar(){
        customerService.listar();
    }
}
