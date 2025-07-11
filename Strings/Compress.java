package Strings;
// import java.util.*;
import java.io.*;

public class Compress {
	static void compressedString(String s) {
        
        
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();
            compressedString(s);
            System.out.println();
        }
    }
}


