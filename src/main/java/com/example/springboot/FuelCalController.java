package com.example.springboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/FuelCals")
public class FuelCalController {

	@GetMapping("/{id}")
	// TODO get product by id from DB
	public ResponseEntity<FuelCal> findLogById(@PathVariable Long id) {
		return ResponseEntity.ok().body(new FuelCal(1, 1, 96.4, 29.2, 38.62));
	}

	@PostMapping
	// TODO save product to DB
	public ResponseEntity<FuelCalResponse> saveFuelCal(@RequestBody FuelCal fuelcal) {
		return ResponseEntity.ok().body(new FuelCalResponse("00", "Success"));
	}

	@PutMapping("/{id}")
	// TODO update product to DB
	public ResponseEntity<FuelCalResponse> updateFuelCal(@PathVariable Long id, @RequestBody FuelCal fuelcal) {
		return ResponseEntity.ok().body(new FuelCalResponse("00", "Success"));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<FuelCalResponse> deleteFuelCal(@PathVariable Long id) {
		// TODO delete product by id from DB
		return ResponseEntity.ok().body(new FuelCalResponse("00", "Success"));
	}
}
