package organism;

public class Animal {
	private float height;
	private float weight;
	private String animalType;
	private String bloodType;
	
	public  Animal() {
		
	}
	
	public  Animal(float height, float weight, String animalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}
	
	
	

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public String getAnimalType() {
		return animalType;
	}

	public String getBloodType() {
		return bloodType;
	}

	@Override
	public String toString() {
		return "Animal [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}
	
	
}
