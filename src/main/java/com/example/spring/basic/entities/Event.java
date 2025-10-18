package com.example.spring.basic.entities;

public class Event {
    private Long id;
    private String nombre;
    private String fecha;
    private String lugar;
    private double precioBase;
    private String estado;

    public Event() {}

    public Event(Long id, String nombre, String fecha, String lugar, double precioBase, String estado) {
        this.id = id; this.nombre = nombre; this.fecha = fecha; this.lugar = lugar; this.precioBase = precioBase; this.estado = estado;
    }

    public Long getId() { return id; } public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; } public void setNombre(String nombre) { this.nombre = nombre; }
    public String getFecha() { return fecha; } public void setFecha(String fecha) { this.fecha = fecha; }
    public String getLugar() { return lugar; } public void setLugar(String lugar) { this.lugar = lugar; }
    public double getPrecioBase() { return precioBase; } public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
    public String getEstado() { return estado; } public void setEstado(String estado) { this.estado = estado; }
}