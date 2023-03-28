//==================================================================//
//	Rectangle.java		Author: Bhisma/21-02-2023
//	
//	Represents a rectangle.
//==================================================================//

public class Rectangle extends Shape {
    private double length;
    private double width;
    
	//----------------------------------------------------------
	//	Constructor: Sets up the rectangle.
	//----------------------------------------------------------
    public Rectangle(double length, double width) {
    	super("Rectangle");
        this.length = length;
        this.width = width;
    }

	//----------------------------------------------------------
	//	Returns the surface area of the rectangle.
	//----------------------------------------------------------
    @Override
    public double area() {
        return length * width;
    }


	//----------------------------------------------------------
	//	Returns the rectangle as a String.
	//----------------------------------------------------------
	@Override
    public String toString() {
		return super.toString() + "\nWith the length of: " + length
				+ " and the Width of: " + width;
    }
}
