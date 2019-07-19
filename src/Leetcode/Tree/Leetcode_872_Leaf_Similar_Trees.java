package Leetcode.Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Leetcode_872_Leaf_Similar_Trees {

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Iterator<TreeNode> it1 = leafSequence(root1).iterator();
        Iterator<TreeNode> it2 = leafSequence(root2).iterator();
        while(it1.hasNext() && it2.hasNext()) {
            if(it1.next().val != it2.next().val) {
                return false;
            }
        }
        return !(it1.hasNext() || it2.hasNext());
    }

    private static List<TreeNode> leafSequence(TreeNode node) {
        List<TreeNode> res = new ArrayList<>();
        if(node == null) {
            return res;
        }
        if(node.left == null && node.right == null) {
            res.add(node);
            return res;
        }
        List<TreeNode> left = leafSequence(node.left);
        List<TreeNode> right = leafSequence(node.right);
        res.addAll(left);
        res.addAll(right);
        return res;
    }
}
