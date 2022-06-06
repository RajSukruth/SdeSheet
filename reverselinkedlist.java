import java.util.* ;
import java.io.*; 
/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
        if(head==null || head.next==null)
            return head;
         LinkedListNode<Integer> prev=null;
        LinkedListNode<Integer> next=head;
        while(head.next!=null)
        {
            head=head.next;
            next.next=prev;
            prev=next;
            next=head;
        }
        head.next=prev;
        
        return next;
        
        
        
    }
}