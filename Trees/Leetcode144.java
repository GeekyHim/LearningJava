import java.util.ArrayList;
import java.util.List;

public class Leetcode144 {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
    class Solution {
    public void preorder(TreeNode root, List<Integer> ans){
        if(root == null) return;
        ans.add(root.val);
        preorder(root.left, ans);
        preorder(root.right, ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }
}
    
}
/**
 * 
 * Globally Bhi arraylist ko kar skta tha
 * phir bahar declare hota ( immediately after entering solution class)
 * and function ke andar intialize hota (immediately after entering preorderTraversal function)
 * 
 * 
 */