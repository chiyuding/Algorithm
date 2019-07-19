package Leetcode.Array;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode_888_Fair_Candy_Swap {
    public static void main(String[] args) {
        int[] A = {1, 2, 5};
        int[] B = {2, 4};
        System.out.println(Arrays.toString(fairCandySwap(A, B)));
    }

    private static int[] fairCandySwap(int[] A, int[] B) {
        int suma = 0, sumb = 0;
        HashSet<Integer> setb = new HashSet<>();
        int[] res = new int[2];
        for(int num : A){
            suma += num;
        }
        for(int num : B){
            sumb += num;
            setb.add(num);
        }
        int diff = (suma - sumb) / 2;
        for(int num : A){
            if(setb.contains(num - diff)){
                res[0] = num;
                res[1] = num - diff;
                break;
            }
        }
        return res;

    }
}
