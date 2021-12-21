package Access_Specifiers;

public class Employee_Details 
{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.setempID(502);
		e1.setName("Gvv");
		e1.setDept("Admin");
		e1.setSalary(30000);
		
		System.out.println(e1.getempID());
		System.out.println(e1.getName());
		System.out.println(e1.getDept());
		System.out.println(e1.getSalary());
		

	}
}


