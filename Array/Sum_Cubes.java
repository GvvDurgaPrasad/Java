package Array;

import java.util.Scanner;

public class Sum_Cubes {

	public static void main(String[] args) 
	{
		
        sumCubes();
	}
	
	public static void sumCubes()
	{   
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of array");
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    System.out.println("Enter the values");
		int sum = 0;
		for(int i = 0 ; i < n ; i++)
		{   
			a[i] = sc.nextInt();
			sum = sum + a[i]*a[i]*a[i];
		}
		System.out.println("Sum of cubes : " + sum);
		sc.close();
		
	}

}