package Methods;

public class Area_of_Circle 
{
	
	public static double AreaCircle(int radius)
	{
		double area = Math.PI * (radius * radius);
				return area;
	}

	public static void main(String[] args) 
	{
		System.out.println(AreaCircle(6));
	}

}
