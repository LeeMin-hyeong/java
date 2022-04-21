//pp165 #4

import java.util.Scanner;

public class assign9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        for(int i=a.charAt(0)-'a'; i>=0; i--){
            for(int j=0; j<=i; j++)
                System.out.printf("%c", 'a'+j);
            System.out.print("\n");
        }
        sc.close();
    }
}
