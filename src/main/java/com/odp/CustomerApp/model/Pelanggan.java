package com.odp.CustomerApp.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "pelanggan")
public class Pelanggan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelanggan")
    private Long idPelanggan;


    @Column(name = "nama_pelanggan")
    private String namaPelanggan;

    @Column(name = "alamat")
    private String alamat;

    public Pelanggan() {
    }

    public Long getIdPelanggan() {
        return idPelanggan;
    }

    public Pelanggan(Long idPelanggan, String namaPelanggan, String alamat) {
        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.alamat = alamat;
    }

    public void setIdPelanggan(Long idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pelanggan pelanggan)) return false;
        return Objects.equals(idPelanggan, pelanggan.idPelanggan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPelanggan);
    }
}
