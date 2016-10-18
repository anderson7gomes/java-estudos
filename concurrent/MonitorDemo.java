import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class MonitorDemo {

    public static void main(String[] args) {
    
        Lock lock = new ReentrantLock();
        Condition notFull = lock.newCondition();
        Condition notEmpty = lock.newCondition();
        Buffer buffer = new Buffer(5);
        
        Producer producer = new Producer(lock, notFull, notEmpty, buffer);
        Consumer consumer = new Consumer(lock, notFull, notEmpty, buffer);
        
        new Thread(producer).start();
        new Thread(consumer).start();
        
    }

}

class Consumer implements Runnable {

    private Lock lock;
    private Condition notFull;
    private Condition notEmpty;
    private Buffer buffer;
    
    Consumer(Lock lock, Condition notFull, Condition notEmpty, Buffer buffer) {
    
        this.lock = lock;
        this.notFull = notFull;
        this.notEmpty = notEmpty;
        this.buffer = buffer;
    
    }
    
    public void run() {
    
    }

}

class Producer implements Runnable {

    private Lock lock;
    private Condition notFull;
    private Condition notEmpty;
    private Buffer buffer;
    
    Producer(Lock lock, Condition notFull, Condition notEmpty, Buffer buffer) {
    
        this.lock = lock;
        this.notFull = notFull;
        this.notEmpty = notEmpty;
        this.buffer = buffer;
    
    }
    
    public void run() {
    
        for (int i = 1; i <= 10; i++) {
        
            try {
            
                lock.lock();
        
                while (buffer.getCount() == buffer.getCapacity()) {
                    notFull.await();
                }
        
                System.out.println("Producing: " + i);
        
                buffer.set(buffer.getPosition(), i);
            
                notEmpty.signal();
            
                lock.unlock();
    
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted");
            }
    
        }
    
    }

}

class Buffer {
    
    private int[] buffer;
    private int position;
    private int count;
    
    Buffer(int capacity) {
    
        buffer = new int[capacity];
        position = 0;
        count = 0;
    
    }
    
    int getCapacity() {
        return buffer.length;
    }
    
    void setPosition(int position) {
        this.position = position;
    }
    
    int getPosition() {
        return position;
    }
    
    void set(int index, int value) {
    
        buffer[index] = value;
        ++count;
        
    }
    
    int get(int index) {
    
        --count;
        return buffer[index];
        
    }
    
    int getCount() {
        return count;
    }
    
}
