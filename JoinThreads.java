class JoinThreads {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("Thread One");
		MyThread t2 = new MyThread("Thread Two");
		MyThread t3 = new MyThread("Thread Three");

		System.out.printf("%s isAlive()? %b\n", t1, t1.isAlive());
		System.out.printf("%s isAlive()? %b\n", t2, t1.isAlive());
		System.out.printf("%s isAlive()? %b\n", t3, t1.isAlive());

		System.out.println("Join threads...");

		try {

			t1.join();
			t2.join();
			t3.join();

		} catch (InterruptedException e) {
			System.err.println(e);
		}

		System.out.println("Exiting main thread");

	} // end main method

} // end JoinThreads class

class MyThread extends Thread {

	MyThread(String threadName) {

		super(threadName);
		start();

	} // end MyRunnable constructor - String

	@Override
	public void run() {

		System.out.println("Starting " + getName());

		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.err.println(getName() + " interrupted");
			}

		}

		System.out.println("Exiting " + getName());

	} // end run method

	@Override
	public String toString() {

		return getName();

	} // end toString method

} // end MyThread class