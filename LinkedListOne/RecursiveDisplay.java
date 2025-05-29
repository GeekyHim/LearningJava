public class RecursiveDisplay {

    public static void printLLRecursive(Node head){
        if(head==null) return;
        System.out.println(head.data);
        printLLRecursive(head.next);
        }

        public static void reversePrintLLRecursive(Node head){
        if(head==null) return;
        printLLRecursive(head.next);
        System.out.println(head.data);
        }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        // Linking 
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.println();
        printLLRecursive(n1);
    }    
}
