package Two_D;

public class Demo2
{

	public static void main(String[] args) 
	{
		int a[][]=new int[2][2];
		a[0][0]=12;
		a[0][1]=13;
		a[1][0]=14;
		a[1][1]=15;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}