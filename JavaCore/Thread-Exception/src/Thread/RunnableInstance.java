package Thread;

public class RunnableInstance implements Runnable{
    @Override
    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        RunnableInstance runnableInstance = new RunnableInstance();
        Thread thread = new Thread(runnableInstance);
        thread.start();
    }
}
