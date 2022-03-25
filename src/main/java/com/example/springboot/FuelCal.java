package com.example.springboot;

public class FuelCal {
	private long id;
	private int people;
	private double distance;
	private double consumption;
	private double gasPrice;

	public FuelCal() {
		super();
	}

	public FuelCal(long id,int people, double distance, double consumption, double gasPrice) {
		super();
		this.id = id;
		this.people = people;
		this.distance = distance;
		this.consumption = consumption;
		this.gasPrice = gasPrice;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	public double getGasPrice() {
		return gasPrice;
	}

	public void setGasPrice(double gasPrice) {
		this.gasPrice = gasPrice;
	}
}
