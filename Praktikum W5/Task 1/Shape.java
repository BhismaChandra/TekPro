public class Shape {
	// private instance variable, not accessible from outside this class
	private String color;
	private boolean filled;

	// Constructors (overloaded)
	/** Constructs a Shape instance with default value for color and filled */
	public Shape() { // 1st (default) constructor
		color = "green";
		filled = true;
	}
	
	/** Constructs a Shape instance with given value for color and filled */
	public Shape(String color, boolean filled) { // 2nd constructor
		this.color = color;
		this.filled = filled;
	}

	/** Returns the value of filled */
	public boolean isFilled() {
		return filled;
	}

	/** Return the value of color*/
	public String getColor() {
		return color;
	}

	/** Assign the value of filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Assign the value of color */
	public void setColor(String color) {
		this.color = color;
	}

	/** Return a self descriptive string of this instance in the form of
	A Shape with color of xxx and filled/not filled*/
	public String toString() {
		String filledStatus = filled ? "filled" : "not filled";
		return "A Shape with color of " + color + " and " + filledStatus;
	}
}