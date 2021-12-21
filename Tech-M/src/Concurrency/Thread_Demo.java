package Concurrency;

public class Thread_Demo extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName() + " in run");
		System.out.println(Thread.currentThread().getState());
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread_Demo thread = new Thread_Demo();	//New
		System.out.println(thread.getState());
		
		thread.start();	//Runnable
		System.out.println(thread.getState());
		
		thread.join(); //Terminated
		System.out.println(thread.getState());
		
		
		
	/*	Thread_Demo thread1 = new Thread_Demo();
		thread1.start();
		
		Thread_Demo thread2 = new Thread_Demo();
		thread2.start();			*/
		
	}
}

