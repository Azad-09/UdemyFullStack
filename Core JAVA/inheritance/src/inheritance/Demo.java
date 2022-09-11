package inheritance;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello there!!");

		Bike cbrHonda = new Bike("short", "Kappa", 2, 2, "Petrol");
//		System.out.println(cbrHonda.handle);

		System.out.print("Bike Handle: " + cbrHonda.handle + "\nBike Engine: " + cbrHonda.getEngine()
				+ "\nBike Silencer: " + cbrHonda.getSilencer() + "\nBike Wheels: " + cbrHonda.getWheels()
				+ "\nBike Fuel Type: " + cbrHonda.getFuelType() + "\n\n");

		System.out.println(cbrHonda + "\n");

		cbrHonda.run();
	}

}
