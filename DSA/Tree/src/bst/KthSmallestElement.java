package bst;

import java.util.ArrayDeque;
import java.util.Deque;


class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class KthSmallestElement {
	public int kthSmallest(TreeNode root, int k) {
		Deque <TreeNode> stack= new ArrayDeque<>();
	    TreeNode current=root;
	    
	    while(!stack.isEmpty()||current!=null) {
	    		while(current!= null) {
	    			stack.push(current);
	    			current=current.left	;
	    		}
	    		
	    		//current 
	    		current=stack.pop();
	    		k--;
	    		
	    		if (k == 0) {
	    			return current.data;
	    		}
	    		// Move to right subtree
	    		current=current.right;
	    }
	    return -1;
    }

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.left.left.left = new TreeNode(1);
		KthSmallestElement kth = new KthSmallestElement();
		System.out.println(kth.kthSmallest(root, 3));

	}

}
