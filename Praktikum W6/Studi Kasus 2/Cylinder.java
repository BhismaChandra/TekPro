//==================================================================//
//	Cylinder.java		Author: Bhisma/21-02-2023
//	
//	Represents a cylinder.
//==================================================================//

public class Cylinder extends Shape {
    private double radius;
    private double height;

	//----------------------------------------------------------
	//	Constructor: Sets up the cylinder.
	//----------------------------------------------------------
    public Cylinder(double radius, double height) {
    	super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

	//----------------------------------------------------------
	//	Returns the cylinder area of the rectangle.
	//----------------------------------------------------------
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

	//----------------------------------------------------------
	//	Returns the cylinder as a String.
	//----------------------------------------------------------
	@Override
    public String toString() {
		return super.toString() + "\nWith the Radius of: " + radius
				+ " and the Height of: " + height;
    }
}
