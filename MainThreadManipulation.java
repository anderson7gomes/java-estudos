class MainThreadManipulation {

	public static void main(String[] args) {
	
		ThreadGroup group = new ThreadGroup("Grupo das Thread dos Mangote");

		Thread thread = Thread.currentThread();
		
		System.out.println(thread);
		
		thread.setName("Thread principal do Gomes");
		
		System.out.println(thread);
		
		Thread thread2 = new Thread(group, "Thread do Gomes");
		System.out.println(thread2);
	
		Thread thread3 = new Thread(group, new RunnableTest(), "Thread do Valinha");
		System.out.println(thread3);
		thread3.start();

		System.out.println("Número de threads ativas no grupo das Thread dos Mangotes: " + 
				group.activeCount());
		
		Thread thread4 = new Thread(new RunnableTest2());
		System.out.println(thread4);
		thread4.setDaemon(false);
		
		thread4.setUncaughtExceptionHandler(new ThreadExceptionHandler());
		
		thread4.start();
	
		System.out.printf("main thread is daemon? %b\n", thread.isDaemon());
		
		System.out.printf("thread4 is daemon? %b\n", thread4.isDaemon());
		
		Thread thread5 = new Thread(new RunnableTest(), "Thread n° 5");
		System.out.println(thread5);
		thread5.start();
		
		System.out.println(new Thread());

		System.out.println("Prioridade máxima: " + Thread.MAX_PRIORITY);
		System.out.println("Prioridade mínima: " + Thread.MIN_PRIORITY);
		System.out.println("Prioridade normal: " + Thread.NORM_PRIORITY);

		System.out.println("Possíveis estados de uma Thread:\n");

		for (Thread.State state : Thread.State.values()) {
			System.out.println(state);
		}

		System.out.println("Estado da thread main(Thread principal do Gomes): "
				+ thread.getState());

		System.out.println("Estado da thread2(a qual não foi startada): "
				+ thread2.getState());		

		System.out.println("Estado da thread2(em sleep): "
				+ thread3.getState());		

	} // end method main

} // end class MainThreadManipulation

class RunnableTest implements Runnable {

	@Override
	public void run() {
	
		System.out.println("Hello thread-based Multitasking!");

		try {

			Thread.sleep(5000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	} // end method run

} // end class RunnableTest

class RunnableTest2 implements Runnable {

	@Override
	public void run() {
	
		System.out.println("Hello thread-based Multitasking!");
	
		throw new IllegalArgumentException();
	
	} // end method run

} // end class RunnableTest

class ThreadExceptionHandler implements Thread.UncaughtExceptionHandler {

	public void uncaughtException(Thread thread, Throwable throwable) {
	
		System.out.println("Dentro do método uncaughtException " + throwable);
	
	} // end uncaughtException method

} // end ThreadExceptionHandler class