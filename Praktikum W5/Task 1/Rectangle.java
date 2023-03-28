/*
 * The Rectangle class models a rectangle with a width, length, color, and filled.
 */
public class Rectangle extends Shape {
    private double width;
    private double length;

	// Constructors (overloaded)
	/** Constructs a Rectangle instance with default value for width, length, color, and filled */
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

	/** Constructs a Rectangle instance with default value for color and filled, but given value for width and length */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

	/** Constructs a Rectangle instance with given width, length, color, and filled */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

	/** Assign the width */
    public void setWidth(double width) {
        this.width = width;
    }
    
	/** Assign the length */
    public void setLength(double length) {
        this.length = length;
    }

	/** Returns the width */
    public double getWidth() {
        return width;
    }
    
	/** Returns the length */
    public double getLength() {
        return length;
    }

	/** Returns the surface area of this Rectangle instance */
    public double getArea() {
        return width * length;
    }


	/** Returns the perimeter of this Rectangle instance */
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
	/** Return a self descriptive string of this instance in the form of
    A Rectangle with width=xxx and length=zzz, which is a subclass of yyy*/
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
