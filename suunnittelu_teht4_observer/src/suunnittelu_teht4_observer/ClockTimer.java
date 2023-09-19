package suunnittelu_teht4_observer;

import java.util.Calendar;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

public class ClockTimer extends Observable {
	private Calendar currentTime;

	public ClockTimer() {
		currentTime = Calendar.getInstance(); 


		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				tick();
			}
		}, 1000, 1000); //timer kutsuu tikitystä sekunnin välein
	}

	public int getHour() {
		return currentTime.get(Calendar.HOUR_OF_DAY);
	}

	public int getMinute() {
		return currentTime.get(Calendar.MINUTE);
	}

	public int getSecond() {
		return currentTime.get(Calendar.SECOND);
	}

	public void tick() {

		currentTime.add(Calendar.SECOND, 1);

		setChanged();
		notifyObservers(); 
	}
}

