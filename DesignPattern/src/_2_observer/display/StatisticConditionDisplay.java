package _2_observer.display;

import org.springframework.util.Assert;

import _2_observer.interfaces.DisplayAble;
import _2_observer.interfaces.Observer;
import _2_observer.model.WeatherDto;

public class StatisticConditionDisplay  implements Observer, DisplayAble {
	private WeatherDto dto;

	@Override
	public void update(WeatherDto dto) {
		this.dto = dto;
		this.display();
	}

	@Override
	public void display() {
		Assert.notNull(dto);
		System.out.println("st" + dto);
	}
}
