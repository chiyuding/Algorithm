package Leetcode.Tree;

public class Leetcode_235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val < Math.min(p.val , q.val)) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if(root.val > Math.max(p.val , q.val)) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
}
