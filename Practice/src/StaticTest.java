public class StaticTest {
    static int x=0;
    int b=0;
    public static void main(String[] args) {
        StaticTest obj1=new StaticTest();
        StaticTest obj2=new StaticTest();
        obj1.x=3;
        obj1.b=4;
        obj2.x=5;
        obj2.b=6;
        System.out.println(obj1.x+" "+obj1.b+" "+obj2.x+" "+obj2.b);
    }
}
