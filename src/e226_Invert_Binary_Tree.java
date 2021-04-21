/*
反轉一個二元樹。
*/
public class e226_Invert_Binary_Tree {
	public TreeNode226 invertTree(TreeNode226 root) {
		//#1
//        if(root == null || root.left == null && root.right == null) {
//           return root;
//       }
//  
//        TreeNode226 tmp = root.right;
//       root.right = root.left;
//       root.left = tmp;
//       invertTree(root.left);
//       invertTree(root.right);
//  
//       return root;
		
		//#2
		helper(root);
	    return root;
   }
	
	public void helper(TreeNode226 n){
	    if(n==null){
	        return;
	    }
	 
	    TreeNode226 t = n.left;
	    n.left = n.right;
	    n.right = t;
	 
	    helper(n.left);
	    helper(n.right);
	}
}

class TreeNode226 {
	 int val;
	 TreeNode226 left;
	 TreeNode226 right;
	 TreeNode226() {}
	 TreeNode226(int val) { this.val = val; }
	 TreeNode226(int val, TreeNode226 left, TreeNode226 right) {
		 this.val = val;
		 this.left = left;
		 this.right = right;
	 }
}

//https://matthung0807.blogspot.com/2018/12/leetcode-invert-binary-tree.html
//
