package Leetcode.DFS;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Leetcode_897_Increasing_Order_Search_Tree {
    private static TreeNode increasingBST(TreeNode root) {
        return increasingBST(root, null);
    }

    public static TreeNode increasingBST(TreeNode root, TreeNode tail) {
        if (root == null) return tail;
        TreeNode res = increasingBST(root.left, root);
        root.left = null;
        root.right = increasingBST(root.right, tail);
        return res;
    }

}
