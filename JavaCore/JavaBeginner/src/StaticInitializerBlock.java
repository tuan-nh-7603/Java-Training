public class StaticInitializerBlock {
    static double percentage;
    static int rank;
    static {
        percentage = 44.6;
        rank = 12;
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        StaticInitializerBlock sib = new StaticInitializerBlock();
        System.out.println("Main method:");
        System.out.println("Rank: "+ rank);
    }
}