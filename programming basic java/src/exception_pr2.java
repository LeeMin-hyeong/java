import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_pr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char day[]={'일', '월', '화', '수', '목', '금', '토'};
        int n=0;
        try{
            n=sc.nextInt();
            if(n>=0)
                System.out.println(day[n%7]);
        }
        catch(InputMismatchException e){
            System.out.println("경고! 수를 입력하지 않았다.");
        }
        sc.close();
    }
}
