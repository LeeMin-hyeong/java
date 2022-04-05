import java.util.Scanner;

public class practice05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("돈의 액수를 입력하세요.");
        int money=sc.nextInt();
        System.out.printf("오만원 %d개, 만원 %d개, 오천원 %d개, 천원 %d개, 오백원 %d개, 백원 %d개, 오십원 %d개, 십원 %d개, 일원 %d개",money/50000, money%50000/10000, money%10000/5000, money%10000%5000/1000, money%1000/500, money%1000%500/100, money%100/50, money%100%50/10, money%10);;
        sc.close();
    }
}