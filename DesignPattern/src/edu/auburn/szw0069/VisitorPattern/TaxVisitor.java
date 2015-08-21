package edu.auburn.szw0069.VisitorPattern;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor{
	
	DecimalFormat df;
	
	public TaxVisitor(String decimalPoints) {
		df = new DecimalFormat(decimalPoints);
	}

	@Override
	public double visit(Liquor item) {
		System.out.println("Liquor Price: After the tax");
		return Double.parseDouble(df.format((item.getPrice() * .16) + item.getPrice()));
	}

	@Override
	public double visit(Tobacco item) {
		System.out.println("Tobacco Price: After the tax");
		return Double.parseDouble(df.format((item.getPrice() * .30) + item.getPrice()));
	}

	@Override
	public double visit(Necessity item) {
		System.out.println("Necessity Price: After the tax");
		return Double.parseDouble(df.format((item.getPrice() * 0) + item.getPrice()));
	}
	
	

}
