package _2_observer.interfaces;

import _2_observer.model.WeatherDto;

public interface Observer {
	void update(WeatherDto dto);
}
