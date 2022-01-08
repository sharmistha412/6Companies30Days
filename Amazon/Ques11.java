import java.util.*;
public class Ques11 {
    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    public void serialize(Node root, ArrayList<Integer> A) 
	{
	    //code here
	    if(root==null){
	        A.add(Integer.MAX_VALUE);
	        return;
	    }
	    A.add(root.data);
	    serialize(root.left,A);
	    serialize(root.right,A);
	}
	int count=0;
	public Node solve(ArrayList<Integer> A){
	    if(A.get(count)==Integer.MAX_VALUE || A.size()==0){
	        count++;
	        return null;
	    }
	    Node n=new Node(A.get(count));
	    count++;
	    n.left=solve(A);
	    n.right=solve(A);
	    return n;
	}
	//Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A)
    {
        //code here
        return solve(A);
    }
    
}
