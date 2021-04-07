/*
題目給定一個二元樹，要求找到最小的深度，也就是從根節點到最近的葉節點的路徑長。

Input: root = [3,9,20,null,null,15,7]
Output: 2

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5

*/

public class e111_Minimum_Depth_of_Binary_Tree {
	public int minDepth(TreeNode111 root) {
        if (root == null) return 0;
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if (l == 0 || r == 0) {
            return l + r + 1;
        } else {
            return Math.min(l, r) + 1;
        }
    }
}

class TreeNode111 {
	int val;
	TreeNode111 left;
	TreeNode111 right;
	TreeNode111() {}
	TreeNode111(int val) { this.val = val; }
	TreeNode111(int val, TreeNode111 left, TreeNode111 right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
