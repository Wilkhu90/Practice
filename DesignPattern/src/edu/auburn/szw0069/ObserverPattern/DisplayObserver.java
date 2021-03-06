package edu.auburn.szw0069.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class DisplayObserver implements Observer, Display{
	
	Observable observable;
	float temperature;
	float humidity;
	float pressure;
	
	public DisplayObserver(Observable ob){
		this.observable = ob;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			this.humidity = ((WeatherData) o).humidity;
			this.pressure = ((WeatherData) o).pressure;
			display();
		}
		
	}

	@Override
	public void display() {
		System.out.println("The humidity is: " + humidity + " and the pressure is: " + pressure + ".");
		
	}
	
	

}
