class ThreadComunication {

	public static void main(String[] args) {

		Buffer buffer = new Buffer();

		Producer producer = new Producer(buffer);
		Consumer consumer = new Consumer(buffer);

	} // end main method

} // end ThreadComunication class

class Buffer {

	private boolean valueSet;
	private int number;

	synchronized int getNumber() {

		while (!valueSet) {

			try {
				wait();
			} catch (InterruptedException e) {
				System.err.println(e);
			}

		}

		System.out.println("Got: " + number);
		valueSet = false;
		notify();

		return number;

	} // end getNumber method

	synchronized void setNumber(int number) {

		while (valueSet) {

			try {
				wait();
			} catch (InterruptedException e) {
				System.err.println(e);
			}

		}

		System.out.println("Put: " + number);
		valueSet = true;
		notify();

		this.number = number;

	} // end setNumber method

} // end Buffer class

class Producer implements Runnable {

	private Buffer buffer;

	Producer(Buffer buffer) {

		this.buffer = buffer;
		new Thread(this).start();

	} // end Producer constructor - Buffer

	public void run() {

		for (int i = 1; i < 10; i++) {
			buffer.setNumber(i);
		}

	} // end run method

} // end Producer class

class Consumer implements Runnable {

	private Buffer buffer;

	Consumer(Buffer buffer) {

		this.buffer = buffer;
		new Thread(this).start();

	} // end Consumer constructor - Buffer

	public void run() {

		for (int i = 1; i < 10; i++) {
			buffer.getNumber();
		}

	} // end run method

} // end Consumer class