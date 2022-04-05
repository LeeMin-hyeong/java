//pp.110 #2

import java.util.Scanner;

public class assign1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("2자리수 정수 입력(10~99)>>");
        int n=sc.nextInt();
        if(n/10==n%10)
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        sc.close();
    }
}
