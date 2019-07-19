package Leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_429_N_ary_Tree_Level_Order_Traversal {
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int i = queue.size();
            List<Integer> temp = new ArrayList<>();
            while(i-- > 0) {
                Node node = queue.remove();
                temp.add(node.val);
                queue.addAll(node.children);
            }
            res.add(temp);
        }
        return res;
    }
}
