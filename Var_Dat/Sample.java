package Var_Dat;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the inputs");
		int num1=sc.nextInt();
		float num2=sc.nextFloat();
		double num3=sc.nextDouble();
		String name=sc.next();
		char initial=sc.next().charAt(0);
		System.out.println("Integer input:"+num1);
		System.out.println("Float input:"+num2);
		System.out.println("double input:"+num3);
		System.out.println("String is:"+name);
		System.out.println("Char data:"+initial);
		sc.close();

	}

}