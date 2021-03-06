package edu.auburn.szw0069.ObserverPattern;

public class WeatherSimulate {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		DisplayObserver display = new DisplayObserver(weatherData);
		weatherData.setMeasurements(200, 300, 55);
		weatherData.setMeasurements(300, 400, 56);
		weatherData.setMeasurements(400, 500, 57);
		System.out.println("The recent report is:");
		display.display();
	}

}
