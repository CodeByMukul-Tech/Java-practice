
import java.io.*;
import java.util.*;

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

class Max_width_of_tree {
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
            if (i >= ip.length)
                break;
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Node root = buildTree(s);
        Solution tree = new Solution();
        int ans = tree.solve(root);
        System.out.println(ans);

        sc.close();
    }
}

class Pair {
    Node n;
    int idx;

    public Pair(Node n, int idx) {
        this.n = n;
        this.idx = idx;
    }
}

class Solution {

    public int solve(Node root) {
        Deque<Pair> q = new ArrayDeque<>();
        int maxwidth = 0;
        int curridx = 0;
        q.addLast(new Pair(root, 1));
        while (!q.isEmpty()) {
            int size = q.size();
            int start = -1 ; 
            int end = -1 ;
            for (int i = 0; i < size; i++) {
                if(i==0) start = q.peek().idx;
                if(i == size-1) end = q.peek().idx;
                Pair p = q.pollFirst();
                Node nod = p.n;
                int idx = p.idx;

                if(nod.left!=null )q.add(new Pair(nod.left, 2*idx));
                if(nod.right!=null)q.add(new Pair(nod.right, 2*idx+1));
                 

            }

            maxwidth = Math.max(maxwidth , end -start+1);

        }
        return maxwidth;

    }
}
