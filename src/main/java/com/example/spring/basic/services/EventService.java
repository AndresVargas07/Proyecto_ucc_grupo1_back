package com.example.spring.basic.services;

import com.example.spring.basic.entities.Event;
import java.util.List;

public interface EventService {
    Event create(String nombre, String fecha, String lugar, double precioBase, String estado);
    List<Event> getAll();
    Event getById(Long id);
}
