//pp.112 #10

import java.util.Scanner;

public class assing5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 입력");
        int x1=sc.nextInt(), y1=sc.nextInt(), r1=sc.nextInt();
        System.out.print("두번째 원의 중심과 반지름 입력");
        int x2=sc.nextInt(), y2=sc.nextInt(), r2=sc.nextInt();
        double distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        if(distance<=r1+r2);
    }
}
