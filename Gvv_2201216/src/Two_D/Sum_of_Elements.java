package Two_D;

import java.util.Scanner;

public class Sum_of_Elements 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row and column");
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		int a[][] = new int[row][column];
		System.out.println("Enter the Input");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Row sum :");
		for(int i=0; i<row; i++)
		{
			int sum = 0;
			for(int j=0; j<column; j++)
			{
				sum = sum + a[i][j];
			}
			System.out.println(sum);
	

	}
	}

}
