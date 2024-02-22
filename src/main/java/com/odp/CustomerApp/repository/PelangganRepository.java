package com.odp.CustomerApp.repository;

import com.odp.CustomerApp.model.Pelanggan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PelangganRepository extends CrudRepository<Pelanggan, Long> {
}
