import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        System.out.println("몇 층인지 입력>>");
        Scanner sc=new Scanner(System.in);
        System.out.println(sc.nextInt()*5+"m 이다.");
        sc.close();
    }
}
