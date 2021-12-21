package Methods;

import java.util.Scanner;

public class Greatest_Number
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int x = sc.nextInt();
		System.out.println("Enter the second number :");
		int y = sc.nextInt();
		System.out.println("Enter the third number :");
		int z = sc.nextInt();
		System.out.println("The Greatest Number :"+Greatest(x,y,z));
	}
	public static int Greatest(int x, int y, int z)
	{
		if(x>y && x>z)
			return x;
		
		else if(y>z)
			return y;
		
		else
			return z;
	}

}
