public class LinkedList11 {// Remove duplicates from a sorted linked list

    Node head;

    class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void removeDuplicates(){
        Node curr = head;
        while(curr != null){
            Node temp = curr;
            while(temp != null && temp.data == curr.data){
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
    }

    void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }

    public static void main(String[] args){
        LinkedList11 list = new LinkedList11();
        list.push(1);
        list.push(6);
        list.push(6);
        list.push(7);
        list.push(10);
        list.push(10);
        list.push(10);
        list.push(11);
        list.push(12);
        list.push(12);

        System.out.println("List before removal of duplicates");
        list.printList();
        list.removeDuplicates();
        System.out.println("List after removal of duplicates");
        list.printList();




    }
}
