package edu.auburn.szw0069.StatePattern;

public class SoldOutSate implements State{
	GumballMachine gumballMachine;
	
	public SoldOutSate(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert, the machine is sold out.");				
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter.");		
		
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there's no gumball.");		
		
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed.");		
		
	}

}
