import java.util.Stack;

public class LinkedList10 {// Check if LinkedList is a palindrome

    Node head;
    Node slow_ptr, fast_ptr, second_half;

    class Node{

        char val;
        Node next;

        public Node(char val){
            this.val = val;
            next = null;
        }
    }

    void printList(){
        Node curr = head;
        while(curr !=  null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
    }

    boolean isPalindrome(Node head){
        slow_ptr = head;
        fast_ptr = head;
        Node prev_of_slow_ptr = head;
        Node midnode = null;
        boolean res = true;

        if(head != null && head.next != null){
            while(fast_ptr != null && fast_ptr.next != null){
                fast_ptr = fast_ptr.next.next;
                prev_of_slow_ptr = slow_ptr;
                slow_ptr = slow_ptr.next;
            }

            if(fast_ptr != null){
                midnode = slow_ptr;
                slow_ptr = slow_ptr.next;
            }

            second_half =slow_ptr;
            prev_of_slow_ptr.next = null;
            reverse();
            res = compareLists(head, second_half);

            reverse();

            if(midnode != null){
                prev_of_slow_ptr.next = midnode;
                midnode.next = second_half;
            }
            else prev_of_slow_ptr.next = second_half;


        }
        return res;
    }
    boolean compareLists(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        while(temp1 != null && temp2 != null){
            if(temp1.val == temp2.val){
                temp1 = temp1.next;
                temp2 = temp2.next;
            }else return false;
        }

        // if both lists are empty
        if(temp1 == null && temp2 == null){
            return true;
        }

        return false;
    }

    void push(char new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void reverse(){
        Node prev = null, current = second_half, next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        second_half = prev; // this will be the new head of the list
    }


    public static void main(String[] args){
        LinkedList10 list = new LinkedList10();

        char[] str = {'a', 'b', 'a', 'c', 'a', 'b', 'a'};
        String string = new String(str);
        for(int i = 0; i < 7; i++){
            list.push(str[i]);
            list.printList();

            if(list.isPalindrome(list.head)!= false){
                System.out.print("Is a Palindrome");
                System.out.print("\n");
            }else{
                System.out.print("Not a Palindrome");
                System.out.print("\n");
            }
        }

    }
}
