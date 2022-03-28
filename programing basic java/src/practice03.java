import java.util.Scanner;

public class practice03 {
    public static void main(String[] args) {
        System.out.println("x값을 입력하세요>>");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.printf("x=%d, y=%d%n", x, (x*x-3*x+7));
        sc.close();
    }
}