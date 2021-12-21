package Methods;

import java.util.Scanner;

public class Positive_Negative 
{
	public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number :");
			int num=sc.nextInt();
			checkPositive(num);

		}
		public static void checkPositive(int num)
		{
			if(num>=0)
			{
				System.out.println("Positive Number");
			}
			else
			{
				System.out.println("Negative Number");
			}
		}

	}