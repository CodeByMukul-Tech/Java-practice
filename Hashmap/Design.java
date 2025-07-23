import java.util.*;

class Solution {
    // Boolean array to track presence of keys
   

    // Checks if the key exists in the set
    
}

public class Design {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Solution Obj = new Solution();

        for (int i = 0; i < q; i++) {
            int choice = sc.nextInt();
            int key = sc.nextInt();

            if (choice == 1) {
                // Add
                Obj.add(key);
            } else if (choice == 2) {
                // Contains
                if (Obj.contains(key)) {
                    System.out.print("True ");
                } else {
                    System.out.print("False ");
                }
            } else if (choice == 3) {
                // Remove
                Obj.remove(key);
            }
        }
        System.out.println();
        sc.close();
    }
}
