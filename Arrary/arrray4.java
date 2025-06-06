import java.util.*;


public class arrray4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n;
        
        n = sc.nextInt();
        int []arrA=new int[n];
        for(int i=0;i<n;++i){
                arrA[i]=sc.nextInt();
        }
        
        n = sc.nextInt();
        int []arrB=new int[n];
        for(int i=0;i<n;++i){
            arrB[i]=sc.nextInt();
        }
        
        System.out.println(ArrayProblem(arrA,arrB)); 
    }
    public static String ArrayProblem(int []arrA,int []arrB){
        int a = 0 ;
        int b = 0 ;
        String result;
          for(int i = 0 ; i<arrA.length;i++){
            a+=arrA[i];

            
          }
          for(int i = 0 ; i<arrB.length;i++){
            b+=arrB[i];
          }
          if(a>b){
             result ="First array is larger";
          }else{
            if(a<b){
                result ="Second array is larger";
            }else{
                result ="Both arrays are equal";
            }
          }




        return result;
       // Write code here
    }
}