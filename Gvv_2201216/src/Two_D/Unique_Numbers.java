package Two_D;

import java.util.Scanner;

public class Unique_Numbers 
{

	public static void main(String[] args) 
	{
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the numbers :");
		for(i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		
		System.out.println("The Unique Numbers in the Array :");
		for( i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(a[i]);
			}
		}

	}

}