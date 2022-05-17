import java.util.Scanner;

class Grade{
    int subject1, subject2, subject3;
    Grade(int subject1, int subject2, int subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    int average(){
        return (subject1+subject2+subject3)/3;
    }
}

public class Assign16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은" + me.average());

        scanner.close();
    }
}
