package Leetcode.Tree;

public class Leetcode_1022_Sum_of_Root_To_Leaf_Binary_Numbers {
    public static int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private static int dfs(TreeNode root, int val) {
        if (root == null) {
            return 0;
        }
        val = val * 2 + root.val; // pass the value to its subtrees
        return root.left == root.right ? val : dfs(root.left, val) + dfs(root.right, val);
    }
}
