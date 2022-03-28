//java 17.0.2
//jdk 17.0.2
import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        System.out.print("두 정수를 입력하세요>>");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
        sc.close();
    }
}