import java.util.Scanner;

public class practice06 {
    public static void main(String[] args) {
        System.out.print("학점을 입력>>");
        Scanner sc=new Scanner(System.in);
        char grade=sc.next().charAt(0);
        switch(grade){
            case 'A': case 'B':
                System.out.println("Excellent");
                break;
            case 'C': case 'D':
                System.out.println("Good");
                break;
            case 'F':
                System.out.println("Bye");
                break;
        }
        sc.close();
    }
}
