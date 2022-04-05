import java.util.Scanner;

public class practice04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("점(x, y)의 좌표를 입력하세요. >>");
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>=50&&x<=100&&y>=50&&y<=100)
            System.out.printf("점(%d, %d)는 (50, 50)과 (100, 100)의 사각형 내에 있습니다.%n", x, y);
        else
            System.out.printf("점(%d, %d)는 (50, 50)과 (100, 100)의 사각형 내에 있지 않습니다.%n", x, y);
        sc.close();
    }
}
