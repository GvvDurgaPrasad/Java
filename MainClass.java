package Abstract;

public class MainClass
{
	public static void main(String[] args) {
		SubDemo s1 = new SubDemo(10,5);
		
		s1.add();
		s1.sub();
		
		s1.setColor("Blue");
		
		System.out.println("color : " + s1.getColor()); 
	}

}


