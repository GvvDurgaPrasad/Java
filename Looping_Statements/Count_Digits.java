package Looping_Statements;

import java.util.Scanner;

public class Count_Digits
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int remainder=0,count=0;
		
		while(num != 0)
		{
			remainder = num%10;	
			count++;	
			num=num/10;
		}
		System.out.println("sum of digits in the given number is " +count);	
	}
}
