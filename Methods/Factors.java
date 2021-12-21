package Methods;

import java.util.Scanner;

public class Factors 
{

	public static void main(String[] args)
	{
		checkAllTheFactor();
	}
	public static void checkAllTheFactor()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int start=1;
		
		while(start<=num)
		{
			if(num%start==0)
			{
				System.out.println(start);
			}
			start++;
		}
	
	}

}