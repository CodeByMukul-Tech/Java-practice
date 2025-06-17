import java.util.Scanner;

public class Reverse_an_array {
    public static void runner(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i< n ; i++){
            arr[i] = arr[n -1- i  ];
        }
         System.out.println("k");
        for(int i = 0 ;i< n ;i++){
            System.out.println(arr[i]);
        }
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size of an array");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number an array");
        for(int i = 0 ; i< n ; i++){
                   arr[i] = sc.nextInt();
        }

        runner(arr);
    }
}
