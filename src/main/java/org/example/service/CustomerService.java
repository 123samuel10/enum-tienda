package org.example.service;

public interface CustomerService {
    void agregarCliente(Long id,String name,Integer tier);
    void buscar(Long id);
    void eliminar(Long id);
    void listar();
}
