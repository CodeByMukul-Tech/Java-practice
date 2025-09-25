// import java.io.*;
import java.util.*;

public class Autori {
	static String autori(String str){
       StringBuilder data = new StringBuilder();
       data.append(str.charAt(0));
       int n = str.length();
       for(int i = 0 ; i< n ;i++){
         if(str.charAt(i)=='-'){
            data.append(str.charAt(i+1));
         }
       }

       String macher = data.toString();
       return macher;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String result = autori(str);
        System.out.print(result);        
        System.out.println('\n');
    }
}