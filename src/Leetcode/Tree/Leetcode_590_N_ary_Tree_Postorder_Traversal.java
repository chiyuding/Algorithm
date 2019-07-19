package Leetcode.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Leetcode_590_N_ary_Tree_Postorder_Traversal {

    public static List<Integer> recursion(Node root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        for(Node child : root.children) {
            List<Integer> ans = recursion(child);
            res.addAll(ans);
        }
        res.add(root.val);
        return res;
    }

    public static List<Integer> iteration(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node cur = stack.pop();
            res.add(cur.val);
            for(Node node : cur.children) {
                stack.push(node);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
