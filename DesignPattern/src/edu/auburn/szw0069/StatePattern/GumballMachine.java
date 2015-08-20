package edu.auburn.szw0069.StatePattern;

public class GumballMachine {
	
	State noQuarterState;
	State soldState;
	State soldOutState;
	State hasQuarterState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutSate(this);
		noQuarterState = new NoQuaterState(this);
		hasQuarterState = new HasQuaterState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		if(numberGumballs>0){
			state = noQuarterState;
		}
		
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	void setState(State state){
		this.state = state;
	}
	
	void releaseBall(){
		System.out.println("The ball comes rolling down...");
		if (count!=0){
			count=count-1;
		}
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}
	
	public State getState() {
		return state;
	}

	public int getCount() {
		return count;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public String toString(){
		String string;
		System.out.println("Mighty Gumball, Inc.");
		System.out.println("Inventory: "+ count +" gumballs");
		if (count>0){
			string = "Machine is waiting for quarter.\n";
		}
		else{
			string = "Machine is sold out.\n";
		}
		return string;
	}

}
