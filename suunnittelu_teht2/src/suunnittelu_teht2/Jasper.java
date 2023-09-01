package suunnittelu_teht2;

public class Jasper {
	private Farmarit farmarit;
	private TPaita tPaita;
	private Lippis lippis;
	private Kengat kengat;
	
	 public Jasper(AbstractFactory factory) {
	        farmarit = factory.createFarmarit();
	        tPaita = factory.createTpaita();
	        lippis = factory.createLippis();
	        kengat = factory.createKengat();
	    }
	 
	 public void puePaalle() {
		 System.out.println("Pukeudutaan: " + farmarit + ", " + tPaita + ", " + lippis + ", " + kengat);
	 }

}
