import java.util.concurrent.Semaphore;

class SemaphoreDemo {

	public static void main(String[] args) {
	
		Semaphore sem = new Semaphore(1);
		Semaphore empty = new Semaphore(1);
		Semaphore full = new Semaphore(0);
		PlayerNumber number = new PlayerNumber();
		
		Producer producer = new Producer(sem, empty, full, number);
		Consumer consumer = new Consumer(sem, empty, full, number);
		
		new Thread(producer).start();
		new Thread(consumer).start();
	
	}

}

class PlayerNumber {

	private int number;
	
	void setNumber(int number) {
		this.number = number;
	}
	
	int getNumber() {
		return number;
	}

}

class Producer implements Runnable {

	private Semaphore sem;
	private Semaphore empty;
	private Semaphore full;
	private PlayerNumber number;
	
	Producer(Semaphore sem, Semaphore empty, Semaphore full, 
			PlayerNumber number) {
		
		this.sem = sem;
		this.empty = empty;
		this.full = full;
		this.number = number;	
		
	}	
	
	public void run() {
	
		for (int i = 1; i <= 20; i++) {
			
			try {
			
				empty.acquire();
			
				sem.acquire();
			
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				System.err.println("Thread interrupted");
			}
			
			System.out.println("Producing: " + i);
			number.setNumber(i);
			
			sem.release();
			
			full.release();
		
		}
	
	}

}

class Consumer implements Runnable {

	private Semaphore sem;
	private Semaphore empty;
	private Semaphore full;
	private PlayerNumber number;
	
	Consumer(Semaphore sem, Semaphore empty, Semaphore full, 
			PlayerNumber number) {
		
		this.sem = sem;
		this.empty = empty;
		this.full = full;
		this.number = number;	
		
	}
	
	public void run() {	
	
		for (int i = 1; i <= 20; i++) {
	
			try {
	
				full.acquire();
		
				sem.acquire();
		
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				System.err.println("Thread interrupted");
			}
		
			System.out.println("Consuming: " + number.getNumber());
		
			sem.release();
		
			empty.release();
		
		}
	
	}

}
