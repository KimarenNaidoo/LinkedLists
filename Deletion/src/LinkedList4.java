import java.util.Random;

public class LinkedList4 {// Search an element in a Linked List (Iterative and Recursive)
    Node head;
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    // Iterative approach
    public boolean searchIterative(int key){
        Node curr = head;
        while(curr != null){
            if(curr.data == key){
                return true;
            }else{
                curr = curr.next;
            }
        }
        return false;
    }

    //Recursive approach
    public boolean searchRecursive(Node head, int key){
        if(head == null) return false;
        if(head.data == key) return true;
        return searchRecursive(head.next, key);
    }

    public static void main(String[] args){
        Random r=new Random();

        //Iterative
        LinkedList4 list=new LinkedList4();
        for(int i=0; i<10; i++){
            list.push(r.nextInt(200)+1);
        }
        list.push(45);
        list.print();
        System.out.println(list.searchIterative(45));

        //Recursive
        LinkedList4 list2 = new LinkedList4();
        for(int i=0; i<10; i++){
            list2.push(r.nextInt(200)+1);
        }
        list2.push(66);
        list2.print();
        System.out.println(list2.searchRecursive(list.head,45));
    }
}
