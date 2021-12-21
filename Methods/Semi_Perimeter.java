package Methods;

import java.util.Scanner;

public class Semi_Perimeter 
{
	public static double Perimeter(int a, int b,int c)
	{
		double SemiPerimeter = (a+b+c)/2;
		return SemiPerimeter;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("The SemiPerimeter :" +Perimeter(a,b,c));
		
	}

}
