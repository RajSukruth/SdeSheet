import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
		{
		    public int data;
		    public Node next;

		    Node(int data)
		    {
		        this.data = data;
		        this.next = null;
		    }
		}

*****************************************************************/

public class Solution 
{
    public static Node firstNode(Node head) 
    {
        //    Write your code here.
        HashSet<Node> hs=new HashSet<>();
        Node prev=null;
        while(head!=null){
            if(hs.contains(head))
                return head;
            hs.add(head);
            prev=head;
            head=head.next;
            
        }
        return null;
    }
}