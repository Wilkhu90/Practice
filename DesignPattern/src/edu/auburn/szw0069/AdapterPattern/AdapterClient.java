package edu.auburn.szw0069.AdapterPattern;

public class AdapterClient {
	public static void main(String [] args) {
		EnemyAttacker enemyAttacker = new EnemyAttackerMachine();
		EnemyRobot enemyRobot = new EnemyRobotMachine();
		EnemyRobotAdapter enemyRobotAdapter = new  EnemyRobotAdapter(enemyRobot);
		
		enemyAttacker.assignDriver("Paul");
		enemyAttacker.driveForward();
		enemyAttacker.fireWeapon();
		
		enemyRobotAdapter.assignDriver("Robot");
		enemyRobotAdapter.driveForward();
		enemyRobotAdapter.fireWeapon();
	}

}
