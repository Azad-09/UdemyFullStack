package components;

public class Graphics {
	private String brand;
	private String series;
	private String memorySize;

	public Graphics() {
		this.brand = "Nvidia";
		this.series = "1070 GTX";
		this.memorySize = "4 GB ";
	}

	public Graphics(String brand, String series, String memorySize) {
		this.brand = brand;
		this.series = series;
		this.memorySize = memorySize;
		
		}

	@Override
	public String toString() {
		return "Graphics [brand=" + brand + ", series=" + series + ", memorySize=" + memorySize + "]";
	}
	
	

}
