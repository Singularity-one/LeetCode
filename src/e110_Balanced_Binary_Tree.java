
/*
給一個二元樹，判斷這是不是一個高度平衡的樹。
在這個問題中，高度平衡樹的定義是一個樹兩個子樹每個node的level不能差超過1。

*/

public class e110_Balanced_Binary_Tree {
	public boolean res = true;
	public boolean isBalanced(TreeNode110 root) {
		maxdp(root);
		return res;
	}
	public int maxdp(TreeNode110 root) {
		if (root == null || !res) return 0;
		int l = maxdp(root.left);
		int r = maxdp(root.right);
		if (Math.abs(l-r) > 1) {
			res = false;
			return 0;
		}
		return Math.max(l, r) + 1;
	}	
}

class TreeNode110 {
     int val;
     TreeNode110 left;
     TreeNode110 right;
     TreeNode110() {}
     TreeNode110(int val) { this.val = val; }
     TreeNode110(int val, TreeNode110 left, TreeNode110 right) {
        this.val = val;
         this.left = left;
         this.right = right;
     }
}

//參考:https://ithelp.ithome.com.tw/articles/10213283
