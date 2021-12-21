package Concurrency;

//using static synchronization

class Power1 {
	synchronized static void printPower(int n) { // static synchronized method
		int temp = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + ":- " + n + "^" + i + " value: " + n * temp);
			temp = n * temp;
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}

	}
}

class Thread11 extends Thread {
	Power1 p;

	Thread11(Power1 p) {
		this.p = p;
	}

	public void run() {
		Power1.printPower(2);
	}

}

class Thread12 extends Thread {
	Power1 p;

	Thread12(Power1 p) {
		this.p = p;
	}

	public void run() {
		Power1.printPower(3);
	}
}

class Thread13 extends Thread {
	Power1 p;

	Thread13(Power1 p) {
		this.p = p;
	}

	public void run() {
		Power1.printPower(5);
	}
}

class Thread14 extends Thread {
	Power1 p;

	Thread14(Power1 p) {
		this.p = p;
	}

	public void run() {
		Power1.printPower(8);
	}
}

public class Synchronization2 {
	public static void main(String args[]) {
		Power1 ob1 = new Power1(); // first object
		Power1 ob2 = new Power1(); // second object
		Thread11 p1 = new Thread11(ob1);
		Thread12 p2 = new Thread12(ob1);
		Thread13 p3 = new Thread13(ob2);
		Thread14 p4 = new Thread14(ob2);

		p1.start();
		p2.start();
		p3.start();
		p4.start();
	}
}
