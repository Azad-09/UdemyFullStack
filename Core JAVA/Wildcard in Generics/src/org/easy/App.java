package org.easy;

import java.util.ArrayList;
import java.util.List;


//VEHICLE class
class Vehicle {
	private int vehicleID;

	public Vehicle(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	@Override
	public String toString() {
		return "Vehicle ID: " + vehicleID;
	}
	
	public void info() {
		System.out.println("Vehicle ID is: " + getVehicleID());
	}
}

//CAR class
class Car extends Vehicle {
	private String carModel;

	public Car(int vehicleID, String carModel) {
		super(vehicleID);
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	@Override
	public String toString() {
		return "Vehicle ID: " + getVehicleID() + " Car Model: " + getCarModel();
	}
	
	@Override
	public void info() {
		System.out.println("Car Model is: " + getCarModel());
	}

}

public class App {

	public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<Vehicle>();
		list.add(new Vehicle(12));
		list.add(new Vehicle(23));
		list.add(new Vehicle(43));
		list.add(new Vehicle(89));
		list.add(new Vehicle(33));
		list.add(new Vehicle(90));
		list.add(new Car(87, "S8"));
		list.add(new Car(666, "A10"));
//		list.add(new String("Radhe Mohan"));
//		list.add(new Character('#'));

		display(list);
	}

//	Here the type of the entry can be decided so we are using the wildcard "?" which means it can be of any type
//	Here "?" is extending the Vehicle class which is the parent class of Car so now the "?" can only contain Object of Vehicle and Car class and this is known as "Upper Bound" (List<? extends Vehicle> list);
//	Doing the reverse of "Upper Bound" we get "Lower Bound" (List<? super Car> list)
//	With "Lower Bound" we can,t use the methods of the class as the "Object" is the parent class and does'nt contain any method with him
	public static void display(List<? extends Vehicle> list) {
		for (Vehicle elements : list) {
		
			elements.info();  //(The method info() is undefined for the type Object) In case of Lower Bound
		}

	}
	
//	This is the reason why we use "Upper Bound" in place of "Lower Bound" 

}
