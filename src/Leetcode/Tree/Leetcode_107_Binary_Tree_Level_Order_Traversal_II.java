package Leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_107_Binary_Tree_Level_Order_Traversal_II {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        if(root == null) {
             return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            while(size-- > 0) {
                TreeNode popItem = queue.remove();
                temp.add(popItem.val);
                if(popItem.left != null) {
                    queue.offer(popItem.left);
                }
                if(popItem.right != null) {
                    queue.offer(popItem.right);
                }
            }
            res.add(0, temp);
        }
        return res;
    }
}
