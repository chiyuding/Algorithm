package Leetcode.Binary_Search;

public class Leetcode_69_Sqrt_x {
    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(mySqrt(x));
    }

    private static int mySqrt(int x) {
        int lo = 0, hi = x;
        int mid;
        while(lo < hi){
            mid = (lo + hi) / 2 + 1;
            if(mid == x / mid)
                return mid;
            else if(mid > x / mid)
                hi = mid - 1;
            else
                lo = mid;
        }
        return hi;
    }
}
