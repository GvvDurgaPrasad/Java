package Two_D;

import java.util.Scanner;

public class Ascending_Order 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the numbers :");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Ascending Order :");
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[i] < a[j])
				{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
		}
		
			for(int k=0; k<a.length; k++)
			{
				System.out.println(a[k]);
			}
	}

}
