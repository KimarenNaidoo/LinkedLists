import java.util.HashSet;

public class LinkedList8 {// Detect loop in a linked list

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

    static boolean detectLoop(Node h){
        HashSet<Node> s = new HashSet<>();
        while(h != null) {
            if (s.contains(h)) {
                return true;
            }

            s.add(h);
            h = h.next;
        }
        return false;
    }


    public static void main(String[] args){
        LinkedList8 list = new LinkedList8();
        list.push(8);
        list.push(57);
        list.push(73);
        list.push(0);

        // The loop
        list.head.next.next.next.next = list.head;

        if(detectLoop(list.head)){
            System.out.println("Loop Detected");
        }else{
            System.out.println("Loop Undetected");
        }

    }
}
