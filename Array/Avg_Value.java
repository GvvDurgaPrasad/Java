package Array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Avg_Value 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the Marks :");
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		int sum = 0;
		int length = Array.getLength(a);
		for(int i = 0; i<Array.getLength(a); i++)
		{
			sum += a[i];
		}
		double avg = sum/length;
		System.out.println("The avg :"+avg);
			
	}

}
