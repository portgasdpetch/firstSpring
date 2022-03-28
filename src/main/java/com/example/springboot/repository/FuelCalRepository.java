package com.example.springboot.repository;

import com.example.springboot.model.FuelCal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelCalRepository extends JpaRepository<FuelCal, Long> {
}
