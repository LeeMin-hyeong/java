public class Typetest {
    public static void main(String[] args) {
        short s1 = 200;
        int s2 = 400;
        long s3 = (long) s1+s2;
        String s4 = (String)(s3*s2); //Long.toString(s3*s2);
        System.out.println(s4);
    }
}
