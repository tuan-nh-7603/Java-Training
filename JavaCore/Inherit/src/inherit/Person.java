package inherit;

public class Person {
    public  String name;
    public int age;
    void speak(){
        System.out.println("I'm a person "+ name +"-"+age );
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
      Person person = new Person("Hoang",21);
      person.speak();
    }
}
