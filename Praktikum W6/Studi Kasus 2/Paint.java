//==================================================================//
//	Paint.java		Author:...
//					Updated: Bhisma/21-02-2023
//	
//	Represents a type of paint that has a fixed area covered by
//	a gallon. All measurement are in feet.
//==================================================================//

public class Paint {
	private double coverage; // number of square feet per galon
	
	//----------------------------------------------------------
	//	Constructor: Sets up the paint object.
	//----------------------------------------------------------
	public Paint(double coverage) {
		this.coverage = coverage;
	}
	
	//----------------------------------------------------------
	//	Returns the amount of paint (number of gallons)
	//	needed to paint the shape given as the parameter.
	//	The amount of paint needed is the area of the shape 
	//	divided by the coverage for the paint
	//----------------------------------------------------------
	public double amount(Shape shape) {
		System.out.println("\nComputing the amount for " + shape);
		return shape.area()/coverage;
	}
}
