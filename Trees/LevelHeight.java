public class LevelHeight {
    
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+ " ");
        display(root.left);
        display(root.right);
    }

    public static int level(Node root) {
        if(root == null) return 0;
        return 1 + Math.max( level(root.left), level(root.right));
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(0);
        Node c = new Node(3);
        Node d = new Node(100);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(2);
        
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
    
        System.out.println("Levels: " + level(a));
        System.out.println("Height: " + (level(a)-1));

        display(a);
    }
    
}

class Node  {
    int val;
    Node left;
    Node right;
    Node(int data){
        this.val = data;
    }
}






