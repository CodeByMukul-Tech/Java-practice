import java.util.*;

class Accio{
    static long MarcsCakewalk(int n,int[] cupcakes){
        long sum =0 ;
        long s = 0 ;
      Arrays.sort(cupcakes);
      for(int i = n-1;i>=0;i--){

         long a = (long) (Math.pow(2,s)*cupcakes[i]); 
         s++;
         sum +=a;

      }

      return sum;
    }
}

public class Macs_cake {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        long ans=obj.MarcsCakewalk(n,arr);
        System.out.println(ans);
    }
}