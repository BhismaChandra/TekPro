/*
 * The Circle class models a circle with a radius, color, and filled.
 */
public class Circle extends Shape {
	// private instance variable, not accessible from outside this class
	private double radius;

	// Constructors (overloaded)
	/** Constructs a Circle instance with default value for radius and color */
	public Circle() { // 1st (default) constructor
		super();
		radius = 1.0;
	}

	/** Constructs a Circle instance with the given radius and default color */
	public Circle(double radius) { // 2nd constructor
		super();
		this.radius = radius;
	}

	/** Constructs a Circle instance with the given radius and given color */
	public Circle(double radius, String color, boolean filled) { // 3rd constructor
		super(color, filled);
		this.radius = radius;
	}
	
	/** Assign the radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/** Returns the radius */
	public double getRadius() {
		return radius;
	}
	
	/** Returns the area of this Circle instance */
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	/** Returns the perimeter of this Circle instance */
	public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

	@Override
	/** Return a self descriptive string of this instance in the form of
	    A Circle with radius=xxx, which is a subclass of yyy*/
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}