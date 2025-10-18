package com.example.spring.basic.controllers;

import com.example.spring.basic.entities.Event;
import com.example.spring.basic.services.EventService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService service;


    public EventController(EventService service) {
        this.service = service;
    }


    @PostMapping("/crear")
    public Event crear(
            @RequestParam String nombre,
            @RequestParam String fecha,
            @RequestParam String lugar,
            @RequestParam double precioBase,
            @RequestParam String estado
    ) {
        return service.create(nombre, fecha, lugar, precioBase, estado);
    }


    @GetMapping
    public List<Event> getAll() {
        return service.getAll();
    }


    @GetMapping("/{id}")
    public Event getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
