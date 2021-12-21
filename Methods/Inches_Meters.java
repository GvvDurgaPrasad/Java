package Methods;

import java.util.Scanner;

public class Inches_Meters
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the inputs");
		double inch=sc.nextDouble();
		double meter=inch*0.025;
		System.out.println("The Value is:"+meter);
		
		
	}
	public static double inctometer(double inch,double meter)
	{
		double result = inch*0.025;
		return result;
	}

}