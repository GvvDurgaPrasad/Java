package Abstract;

public class School 
{
public static void main(String[] args) {
		
		int m1[] = {78,75,76,63};
		
		Class8 s8 = new Class8("Joe",m1);
		
		System.out.println(s8.getName() + " " + s8.findPercentage());
		System.out.println(s8);

		int t[] = {77,88,77};
		int p[] = {66,77,88};
		
		Class11 s11 = new Class11("Jack",76, 77, t, p);
		System.out.println(s11);
	}

}