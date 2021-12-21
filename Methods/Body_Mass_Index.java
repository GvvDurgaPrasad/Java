package Methods;

import java.util.Scanner;

public class Body_Mass_Index 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight :");
		double a = sc.nextDouble();
		System.out.println("Enter the height :");
		double b = sc.nextDouble();
		System.out.println("The BMI :"+BMI(a,b));
		
	}
	public static double BMI(double weight, double height)
	{
		double BMI = weight/(height*height);
		return BMI;
	}

}
