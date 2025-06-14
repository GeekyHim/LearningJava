// making the linked list data strcture

class Node{ // user defined data type
    int data;
    Node next;
    Node(int data) { this.data = data; }
}
public class MyLinkedListDS {// user defined data Structure
    Node head; // by default is null
    Node tail;
    int size; // by default is 0
    // My Member Functions
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    void size(){
        System.out.println("Length of LinkedList is: "+size);
    }

    void addAtLast(int val){
        Node temp = new Node(val);
        if(head==null) {
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            // temp ka next is alrdy null 
            //temp.next = null;
            // but ab imp thing tail ko last pe leke jana hai 
            tail = temp;
        }
        size++;
    }

    void addAtStart(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
}

