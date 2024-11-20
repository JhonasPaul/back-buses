package com.ortiz.jonathan.controller;

import com.ortiz.jonathan.entity.Bus;
import com.ortiz.jonathan.services.BusService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BusController {

    private final BusService busService;
    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping("/bus/page")
    private Page<Bus> index(@RequestParam Integer page) {
        Pageable pageable = PageRequest.of(page, 6);
        return busService.listarFutbolistas(pageable);
    }

    @GetMapping("/bus/{id}")
    public Bus bus(@PathVariable Integer id) {
        return busService.getBus(id);
    }
}
