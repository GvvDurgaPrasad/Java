package Looping_Statements;

import java.util.Scanner;

public class Even_NaturalNumbers
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int num = sc.nextInt();
		int i=2, sum=0;
		while(i<=num)
		{
			sum = sum+i;
			i = i+2;
		}
			System.out.println("Sum of first n natural numbers :" +sum);
		
		
	}

}
