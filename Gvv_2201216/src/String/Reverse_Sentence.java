package String;

import java.util.Scanner;

public class Reverse_Sentence
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence = sc.nextLine();
		stringReverser(sentence);
		sc.close();

	}
	
	public static void stringReverser(String str)
	{
		String words[] = str.split(" ");
		int wordlength = words.length;
		String revwords[] = new String[wordlength];
		
		for(int i = 0 ; i < words.length ; i++)
		{
			int len = words[i].length();
			String s = "";
			
			for(int j = len - 1 ; j >= 0 ; j--)
			{
			  s = s + words[i].charAt(j);	
			}
			
			revwords[i] = s;
		}
		
		for(String s:revwords)
		{
			System.out.print(s + " ");
		}
	}

}