package Leetcode.Tree;

public class Leetcode_104_Maximum_Depth_of_Binary_Tree {
    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = maxDepth(root.left), right = maxDepth(root.right);
        return Math.max(left, right) + 1;

    }
}
