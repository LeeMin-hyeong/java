public class pr5 {
    public static void main(String[] args) {
        int even=0;
        int odd=0;

        for(int i=1; i<=100; i++){
            if(i%2==1)
                odd+=i;
            else
                even+=i;
        }
        System.out.println("홀수의 합"+odd);
        System.out.println("짝수의 합"+even);
    }
}
