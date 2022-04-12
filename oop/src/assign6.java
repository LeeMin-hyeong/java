//p.112 #12.(1)

import java.util.Scanner;

public class assign6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("연산>>");
        double a=sc.nextDouble();
        String indicator=sc.next();
        double b=sc.nextDouble();
        double result=0;
        Boolean error=false;

        if(indicator.equals("+")) result=a+b;
        else if(indicator.equals("-")) result=a-b;
        else if(indicator.equals("*")) result=a*b;
        else if(indicator.equals("/")){
            if(b==0){
                System.out.println("0으로 나눌 수 없습니다.");
                error=true;
            }
            else result=a/b;
        }
        if(!error)
            System.out.printf("%.2f%s%.2f의 계산 결과는 %.2f\n", a, indicator, b, result);
        sc.close();
        
    }
}
