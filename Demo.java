package Abstract;

public abstract class Demo {
	
	private String color;		
	
	public Demo() {
		
	}
	
	public Demo(String color) {
		this.color = color;
	}
	
	public void setColor(String color) {		
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public abstract void add();
	public abstract void sub();
}