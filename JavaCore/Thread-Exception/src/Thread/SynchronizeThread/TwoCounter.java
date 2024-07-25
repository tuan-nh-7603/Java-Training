package Thread.SynchronizeThread;

public class TwoCounter {
    private long c1 = 0, c2 = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();
    public void inc1() {
        synchronized(lock1) {
            c1++;
        }
    }
    public void inc2() {
        synchronized(lock2) {
            c2++;
        }
    }
    public long getC1() {
        synchronized(lock1) {
            return c1;
        }
    }

    public long getC2() {
        synchronized(lock2) {
            return c2;
        }
    }

    public static void main(String[] args) {
        TwoCounter counters = new TwoCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counters.inc1();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counters.inc1();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counters.inc2();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counters.inc2();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final value of c1: " + counters.getC1());
        System.out.println("Final value of c2: " + counters.getC2());
    }

}
