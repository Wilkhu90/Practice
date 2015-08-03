package edu.auburn.szw0069.CommandPattern;

public class RemoteControlTesting {
	
	public static void main(String [] args) {
		
		RemoteControl remote = new RemoteControl();
		Light light = new Light("Kitchen");
		Fan fan = new Fan("Room");
		//Light Commands.
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		//Fan Commands.
		FanOnCommand fanOn = new FanOnCommand(fan);
		FanOffCommand fanOff = new FanOffCommand(fan);
		
		remote.setCommand(lightOn);
		remote.OnButtonPress();
		
		remote.setCommand(lightOff);
		remote.OnButtonPress();
		
		remote.setCommand(fanOn);
		remote.OnButtonPress();
		
		remote.setCommand(fanOff);
		remote.OnButtonPress();
		
	}

}
