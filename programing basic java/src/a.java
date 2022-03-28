import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("투입한 돈  : ");
        int input=sc.nextInt();
        System.out.printf("물건 값 : ");
        int price=sc.nextInt();
        System.out.println("거스름돈 : "+(input-price));
        System.out.println("500원 동전의 개수 : "+((input-price)/500));
        System.out.println("100원 동전의 개수 : "+((input-price)%500)/100);
        sc.close();
    }
}
