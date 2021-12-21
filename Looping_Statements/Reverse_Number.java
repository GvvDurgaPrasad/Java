package Looping_Statements;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num :");
			int num = sc.nextInt();
			int reverse = 0, remainder;
			while(num != 0)
			{
				remainder = num % 10;
				reverse = reverse*10 + remainder;
				num = num/10;
			}
			System.out.println("The reverse of given number is :" +reverse);
				
			
			
	}

}
