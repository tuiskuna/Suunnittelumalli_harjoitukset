package suunnittelu_teht3;

import java.util.ArrayList;
import java.util.List;

public class Emolevy extends Kokoonpano{

	private List<Laiteosa> laitteenosat;
	private double hinta = 90;
	
	public Emolevy() {
		this.laitteenosat = new ArrayList<>();
	}
	
	public void addLaitteenOsa(Laiteosa osa) {
		laitteenosat.add(osa);
	}
	@Override
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
