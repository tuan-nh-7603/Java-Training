package Thread.SynchronizeThread;

public class SynchronizeThreadExample {
    public static void main(String[] args) {
        // Tạo một đối tượng Counter
        Counter counter = new Counter();

        // Tạo các luồng tăng và giảm giá trị của counter
        Thread incrementThread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread incrementThread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread decrementThread1 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                counter.decrement();
            }
        });

        Thread decrementThread2 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                counter.decrement();
            }
        });

        // Bắt đầu các luồng
        incrementThread1.start();
        incrementThread2.start();
        decrementThread1.start();
        decrementThread2.start();

        // Chờ cho các luồng hoàn tất
        try {
            incrementThread1.join();
            incrementThread2.join();
            decrementThread1.join();
            decrementThread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // In giá trị cuối cùng của counter
        System.out.println("Final count: " + counter.value());
    }
}
