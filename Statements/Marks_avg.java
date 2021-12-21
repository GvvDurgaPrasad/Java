package Statements;

import java.util.Scanner;

public class Marks_avg 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sub1 marks :");
		int sub1 = sc.nextInt();
		System.out.println("Enter the sub2 marks :");
		int sub2 = sc.nextInt();
		System.out.println("Enter the sub3 marks :");
		int sub3 = sc.nextInt();
		double total = sub1+sub2+sub3;
		System.out.println("total marks :" +total);
		double percentage = (total/300)*100;
		System.out.println("percentage :" +percentage);
		
		if(percentage>=90)
		{
			System.out.println("Grade A");
		}
		else if(percentage>=70 && percentage<90)
		{
			System.out.println("Grade B");
		}
		else if(percentage>=50 && percentage<70)
		{
			System.out.println("Grade C");
		}
		else if(percentage<50)
		{
			System.out.println();
		}
		
		
	}

}
