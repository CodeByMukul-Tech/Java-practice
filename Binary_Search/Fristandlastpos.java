import java.util.*;

public class Fristandlastpos {

    static int f(int[] a,int n , int k ){
        int s = 0 ; 
        int e = n-1;
        int frist = -1;
        while (s<=e) {
            int mid = (s+(e-s))/2;
            if(a[mid]==k){
                frist=mid;
                e=mid-1;
            }
            else if(a[mid]>k){
                e = mid-1;
            }
            else s=mid+1;
            
        }
        return frist;
    }

    static int l(int[] a,int n , int k ){
        int s = 0 ; 
        int e = n-1;
        int last = -1;
        while (s<=e) {
            int mid = (s+(e-s))/2;
            if(a[mid]==k){
                last=mid;
                s=mid+1;
            }
            else if(a[mid]>k){
                e = mid-1;
            }
            else s=mid+1;
            
        }
        return last;
    }


    public static void findPosition(int a[], int n,int k)
    {
        int frist = f(a,n,k);
        int last = l(a,n,k);
        System.out.println(frist+" "+last);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        findPosition(array,n,k);
    }
}