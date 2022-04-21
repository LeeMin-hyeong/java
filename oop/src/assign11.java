import java.util.Random;
import java.util.Scanner;

public class assign11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int n=sc.nextInt();
        int arr[];
        arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=r.nextInt(100)+1;
            for(int j=0; j<i; j++){
                if(arr[j]==arr[i]){
                    i--;
                    break;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
            if((i+1)%10==0) System.out.print("\n");
        }
        sc.close();
    }
}
