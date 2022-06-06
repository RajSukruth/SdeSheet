import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> start=new LinkedListNode<Integer>(-1);
        LinkedListNode<Integer> st=start;
        while(first!=null && second!=null)
        {
            if(first.data>second.data)
            {
                start.next=second;
                second=second.next;
                start=start.next;
            }
            else
            {
                 start.next=first;
                first=first.next;
                start=start.next;
                
            }
        }
        while(first!=null)
        {
            start.next=first;
                first=first.next;
                start=start.next;
            
        }
        while(second!=null)
        {
            start.next=second;
                second=second.next;
                start=start.next;
            
        }
              return st.next;              
                 
                
        
	}
}
