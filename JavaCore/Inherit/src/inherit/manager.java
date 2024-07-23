package inherit;

public class manager extends staff{
    String branch;
    public manager(String name,int age,int salary, String branch){
        super(name,age,salary);
        this.branch=branch;
    }
    void speak(){
        super.speak();
        System.out.println("I'm manager too "+ branch);
    }

    public static void main(String[] args) {
        manager m =new manager("Hoang",21,1000,"Tokyo");
        m.speak();
    }
}
