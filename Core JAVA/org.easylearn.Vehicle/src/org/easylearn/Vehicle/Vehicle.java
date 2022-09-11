package org.easylearn.Vehicle;

public class Vehicle {
	 private String engine;
	    private int wheels;
	    private int silencer;
	    private String fuelType;

	    public Vehicle() {
	        this.engine = "Kapa";
	        this.wheels = 2;
	        this.silencer = 2;
	        this.fuelType = "Petrol";
	    }

	    public Vehicle(String engine, int wheel, int silencer, String fuelType) {
	        this.engine = engine;
	        this.wheels = wheel;
	        this.silencer = silencer;
	        this.fuelType = fuelType;
	    }

	    public String getEngine() {
	        return engine;
	    }

	    public int getWheels() {
	        return wheels;
	    }

	    public int getSilencer() {
	        return silencer;
	    }

	    public String getFuelType() {
	        return fuelType;
	    }
}
