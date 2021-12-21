package Concurrency;

public class Runnable_Demo implements Runnable {

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " in run ");
		
	}
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable_Demo());
		
		thread.start();
		
		thread.run();
	}

}
