public class SLL {
 public static class Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    } 
}
public static Node head;
public static Node tail;
// methods to add remove print search 
public void addFirst(int data){
     //step 1 = create a new node
Node newNode = new Node(data);
    if(head==null){
         head=tail=newNode;
         return;
    }
    //step 2 new Node next = head
    //  //linking step
    newNode.next=head;
    // step 3 head = new newNode
    head= newNode;
}
public void addLast(int data){
    Node newNode= new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
}  
  public static void main(String[] args) {
       SLL ll= new SLL();
       ll.addFirst(1);
       ll.addFirst(2);
       ll.addLast(4);
       ll.addLast(6);  
    }
}

