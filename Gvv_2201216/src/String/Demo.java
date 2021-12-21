package String;

public class Demo {

	public static void main(String[] args)
	{
		String s="java";
		String s1="JAVA";
		System.out.println(s);
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.charAt(2));
		System.out.println(s.concat("world"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s);
		s=s.concat("world");
		System.out.println(s);
		System.out.println(s.toLowerCase());
		System.out.println(s.replace('a', 'A'));
		System.out.println(s);
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

		if(s.equals(s1))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		

	}

}
