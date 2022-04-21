import java.util.Scanner;

public class assign15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]={"가위", "바위", "보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while(true){
            String result="";
            int n=(int)(Math.random()*3);
            System.out.print("가위 바위 보!>>");
            String input=sc.nextLine();
            if(input.equals("그만")){
                System.out.println("게임을 종료합니다...");
                break;
            }
            else{
                switch(input){
                    case "가위":
                        if(str[n].equals("가위")) result="비겼";
                        else if(str[n].equals("바위")) result="졌";
                        else if(str[n].equals("보")) result="이겼";
                        break;
                    case "바위":
                        if(str[n].equals("가위")) result="비겼";
                        else if(str[n].equals("바위")) result="졌";
                        else if(str[n].equals("보")) result="이겼";
                        break;
                    case "보":
                        if(str[n].equals("가위")) result="비겼";
                        else if(str[n].equals("바위")) result="졌";
                        else if(str[n].equals("보")) result="이겼";
                        break;
                }
            }
            System.out.printf("사용자 = %s , 컴퓨터 = %s , %s습니다.\n", input, str[n], result);
        }
        sc.close();
    }
}
