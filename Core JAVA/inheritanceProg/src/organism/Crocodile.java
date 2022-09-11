package organism;

public class Crocodile extends Reptile {
	
	
	public Crocodile() {
		super();
	}
	
	public Crocodile( String skin, boolean backbone ,  float height, float weight, String animalType, String bloodType) {
		super(skin, backbone,  height, weight, animalType, bloodType);
//		this.eggShell = eggShell;
	}

	

	@Override
	public String eggType() {
		return "Hard in case of Crocs";
	}

	@Override
	public String toString() {
		return "Crocodile [toString()=" + super.toString() + "]";
	}
	
	
	
	
}
