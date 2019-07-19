package Leetcode.Binary_Search;

public class Leetcode_275_H_Index_II {
    static int[] citations = {0, 1, 3, 5, 6};
    public static void main(String[] args) {
        System.out.println(hIndex(citations));
    }

    private static int hIndex(int[] citations) {
        int lo = 0, hi = Integer.MAX_VALUE;
        int mid;
        int smallerH;
        while(lo < hi){
            mid = lo + (hi - lo) / 2;
            smallerH = findIndex(mid);
            if(smallerH < citations.length - mid)
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
    }
    private static int findIndex(int num){
        int lo = 0, hi = citations.length;
        int mid;
        while(lo < hi){
            mid = lo + (hi - lo) / 2;
            if(citations[mid] <= num)
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
    }
}
