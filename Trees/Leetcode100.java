
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
  
    public boolean isSameTree(TreeNode p, TreeNode q) {
      if(p== null && q==null) return true;

      //if(p!= null && q== null) return false;
      //if(p== null && q!= null) return false;
      if((p!= null && q== null) || (p== null && q!= null)) return false;
      //
      //Even Better Approach
      //if(p==null || q==null) return false;
      // kyu? --> beacause agar dono null hote toh top wala if chl jata
      // vo nhi chla mtlb dono me se koi ek null nhi hai ya dono null nhi hai
      // ab agar dono not null toh good, but if ek nhi null ek null toh ye 
      // wala nikal dega usko
      
      
      //checking the root, place where i m standing
      if(p.val!= q.val) return false;

      //checking left subtree
      if(!isSameTree(p.left,q.left)) return false;

      //checking right subtreee
      if(!isSameTree(p.right,q.right)) return false;
      return true;
    }
}

// approach used is what are possible conditions for false and then used that
// point to remember -> boolean is pass by value