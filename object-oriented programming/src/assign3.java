// pp.111 #6

import java.util.Scanner;

public class assign3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("10~99 사이의 정수를 입력하시오>>");
        int n=sc.nextInt();
        if(n/10%3==0&&n%10%3==0)
            System.out.println("박수짝짝");
        else if(n/10%3==0||n%10%3==0)
            System.out.println("박수짝");
        sc.close();
    }
}
