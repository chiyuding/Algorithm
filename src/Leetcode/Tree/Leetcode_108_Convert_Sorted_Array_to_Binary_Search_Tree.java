package Leetcode.Tree;

import java.util.Arrays;

public class Leetcode_108_Convert_Sorted_Array_to_Binary_Search_Tree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        int midIndex = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, midIndex);
        int[] right = Arrays.copyOfRange(nums, midIndex + 1, nums.length);
        TreeNode root = new TreeNode(nums[midIndex]);
        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);
        return root;
    }
}
