package Leetcode.Tree;

import java.util.LinkedList;
import java.util.List;

public class Leetcode_257_Binary_Tree_Paths {

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new LinkedList<>();
        if(root == null) {
            return res;
        }
        if(root.left == null && root.right == null) {
            res.add(String.valueOf(root.val));
            return res;
        }
        List<String> left = binaryTreePaths(root.left);
        List<String> right = binaryTreePaths(root.right);
        for(String str : left) {
            str = root.val + "->" + str;
            res.add(str);
        }
        for(String str : right) {
            str = root.val + "->" + str;
            res.add(str);
        }
        return res;
    }
}
