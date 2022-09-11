package components;

public class Demo {

	public static void main(String[] args) {
		// Using default constructor
//		Laptop lappy = new Laptop();
	
		Processor proc = new Processor("MacinTOS", "Air", "2 GB");
		Graphics graph = new Graphics("AMD", "Razor 88T", "3 GB");
		Laptop lappy = new Laptop("Apple", graph, 14.5f, "Gaming", proc);
		System.out.println(lappy);
		
	}

}
