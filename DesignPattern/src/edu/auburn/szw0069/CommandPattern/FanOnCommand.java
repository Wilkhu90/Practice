package edu.auburn.szw0069.CommandPattern;

public class FanOnCommand implements Command {

	Fan fan;
	
	public FanOnCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.on();
		
	}
}
