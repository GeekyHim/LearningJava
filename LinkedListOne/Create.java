class Node{
    public int data;
    public Node next;
    Node(int data){
        this.data = data;
        this.next = null; // vaise java automatically assigns it null so unneccesary line
    }
}
public class Create{

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        n1.next = n2;
        System.out.println("NODE 1");
        System.out.println(n1);
        System.out.println(n1.data);
        System.out.println("NODE 2");
        System.out.println(n2);
        System.out.println(n2.data);
        System.out.println(n1.next);
        System.out.println(n1.next.data);
    }
} 