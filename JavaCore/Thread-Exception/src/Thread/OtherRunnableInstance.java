package Thread;

public class OtherRunnableInstance implements Runnable {

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        try {
            Thread.sleep(2000);
            System.out.println("Sleep after 2000 years");
        } catch (InterruptedException e) {
            System.out.println(currentThread.getName() + " is interrupted");
        }
    }
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName() + " started.");
        Thread t2 = new Thread(new OtherRunnableInstance());
        t2.start();
        System.out.println(t1.getName() + " starts " + t2.getName());
        System.out.println(t1.getName() + " finished.");
    }
}
