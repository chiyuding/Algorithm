package Leetcode.Tree;

public class Leetcode_938_Range_Sum_of_BST {
    public static int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) {
            return 0;
        }
        if(root.val < L) {
            return rangeSumBST(root.right, L, R);
        }else if(root.val > R) {
            return rangeSumBST(root.left, L, R);
        }
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}
