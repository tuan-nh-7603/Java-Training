package inherit;

public class staff extends Person{
    int salary;
    public staff(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
    void speak(){
        super.speak();
        System.out.println("I am staff too " + salary);
    }

    public static void main(String[] args) {
        staff staff = new staff("John", 20, 500);
        staff.speak();
    }
}
