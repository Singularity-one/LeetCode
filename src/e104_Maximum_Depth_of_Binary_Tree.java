/*
找出一個二元樹的深度。

*/

public class e104_Maximum_Depth_of_Binary_Tree {
	 public int maxDepth(TreeNode104 root) {
//		 #1
//         if(root == null)
//            return 0;
//        int result = 0;
//        result = 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
//        return result;
		 
		 //#2
		 return root==null?0:Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}

class TreeNode104 {
     int val;
     TreeNode104 left;
     TreeNode104 right;
     TreeNode104() {}
     TreeNode104(int val) { this.val = val; }
     TreeNode104(int val, TreeNode104 left, TreeNode104 right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}

//參考:https://woooooooooord.wordpress.com/2016/11/29/leetcode-104-maximum-depth-of-binary-treejava/
