import java.util.Scanner;

class Concert{
    int NUMBER_OF_ROW=3;
    Scanner sc;
    Seat concert[]=new Seat[NUMBER_OF_ROW];
    Concert(Scanner sc){
        for(int i=0; i<concert.length; i++)
            concert[i]=new Seat();
        this.sc=sc;
    }
    void reservation(){
        while(true){
            try{
                String name;
                int number;
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                int input=Integer.parseInt(sc.nextLine());
                concert[input-1].inquiry();
                do{
                    System.out.print("이름>>");
                    name=sc.nextLine();
                    System.out.print("번호>>");
                    number=Integer.parseInt(sc.nextLine());
                }
                while(!concert[input-1].seatReservation(name, number));
                break;
            }
            catch(Exception e){
                System.out.println("비정상적인 입력입니다.");
                continue;
            }
        } 
    }
    void inquiryAll(){
        for(int i=0; i<concert.length; i++)
            concert[i].inquiry();
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }
    void cancleReservation(){
        try{
            System.out.print("좌석구분 S(1), A(2), B(3)>>");
            int input=Integer.parseInt(sc.nextLine());
            concert[input-1].inquiry();
            if(!concert[input-1].cancle(sc.nextLine()))
                System.out.println("해당 이름의 예약자가 없습니다.");
        }
        catch(Exception e){
            System.out.println("비정상적인 입력입니다.");
        }
    }
}
class Seat{
    int NUMBER_OF_SEAT=10;
    String seat[]=new String[NUMBER_OF_SEAT];
    void inquiry(){
        for(int i=0; i<seat.length; i++)
            System.out.print((seat[i]!=null?seat[i]:"---")+" ");
        System.out.println();
    }
    boolean seatReservation(String name, int number){
        if(seat[number-1]!=null){
            System.out.println("이미 예약된 좌석입니다.");
            return false;
        }
        seat[number-1]=name;
        return true;
    }
    boolean cancle(String name){
        for(int i=0; i<seat.length; i++){
            if(seat[i]!=null&&seat[i].equals(name)){
                seat[i]=null;
                return true;
            }
        }
        return false;
    }
}

public class ConcertReservation {
    public static void main(String[] args) {
        boolean run=true;
        Scanner sc=new Scanner(System.in);
        Concert concert=new Concert(sc);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while(run){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            switch(sc.nextLine()){
                case "1":
                    concert.reservation();
                    break;
                case "2":
                    concert.inquiryAll();
                    break;
                case "3":
                    concert.cancleReservation();
                    break;
                case "4":
                    run=false;
                    break;
                default:
                    System.out.println("비정상적인 입력입니다.");
                    break;
            }
        }
        sc.close();
    }
}
