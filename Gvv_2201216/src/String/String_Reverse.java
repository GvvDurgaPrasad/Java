package String;

public class String_Reverse 
{

	public static void main(String[] args)
	{
		String s = "Thunder";
		String reverse = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			reverse = reverse + s.charAt(i);
		}
		System.out.println("The Reversed string :"+reverse);
	}

}
