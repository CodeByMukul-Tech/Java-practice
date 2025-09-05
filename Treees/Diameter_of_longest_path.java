import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
// import java.util.*;



class Diameter_of_longest_path {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length) break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        Node root1 = buildTree(s1);
        Solution g = new Solution();
        System.out.println(g.diameter(root1));
    }
}


class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Pair{
    int height ;
    int diameter ; 
    public Pair(int h , int d){
        this.height=h;
        this.diameter=d;
    }
}

class Solution {
    public int height(Node root){
        if(root==null) return 0 ; 
        int x = height(root.left);
        int y = height(root.right);
        return 1 +Math.max(x, y);
    }
    
    public Pair Diameterhelper(Node root){
        if(root==null) return new Pair(0, 0);
        Pair left = Diameterhelper(root.left);
        Pair right = Diameterhelper(root.right);
        

    }
    
    public  int diameter(Node root) {
        // Your code here


        return 0 ;
    }
}