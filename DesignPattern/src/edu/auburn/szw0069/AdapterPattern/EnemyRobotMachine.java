package edu.auburn.szw0069.AdapterPattern;

public class EnemyRobotMachine implements EnemyRobot{

	@Override
	public void smashWithHands() {
		System.out.println("Enemy robot fired a weapon.");
		
	}

	@Override
	public void walkForward() {
		System.out.println("Enemy is walking forward.");
		
	}

	@Override
	public void reactToHuman(String human) {
		System.out.println("Enemy is reacting to "+ human);
		
	}

}
