import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("키 : ");
        double height=sc.nextDouble();
        System.out.print("체중 : ");
        double weight=sc.nextDouble();
        double bmi=(weight/(height*height));
        System.out.printf("BMI : %.1f%n", bmi);
        System.out.printf("비만도 %s%n", bmi>=30?"비만":bmi>=25?"과체중":bmi>=18.5?"정상":"저체중");
        sc.close();
    }
}
