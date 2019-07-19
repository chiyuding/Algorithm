package Leetcode.Tree;

public class Leetcode_563_Binary_Tree_Tilt {
    private int tilt = 0;

    public int findTilt(TreeNode root) {
        sumSubtree(root);
        return this.tilt;
    }

    private int sumSubtree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftSum = sumSubtree(root.left);
        int rightSum = sumSubtree(root.right);
        this.tilt += Math.abs(leftSum - rightSum);
        return leftSum + root.val + rightSum;
    }
}
