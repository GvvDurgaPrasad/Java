package Statements;

import java.util.*;

public class Greatest_Num
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
		
		if(x>y && x>z)
		{
			System.out.println("Largest number = " +x);
		}
		else if(y>z)
		{
			System.out.println("Largest number = " +y);
		}
		else
		{
			System.out.println("Largest number = " +z);
		}
		

	}

}
