package bst;

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
public class BinarySearchTree {
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
	public void inOrder() {
		inOrder(root);
	} 
	private void inOrder(Node root) {
	    if (root != null) {
	        inOrder(root.left);
	        System.out.print(root.data + " ");
	        inOrder(root.right);
	    }
	}
	
	//preorder
	public void preOrder() {
		preOrder(root);
	} 
	private void preOrder(Node root) {
	    if (root != null) {
	        System.out.print(root.data + " ");
	        preOrder(root.left);
	        preOrder(root.right);
	    }
	}
	
	//postorder
		public void postOrder() {
			postOrder(root);
		} 
		private void postOrder(Node root) {
		    if (root != null) {
		        postOrder(root.left);
		        postOrder(root.right);
		        System.out.print(root.data + " ");
		    }
		}
	
	//main method
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();

		bst.insertData(50);
		bst.insertData(30);
		bst.insertData(70);
		bst.insertData(20);
		bst.insertData(40);
		bst.insertData(60);
		bst.insertData(80);
		
		System.out.print("BST Elements: ");
		bst.inOrder(bst.root);
		System.out.print("\nPreorder Transversal : ");
		bst.preOrder(bst.root);
		System.out.print("\nPostorder Transversal : ");
		bst.postOrder(bst.root);
		
	}

	
	
		
}
