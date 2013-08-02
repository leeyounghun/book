package _2_observer;

import _2_observer.display.CurConditionDisplay;
import _2_observer.display.StatisticConditionDisplay;
import _2_observer.subject.WeatherSubject;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WeatherSubject wsb = new WeatherSubject();
		wsb.registerObserver(new CurConditionDisplay());
		wsb.registerObserver(new StatisticConditionDisplay());

		wsb.measurementsChanged();
	}

}
