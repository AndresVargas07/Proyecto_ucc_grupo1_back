package com.example.spring.basic.services.impl;

import com.example.spring.basic.entities.Event;
import com.example.spring.basic.repositories.EventRepository;
import com.example.spring.basic.services.EventService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository repo;

    public EventServiceImpl(EventRepository repo) {
        this.repo = repo;
    }

    @Override
    public Event create(String nombre, String fecha, String lugar, double precioBase, String estado) {
        return repo.save(new Event(null, nombre, fecha, lugar, precioBase, estado));
    }

    @Override
    public List<Event> getAll() {
        return repo.findAll();
    }

    @Override
    public Event getById(Long id) {
        return repo.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Evento no encontrado")
        );
    }
}

