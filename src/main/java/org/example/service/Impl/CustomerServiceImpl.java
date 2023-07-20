package org.example.service.Impl;

import org.example.model.Customer;
import org.example.service.CustomerService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {
    List<Customer>customers=new ArrayList<>();
    @Override
    public void agregarCliente(Long id, String name, Integer tier) {
        customers.add(new Customer(id,name,tier));
    }

    @Override
    public void buscar(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null");
        }
        customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .forEach(customer -> mostrarDatosCliente(customer));


    }
    private void mostrarDatosCliente(Customer customer) {
        JOptionPane.showMessageDialog(null,"ID: " + customer.getId() + ", Name: " + customer.getName() + ", Tier: " + customer.getTier());
    }

    @Override
    public void eliminar(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null");
        }
        customers.removeIf(customer -> customer.getId().equals(id));

    }

    @Override
    public void listar() {
        customers.stream()
                .forEach(customer -> JOptionPane.showMessageDialog(null,"ID: " + customer.getId() + ", Name: " + customer.getName() + ", Tier: " + customer.getTier()));
    }


}
