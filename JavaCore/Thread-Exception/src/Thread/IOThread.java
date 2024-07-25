package Thread;

public class IOThread extends Thread{

    @Override
    public void run() {
        System.out.println(this.getName() + " started.");

        try {
            System.out.println(this.getName() + " waiting for 2000mils");
            Thread.sleep(2000);
            System.out.println(this.getName() + " finished waiting for 2000mils");
        } catch (InterruptedException e) {
            System.out.println(this.getName() + " interrupted.");
        }
    }

    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName() + " started.");

        Thread t2 = new IOThread();
        t2.start();
        System.out.println(t1.getName() + " starts." + t2.getName());
        System.out.println(t1.getName() + " finished.");
    }
}
