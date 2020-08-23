public class LinkedList7 {
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

    // Non-recursive
    int freq(int val){
        Node curr = head;
        int count = 0;
        while(curr != null){
            if(curr.data == val){
                count++;
                curr = curr.next;
            }else{
                curr = curr.next;
            }

        }
        return count;
    }

    static int frequency = 0;

    // Recursive
    static int freqRecursive(Node head, int key){
        if(head == null){
            return frequency;
        }
        if(head.data == key)
            frequency++;
        return freqRecursive(head.next, key);
    }


    public static void main(String[] args){
        LinkedList7 list = new LinkedList7();
        list.push(2);
        list.push(27);
        list.push(5);
        list.push(5);
        list.push(2);
        list.push(2);
        list.push(2);
        list.push(2);

        System.out.println(list.freq(2));
        System.out.println(freqRecursive(list.head,2));
    }
}
