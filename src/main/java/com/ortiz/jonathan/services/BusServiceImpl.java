package com.ortiz.jonathan.services;

import com.ortiz.jonathan.entity.Bus;
import com.ortiz.jonathan.repository.BusRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpl implements BusService {

    private final BusRepository busRepository;
    public BusServiceImpl(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    @Override
    public Page<Bus> listarFutbolistas(Pageable pageable) {
        return busRepository.findAll(pageable);
    }

    @Override
    public Bus getBus(Integer id) {
        return busRepository.findById(id).orElse(null);
    }
}
