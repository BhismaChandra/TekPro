public class Square extends Rectangle {

	// Constructors (overloaded)
	/** Constructs a Rectangle instance with default value for side, color, and filled */
    public Square() {
        super();
    }

	/** Constructs a Rectangle instance with given value for side, but given value for color, and filled */
    public Square(double side) {
        super(side, side);
    }

	/** Constructs a Rectangle instance with given value for side, color, and filled */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

	/** Assign the side */
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

	/** Returns the side */
    public double getSide() {
        return super.getWidth();
    }
//
//    @Override
//	/** to maintain the square geometry */
//    public void setWidth(double width) {
//        setSide(width);
//    }
//
//    @Override
//	/** to maintain the square geometry */
//    public void setLength(double length) {
//        setSide(length);
//    }

    @Override
	/** Return a self descriptive string of this instance in the form of
   A Square with side=xxx, which is a subclass of yyy*/
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
