/*
判斷一棵二叉樹是不是映象二叉樹。

Input: root = [1,2,2,3,4,4,3]
Output: true

Input: root = [1,2,2,null,3,null,3]
Output: false

*/

public class e101_Symmetric_Tree {
	public boolean isSymmetric(TreeNode101 root) {
        if (root == null)
			return true;
		return isSymmetric(root.left, root.right);
    }
    
    public boolean isSymmetric(TreeNode101 l, TreeNode101 r) {
	if (l == null && r == null) {
		return true;
	} else if (r == null || l == null) {
		return false;
	}
 
	if (l.val != r.val)
		return false;
 
	if (!isSymmetric(l.left, r.right))
		return false;
	if (!isSymmetric(l.right, r.left))
		return false;
 
	return true;
    }
}

class TreeNode101 {
    int val;
    TreeNode101 left;
    TreeNode101 right;
    TreeNode101() {}
    TreeNode101(int val) { this.val = val; }
    TreeNode101(int val, TreeNode101 left, TreeNode101 right) {
        this.val = val;
         this.left = left;
         this.right = right;
     }
}
