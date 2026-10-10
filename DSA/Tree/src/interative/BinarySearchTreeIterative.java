package interative;

import java.util.ArrayDeque;
import java.util.Deque;


class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

public class BinarySearchTreeIterative {
	Node root;
	
	public void insertData(int data) {
		Node newNode=new Node(data);
		if(root==null) {
			root=newNode;
			return;
		}
		Node temp=root;
		while(true) {
			if(newNode.data < temp.data) {
				if(temp.left==null) {
					temp.left=newNode;
					break;
				}
				temp=temp.left;
			}
			else {
				if(temp.right==null) {
					temp.right=newNode;
					break;
				}
				temp=temp.right;
			}
		}
	}
	
	//inorder

	public void inOrderIterative(Node root2) {
	    Deque <Node> stack= new ArrayDeque<>();
	    Node current=root;
	    while(!stack.isEmpty()||current!=null) {
	    		while(current!= null) {
	    			stack.push(current);
	    			current=current.left	;
	    		}
	    		current=stack.pop();
	    		System.out.print(current.data+" ");
	    		current=current.right;
	    }
	    
	}
	public void preOrderIterative(Node root2) {
	    Deque <Node> stack= new ArrayDeque<>();
	    stack.push(root);
	    	while(!stack.isEmpty()) {
	    		Node current=stack.pop();
	    		System.out.print(current.data+" ");
	    		
	    		if(current.right!=null) {
	    			stack.push(current.right);
	    		}
	    		if(current.left!=null) {
	    			stack.push(current.left);
	    		}
	    }
	    
	}
	
	public void postOrderIterative(Node root) {
	    if(root == null)
	        return;

	    Deque<Node> stack1 = new ArrayDeque<>();
	    Deque<Node> stack2 = new ArrayDeque<>();

	    stack1.push(root);

	    while(!stack1.isEmpty()) {
	        Node current = stack1.pop();
	        stack2.push(current);

	        if(current.left != null) {
	            stack1.push(current.left);
	        }

	        if(current.right != null) {
	            stack1.push(current.right);
	        }
	        
	    }

	    while(!stack2.isEmpty()) {
	        System.out.print(stack2.pop().data + " ");
	    }
	}
	//main method
	public static void main(String[] args) {
		BinarySearchTreeIterative bst=new BinarySearchTreeIterative();

		bst.insertData(50);
		bst.insertData(30);
		bst.insertData(70);
		bst.insertData(20);
		bst.insertData(40);
		bst.insertData(60);
		bst.insertData(80);
		
		System.out.print("BST Elements: ");
		bst.inOrderIterative(bst.root);
		System.out.print("\nPreorder Transversal : ");
		bst.preOrderIterative(bst.root);
		System.out.print("\nPostorder Transversal : ");
		bst.postOrderIterative(bst.root);
		
	}

	

}
