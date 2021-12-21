package Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

class CustomerAccountHolder {
	AtomicInteger amount = new AtomicInteger(0);

	void showBalance() {
		System.out.println("Balance is :" + this.amount);
	}

	void updateBalance(int amount) {
		this.amount.addAndGet(amount);
	}

}

public class ThreadAtomicIntegerDemo {
	public static void main(String args[]) {
		final CustomerAccountHolder c = new CustomerAccountHolder();

		Thread t1 = new Thread() {

			public void run() {

				for (int i = 0; i < 1000; i++)
					c.updateBalance(3);
				c.showBalance();
			}
		};
		t1.start();

		new Thread() {
			public void run() {

				for (int i = 0; i < 1000; i++)
					c.updateBalance(4);
				c.showBalance();
			}
		}.start();

	}

}