interface Enclosure {
	public double perimeter();
	public double area();
}

class Circle implements Enclosure{
	final double pi = 22/7;
	double radius;
	Circle(double radius) {
    	this.radius = radius;
	}
	public double area() {
		return pi*radius*radius;
	}
	public double perimeter() {
		return 2*pi*radius;
	}
}

class Square implements Enclosure{
	double width;
	Square(double width) {
    	this.width = width;
	}
	public double area() {
		return width * width;
	}
	public double perimeter() {
		return 4*width;
	}
}

public class EnclosureTest {

	public static void main(String[] args) {
		Circle circleObj = new Circle(5);
		System.out.println(circleObj.area());
		System.out.println(circleObj.perimeter());
		Square squareObj = new Square(5);
		System.out.println(squareObj.area());
		System.out.println(squareObj.perimeter());

	}

}
