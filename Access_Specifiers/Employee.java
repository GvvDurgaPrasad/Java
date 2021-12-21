package Access_Specifiers;

public class Employee
{
	private int empID;
	private String Name;
	private String Dept;
	private int Salary;
	
	public void setempID(int id)
	{
		empID = id;
	}
	public int getempID()
	{
		return empID;
	}
	
	public void setName(String n)
	{
		Name = n;
	}
	public String getName()
	{
		return Name;
	}
	
	public void setDept(String d)
	{
		Dept = d;
	}
	public String getDept()
	{
		return Dept;
	}
	
	public void setSalary(int s)
	{
		Salary = s;
	}
	public int getSalary()
	{
		return Salary;
	}
	

}
