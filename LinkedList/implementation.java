
public class implementation {
    
    public static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}

public static class linkedlist{
            Node head=null;
            Node tail=null;
            void insertAtEnd(int value){
                Node temp=new Node(value);
                if(head==null ){
                    head=temp;
                    tail=temp;
                }
                else{
                tail.next=temp;
                tail=temp;
                }
            }
            void display(){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            int count=0;
             Node temp= head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;

        }

        void insertAtBeginning(int value){
            Node temp=new Node(value);
                if(head==null ){ // empty list
                    head=temp;
                    tail=temp;
                }else{ // non empty list
                    temp.next=head;
                    head=temp;
                }
        }
}
    public static void main(String[] args) {
        linkedlist ll= new linkedlist();
        ll.insertAtEnd(5); // 5
        ll.insertAtEnd(7); // 5 7
        ll.insertAtEnd(8); // 5 7 8
        ll.display(); 
        System.out.println();
       // System.out.println("Size of the LinkedList is: "+ll.size());
       ll.insertAtBeginning(6); // 6 5 7 8
       ll.insertAtBeginning(1); // 1 6 5 7 8
       ll.insertAtBeginning(2); // 2 1 6 5 7 8
       ll.insertAtBeginning(3); // 3 2 1 6 5 7 8
         ll.display(); 
         System.out.println();
         System.out.println("Size of the LinkedList is: "+ll.size());


        
    }
}
