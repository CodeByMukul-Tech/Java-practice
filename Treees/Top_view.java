import java.util.LinkedList;
import java.util.Queue;
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

class Top_view {
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

    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            Solution tree = new Solution();
            ArrayList<Integer> arr = tree.topView(root);
            for (int x : arr)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}

class qObj {
    Node node;
    int level;

    qObj(Node n, int l) {
        node = n;
        level = l;
    }
}

class Pair {
    int HD;
    Node node;

    public Pair(int HD, Node node) {
        this.HD = HD;
        this.node = node;
    }
}

class Solution {
    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(0, root));
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int Hd = p.HD;
            Node node = p.node;

            if (!map.containsKey(Hd)) {
                map.put(Hd, node.data);
            }

            if(node.left!=null) q.add(new Pair(Hd-1, node.left));
            if(node.right!=null) q.add(new Pair(Hd+1, node.right));
        }


        for(int e : map.values()){
            ans.add(e);
        }

        return ans;
    }
}
