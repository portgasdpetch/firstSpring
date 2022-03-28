package com.example.springboot.controller;

import com.example.springboot.model.FuelCal;
import com.example.springboot.model.FuelCalResponse;
import com.example.springboot.service.FuelCalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/FuelCals")
public class FuelCalController {


    @Autowired
    private FuelCalService fuelCalService;

//	@GetMapping("/{id}")
//	 TODO get product by id from DB
//	public ResponseEntity<FuelCal> findLogById(@PathVariable Long id) {
//		return ResponseEntity.ok().body(new FuelCal(1, 1, 96.4, 29.2, 38.62));
//	}

    @GetMapping("/find-all")
    // TODO get product by id from DB
    public ResponseEntity<List<FuelCal>> findAll() {
        List<FuelCal> list = fuelCalService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

//	@PostMapping
//	 TODO save product to DB
//	public ResponseEntity<FuelCalResponse> saveFuelCal(@RequestBody FuelCal fuelcal) {
//		return ResponseEntity.ok().body(new FuelCalResponse("00", "Success"));
//	}

    @PostMapping("/create")
    // TODO save product to DB
    public FuelCal create(@RequestBody FuelCal fuelCal) {
        return fuelCalService.create(fuelCal);
    }

//	@PutMapping("/{id}")
    // TODO update product to DB
//	public ResponseEntity<FuelCalResponse> updateFuelCal(@PathVariable Long id, @RequestBody FuelCal fuelcal) {
//		return ResponseEntity.ok().body(new FuelCalResponse("00", "Success"));
//	}

    @PutMapping("/update/{id}")
// TODO update product to DB
    public FuelCal update(@PathVariable("id") Long id, @RequestBody FuelCal fuelCal){
        fuelCal.setId(id);
        return fuelCalService.create(fuelCal);
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<FuelCalResponse> deleteFuelCal(@PathVariable Long id) {
        // TODO delete product by id from DB
//        return ResponseEntity.ok().body(new FuelCalResponse("00", "Success"));
//    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        fuelCalService.delete(id);
    }
}
