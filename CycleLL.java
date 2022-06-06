import java.util.* ;
import java.io.*; 
/*  

    Following is the representation of the Singly Linked List node

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

*/
//Two Pointers

public class Solution {
    
    public static boolean detectCycle(Node<Integer> head) {
        //Your code goes here
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}

//Uisng HashSet


public class Solution {
    
    public static boolean detectCycle(Node<Integer> head) {
        //Your code goes here
        HashSet<Node<Integer>> hs=new HashSet<>();
        while(head != null) {
        if(hs.contains(head)) return true;
        hs.add(head);
        head = head.next;
    }
    return false;
    }
}
