package Leetcode.Hashtable;

import java.util.HashMap;

public class Leetcodxe_447_Number_of_Boomerangs {
    public static void main(String[] args) {
        int[][] points = {{0, 0}, {1, 0}, {2, 0}};
        System.out.println(numberOfBoomerangs(points));
    }

    private static int numberOfBoomerangs(int[][] points) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < points.length; i++) {
            for(int j = 0; j < points.length; j++) {
                if(i != j){
                    int d = getDistance(points[i], points[j]);
                    map.put(d, map.getOrDefault(d, 0) + 1);
                }
            }
            for(int val : map.values())
                res += val * (val-1);
            map.clear(); // map.clear(), map.getOrdefault(d, 0) + 1
        }
        return res;
    }

    private static int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];

        return dx*dx + dy*dy;
    }

}
