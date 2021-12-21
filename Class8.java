package Abstract;

import java.util.Arrays;

public class Class8 extends Student
{	
	
	private int marks[];				
	
	private static int idgen = 200;
	
	public Class8() {
	
	}
	
	public Class8(String name ,int marks[]) {
		super(++idgen,name);			
		this.marks = marks;				
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public float findPercentage() {
		int sum = 0;
		
		for(int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		
		float percentage = (float)sum / marks.length;
		
		return percentage;
	}

	@Override
	public String toString() {
		return "Class8 [Id = "+ getId() + ", Name =" + getName() + ", marks=" + Arrays.toString(marks) + ", Percentage =" + findPercentage() +  "]";
	}

	

	
	
}