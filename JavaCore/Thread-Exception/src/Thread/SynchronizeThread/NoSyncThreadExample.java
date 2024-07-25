package Thread.SynchronizeThread;

public class NoSyncThreadExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread incrementThread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.incrementNoSync();
            }
        });

        Thread incrementThread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.incrementNoSync();
            }
        });

        Thread decrementThread1 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                counter.decrementNoSync();
            }
        });

        Thread decrementThread2 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                counter.decrementNoSync();
            }
        });

        incrementThread1.start();
        incrementThread2.start();
        decrementThread1.start();
        decrementThread2.start();

        try {
            incrementThread1.join();
            incrementThread2.join();
            decrementThread1.join();
            decrementThread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final count: " + counter.valueNoSync());
    }
}
