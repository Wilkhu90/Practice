package edu.auburn.szw0069.CommandPattern;

public class RemoteControl {
	
	Command slot;
	
	public RemoteControl(){}
	
	public void setCommand(Command command){
		this.slot = command;
	}
	
	public void OnButtonPress(){
		slot.execute();
	}

}
