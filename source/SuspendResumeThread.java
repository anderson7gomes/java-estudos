class SuspendResumeThread {
	
	public static void main(String[] args) {

		Thread.currentThread().setName("Main Thread");

		NewThread t1 = new NewThread("Thread One");
		NewThread t2 = new NewThread("Thread Two");

		try {

			Thread.sleep(4000);
			System.out.println("Suspending " + t1.getName());
			t1.mysuspend();

			Thread.sleep(4000);
			System.out.println("Resuming " + t1.getName());
			t1.myresume();

			Thread.sleep(4000);
			System.out.println("Suspending " + t2.getName());
			t2.mysuspend();

			Thread.sleep(4000);
			System.out.println("Resuming " + t2.getName());
			t2.myresume();

		} catch (InterruptedException e) {
			System.err.println("Main thread interrupted");
		}

		System.out.println("Waiting threads join:");

		try {

			t1.join();
			t2.join();

		} catch (InterruptedException e) {
			System.err.println(e);
		}

		System.out.println("Main thread terminating");

	} // end main method

} // end SuspendResumeThread class

class NewThread extends Thread {

	private boolean suspended;

	NewThread(String name) {

		setName(name);
		start();

	} // end NewThread constructor - String

	public void run() {

		System.out.println(Thread.currentThread().getName() + 
				" executing run()");

		for (int i = 1; i < 10; i++) {

			try {

				System.out.println(getName() + ": " + i);
				Thread.sleep(2000);

				synchronized(this) {

					while (suspended) {
						wait();
					}

				}

			} catch (InterruptedException e) {
				System.err.println(e);
			}


		}

	} // end run method

	synchronized void mysuspend() {

		System.out.println(Thread.currentThread().getName() + 
				" executing mysuspend()");

		suspended = true;

	} // end mysuspend method

	synchronized void myresume() {

		System.out.println(Thread.currentThread().getName() + 
				" executing myresume()");

		suspended = false;
		notify();

	} // end myresume method

} // end NewThread class