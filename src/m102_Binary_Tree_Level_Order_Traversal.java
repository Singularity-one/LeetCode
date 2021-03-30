import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
給一個二元樹，每一個階層從左到右裝成一個列陣，再依序放到一個大的列陣裡面。

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

Input: root = [1]
Output: [[1]]

Input: root = []
Output: []

*/


public class m102_Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode102 root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode102> queue=new LinkedList<>();
        queue.offer(root);
        Queue<TreeNode102> queue1=new LinkedList<>();
        while(!queue.isEmpty()||!queue1.isEmpty()){
            queue1.clear();
            while(!queue.isEmpty()){        //遍歷一層
            	TreeNode102 now = queue.poll();
                list.add(now.val);
                if(now.left!=null)
                    queue1.offer(now.left);
                if(now.right!=null) 
                    queue1.offer(now.right);
            }
            queue=new LinkedList<>(queue1);       //進行下一層的遍歷
            res.add(new ArrayList<>(list));
            list.clear();       //清空
        }
        return res;
    }
}

class TreeNode102 {
    int val;
    TreeNode102 left;
    TreeNode102 right;
    TreeNode102() {}
    TreeNode102(int val) { this.val = val; }
    TreeNode102(int val, TreeNode102 left, TreeNode102 right) {
        this.val = val;
         this.left = left;
         this.right = right;
     }
}
