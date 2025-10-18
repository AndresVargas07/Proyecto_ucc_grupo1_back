package com.example.spring.basic.entities;

public class Seat {
    private Long id;
    private Long eventId;
    private String fila;
    private int numero;
    private String estado;

    public Seat() {}

    public Seat(Long id, Long eventId, String fila, int numero, String estado) {
        this.id = id; this.eventId = eventId; this.fila = fila; this.numero = numero; this.estado = estado;
    }

    public Long getId() { return id; } public void setId(Long id) { this.id = id; }
    public Long getEventId() { return eventId; } public void setEventId(Long eventId) { this.eventId = eventId; }
    public String getFila() { return fila; } public void setFila(String fila) { this.fila = fila; }
    public int getNumero() { return numero; } public void setNumero(int numero) { this.numero = numero; }
    public String getEstado() { return estado; } public void setEstado(String estado) { this.estado = estado; }
}
