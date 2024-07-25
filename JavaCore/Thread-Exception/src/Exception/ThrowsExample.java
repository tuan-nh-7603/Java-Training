package Exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            checkFile("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    static void checkFile(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
    }
}
