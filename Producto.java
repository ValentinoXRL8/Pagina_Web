package com.example.demo;

public class Producto {
    private Long id;
    private String nombre;

    public Producto(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
}
