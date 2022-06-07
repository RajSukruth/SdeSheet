import java.util.* ;
import java.io.*; 
/************************************
	 
	 //Following is the class structure of the LinkedListNode class:
	 
	  class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}

*****************************************/
public class Solution {

	public static int findIntersection(LinkedListNode<Integer> head, LinkedListNode<Integer> head2) {
        LinkedListNode<Integer> currA = head;
        LinkedListNode<Integer> currB = head2;
        
        while(currA != currB) {
            currA = currA == null ? head2 : currA.next;
            currB = currB == null ? head : currB.next;
        }
        
        if(currA!=null)return currA.data;
		return -1;
	}
}