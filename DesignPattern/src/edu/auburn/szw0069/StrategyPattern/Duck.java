package edu.auburn.szw0069.StrategyPattern;

public abstract class Duck {
	
	QuackBehaviour 	quackBehaviour;
	FlyBehaviour 	flyBehaviour;
	public abstract void display();
	
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	public void PerformFly(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
		this.flyBehaviour.fly();
	}
	public void PerformQuack() {
		quackBehaviour.quack();
	}
}
