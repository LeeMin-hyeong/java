import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("수학점수 입력");
        int math=sc.nextInt();
        System.out.println("영어점수 입력");
        int eng=sc.nextInt();
        if(math>=90&&eng>=90)
            System.out.println("전액 장학금!");
        else if(math>=90||eng>=90)
            System.out.println("반액 장학금!");
        else
            System.out.println("다음 기회에~");
        sc.close();
    }
}
