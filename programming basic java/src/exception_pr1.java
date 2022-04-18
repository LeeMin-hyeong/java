import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_pr1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("정수를 입력하세요 >>");
        try{
            int n=sc.nextInt();
            System.out.println(n%2==0?"짝수":"홀수");
        }
        catch(InputMismatchException e){
            System.out.println("수를 입력하지 않아 프로그램을 종료합니다.");
        }
        sc.close();
    }
}