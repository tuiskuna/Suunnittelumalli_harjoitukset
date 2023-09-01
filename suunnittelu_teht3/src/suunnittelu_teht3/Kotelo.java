package suunnittelu_teht3;

import java.util.ArrayList;
import java.util.List;

public class Kotelo extends Kokoonpano {

	
	private List<Laiteosa> laitteenosat;
	private double hinta = 60;
	
	public Kotelo() {
		this.laitteenosat = new ArrayList<>();
	}
	
	public void addLaitteenOsa(Laiteosa osa) {
		laitteenosat.add(osa);
	}
	
	public double getHinta() {
		return getKokonaisHinta();
	}
	
	public double getKokonaisHinta() {
		double kokonaishinta = hinta;
		 for (Laiteosa osa : laitteenosat) {
			 kokonaishinta += osa.getHinta();
		 }
		return kokonaishinta;
	}

}
