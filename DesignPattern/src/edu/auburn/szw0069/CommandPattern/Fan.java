package edu.auburn.szw0069.CommandPattern;

public class Fan {
	String fan;
	public Fan(String fan){
		this.fan = fan;
	}
	
	public void on(){
		System.out.println("The "+ this.fan +" Light is on.");
	}
	
	public void off(){
		System.out.println("The "+ this.fan +" Light is off.");
	}

}
