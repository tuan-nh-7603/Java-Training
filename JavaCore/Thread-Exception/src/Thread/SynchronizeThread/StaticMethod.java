package Thread.SynchronizeThread;

public class StaticMethod {

    public static void main(String[] args) {
        Screen screen1 = Screen.getScreen();
        Screen screen2 = Screen.getScreen();

        if (screen1 == screen2) {
            System.out.println("Both screen1 and screen2 refer to the same instance.");
        } else {
            System.out.println("screen1 and screen2 refer to different instances.");
        }
    }
}
