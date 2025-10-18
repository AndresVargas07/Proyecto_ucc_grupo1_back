package com.example.spring.basic.controllers;

import com.example.spring.basic.entities.Event;
import com.example.spring.basic.entities.Seat;
import com.example.spring.basic.repositories.EventRepository;
import com.example.spring.basic.repositories.SeatRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class SeedController {

    private final EventRepository events;
    private final SeatRepository seats;

    public SeedController(EventRepository events, SeatRepository seats) {
        this.events = events;
        this.seats = seats;
    }

    @GetMapping("/seed")
    public String seed() {
        Event e1 = events.save(new Event(null, "Concierto", "2025-12-01 20:00", "Teatro", 50.0, "ACTIVO"));
        for (int i = 1; i <= 10; i++) {
            seats.save(new Seat(null, e1.getId(), "A", i, "LIBRE"));
        }
        return "ok";
    }
}
