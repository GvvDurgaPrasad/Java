package String;

import java.util.Scanner;

public class Changing_Cases {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String sentence=sc.nextLine();
		String result="";
		
		for(int i=0;i<sentence.length();i++)
		{
			char c=sentence.charAt(i);
			if(Character.isAlphabetic(c)) 
			{
				if(Character.isLowerCase(c))
				{
					result+=Character.toUpperCase(c);
				}
				else if(Character.isUpperCase(c))
				{
					result+=Character.toLowerCase(c);
				}
			}
			else
			{
				result=result+sentence.charAt(i);
			}
		}
		System.out.println("The Swap:"+result+" ");
		

	}

}