// import java.io.*;
import java.util.*;

// import javax.print.Doc;

public class Strange_string {
    static String strangeString(int n) {
        StringBuilder Doctor_strange = new StringBuilder();
        int data = 97;
       
       for(int i = 0 ; i< n ;i++){
        
        char ch = (char)(data);
        if(i%2==0){
            Doctor_strange.insert(0,ch);
        }else{
            Doctor_strange.append(ch);
        }
        data++;
        if(data>122){
            data = 97;
        }

       }

       return Doctor_strange.toString();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            System.out.println(strangeString(n));
        }
        input.close();
    }
}