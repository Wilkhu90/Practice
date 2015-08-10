package edu.auburn.szw0069.AdapterPattern;

public class EnemyAttackerMachine implements EnemyAttacker{

	@Override
	public void fireWeapon() {
		System.out.println("Enemy tank fired a weapon.");
		
	}

	@Override
	public void driveForward() {
		System.out.println("Enemy is driving forward.");
		
	}

	@Override
	public void assignDriver(String driver) {
		System.out.println("Enemy tank is driven by "+driver);
		
	}

}
