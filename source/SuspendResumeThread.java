import java.io.IOException;

class SuspendResumeThread {
	
	public static void main(String[] args) throws IOException {

		Thread.currentThread().setName("Main Thread");

		NewThread t1 = new NewThread("Thread One");
		NewThread t2 = new NewThread("Thread Two");

		System.out.println("Press a to suspend(resume) " + t1.getName() + 
				" or s to suspend(resume) " + t2.getName());

		while (true) {

			char response = (char) System.in.read();
			System.out.println("Clicado: " + response);

			if (response == 'a') {
				t1.mysuspend();
			} else if (response == 's') {
				t2.mysuspend();
			}

		}

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

		int i = 1;

		while (true) {

			try {

				System.out.println(getName() + ": " + i++);
				Thread.sleep(3000);

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

		if (!suspended) {
			suspended = true;
		} else {
			myresume();
		}

	} // end mysuspend method

	synchronized void myresume() {

		suspended = false;
		notify();

	} // end myresume method

} // end NewThread class