import java.util.Random;

public class LinkedList3 {// Find Length of a Linked List (Iterative and Recursive)
    Node head;


    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
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

    public void countNodes(){
        int count = 0;
        Node curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        System.out.println("The number of nodes in this LinkedList is " + count);
    }

    public int countNodesRec(Node node){
        if(node == null) return 0;
        return 1 + countNodesRec(node.next);
    }

    public int countNodesRecWrap(){
        return countNodesRec(head);
    }


    public static void main(String[] args){
        Random r = new Random();
        LinkedList3 list = new LinkedList3();
        LinkedList3 listRec = new LinkedList3();
        for(int i = 0; i < 10; i++){
            list.push(r.nextInt(200)+1);
        }

        for(int i = 0; i < 10; i++){
            listRec.push(r.nextInt(200)+1);
        }
        System.out.println("Iterative approach");
        list.print();
        System.out.println();
        list.countNodes();

        System.out.println("Recursive approach");
        listRec.print();
        System.out.println();
        System.out.println("The number of nodes in this LinkedList is " + listRec.countNodesRecWrap());
    }
}
