class Node  {
    int val;
    Node left;
    Node right;
    Node(int data){
        this.val = data;
    }
}

public class SumOfTreeNodes {
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+ " ");
        display(root.left);
        display(root.right);
    }
    
    static int sum = 0;
    public static void sumOfNodes(Node root){
        if(root == null) return;
        sum += root.val;
        sumOfNodes(root.left);
        sumOfNodes(root.right);
    }

    public static int betterSum(Node temp){
        if(temp == null) return 0;
        int totalSum = temp.val + betterSum(temp.right) + betterSum(temp.left);
        return totalSum;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(10);
        Node h = new Node(20);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;  c.left = g;
        g.left = h;

        display(a);
        sumOfNodes(a);
        System.out.println(sum);

        System.out.println("---------Better Method----------");

        System.out.println(betterSum(a));

    }   
}



