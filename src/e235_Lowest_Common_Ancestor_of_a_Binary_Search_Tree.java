/*


*/
public class e235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
	public TreeNode235 lowestCommonAncestor(TreeNode235 root, TreeNode235 p, TreeNode235 q) {
        if ((root.val - p.val) * (root.val - q.val) < 1) return root;
        if (p.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        return lowestCommonAncestor(root.right, p, q);
    }
}

class TreeNode235 {
     int val;
     TreeNode235 left;
     TreeNode235 right;
     TreeNode235(int x) { val = x; }
}
//https://desolve.medium.com/%E5%BE%9Eleetcode%E5%AD%B8%E6%BC%94%E7%AE%97%E6%B3%95-51-bst-4-94cd8fe956ac