package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader f = new FileReader("NO FILE");
    }
}
