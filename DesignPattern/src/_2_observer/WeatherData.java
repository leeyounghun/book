package _2_observer;


public class WeatherData {
	public Integer getTemperature(){
		return (int) (Math.random() * 10 + 1);
	}

	public Integer getHumidity(){
		return (int) (Math.random() * 10 + 1);
	}

	public Integer getPressure(){
		return (int) (Math.random() * 10 + 1);
	}

	public void measurementsChanged(){
		System.out.println(getTemperature());
		System.out.println("changed");
	}
}
