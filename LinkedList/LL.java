

public class LL {

    public static class Node{
        int data;  // value 
        Node next; // address of next node
        public Node(int data){
        this.data= data;
        this.next= null;
    }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
         Node newNode= new Node(data);
        if(head==null){
            head=tail= newNode;
            return;
        }
       
        newNode.next= head;
        head=newNode;


    }

    public static void main(String[] args) {
        Node a= new Node(5);
        Node b= new Node(6);
        Node c= new Node(8);
        Node d= new Node(10);
        Node e= new Node(15);
       // before linking nodes 
        // 5  6  8  10  15

        // linking the nodes
        a.next=b; 
        // 5 -> 6  8  10  15  after linking a to b 
        b.next=c;
         // 5 -> 6 ->  8  10  15
        c.next=d;
         // 5 -> 6 -> 8 -> 10  15
        d.next=e;
         // 5 -> 6 -> 8 -> 10 -> 15
        d.next=null; 
         // the resultant linked list looks like 
        // 5 -> 6 -> 8 -> 10 -> 15 -> null
        // checking the link of node by checking adresses
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.next);
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(d );
        System.out.println(c.next);
        System.out.println(e);
        System.out.println(d.next);
        System.out.println(e.next);
        
    }
}
