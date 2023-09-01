package suunnittelu_teht3;

import java.util.ArrayList;
import java.util.List;

public class Laite implements Laiteosa {

	private List<Laiteosa> laitteenosat;
	
	public Laite() {
		this.laitteenosat = new ArrayList<>();
	}
	
	public void addLaiteosa(Laiteosa osa) {
		laitteenosat.add(osa);
	}
	
	public double getHinta() {
		double kokonaishinta = 0;
		 for (Laiteosa osa : laitteenosat) {
			 kokonaishinta += osa.getHinta();
		 }
		return kokonaishinta;
	}

}
