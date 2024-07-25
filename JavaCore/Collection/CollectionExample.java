package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Collection size: " + fruits.size());

        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the collection.");
        }

        fruits.remove("Banana");
        System.out.println("After removing Banana, collection size: " + fruits.size());

        System.out.println("Fruits in the collection:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.clear();
        System.out.println("After clearing, collection size: " + fruits.size());
    }
}

