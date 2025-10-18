package com.example.spring.basic.services.impl;

import com.example.spring.basic.entities.Seat;
import com.example.spring.basic.repositories.SeatRepository;
import com.example.spring.basic.services.SeatService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {

    private final SeatRepository seats;

    public SeatServiceImpl(SeatRepository seats) {
        this.seats = seats;
    }

    @Override
    public List<Seat> getByEvent(Long eventId) {
        return seats.findByEventId(eventId);
    }
}
