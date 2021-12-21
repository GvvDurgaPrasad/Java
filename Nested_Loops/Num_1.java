package Nested_Loops;

public class Num_1
{

	public static void main(String[] args)
	{

		      int i,j,row=5,k;
		      
		      
		      for(i=1;i<=row;i++)
		      {
		    	  for(j=i;j<row;j++)
		    	  {
		    		  
		    	  System.out.print(" ");
		    	  
		    	  }
		    	  
		    	  for(k=1;k<=i;k++)
		    	  {
		    		 System.out.print(" ");
		    		 System.out.print("*");
		    	  
		    	  }
		    	  
		    	 System.out.println(); 
		         }
		}
		

	}


