//p.110 #4

import java.util.Scanner;

public class assign2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("정수 3개 입력>>");
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), mid;
        if(a>b){
            if(b>c)
                mid=b;
            else{ //c>b
                if(a>c)
                    mid=c; 
                else //c>a
                    mid=a;
            }
        }
        else{ //b>a
            if(b>c){
                if(a>c)
                    mid=a;
                else //c>a
                    mid=c;
            }
            else //c>b
                mid=b;
        }
        System.out.println("중간 값은"+mid);
        sc.close();
    }
}
