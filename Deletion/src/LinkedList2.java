public class LinkedList2 {// Deleting an entire linked list

    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;

    }

    public void deleteEntireLinkedList(){
        head  = null;
    }

    public void print(){
        Node curr = head;

        if(curr == null){
            System.out.println("Linkedlist is empty");
        }

        while(curr != null){
            System.out.print(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args){
        LinkedList2 list = new LinkedList2();
        list.push(3);
        list.push(5);
        list.push(10);

        list.print();
        System.out.println();
        list.deleteEntireLinkedList();
        list.print();
    }

}

