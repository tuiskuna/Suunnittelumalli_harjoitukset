package suunnittelu_teht3;

import java.util.ArrayList;
import java.util.List;

public class Kokoonpano implements Laiteosa {
	
	private List<Laiteosa> laitteenosat;
	
	public Kokoonpano() {
		this.laitteenosat = new ArrayList<>();
	}
	
	public void addLaitteenOsa(Laiteosa osa) {
		laitteenosat.add(osa);
	}

	@Override
	public double getHinta() {
		double kokonaishinta = 0;
		 for (Laiteosa osa : laitteenosat) {
			 kokonaishinta += osa.getHinta();
		 }
		return kokonaishinta;
	}
	
}
