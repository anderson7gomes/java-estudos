import java.util.Observable;
import java.util.Observer;

class ObserverObservableDemo {

    public static void main(String[] args) {
    
        Watcher watcher = new Watcher();
        WatcherDone watcherDone = new WatcherDone();
        BeingWatched watched = new BeingWatched();
        
        watched.addObserver(watcher);
        watched.addObserver(watcherDone);
        
        watched.counter(5);
    
        int observers = watched.countObservers();
        
        System.out.println("Number of observers: " + observers);
    
    } // end main method

} // end ObserverObservableDemo class

class BeingWatched extends Observable {

    void counter(int period) {
    
        while (period > 0) {
        
            --period;
            
            setChanged();
            
        //  clearChanged();
            
            notifyObservers(new Integer(period));
            
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.err.println("Thread error");
            }
        
        }
    
    } // end counter method

} // end BeingWatched class

class Watcher implements Observer {

    public void update(Observable o, Object data) {
    
        System.out.printf("Watching: %d\n", (Integer) data);
    
    } // end update method

} // end Watcher class

class WatcherDone implements Observer {

    public void update(Observable o, Object data) {
    
        if (((Integer) data) == 0) {
            System.out.println("Done!");
        }
    
    } // end update method

} // end WatcherDone class
