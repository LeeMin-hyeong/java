import java.util.Scanner;

public class practice07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("커피 주문하세요 >> ");
        String coffee=sc.next();
        int cups=sc.nextInt();
        if(coffee.equals("에스프레소"))
            System.out.println(cups*2000+"원 입니다.");
        else if(coffee.equals("아메리카노"))
            System.out.println(cups*2500+"원 입니다.");
        else if(coffee.equals("카푸치노"))
            System.out.println(cups*3000+"원 입니다.");
        else if(coffee.equals("카페라테"))
            System.out.println(cups*3500+"원 입니다.");
        sc.close();
    }
}
