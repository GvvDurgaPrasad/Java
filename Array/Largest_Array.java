package Array;

import java.util.Scanner;

public class Largest_Array 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the numbers :");
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for(int i=0; i<size; i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		}
		System.out.println("The Largest Number :"+max);	
		}

	}


