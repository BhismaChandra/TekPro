//==================================================================//
//	Shape.java		Author: Bhisma/21-02-2023
//	
//	Represents a shape.
//==================================================================//

abstract class Shape {
    private String shapeName;

	//----------------------------------------------------------
	//	Constructor: Sets up the shape.
	//----------------------------------------------------------
    public Shape(String name) {
    	shapeName = name;
    }

	//----------------------------------------------------------
	//Derived classes must define the area method for each type
	//of shape.
	//----------------------------------------------------------
    public abstract double area();

	//----------------------------------------------------------
	//	Returns the shape as a String.
	//----------------------------------------------------------
	@Override
    public String toString() {
        return shapeName;
    }
}