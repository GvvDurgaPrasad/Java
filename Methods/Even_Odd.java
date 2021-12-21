package Methods;

import java.util.Scanner;

public class Even_Odd 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num :");
		int num=sc.nextInt();//8
		if(checkEvenOrOdd(num))//call
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}

	}
	public static boolean checkEvenOrOdd(int num)
	{
		return (num%2==0);
		
	}


		

}


