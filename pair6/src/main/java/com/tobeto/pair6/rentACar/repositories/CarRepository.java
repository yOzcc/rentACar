package com.tobeto.pair6.rentACar.repositories;

import com.tobeto.pair6.rentACar.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
