package Generic;

interface Comparable<T> {
    int compareTo(T o);
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }
}

public class InterfaceGeneric{
    public static void main(String[] args) {
        Student student1 = new Student("Thanh", 20);
        Student student2 = new Student("Huy", 22);

        if (student1.compareTo(student2) < 0) {
            System.out.println(student1.getName() + " nho tuoi hon " + student2.getName());
        } else if (student1.compareTo(student2) > 0) {
            System.out.println(student1.getName() + " lon tuoi hon " + student2.getName());
        } else {
            System.out.println(student1.getName() + " va " + student2.getName() + " bang tuoi");
        }
    }
}
