package com.tobeto.pair6.rentACar.repositories;

import com.tobeto.pair6.rentACar.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {
}
