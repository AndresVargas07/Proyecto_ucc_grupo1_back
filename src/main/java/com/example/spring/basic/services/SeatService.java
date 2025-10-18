package com.example.spring.basic.services;

import com.example.spring.basic.entities.Seat;
import java.util.List;

public interface SeatService {
    List<Seat> getByEvent(Long eventId);
}
