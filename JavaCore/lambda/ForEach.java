package lambda;

import java.util.Arrays;
import java.util.List;
// Lambda expressions can be passed as arguments to
// methods that accept functional interfaces, making it easier to use default methods.
public class ForEach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach(name -> System.out.println(name.toUpperCase()));
    }
}
