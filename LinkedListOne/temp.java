public class temp {

    public static void printLL(Node head){
        Node temp = head;
        System.out.println();
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        //System.out.println(temp.data); // kyuki last wale node pe ane pe null mil gya and isne print nhi kiya for temp.next!= null
        // temp != null me esa nhi karna padta kyuki ab last wala print karne ke baad next pe gya -> oh null ho gya temp -> stop
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

        printLL(n1);
    }    
}
