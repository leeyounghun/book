package _2_observer.subject;

import java.util.ArrayList;
import java.util.List;

import _2_observer.WeatherData;
import _2_observer.interfaces.Observer;
import _2_observer.interfaces.Subject;
import _2_observer.model.WeatherDto;

public class WeatherSubject extends WeatherData implements Subject{

	private List<Observer> observers = new ArrayList<Observer>();
	@Override
	public void measurementsChanged(){
		notifyObservers();
	}

	@Override
	public Integer registerObserver(Observer obs) {
		this.observers.add(obs);
		return observers.size();
	}

	@Override
	public Boolean removeObserver(Observer obs) {
		return this.observers.remove(obs);
	}

	@Override
	public Integer notifyObservers() {
		for (Observer srcObs : this.observers) {
			srcObs.update(getCurWeatherData());
		}

		return this.observers.size();
	}

	private WeatherDto getCurWeatherData() {
		WeatherDto dto = new WeatherDto();

		dto.setHumidity(super.getHumidity());
		dto.setPressure(super.getPressure());
		dto.setTemp(super.getTemperature());

		return dto;
	}
}
