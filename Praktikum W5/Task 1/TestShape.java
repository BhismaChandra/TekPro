public class TestShape {

	public static void main(String[] args) {
		/* default shape */
		Shape shape1 = new Shape();
		System.out.println(shape1.toString());

		/* shape with given color and fill */
		Shape shape2 = new Shape("yellow", false);
		System.out.println(shape2.toString()+"\n");

		/* default rectangle */
		Rectangle rectangle1 = new Rectangle();
		System.out.println(rectangle1.toString());
		System.out.println("Rectangle:" + " area=" + rectangle1.getArea() 
		+ ", perimeter=" + rectangle1.getPerimeter() + "\n");

		/* rectangle with given width and length */
		Rectangle rectangle2 = new Rectangle(12, 18);
		System.out.println(rectangle2.toString());
		System.out.println("Rectangle:" + " area=" + rectangle2.getArea() 
		+ ", perimeter=" + rectangle2.getPerimeter() + "\n");

		/* rectangle with given width, length, color, and fill */
		Rectangle rectangle3 = new Rectangle(7, 8, "orange", false);
		System.out.println(rectangle3.toString());
		System.out.println("Rectangle:" + " area=" + rectangle3.getArea() 
		+ ", perimeter=" + rectangle3.getPerimeter() + "\n");

		/* default square */
		Square square1 = new Square();
		System.out.println(square1.toString());
		System.out.println("Square:" + " area=" + square1.getArea() 
		+ ", perimeter=" + square1.getPerimeter() + "\n");

		/* square with given sides */
		Square square2 = new Square(9);
		System.out.println(square2.toString());
		System.out.println("Square:" + " area=" + square2.getArea() 
		+ ", perimeter=" + square2.getPerimeter() + "\n");

		/* square with given sides, color, and fill */
		Square square3 = new Square(9, "orange", false);
		System.out.println(square3.toString());
		System.out.println("Square:" + " area=" + square3.getArea() 
		+ ", perimeter=" + square3.getPerimeter() + "\n");

		/* default circle */
		Circle circle1 = new Circle();
		System.out.println(circle1.toString());
		System.out.println("Circle:" + " area=" + circle1.getArea() 
		+ ", perimeter=" + circle1.getPerimeter() + "\n");

		/* circle with given radius */
		Circle circle2 = new Circle(3);
		System.out.println(circle2.toString());
		System.out.println("Circle:" + " area=" + circle2.getArea() 
		+ ", perimeter=" + circle2.getPerimeter() + "\n");

		/* circle with given radius, color, and fill */
		Circle circle3 = new Circle(5, "orange", false);
		System.out.println(circle3.toString());
		System.out.println("Circle:" + " area=" + circle3.getArea() 
		+ ", perimeter=" + circle3.getPerimeter() + "\n");
	}

}
