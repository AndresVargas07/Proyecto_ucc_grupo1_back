package com.example.spring.basic.repositories;

import com.example.spring.basic.entities.Seat;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class SeatRepository {
    private final List<Seat> data = new ArrayList<>();
    private long nextId = 1L;

    public Seat save(Seat s) {
        if (s.getId() == null) {
            s.setId(nextId++);
            data.add(s);
        } else {
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).getId().equals(s.getId())) {
                    data.set(i, s);
                }
            }
        }
        return s;
    }

    public List<Seat> findAll() { return data; }

    public Optional<Seat> findById(Long id) {
        return data.stream().filter(x -> x.getId().equals(id)).findFirst();
    }

    public List<Seat> findByEventId(Long eventId) {
        List<Seat> r = new ArrayList<>();
        for (Seat s : data) {
            if (s.getEventId().equals(eventId)) {
                r.add(s);
            }
        }
        return r;
    }
}
