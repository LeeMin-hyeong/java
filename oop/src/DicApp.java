import java.util.Scanner;

class Dictionary{
    private static String[] kor={"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng={"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word){
        for(int i=0; i<kor.length; i++)
            if(kor[i].equals(word)) return eng[i];
        return null;
    }
}

public class DicApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true){
            System.out.print("한글 단어?");
            String searchingWord=sc.next();
            if(searchingWord.equals("그만"))
                break;
            String result=Dictionary.kor2Eng(searchingWord);
            if(result!=null)
                System.out.println(searchingWord+"은 "+result);
            else
                System.out.println(searchingWord+"은 저의 사전에 없습니다.");
        }
        sc.close();
    }
}
