package com.odp.CustomerApp.controller;

import com.odp.CustomerApp.model.Pelanggan;
import com.odp.CustomerApp.service.PelangganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RestController
@RequestMapping("/api/pelanggan")
public class PelangganController {

    @Autowired
    private PelangganService pelangganService;

    @GetMapping
    public Iterable<Pelanggan> getAllPelanggan() {
        return pelangganService.getAllPelanggan();
    }

    @GetMapping("/{id}")
    public Pelanggan getPelanggaById(@PathVariable Long id) {
        return pelangganService.getPelangganId(id);
    }

    @PostMapping
    public Pelanggan simpanPelanggan(@RequestBody Pelanggan pelanggan) {
        System.out.println(pelanggan);
        return  pelangganService.simpanPelanggan(pelanggan);
    }

    @PutMapping("/{id}")
    public Pelanggan updatePelanggan(@PathVariable Long id, @RequestBody Pelanggan pelanggan) {
        pelanggan.setIdPelanggan(id);
        return pelangganService.simpanPelanggan(pelanggan);
    }

    @DeleteMapping("/{id}")
    public void hapusPelanggan(@PathVariable Long id) {
        pelangganService.hapusPelanggan(id);
    }
}
