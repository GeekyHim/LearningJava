class Node  {
    int val;
    Node left;
    Node right;
    Node(int data){
        this.val = data;
    }
}

public class MaxNodeValue {
        public static void display(Node root){
            if(root == null) return;
            System.out.print(root.val+ " ");
            display(root.left);
            display(root.right);
        }

        public static int max(Node root){
            if(root == null) return Integer.MIN_VALUE;
            int MaxRightTree = max(root.right);
            int MaxLeftTree = max(root.left);
            int max = Math.max(root.val, Math.max(MaxRightTree, MaxLeftTree));
            // return Math.max(root.val,Math.max(max(root.right),max(root.left)));
            return max;
        }



        public static int min(Node root){
            if(root == null) return Integer.MAX_VALUE;
            int MinRightTree = min(root.right);
            int MinLeftTree = min(root.left);
            int min = Math.min(root.val, Math.min(MinRightTree, MinLeftTree));
            return min;
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
        
            System.out.println(max(a));
            System.out.println(min(a));
            display(a);
    }

    }




