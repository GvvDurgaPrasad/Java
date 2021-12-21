package Abs_Shape;

public class Rectangle extends Shape
{
	private double width;
	private double length;
	
	public Rectangle() {
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	

	@Override
	public double getarea() {
		double area = 2 * (length + width);
		return area;
	}


	@Override
	public double getperimeter() {
		double perimeter = (length * width);
		return perimeter;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", getWidth()=" + getWidth() + ", getLength()="
				+ getLength() + ", getarea()=" + getarea() + ", getperimeter()=" + getperimeter() + ", getColor()="
				+ getColor() + ", isFilled()=" + isFilled() + "]";
	}
	
	

}
