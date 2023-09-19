package suunnittelu_teht4_observer;

import java.util.Observable;
import java.util.Observer;

public class Main {

	public static void main(String[] args) {

		  ClockTimer timer = new ClockTimer();
	        DigitaaliKello digiKello= new DigitaaliKello(timer);

	}

}
