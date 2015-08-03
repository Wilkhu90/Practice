package edu.auburn.szw0069.CommandPattern;

public class FanOffCommand implements Command {
	
	Fan fan;
	
	public FanOffCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.off();
		
	}
}
