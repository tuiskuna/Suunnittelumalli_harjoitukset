package suunnittelu_teht3;

public class Main {

	public static void main(String[] args) {

		Laiteosa muistipiiri = new Muistipiiri();
		Laiteosa prosessori = new Prosessori();
		Laiteosa verkkokortti = new Verkkokortti();
		Laiteosa naytonohjain = new Naytonohjain();
		
		Kokoonpano emolevy = new Emolevy();
		
		emolevy.addLaitteenOsa(prosessori);
		emolevy.addLaitteenOsa(muistipiiri);
		
		Kokoonpano kotelo = new Kotelo();
		
		kotelo.addLaitteenOsa(verkkokortti);
		kotelo.addLaitteenOsa(prosessori);
		
		Kokoonpano laite1 = new Kokoonpano();
		Kokoonpano laite2 = new Kokoonpano();
		
		laite1.addLaitteenOsa(emolevy);
		laite1.addLaitteenOsa(naytonohjain);
		
		laite2.addLaitteenOsa(kotelo);
		
		
		
		System.out.println("Laitteen yksi hinta: " + laite1.getHinta());
		System.out.println("Laitteen kaksi hinta: " + laite2.getHinta());
	}

}
