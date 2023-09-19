package suunnittelu_teht4_observer;

import java.util.Observable;
import java.util.Observer;

public class DigitaaliKello implements Observer {
	    private ClockTimer timer;

	    public DigitaaliKello(ClockTimer ct) {
	        timer = ct;
	        timer.addObserver(this); 
	    }

	    @Override
	    public void update(Observable o, Object arg) {
	        if (o == timer) {
	            draw();
	        }
	    }

	    private void draw() {
	        int hour = timer.getHour();

	        System.out.println("Digitaalikello: " + hour + ":" + timer.getMinute() + ":" + timer.getSecond());
	    }
	}
