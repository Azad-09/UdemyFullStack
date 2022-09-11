package components;

public class Laptop {
	private String brand;
	private Graphics graphics;
	private float screenSize;
	private String laptopType;
	private Processor processor;
	
	public Laptop() {
		this.brand = "MI";
		// anonymous Object
		this.graphics = new Graphics();
		this.screenSize = 15.6f;
		this.laptopType = "Professional Laptop";
		// anonymous Object
		this.processor = new Processor();
	}
	
	public Laptop(String brand, Graphics graphics, float screenSize, String laptopType, Processor processor) {
		this.brand = brand;
		this.graphics = graphics;
		this.screenSize = screenSize;
		this.laptopType = laptopType;
		this.processor = processor;
		
	}

	@Override
	public String toString() {
		return "Laptop [brand= " + brand + ", graphics= " + graphics + ", screenSize= " + screenSize + ", laptopType= "
				+ laptopType + ", processor= " + processor + "]";
	}
	
	
}
