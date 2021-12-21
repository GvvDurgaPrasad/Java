package Statements;

import java.util.*;

public class Vote_Age 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		
		if(number>17)
		{
			System.out.println("The person is eligible to vote.");
		}
		else if(number<17)
		{
			System.out.println("The person is not eligible to vote.");
		}
		else
		{
			System.out.println("Invalid.");
		}
		

	}

}
