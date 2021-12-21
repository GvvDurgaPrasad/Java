package Array;

import java.util.Scanner;

public class Demo
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Inputs :");
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0; i<size; i++)
		{
			System.out.println(a[i]);
		}
			
		
	}

}
