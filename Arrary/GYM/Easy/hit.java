package GYM.Easy;

import java.util.*;

public class hit {
	 static int[] Sorting01(int n,int[] arr){
        int zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }else{
            }
        }
        int[] ans=new int[n];
        for(int i=0;i<zero;i++){
            ans[i]=0;
        }
        for(int i=zero;i<n;i++){
            ans[i]=1;
        }
        return ans;
    }
	
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int[] ans=Sorting01(n,arr);
        for(int i=0;i<n;++i){
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}