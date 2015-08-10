package edu.auburn.szw0069.AdapterPattern;

public class EnemyRobotAdapter implements EnemyAttacker{
	EnemyRobot enemy;
	
	public EnemyRobotAdapter(EnemyRobot enemy){
		this.enemy = enemy;
	}

	@Override
	public void fireWeapon() {
		enemy.smashWithHands();
		
	}

	@Override
	public void driveForward() {
		enemy.walkForward();
		
	}

	@Override
	public void assignDriver(String driver) {
		enemy.reactToHuman(driver);
		
	}
	
	

}
