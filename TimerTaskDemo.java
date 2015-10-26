import java.util.Timer;
import java.util.TimerTask;

class TimerTaskDemo {

	public static void main(String[] args) throws InterruptedException {
	
		TimerTask task = new PrintHello();
		
		Timer timer = new Timer("Hello Timer", true);
		
		timer.schedule(task, 2000, 1500);
	
		Thread.sleep(8000);
		
		task.cancel();
		
		timer.purge();
	
	} // end main method

} // end TimerTaskDemo class

class PrintHello extends TimerTask {

	public void run() {
	
		System.out.println("Hello!");
	
	} // end run method

} // end PrintHello class
