package lambda;

@FunctionalInterface
interface HelloNoArgs {
    public String sayHello();
}

@FunctionalInterface
interface HelloOneArgs {
    public String sayHello(String name);
}


@FunctionalInterface
interface HelloMultipleArgs {
    public String sayHello(String name, String com);
}

public class LambdaExpression {
    public static void main(String[] args) {
        HelloNoArgs a = () -> {return "Hello Lambda";};
        System.out.println(a.sayHello());

        HelloOneArgs b = name -> "Hello, " + name;
        System.out.println(b.sayHello("Lambda"));

        HelloMultipleArgs c = (name, com) -> "Hello, " + name + ". Welcome to " + com;
        System.out.println(c.sayHello("newbie", "Lambda"));


    }
}
