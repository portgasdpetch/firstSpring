package com.example.springboot.service;

import com.example.springboot.model.FuelCal;
import com.example.springboot.repository.FuelCalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuelCalServiceImplement implements FuelCalService {

    @Autowired
    private FuelCalRepository repository;

    @Override
    public List<FuelCal> findAll(){
        return repository.findAll();
    }

    @Override
    public FuelCal create(FuelCal fuelCal){
        return repository.save(fuelCal);
    }

    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
}
