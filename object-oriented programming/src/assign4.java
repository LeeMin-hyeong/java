//pp.111 #8

import java.util.Scanner;

public class assign4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("(x1, y1), (x2, y2) 입력>>");
        int x1=sc.nextInt(), y1=sc.nextInt(), x2=sc.nextInt(), y2=sc.nextInt();
        if(inRect(x1, y1, 100, 100, 200, 200)||inRect(x2, y2, 100, 100, 200, 200))
            System.out.println("충돌함");
        else
            System.out.println("충돌하지 않음");
        sc.close();
    }

    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        if((x>=rectx1&&x<=rectx2)&&(y>=recty1&&y<=recty2))
            return true;
        else return false;
    }
}
