package Two_D;

import java.util.Scanner;

public class Diagonal 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and column");
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		int a[][]=new int[row][column];
		System.out.println("enter the input");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Diagonal Elemnts");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(i==j)
				{
					System.out.print(a[i][j]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	

	}


	}


