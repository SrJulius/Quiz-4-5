package hierarchy;

public class SuperArtificial extends Artificial implements FlightSkill {
	
	public SuperArtificial(String pdroidName) {
		super(pdroidName);
	}
	
	public void volar() {
		System.out.println(droidName + " Vuela usando un jetpack incorporado");
	}
	
	

}
