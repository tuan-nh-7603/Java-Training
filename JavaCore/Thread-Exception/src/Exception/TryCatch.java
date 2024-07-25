package Exception;

import java.util.Arrays;

public class TryCatch {
    public static void main(String[] args) {
        try{
            try{
                System.out.println(10/0);
            }catch(ArithmeticException e){
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
            System.out.println("Continue ..,");
            String str = null;
            System.out.println(str.length());

        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally");
        }
    }
}
