//pp.165 #6

import java.util.Scanner;

public class assign10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] unit={50000, 10000, 1000, 500, 100, 50, 10, 1};
        int money=sc.nextInt();
        for(int i=0; i<unit.length; i++){
            System.out.printf("%d원 짜리 : %d 개\n", unit[i], money/unit[i]);
            money%=unit[i];
        }
        sc.close();
    }
}
