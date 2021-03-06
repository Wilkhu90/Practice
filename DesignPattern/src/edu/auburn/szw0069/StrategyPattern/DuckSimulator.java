package edu.auburn.szw0069.StrategyPattern;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		//mallard.setFlyBehaviour(new NoFly());
		mallard.setQuackBehaviour(new Squeek());
		mallard.PerformFly(new Fly());
		mallard.PerformQuack();
	}

}
