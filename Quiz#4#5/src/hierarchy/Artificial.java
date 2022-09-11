package hierarchy;

public class Artificial {
	
	protected String droidName;
	
	public Artificial(String pdroidName) {
		this.droidName = pdroidName;
		
	}
	
	public void seguirInstrucciones() {
		System.out.println(droidName + " Sigue instrucciones");
	}

}
