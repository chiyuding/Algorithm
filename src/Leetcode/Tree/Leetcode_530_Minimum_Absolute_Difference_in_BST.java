package Leetcode.Tree;

public class Leetcode_530_Minimum_Absolute_Difference_in_BST {
    private int minDiff = Integer.MAX_VALUE;
    private TreeNode prev;

    public int getMinimumDifference(TreeNode root) {
        //inorder(root);
        findMaxMinValue(root);
        return minDiff;
    }

    private void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        if(prev != null) {
            minDiff = Math.min(minDiff, root.val - prev.val);
        }
        prev = root;
        inorder(root.right);
    }

    private long[] findMaxMinValue(TreeNode node) {
        long[] res = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        if(node == null) {
            return res;
        }
        long[] left = findMaxMinValue(node.left);
        long[] right = findMaxMinValue(node.right);
        this.minDiff = (int)Math.min(this.minDiff, Math.min(node.val - left[0], right[1] - node.val));
        res[0] = Math.max(node.val, right[0]);
        res[1] = Math.min(node.val, left[1]);
        return res;
    }
}
