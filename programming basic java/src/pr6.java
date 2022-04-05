import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("시급입력");
        int a=sc.nextInt();
        System.out.println("근무시간");
        int b=sc.nextInt();
        if(a<10000)
            System.out.println("기본 시급이 1만 원보다 작습니다.");
        else{
            if(b>180)
                System.out.println("[에러] 근무시간이 180시간을 초과하였습니다.");
            else if(b>160)
                System.out.println("[급여] "+(int)a*b*1.5);
            else
                System.out.println("[급여]" +a*b);
        }
        sc.close();
    }
}
