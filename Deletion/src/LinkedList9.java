public class LinkedList9 {// Find length of loop in linked list ( Floyd’s Cycle detection algorithm )

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

    static int countNodes(Node h){
        int res = 1;
        Node temp = h;
        while(temp.next != h){
            res++;
            temp = temp.next;
        }
        return res;
    }

    static int countLoopNodes(Node n){
        Node slow_p = n, fast_p = n;
        while(slow_p != null && fast_p != null & fast_p.next != null){
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;

            if(slow_p == fast_p){
                return countNodes(slow_p);
            }
        }
        return 0;
    }

    public static void main(String[] args){
        LinkedList9 list  = new LinkedList9();
        list.push(8);
        list.push(57);
        list.push(73);
        list.push(73);
        list.push(0);

        // The loop
        list.head.next.next.next.next = list.head;

        System.out.println(countLoopNodes(list.head));
    }
}
