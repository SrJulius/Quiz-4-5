package hierarchy;

public class SuperHuman extends Human implements FlightSkill {
	
	SuperHuman(String pname){
		super(pname);
	}
	
	
	public void volar() {
		System.out.println(name + " vuela");
	}
	

	}
