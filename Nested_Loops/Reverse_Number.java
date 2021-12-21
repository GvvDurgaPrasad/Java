package Nested_Loops;

public class Reverse_Number 
{

	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
