package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductoService {
    private List<Producto> lista = Arrays.asList(
            new Producto(1L, "Coputadora de escritorio"),
            new Producto(2L, "Mouse Gamer Pro ")
    );

    public List<Producto> obtenerTodos() {
        return lista;
    }

    public Producto obtenerPorId(Long id) {
        return lista.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
