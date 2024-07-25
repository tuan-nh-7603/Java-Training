package Thread.SynchronizeThread;

public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }

    public synchronized int value() {
        return count;
    }

    public void incrementNoSync(){
        count++;
    }
    public void decrementNoSync(){
        count--;
    }
    public int valueNoSync(){
        return count;
    }

}
