import java.util.Random;

public class assign12 {
    public static void main(String[] args) {
        Random r=new Random();
        int arr[][];
        arr=new int[4][4];
        for(int i=0; i<10; i++){
            int m=r.nextInt(4), n=r.nextInt(4);
            if(arr[m][n]==0)
                arr[m][n]=r.nextInt(10)+1;
            else
                i--;
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++)
                System.out.print(arr[i][j]+"\t");
            System.out.print("\n");
        }
    }
}
