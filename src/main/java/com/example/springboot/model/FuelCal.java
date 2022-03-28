package com.example.springboot.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "fuel_cal")
@Getter
@Setter
public class FuelCal implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private int people;
	private double distance;
	private double consumption;
	private double gasPrice;

}
