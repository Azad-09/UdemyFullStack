package inheritance;

import inheritance.Vehicle;

public class Bike extends Vehicle {
	public String handle;

    public Bike() {
        super();
    }

    public Bike(String handle, String engine, int wheel, int silencer, String fuelType) {
        super(engine, wheel, silencer, fuelType);
        this.handle = handle;

    }

	@Override
	public String toString() {
		return "Bike [handle=" + handle + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSilencer()=" + getSilencer() + ", getFuelType()=" + getFuelType() + "]";
	}
    
    
	@Override
	public void run() {
		System.out.println("Runnig Bike");
		
		System.out.println(toString());
	}
}
