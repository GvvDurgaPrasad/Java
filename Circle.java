package Abs_Shape;

public class Circle extends Shape
{
	private double radius;
	
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getarea() {
		double area = Math.PI * (radius * radius);
		return area;
	}

	@Override
	public double getperimeter() {
		double perimeter = (2 * Math.PI * radius);
		return perimeter;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + ", getarea()=" + getarea()
				+ ", getperimeter()=" + getperimeter() + ", getColor()=" + getColor() + ", isFilled()=" + isFilled()
				+ "]";
	}
	
	

}
