package com.ortiz.jonathan.services;

import com.ortiz.jonathan.entity.Bus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BusService {
    List<Bus> getAllBuses();
    Page<Bus> listarFutbolistas(Pageable pageable);

    Bus getBus(Integer id);
}
