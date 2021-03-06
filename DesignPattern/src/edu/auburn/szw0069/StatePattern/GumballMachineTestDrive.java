package edu.auburn.szw0069.StatePattern;

public class GumballMachineTestDrive {
	public static void main(String [] args){
		GumballMachine gumballMachine = new GumballMachine(2);
		
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
	}

}
