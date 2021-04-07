import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
給一個二元樹，每一個階層從左到右裝成一個list，再從下到上放到一個大list裡面。

*/

public class m107_Binary_Tree_Level_Order_Traversal_II {
	public List<List<Integer>> levelOrderBottom(TreeNode107 root) {
		List<List<Integer>> list2 = new ArrayList<>();
	    if (root == null) {
	        return list2;
	    }
	    List<Integer> list = new ArrayList<Integer>();
	    Queue<TreeNode107> q = new LinkedList<>();
	    q.add(root);
	    while (!q.isEmpty()) {
	        list = new ArrayList<Integer>();
	        Queue<TreeNode107> tem = new LinkedList<>();
	        while (!q.isEmpty()) {
	        	TreeNode107 t = q.poll();
	            list.add(t.val);
	            if (t.left != null) {
	                tem.add(t.left);
	            }
	            if (t.right != null) {
	                tem.add(t.right);
	            }
	        }
	        list2.add(list);
	        q = tem;
	    }
	    List<List<Integer>> list3 = new ArrayList<>();
	    for(int i=list2.size()-1; i >= 0; i--){
	        list3.add(list2.get(i));
	    }
	    return list3;
    }
}

class TreeNode107 {
     int val;
     TreeNode107 left;
     TreeNode107 right;
     TreeNode107() {}
     TreeNode107(int val) { this.val = val; }
     TreeNode107(int val, TreeNode107 left, TreeNode107 right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

//參考:https://webcache.googleusercontent.com/search?q=cache:savMJtqm-i8J:https://www.itread01.com/content/1541639350.html+&cd=2&hl=zh-TW&ct=clnk&gl=tw
