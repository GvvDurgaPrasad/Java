package Var_Dat;

public class SemiPerimeter {

	public static void main(String[] args) {
		
		double a,b,c,perimeter,s,area;
		a = 10;
		b = 12;
		c = 15;
		
		perimeter = a+b+c;
		s = (a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("The perimeter of Triangle = " +perimeter);
		System.out.println("The semi perimeter of Triangle = " +s);
		System.out.println("The Area of Triangle = " +area);

	}

}
