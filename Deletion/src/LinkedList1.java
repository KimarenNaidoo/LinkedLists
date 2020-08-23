public class LinkedList1 {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    void insert(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    void delete(int position){
        if(head == null)
            return;

        Node curr = head;

        if (position == 0){
            head = curr.next;
            return;
        }

        for(int i = 0; curr != null && i < position-1; i++){
            curr = curr.next;
        }

        if(curr == null || curr.next == null){
            return;
        }

        Node n = curr.next.next;
        curr.next = n;

    }

    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        LinkedList1 list = new LinkedList1();
        list.insert(1);
        list.insert(9);
        list.insert(11);
        list.insert(12);

        list.printList();

        System.out.println();

        list.delete(2);

        list.printList();
    }
}
