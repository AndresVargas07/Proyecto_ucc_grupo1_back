package com.example.spring.basic.controllers;

import com.example.spring.basic.entities.Seat;
import com.example.spring.basic.services.SeatService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/events/{eventId}/seats")
public class SeatController {

    private final SeatService service;

    public SeatController(SeatService service) {
        this.service = service;
    }


    @GetMapping
    public List<Seat> getByEvent(@PathVariable Long eventId) {
        return service.getByEvent(eventId);
    }
}
