package Concurrency;


 class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
		System.out.println("balance:" + this.amount);
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		System.out.println("balance:" + this.amount);
		notify();
	}
}

class ThreadCommunication {
	public static void main(String args[]) {
		Customer c = new Customer();

		Thread t1 = new Thread() {

			public void run() {
				c.withdraw(5000);
			}
		};
		t1.start();

		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();

	}

}