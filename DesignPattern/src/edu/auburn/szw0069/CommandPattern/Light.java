package edu.auburn.szw0069.CommandPattern;

public class Light {
	String light;
	public Light(String light){
		this.light = light;
	}
	
	public void on(){
		System.out.println("The "+ this.light +" Light is on.");
	}
	
	public void off(){
		System.out.println("The "+ this.light +" Light is off.");
	}

}
