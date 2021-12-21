package Abstract;

import java.util.Arrays;

public class Class11 extends Student
{
	private int english;
	private int hindi;
	private int[] theory;  
	private int[] practical; 
	
	private static int idgen = 400;
	
	public Class11() {
		
	}

	public Class11( String name ,int english, int hindi, int[] theory, int[] practical) {
		super(++idgen,name);				
		this.english = english;
		this.hindi = hindi;
		this.theory = theory;
		this.practical = practical;
	}

	public int getEnglish() {
		return english;
	}


	public int getHindi() {
		return hindi;
	}


	public int[] getTheory() {
		return theory;
	}


	public int[] getPractical() {
		return practical;
	}
	public float findPercentage() {

		float theory_total = 0;
		float practical_total = 0;
		
		for(int i = 0 ; i < theory.length; i++) {
			theory_total += theory[i] * 0.6f ;		
			practical_total += practical[i] * 0.4f;
		}
		
						
		float percentage = (english + hindi + theory_total + practical_total) /5;
		
		return percentage;
	
	}
	
	@Override
	public String toString() {
		return "Class11 [Id = "+ getId() + ", Name =" + getName() + ", Theory marks=" + english + ", " + hindi + " , " + Arrays.toString(theory) + ", Practical Marks="+ Arrays.toString(practical)+ ", Percentage =" + findPercentage() +  "]";
	}

}


