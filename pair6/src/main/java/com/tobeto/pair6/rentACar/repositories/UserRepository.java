package com.tobeto.pair6.rentACar.repositories;

import com.tobeto.pair6.rentACar.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
