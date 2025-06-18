public class Traversals {
    
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+ " ");
        display(root.left);
        display(root.right);
    }

    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+ " ");
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+ " ");
        inorder(root.right);
    }

    
    public static void main(String[] args) {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');
        Node i = new Node('I');
        
        a.left = b; a.right = e;
        b.left = c; b.right = d;
        d.left = h;
        e.left = f; e.right = g;
        f.right = i;
        
        System.out.println("-----------PREORDER--------------");
        preorder(a);
        System.out.println();
        System.out.println("-----------INORDER--------------");
        inorder(a);
        System.out.println();
        System.out.println("-----------POSTORDER--------------");
        postorder(a);
        System.out.println();
    }
    
}

class Node  {
    char val;
    Node left;
    Node right;
    Node(char data){
        this.val = data;
    }
}







