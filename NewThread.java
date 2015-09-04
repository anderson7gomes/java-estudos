class NewThread implements Runnable {

	private Thread t;

	NewThread() {

		t = new Thread(this);
		t.start();

	} // end NewThread constructor-

	public void run() {

		for (int i = 0; i < 5; i++) {

			ThreadUtil.putSleep(1000, "Child thread");

		}

	} // end run method

} //  end NewThread class

class MainThread {

	public static void main(String[] args) {

		new NewThread();

		for (int i = 0; i < 5; i++) {

			ThreadUtil.putSleep(1000, "Main thread");

		}

	} // end main method

} // end MainThread class

class ThreadUtil {

	static void putSleep(long milliseconds, String threadName) {

		try {

			Thread.sleep(milliseconds);
			System.out.println(threadName);

		} catch (InterruptedException e) {
			System.err.println("Thread interrupted: " + Thread.currentThread());
		}

	} // end static method putSleep

} // end ThreadUtil class