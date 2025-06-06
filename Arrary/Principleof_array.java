
import java.util.Scanner;

public class Principleof_array {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int arr[] = new int[5];
        // System.out.println(arr);  //starting address of the array
      
        Scanner sc = new Scanner(System.in);
        for( int i = 0 ; i< 5;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        for(int i =0 ; i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
