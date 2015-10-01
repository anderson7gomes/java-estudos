class NewThread extends Thread {

    private static final int ONE_SECOND = 1000;

    private boolean suspended;

    NewThread(ThreadGroup obGroup, String threadName) {
    
        super(obGroup, threadName);
        System.out.println("new Thread: " + threadName);
        suspended = false;
        start();
    
    } // end NewThread constructor -- ThreadGroup, String

    @Override
    public void run() {
    
        for (int i = 0; i < 10; i++) {
        
            System.out.printf("%s: %d\n", getName(), i);
        
            try {
        
                Thread.sleep(ONE_SECOND);
        
                synchronized(this) {
               
                    while (suspended) {
                        wait();
                    }
                
                }
            
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
        }
        
        System.out.println("Exiting " + getName());
    
    } // end run method
    
    synchronized void mysuspend() {
    
        suspended = true;
    
    } // end mysuspend method

    synchronized void myresume() {
    
        suspended = false;
        notify();
    
    } // end myresume method

} // end NewThread class

class ThreadGroupUsageDemo {

    public static void main(String[] args) {
    
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");
        
        groupA.list();
        groupB.list();
        
        NewThread threadOne = new NewThread(groupA, "Thread One");
        NewThread threadTwo = new NewThread(groupA, "Thread Two");
        NewThread threadThree = new NewThread(groupB, "Thread Three");
        NewThread threadFour = new NewThread(groupB, "Thread Four");
        
        Thread[] groupAThreads = new Thread[groupA.activeCount()];
        
        System.out.println("Suspending threads of group A");      
  
        groupA.enumerate(groupAThreads);
        
        for (Thread t : groupAThreads) {
            ((NewThread) t).mysuspend();
        }
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Resuming thread of group A");
        
        for (Thread t : groupAThreads) {
            ((NewThread) t).myresume();
        }
        
        try {
        
            threadOne.join();
            threadTwo.join();
            threadThree.join();
            threadFour.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
    } // end main method

} // end ThreadGroupUsageDemo class
