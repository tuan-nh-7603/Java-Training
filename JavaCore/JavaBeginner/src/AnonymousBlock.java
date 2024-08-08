public class AnonymousBlock {
    public AnonymousBlock(){
        System.out.println("default constructor");
    }
    public AnonymousBlock(int i){
        System.out.println("parameter constructor");
    }
    {
        System.out.print("Object is created by the ");
    }

    public static void main(String[] args) {
        AnonymousBlock b1 = new AnonymousBlock();
        AnonymousBlock b2 = new AnonymousBlock(1);
    }
}
