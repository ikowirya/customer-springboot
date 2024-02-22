package com.odp.CustomerApp.service;

import com.odp.CustomerApp.model.Pelanggan;
import com.odp.CustomerApp.repository.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PelangganService {

    @Autowired
    private PelangganRepository pelangganRepository;

    public PelangganService(PelangganRepository pelangganRepository) {
        this.pelangganRepository = pelangganRepository;
    }

    public Iterable<Pelanggan> getAllPelanggan() {
        return pelangganRepository.findAll();
    }

    public Pelanggan getPelangganId(Long id) {
        return pelangganRepository.findById(id).orElse(null);
    }

    public Pelanggan simpanPelanggan(Pelanggan pelanggan) {
        System.out.println("hao" + pelanggan);
        return pelangganRepository.save(pelanggan);
    }

    public void hapusPelanggan(Long id) {
        pelangganRepository.deleteById(id);
    }
}
