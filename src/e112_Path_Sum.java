import java.util.Stack;

/*
題目會給定一個「二叉樹：Binary Tree」和一個「整數值」。
然後要求我們找判斷該二叉樹「從根至葉：A Root-to-Leaf Path」的總和是否等於題目給定的整數值，範例如下圖：


*/

public class e112_Path_Sum {
	public boolean hasPathSum(TreeNode112 root, int targetSum) {
		//#1
//		if (root == null) return false;
//        else if (root.left == null && root.right == null && root.val == targetSum) return true;
//        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
		
		//#2
		Stack<TreeNode112> trees = new Stack<>();
        Stack<Integer> sums = new Stack<>();
        trees.push(root);
        sums.push(targetSum);
        while (!trees.isEmpty() && (root != null)) {
            int target = sums.pop();
            TreeNode112 top = trees.pop();
            if (top.left == null && top.right == null
                    && top.val == target) return true;

            if (top.right != null) {
                trees.push(top.right);
                sums.push(target - top.val);
            }
            if (top.left != null) {
                trees.push(top.left);
                sums.push(target - top.val);
            }
        }
        return false;
    }
}

class TreeNode112 {
	int val;
	TreeNode112 left;
	TreeNode112 right;
	TreeNode112() {}
	TreeNode112(int val) { this.val = val; }
	TreeNode112(int val, TreeNode112 left, TreeNode112 right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
