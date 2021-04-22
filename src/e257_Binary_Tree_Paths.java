import java.util.ArrayList;
import java.util.List;

/*
但引出所有的从根节点到叶子节点的路径。

*/
public class e257_Binary_Tree_Paths {
	public List<String> binaryTreePaths(TreeNode257 root) {
         List<String> ans = new ArrayList<String>();
            if(root != null){
                searchNode(root, "", ans);
        }
        return ans;
    }
    
    public void searchNode(TreeNode257 root, String path, List<String> ans){
        if(root.left == null && root.right == null){
            ans.add(path + root.val);
        }
        if(root.left != null){
            searchNode(root.left, path + root.val + "->", ans);
        }
        if(root.right != null){
            searchNode(root.right, path + root.val + "->", ans);
        }
    }
}

class TreeNode257 {
    int val;
     TreeNode257 left;
     TreeNode257 right;
     TreeNode257() {}
     TreeNode257(int val) { this.val = val; }
     TreeNode257(int val, TreeNode257 left, TreeNode257 right) {
        this.val = val;
         this.left = left;
         this.right = right;
     }
}

//https://blog.csdn.net/fuxuemingzhu/article/details/71249429
