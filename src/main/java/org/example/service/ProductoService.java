package org.example.service;

import org.example.enums.Juguetes;

public interface ProductoService {

    void agregar(Long id, String nombre, Categoria categoria, double cantidad, double price);
    void buscar(Long id);
    void eliminar(Long id);
    void listar();
}
