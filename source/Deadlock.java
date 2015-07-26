class Deadlock implements Runnable {

	private A a = new A();
	private B b = new B();

	Deadlock() {

		Thread.currentThread().setName("Main Thread");
		Thread racingThread = new Thread(this, "Racing Thread");
		racingThread.start();

		a.foo(b);

		System.out.println("Exiting " + 
				Thread.currentThread().getName());

	} // end Deadlock constructor

	public void run() {

		b.bar(a);

		System.out.println("Exiting " +
				Thread.currentThread().getName());

	} // end run method

	public static void main(String[] args) {

		new Deadlock();

	} // end main method	

} // end Deadlock class

class A {

	synchronized void foo(B b) {

		String currentThreadName = 
				Thread.currentThread().getName(); 

		System.out.println(currentThreadName + " enter A.foo()");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.err.println(e);
		}

		System.out.println(currentThreadName + " trying to call B.last()");

		b.last();

	} // end foo method

	synchronized void last() {

		System.out.println("Inside A.last()");

	} // end last method

} // end A class

class B {

	synchronized void bar(A a) {

		String currentThreadName = 
				Thread.currentThread().getName(); 

		System.out.println(currentThreadName + " enter B.bar()");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.err.println(e);
		}

		System.out.println(currentThreadName + " trying to call A.last()");

		a.last();

	} // end bar method

	synchronized void last() {

		System.out.println("Inside B.last()");

	} // end last method

} // end B class