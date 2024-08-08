public class Vehicle {
    String name;
    String color;
    int speed;

    String getName() {
        return name;
    }

    String getColor() {
        return color;
    }

    int getSpeed() {
        return speed;
    }

    void setName(String name) {
        this.name = name;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }
    Vehicle(String name) {
        this.name = name;
        System.out.println("Vehicle is created by the " + name);
    }

    Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println("Vehicle is created by the " + name + " and color is " + color);
    }

    Vehicle(String name, String color, int speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        System.out.println("Vehicle is created by the " + name + " and color is " + color + " and speed is " + speed);
    }

    Vehicle() {
        this("Car", "Red", 100);
    }

    String getInformation() {
        return "Vehicle name is " + this.getName() + " and color is " + this.getColor() + " and speed is " + this.getSpeed();
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Bike");
        Vehicle v2 = new Vehicle("Car", "Blue");
        Vehicle v3 = new Vehicle("Bus", "Yellow", 80);
        Vehicle v4 = new Vehicle();
        System.out.println(v3.getInformation());
    }
}
