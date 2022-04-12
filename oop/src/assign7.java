//p.112 #12.(2)

import java.util.Scanner;

public class assign7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("연산>>");
        double a=sc.nextDouble();
        String indicator=sc.next();
        double b=sc.nextDouble();
        double result=0;
        Boolean error=false;

        switch(indicator){
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
                result=a*b;
                break;
            case "/":
                if(b==0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    error=true;
                }
                else
                    result=a/b;
                break;
        }
        if(!error)
            System.out.printf("%.2f%s%.2f의 계산 결과는 %.2f\n", a, indicator, b, result);
        sc.close();
        
    }
}
