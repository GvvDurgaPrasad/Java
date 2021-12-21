package Methods;

import java.util.Scanner;

public class Five_Digit {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int num = sc.nextInt();
		String result = checkFiveDigit(num);
		System.out.println(result);
	
	}
	public static String checkFiveDigit(int num)
	{
		if(num>=10000 && num<=99999)
		{
			return "Five Digit";
		
		}
		else
		{
			return "Not Five Digit";
		}
	}

}