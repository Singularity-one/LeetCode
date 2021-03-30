/*
給定兩個二元樹，判斷這兩個樹每一個節點值與節點位置是否都相同


Input: p = [1,2,3], q = [1,2,3]
Output: true

Input: p = [1,2], q = [1,null,2]
Output: false

Input: p = [1,2,1], q = [1,1,2]
Output: false


*/


public class e100_Same_Tree {
	public boolean isSameTree(TreeNode100 p, TreeNode100 q) {
		 // 如果兩個節點都是null，代表所有node比較都是一樣的
         if(p==null&&q==null){return true;}
		 if(p!=null&&q==null){return false;}
		 if(p==null&&q!=null){ return false;}
       
		 return q.val==p.val&&isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
   }
}

 class TreeNode100 {
    int val;
    TreeNode100 left;
    TreeNode100 right;
    TreeNode100() {}
    TreeNode100(int val) { this.val = val; }
    TreeNode100(int val, TreeNode100 left, TreeNode100 right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}
