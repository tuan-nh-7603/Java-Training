package Thread.SynchronizeThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NameStorage {
    private String lastName;
    private int nameCount = 0;
    private final List<String> nameList = new ArrayList<>();

    public void addName(String name) {
        synchronized(this) {
            lastName = name;
            nameCount++;
            nameList.add(name);
        }

    }

    public void addNameNoSync(String name) {
        synchronized(this) {
            lastName = name;
            nameCount++;

        }
        nameList.add(name);
    }


    public String getLastName() {
        return lastName;
    }

    public int getNameCount() {
        return nameCount;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public static void main(String[] args) {
        NameStorage nameStorage = new NameStorage();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                nameStorage.addName("Name1_" + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                nameStorage.addName("Name2_" + i);
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                nameStorage.addName("Name3_" + i);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Last Name: " + nameStorage.getLastName());
        System.out.println("Name Count: " + nameStorage.getNameCount());
        System.out.println("Name List Size: " + nameStorage.getNameList().size());
    }
}
