package edu.auburn.szw0069.VisitorPattern;

public interface Visitor {
	
	public double visit(Liquor item);
	public double visit(Tobacco item);
	public double visit(Necessity item);

}
