public class StringExample {
    public static void main(String[] args) {
        String s1 = new String("Hello ");
        String s2 = "world";
        String s3 = s1 + s2;
        System.out.println(s3);

        String str1 = "JAVA";
        String str2 = "java";
        String str3 = "Python";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str3.startsWith("Py"));
        System.out.println(str1.length());
        System.out.println(str1.substring(2));
        System.out.println(str1.contains("AV"));
        System.out.println(str1.isEmpty());
        System.out.println(str1.replace("J", "L"));

    }

}