package organism;

import organism.Animal;

public class Reptile extends Animal {

	private String skin;
	private boolean backbone;
	private String egg;

	public Reptile() {
		super();
	}

	public Reptile(String skin, boolean backbone, float height, float weight, String animalType, String bloodType) {
		super(height, weight, animalType, bloodType);

		this.skin = skin;
		this.backbone = backbone;

	}
	
	
	public String eggType() {
		return "Generally Soft";
	}

	public String getSkin() {
		return skin;
	}

	public boolean isBackbone() {
		return backbone;
	}

	public String getEgg() {
		return egg;
	}

	@Override
	public String toString() {
		return "Reptile [skin=" + skin + ", backbone=" + backbone + ", egg=" + egg + ", toString()=" + super.toString()
				+ "]";
	}

}
