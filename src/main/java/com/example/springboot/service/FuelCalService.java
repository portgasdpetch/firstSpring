package com.example.springboot.service;

import com.example.springboot.model.FuelCal;

import java.util.List;

public interface FuelCalService {
    List<FuelCal> findAll();

    FuelCal create(FuelCal fuelCal);

    void delete(Long id);
}
