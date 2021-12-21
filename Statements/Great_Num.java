package Statements;

import java.util.Scanner;

public class Great_Num 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the inputs: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int max=num1;
		if(num2>max)
		{
	     max=num2;
		}
		if(num3>max)
		{
			max=num3;
		}
		
System.out.println("The Max value is :"+max);
	}

}