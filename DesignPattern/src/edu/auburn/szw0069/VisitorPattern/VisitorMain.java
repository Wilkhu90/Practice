package edu.auburn.szw0069.VisitorPattern;

public class VisitorMain {
	
	public static void main(String [] args){
		
		TaxVisitor taxCalc = new TaxVisitor();
		
		Liquor liquorItem = new Liquor(3.14);
		Tobacco tobaccoItem = new Tobacco(13.14);
		Necessity necessityItem = new Necessity(20.14);
		
		System.out.println("The Tax System in execution...\n");
		System.out.println(liquorItem.accept(taxCalc));
		System.out.println(tobaccoItem.accept(taxCalc));
		System.out.println(necessityItem.accept(taxCalc));
	}

}
