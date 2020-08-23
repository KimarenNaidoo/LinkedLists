public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    void deleteNode(int key){
        Node temp = head, prev = null;
        if(temp != null && temp.data == key){
            head = temp.next;
        }
        while(temp!=null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        if(temp==null)
            return;
        prev.next = temp.next;
    }
     void push(int new_data){
        Node new_node = new Node(new_data);
        // We inserting at the front of the list.
        new_node.next  = head;
        head  = new_node;
     }

     void printList(){
        Node list = head;
        while(list!=null){
            System.out.print(list.data + " ");
            list = list.next;
        }
     }
     public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.push(5);
        list.push(4);
        list.push(9);
        list.push(1);

        list.printList();
        System.out.println();
        list.deleteNode(9);

        list.printList();
     }
}
