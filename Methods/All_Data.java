package Methods;

import java.util.Scanner;

public class All_Data {

	public static void main(String[] args) 
	{
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = sc.nextInt();
			digitFunc(num);
			sc.close();
		}
		
		public static void digitFunc(int n)
		{
			System.out.println("The digits are : ");
			int rem;
			while(n>0)
			{
				rem = n%10;
				System.out.println(rem);
				n = n/10;
			}
		}
		


}


