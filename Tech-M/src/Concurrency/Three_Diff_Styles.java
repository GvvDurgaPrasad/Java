package Concurrency;

public class Three_Diff_Styles {

	public static void main(String[] args) {
		
		
	//	MyThread1 Thread1 = new MyThread1();
		
		Thread thread0 = new Thread() {
			public void run() {
				for(int i=0; i<5; i++)
					System.out.println(Thread.currentThread().getName() + " i: " + i*5);
			}
		};
			thread0.setName("First Thread");
			thread0.start();

			Thread thread1 = new Thread() {
				public void run() {
					for(int i=0; i<5; i++) 
						System.out.println(Thread.currentThread().getName() + " i : " + i*5);
					
				}
			};
			
			thread1.setName("Second Thread");
			thread1.start();
	}

}
