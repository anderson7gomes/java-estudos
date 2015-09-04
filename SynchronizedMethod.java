class SynchronizedMethod {

	public static void main(String[] args) {

		CallMe callMe = new CallMe();

		Thread t1 = new Thread(new MyRunnable(callMe, "Hello"));
		Thread t2 = new Thread(new MyRunnable(callMe, "Anderson"));
		Thread t3 = new Thread(new MyRunnable(callMe, "Gomes"));

		t1.start();
		t2.start();
		t3.start();	

		try {

			t1.join();
			t2.join();
			t3.join();

		} catch (InterruptedException e) {
			System.err.println(e);
		}

	} // end main method

} // end SynchronizedMethod class

class MyRunnable implements Runnable {

	private CallMe target;
	private String msg;

	MyRunnable(CallMe target, String msg) {

		this.target = target;
		this.msg = msg;

	} // end MyRunnable constructor - CallMe, String

	public void run() {

		synchronized(target) {
			target.call(msg);
		}

	} // end run method

} // end MyRunnable class 

class CallMe {

	void call(String message) {

		System.out.print("[" + message);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.err.println(e);
		}

		System.out.println(']');

	} // end call method

} // end CallMe class