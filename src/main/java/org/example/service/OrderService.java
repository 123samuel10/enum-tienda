package org.example.service;

import org.example.model.Customer;
import org.example.model.Producto;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {

    void venta(Long id,String status,LocalDate orderDate,List<Producto>productos,Customer customer);
}
