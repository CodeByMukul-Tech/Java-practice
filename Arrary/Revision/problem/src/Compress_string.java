
// import java.util.*;
import java.io.*;

public class Compress_string {
    static void compressedString(String s) {
        StringBuilder res = new StringBuilder();
        int size_of_givern_string = s.length();
        int count = 1;

        for (int i = 0; i < size_of_givern_string; i++) {
            char pre_c = s.charAt(i);
            for (int j = i + 1; j < size_of_givern_string; j++) {
                char curr_next = s.charAt(j);
                 if(pre_c == curr_next ){
                    count++;
                 }
            }
            res.append(pre_c);
            res.append(count);


        }
        System.out.println(res);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            compressedString(s);
            System.out.println();
        }
        br.close();
    }
}
