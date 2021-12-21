package Concurrency;

class BankTransaction extends Thread {
	public void run() {
		try {
			Thread.sleep(3000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("customer done.");
	}
}

public class ThreadLifeCycleDemo {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("customer reached bank");
		Thread customer = new BankTransaction();
		System.out.println("customer state:" + customer.getState());

		customer.start();
		System.out.println("customer state:" + customer.getState());

		System.out.println("customer is waiting");
		Thread.sleep(500);
		System.out.println("customer state:" + customer.getState());
		customer.join();

		System.out.println("customer state:" + customer.getState());

	}
}