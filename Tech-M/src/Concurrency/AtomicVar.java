package Concurrency;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVar {
	private AtomicInteger atomicVariable = new AtomicInteger(0);
	private Integer regularInteger = new Integer(0);

	private class AtomicThread implements Runnable {
		public void run() {
			System.out.println("Atomic integer value :" + atomicVariable.incrementAndGet());

		}
	}

	private class RegularThread implements Runnable {
		public void run() {
			System.out.println("Regular integer value :" + (++regularInteger).toString());

		}
	}

	public static void main(String[] args) {
		AtomicVar aVar = new AtomicVar();

		// Thread aThread = new Thread(aVar.new AtomicThread());
		// Thread rThread = new Thread(aVar. new RegularThread());

		for (int i = 0; i < 10; i++) {
			// new Thread(aVar.new AtomicThread()).start();
			new Thread(aVar.new RegularThread()).start();
			;
		}
	}
}