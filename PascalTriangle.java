import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        ArrayList<ArrayList<Long>> res=new ArrayList<ArrayList<Long>>();
        ArrayList<Long> prev=new ArrayList<Long>();
        for(int i=0;i<n;++i)
        {
            ArrayList<Long> curr=new ArrayList<Long>();
            for(int j=0;j<=i;++j)
            {
                if(j==0 || j==i)
                    curr.add((long)1);
                else
                    curr.add(prev.get(j-1)+prev.get(j));
            }
            prev=curr;
            res.add(curr);
            
        }
        return res;
        }
}
