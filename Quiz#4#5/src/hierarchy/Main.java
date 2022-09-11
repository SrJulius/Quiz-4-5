package hierarchy;

public class Main {

	public static void main(String[] args) {
		
		Human Alfred = new Human("Alfred");
		Alfred.hablar();
		Alfred.caminar();
		
		SuperHuman Homelander = new SuperHuman("Homelander");
		Homelander.hablar();
		Homelander.volar();
		
		System.out.println(' ');
		
		
		Artificial R2D2 = new Artificial("R2D2");
		R2D2.seguirInstrucciones();
		
		
		SuperArtificial Gigante = new SuperArtificial("Gigante de acero");
		Gigante.seguirInstrucciones();
		Gigante.volar();

		System.out.println(' ');
		
		
		Alien Jabba = new Alien("Jabba");
		Jabba.comunicar();
		
		
		SuperAlien Mantis = new SuperAlien("Mantis");
		Mantis.comunicar();
		Mantis.volar();
		

	}

}
