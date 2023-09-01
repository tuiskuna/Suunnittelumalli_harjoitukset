package suunnittelu_teht3;

public class Main {

	public static void main(String[] args) {

		Laiteosa muistipiiri = new Muistipiiri();
		Laiteosa emolevy = new Emolevy();
		Laiteosa kotelo = new Kotelo();
		Laiteosa prosessori = new Prosessori();
		
		Laite laite1 = new Laite();
		Laite laite2 = new Laite();
		
		laite1.addLaiteosa(kotelo);
		laite1.addLaiteosa(emolevy);
		
		laite2.addLaiteosa(prosessori);
		laite2.addLaiteosa(kotelo);
		laite2.addLaiteosa(muistipiiri);
		laite2.addLaiteosa(emolevy);
		
		System.out.println("Laitteen yksi hinta: " + laite1.getHinta());
		System.out.println("Laitteen kaksi hinta: " + laite2.getHinta());
	}

}
