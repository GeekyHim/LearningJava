class Node  {
    int val;
    Node left;
    Node right;
    Node(int data){
        this.val = data;
    }
}
public class ProductNode {
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+ " ");
        display(root.left);
        display(root.right);
    }

    public static int product(Node root){
        if(root == null) return 1;
        if(root.val == 0) return product(root.left) * product(root.right);
        return root.val * product(root.left) * product(root.right);

    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(0);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(2);
        
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        System.out.println(product(a));
        display(a);
    }
}


