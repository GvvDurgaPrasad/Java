package Methods;

import java.util.Scanner;

public class Arithmetic_Operations 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a,b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The addition is :"+add(a,b));
		System.out.println("The Subtraction is :"+subtraction(a, b));
		System.out.println(" Multiplication is :"+product(a, b));
		System.out.println("Division is :"+division(a, b));
	

	}
	public static int add(int a,int b)
	{
		int add=a+b;
		return add;
	}
	public static int subtraction(int a,int b)
	{
		int sub=a-b;
		return sub;
	}
	public static int product(int a,int b)
	{
		int product=a*b;
		return product;
	}
	public static int division(int a,int b)
	{
		int division=a/b;
		return division;

	}

}
