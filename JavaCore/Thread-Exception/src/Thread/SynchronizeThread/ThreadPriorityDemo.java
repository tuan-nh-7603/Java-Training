package Thread.SynchronizeThread;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running.");
            }
        });
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        lowPriorityThread.setName("LowPriorityThread");

        Thread highPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running.");
            }
        });
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        highPriorityThread.setName("HighPriorityThread");

        Thread normalPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running.");
            }
        });
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);
        normalPriorityThread.setName("NormalPriorityThread");

        lowPriorityThread.start();
        normalPriorityThread.start();
        highPriorityThread.start();
    }
}

