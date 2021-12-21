package Abstract;

public class SubDemo extends Demo
{
	private int i,j;
	
	public SubDemo()
	{
		
	}
	public SubDemo(int i, int j)
	{
		this.i = i;
		this .j = j;
	}
	public void add()
	{
		System.out.println("Add : " +(i+j));
	}
	public void sub()
	{
		System.out.println("Sub : " +(i-j));
	}
}
