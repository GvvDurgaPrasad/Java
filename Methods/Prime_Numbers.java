package Methods;

import java.util.Scanner;

public class Prime_Numbers
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		System.out.println("The Result is :"+checkPrime(num));
	}
		public static int checkPrime(int num)
		{
			int start=1;
			int fact=0;
			while(start<=num)
			{
				if(num%start==0)
				{
					fact++;
				}
				start++;
			}
			if(fact==2)
			{
				System.out.println("prime number");
			}
			else
			{
				System.out.println("composite number");
			}
			return fact;
		}

	}