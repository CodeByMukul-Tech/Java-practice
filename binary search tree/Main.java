import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if (root == null)
            return null;
        StringBuilder ans = new StringBuilder();
        ans.append(root.val).append(",");
        serialize(root.left);
        serialize(root.right);
        String s = ans.toString();
        System.out.println(s);
        return s;
    }
    static int idx = 0 ;
    static TreeNode helper(String[] ans , int min, int max){
        if(idx>=ans.length) return null;
        int val = Integer.parseInt(ans[idx]);
        if(val < min || val > max ) return null;
        TreeNode node = new TreeNode(val);
        idx++;
        node.left = helper(ans, min, max-1);
        node.right = helper(ans, min-1, max);
        return node;

    }
    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String str) {
        if(str == null) return null;
        String[] ans = str.split(",");
        return helper(ans, Integer.MIN_VALUE, Integer.MAX_VALUE);
    

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

        String s = serialize(root);
        display(deserialize(s));
    }

    public static void main(String[] args) {
        solve();
    }
}