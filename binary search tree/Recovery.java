
import java.util.Scanner;

public class Recovery {

    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // static TreeNode helper(TreeNode root, int number1 , int number2){
    //     if(root == null) return null;
    // }

    static int node1 = 0;
    static int node2 = 0;

    // public static void recoverTree(TreeNode root) {

    //     if (root == null)
    //         return;
    //     if (root.left.val > root.val) {
    //         node1 = root.left.val;
    //     }
    //     if (root.right.val < root.val) {
    //         node2 = root.right.val;
    //     }
    //     int k = node1;
    //     node1 = node2;
    //     node2 = k;


    //     recoverTree(root.left);
    //     recoverTree(root.right);
    //     helper(root, node1, node2);

    // }

     public static void recoverTree(TreeNode root){
        if(root == null) return ;
        

     }

    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null)
            return;

        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append(" -> " + node.val + " <- ");
        sb.append((node.right != null ? node.right.val : "."));

        System.out.println(sb.toString());

        display(node.left);
        display(node.right);

    }

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
            IDX[0]++;
            return null;
        }

        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);
        recoverTree(root);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}