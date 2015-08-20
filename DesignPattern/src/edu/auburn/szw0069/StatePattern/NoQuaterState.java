package edu.auburn.szw0069.StatePattern;

public class NoQuaterState implements State{
	GumballMachine gumballMachine;
	
	public NoQuaterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a Quarter.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a Quarter.");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there's no Quarter.");		
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first.");		
	}

}
