package Leetcode.DFS;

import java.util.List;

class Node {
    public int val;
    public List<Node> children;
    public Node() {}

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class Leetcode_559_Maximum_Depth_of_Nary_Tree {
    private static int maxDepth(Node root) {
        if(root == null) return 0;
        int tmax = 0;
        for(Node child : root.children){
            int depth = maxDepth(child);
            tmax = depth > tmax ? depth : tmax; // Math.max()
        }
        return tmax + 1;
    }
}
