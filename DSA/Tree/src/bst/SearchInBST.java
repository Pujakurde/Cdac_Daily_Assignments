package bst;

public class SearchInBST {
	public TreeNode searchBST(TreeNode root, int data) {
        /*if(root!=null&&root.val==root){
            return root;
        }*/
        while(root!=null&& root.data!=data){
            if(data<root.data) {
                root=root.left;
            }
            else{
                root=root.right;
            }

        }
        return root;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
