import java.util.Scanner;

class Phone{
    String name;
    String phoneNumber;
    Scanner sc;
    Phone(Scanner scanner){
        this.sc=scanner;
        System.out.print("이름과 전화번호>>");
        name=sc.next();
        phoneNumber=sc.next();
    }
}

public class PhoneBook{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("인원수>>");
        Phone phoneBook[]=new Phone[sc.nextInt()];
        for(int i=0; i<phoneBook.length; i++)
            phoneBook[i]=new Phone(sc);
        System.out.println("저장되었습니다...");
        while(true){
            System.out.print("검색할 이름>>");
            String searchingName=sc.next();
            if(searchingName.equals("그만"))
                break;
            for(int i=0; i<phoneBook.length; i++){
                if(phoneBook[i].name.equals(searchingName)){
                    System.out.println(phoneBook[i].name+"의 번호는 "+phoneBook[i].phoneNumber+"입니다.");
                    break;
                }
            }
        }
        sc.close();
    }
}
