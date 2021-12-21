package Array;

import java.util.Scanner;

public class Array_Method_Demo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt(); 
		int a[] = new int[size];
		System.out.println("Enter the input");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		single(a);

	}
	
	public static void single(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("The index"+" i : = "+a[i]);
		}
	}

}