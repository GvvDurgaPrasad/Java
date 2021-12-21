package Methods;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		System.out.println("The count of the Digits :"+digits(num));
		

	}
	public static int digits(int num)
	{
		int digit=0;
		int count=0;
		while(num!=0)
		{
			digit=num%10;
			count++;
			num=num/10;
			
		}
		return count;
		
		
	}

}