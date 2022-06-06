import java.util.* ;
import java.io.*; 
/****************************************************************
	
	Following is the structure of the Singly Linked List.
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int k) {
		// Write your code here.
        if(head==null)
            return head;
        if(k==0)
            return head;
        if(head.next==null && k==1)
            return null;
        int temp=k;
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head;
        LinkedListNode<Integer> prev=null;
        while(temp>0 && fast!=null)
        {
            fast=fast.next;
            temp--;
        }
        while(fast!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        if(prev!=null)
        prev.next=slow.next;
        else
        {
            head=head.next;
        slow.next=prev;
        }
        return head;
	}
}
