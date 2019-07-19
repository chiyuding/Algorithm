package Leetcode.Tree;

public class Leetcode_543_Diameter_of_Binary_Tree {
    private int longestPath = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return this.longestPath;
        }
        findLongestPath(root);
        return this.longestPath - 1;
    }

    private int findLongestPath(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int left = findLongestPath(node.left);
        int right = findLongestPath(node.right);
        this.longestPath = Math.max(this.longestPath, left + right + 1);
        return Math.max(left, right) + 1;
    }
}
