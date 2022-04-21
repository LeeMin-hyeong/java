import java.util.Scanner;

public class assign14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String course[]={"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score[]={95, 88, 76, 62, 55};

        while(true){
            System.out.print("과목이름>>");
            String input=sc.next();
            if(input.equals("그만"))
                break;
            else{
                for(int i=0; i<course.length; i++){
                    if(course[i].equals(input)){
                        System.out.printf("%s의 점수는 %d\n", course[i], score[i]);
                        break;
                    }
                    if(i==course.length-1)
                        System.out.println("없는 과목입니다.");
                }
            }
        }
        sc.close();
    }
}
