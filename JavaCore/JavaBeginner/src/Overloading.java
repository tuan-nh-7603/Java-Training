public class Overloading {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;

    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Overloading x = new Overloading();
        System.out.println(x.add(30, 70));
        System.out.println(x.add(15.5, 24.5));
        System.out.println(x.add(10, 20, 30));
    }

}