package String;

import java.util.Scanner;

public class Sentence_Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Your Sentence :");
		String sentence=sc.nextLine();
		String word[]=sentence.split(",");
		int count=word.length;
		System.out.println("The Word Count is :"+count);
		

		
	}

}
