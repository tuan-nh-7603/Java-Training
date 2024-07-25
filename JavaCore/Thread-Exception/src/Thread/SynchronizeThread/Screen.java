package Thread.SynchronizeThread;

public class Screen {
    private static Screen theScreen;
    private Screen() {}
    public static synchronized Screen getScreen() {
        if (theScreen == null) {
            theScreen = new Screen();
        }
        return theScreen;
    }

}
