interface Animal {
    void eat();
    void sleep();
}

interface Bird extends Animal {
    void fly();
}

class Sparrow implements Bird {
    public void eat() {
        System.out.println("Sparrow is eating");
    }

    public void sleep() {
        System.out.println("Sparrow is sleeping");
    }

    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class ExtendsInterface {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.sleep();
        sparrow.fly();
    }
}