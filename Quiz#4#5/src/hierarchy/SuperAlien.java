package hierarchy;

public class SuperAlien extends Alien implements FlightSkill{
	
	public SuperAlien(String pspecieName) {
		super(pspecieName);
		
	}
	
	public void volar() {
		System.out.println(specieName + " Vuela usando una piedra de levitacion");
	}

}
