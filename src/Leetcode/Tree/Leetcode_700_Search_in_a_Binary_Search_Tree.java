package Leetcode.Tree;

public class Leetcode_700_Search_in_a_Binary_Search_Tree {
    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
            return null;
        }
        if(root.val < val) {
            return searchBST(root.right, val);
        } else if(root.val > val) {
            return searchBST(root.left, val);
        }
        return root;
    }

}
