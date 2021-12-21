package Methods;

import java.util.Scanner;

public class Vote_Eligible {

		public static void main(String[] args) 
		{
			
			System.out.println(checkVoteEligeble());

		}
		public static String checkVoteEligeble()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the age :");
			int  age=sc.nextInt();
			if(age<18)
			{
				return "Not eligible to Vote";
			}
			else
			{
				return "Eligible to Vote";
			}
		}

	}