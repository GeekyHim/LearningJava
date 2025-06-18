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

    void insertAt(int index, int data){
        if(index==0) { // to make sure start me insert ho head var  maintain rkhne ke liye
            addAtStart(data);
            return;
        }
        if(index==size){ // even tho iski zarurat nhi thi, lekin phir tail var nhi maintain hogi 
            addAtLast(data);
            return;
        }
        if(index>size){
            System.out.println("Invalid Index Given!!!");
            return;
        }
        Node temp = new Node(data);
        Node tracker = head;
        for(int i=0;i<index-1;i++){
            tracker = tracker.next;
        }
        temp.next = tracker.next;
        tracker.next = temp;
        size++;
    }
}

