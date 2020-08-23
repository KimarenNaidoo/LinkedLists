public class LinkedList5 {// Write a function to get Nth node in a Linked List
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
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    public void print(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public int GetNth(int index){
        Node curr=head;
        int count=0;
        while(curr!=null){
            if(count==index){
                return curr.data;
            }else{
                count++;
                curr=curr.next;
            }
        }
        return -1;
    }
    public static void main(String[] agrs){
        LinkedList5 list=new LinkedList5();
        list.push(5);
        list.push(9);
        list.push(67);
        list.push(564);
        list.push(54);
        list.push(0);
        list.print();
        System.out.println();
        System.out.println(list.GetNth(2));
    }
}
