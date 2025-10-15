package GYM.Easy;



import java.util.*;
// import java.io.*;



class Solutiona{
    public int product(int[][]arr , int n ){
        int products = 1 ;
        for(int i = 0 ; i< n;i++){
          products *=arr[i][i];

          if(i!=n-1-i){
              products *=arr[i][n-1-i];
          }
        }


        return  products ;
    }
}

public class Digonla_product {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();
        int[][] arr = new int[idx][idx];
        for(int i = 0 ; i< idx;i++){
            for(int j = 0 ; j<idx;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        sc.close();
        Solutiona obj = new Solutiona();
        obj.product(arr,idx);
        
    }
}

