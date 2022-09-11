package organism;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crocodile crocs = new Crocodile("Dry", true, (float) 6.3, 330, "Reptile", "sh");

		System.out.println("Crocs Skin Type: " + crocs.getSkin() + "\nCrocs has backcone: " + crocs.isBackbone()
				+ "\nCrocs height in feet: " + crocs.getHeight() + "\nCrocs weight in pounds: " + crocs.getWeight()
				+ "\nCrocs Animal Type: " + crocs.getAnimalType() + "\nCrocs Blood Type: " + crocs.getBloodType()
				+ "\nCrocks EggShell Type: " + crocs.eggType());
	}

}
