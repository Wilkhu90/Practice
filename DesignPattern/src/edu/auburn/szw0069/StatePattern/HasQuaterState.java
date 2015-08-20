package edu.auburn.szw0069.StatePattern;

public class HasQuaterState implements State{
	GumballMachine gumballMachine;
	
	public HasQuaterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another Quarter.");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());		
	}

	@Override
	public void dispense() {
		System.out.println("No Gumball dispensed.");
		
	}

}
