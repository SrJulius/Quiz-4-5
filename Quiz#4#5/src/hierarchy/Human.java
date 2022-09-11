package hierarchy;

public class Human{
	
	protected String name = "";
	
	public Human(String pname) {
		this.name = pname;
	}
	
	public void hablar() {
		System.out.println(name + " habla");
	}
	
	public void caminar() {
		System.out.println(name + " camina");
	}

}
