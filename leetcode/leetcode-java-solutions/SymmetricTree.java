import java.util.Stack;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return IsMirror(root,root);
    }


    public boolean IsMirror(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        } else if (tree1 == null || tree2 == null) {
            return false;
        }
        return (tree1.val == tree2.val) && IsMirror(tree1.left, tree2.right) &&
                IsMirror(tree1.right, tree2.left);
    }



}