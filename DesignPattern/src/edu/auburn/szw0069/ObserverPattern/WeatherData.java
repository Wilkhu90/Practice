package edu.auburn.szw0069.ObserverPattern;

import java.util.Observable;

public class WeatherData extends Observable{
	
	float temperature;
	float humidity;
	float pressure;
	
	public WeatherData() {}
	
	public void MeasurementChanged() {
		
		setChanged();
		notifyObservers(this);
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.humidity = humidity;
		this.temperature = temperature;
		this.pressure = pressure;
		MeasurementChanged();
	}

}
