public class Leetcode226 {
    
}

class Solution {
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
 
    private void swap(TreeNode root){
      TreeNode temp = new TreeNode();
      temp = root.left;
      root.left = root.right;
      root.right = temp;
    }

    private void helper(TreeNode root){
      if(root==null) return;
      helper(root.left);
      helper(root.right);
      swap(root);
    }

    public TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;
    }
}
