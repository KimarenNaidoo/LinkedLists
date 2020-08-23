import java.util.Random;

public class LinkedList6 {

    Node head;
    public class Node{
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

    public void Print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public void printMiddle(){
        int len = 0;
        Node curr = head;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        //System.out.println(len/2);
        curr = head;

            for (int i = 1; i < (len / 2)+1; i++) {
                curr = curr.next;
            }
            System.out.println(curr.data);


    }

    public static void main(String[] args) {
        Random r = new Random();

        // Odd number of nodes
        LinkedList6 list = new LinkedList6();
        for(int i = 0; i < 19; i++){
            list.push(r.nextInt(200)+1);
        }
        list.Print();
        list.printMiddle();

        System.out.println();

        // Even number of nodes
        LinkedList6 list2 = new LinkedList6();
        for(int j = 0; j < 20; j++){
            list2.push(r.nextInt(200)+1);
        }
        list2.Print();
        list2.printMiddle();
    }

}
