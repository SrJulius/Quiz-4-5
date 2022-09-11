package hierarchy;

public class Alien{
	
	protected String specieName;
	
	
	public Alien(String pspecieName) {
		this.specieName = pspecieName;
	}
	
	
	public void comunicar() {
		System.out.println(specieName + " Intenta comunicarse");
	}

}
