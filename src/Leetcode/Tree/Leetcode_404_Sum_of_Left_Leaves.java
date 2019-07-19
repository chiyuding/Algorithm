package Leetcode.Tree;

public class Leetcode_404_Sum_of_Left_Leaves {

    public static int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }

    private static int sumOfLeftLeaves(TreeNode root, Boolean isLeft) {
        if(root == null) {
            return 0;
        }
        int sum = sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
        if(root.left == null && root.right == null && isLeft) {
            sum += root.val;
        }
        return sum;
    }
}
