interface Vehicle {
    // default
    default void start() {
        System.out.println("Vehicle is starting...");
    }

    void drive();

    // static
    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }

    public void start() {
        System.out.println("Car is starting");
    }
}

public class DefaultStaticMethod {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.start();
        myCar.drive();

        System.out.println("Horse Power: " + Vehicle.getHorsePower(500,600));
    }
}
