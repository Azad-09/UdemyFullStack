package components;

public class Processor {
	private String proName;
	private String proSeries;
	private String mainMemory;

	//default constructor
	public Processor() {
		this.proName = "Intel";
		this.proSeries = "i7 10th Gen";
		this.mainMemory = "16 GB RAM";
	}

	// Parameterized constructor
	public Processor(String proName , String proSeries, String mainMemory) {
		this.proName = proName;
		this.proSeries = proSeries;
		this.mainMemory = mainMemory;
	}

	@Override
	public String toString() {
		return "Processor [proName=" + proName + ", proSeries=" + proSeries + ", mainMemory=" + mainMemory + "]";
	}
	
	

}
