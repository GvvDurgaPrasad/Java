package String;

import java.util.Scanner;

public class Conversion_Methods 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String Sentence = sc.nextLine();
		
		System.out.println("The Conversion :"+Conversion(Sentence));
	}
		
	public static String Conversion(String Sentence) 
	{
		String result = "";
		for(int i=0; i<Sentence.length(); i++)
		{
			char c = Sentence.charAt(i);
			if(Character.isAlphabetic(c)) 
			{
				if(Character.isLowerCase(c))
				{
					result += Character.toUpperCase(c);
				}
				else if(Character.isUpperCase(c))
				{
					result += Character.toLowerCase(c);
				}
			}
			else
			{
				result = result + Sentence.charAt(i);
			}
		}
		return result+" ";
		

	}


}


