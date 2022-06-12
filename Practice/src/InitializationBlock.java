//하라오름
public class InitializationBlock {
    static{
        System.out.println("정적초기화 블록");
    }
    static{
        a=20;
    }
    static int a=50;
    static{
        a=100;
        System.out.println(a);
    }

    {
        int a=20;
        System.out.println(a);
    }
    InitializationBlock(){
        System.out.println("생성자 호출");
    }
    public static void main(String[] args) {
        new InitializationBlock();
        InitializationBlock e;
    }
}
