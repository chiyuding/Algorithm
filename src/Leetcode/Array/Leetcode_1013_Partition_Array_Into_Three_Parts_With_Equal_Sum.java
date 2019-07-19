package Leetcode.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class Leetcode_1013_Partition_Array_Into_Three_Parts_With_Equal_Sum {
    public static void main(String[] args) {
        int[] A = {0,2,1,-6,6,-7,9,1,2,0,1};
        System.out.println(canThreePartsEqualSum(A));
    }

    private static boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        HashMap<Integer, ArrayList<Integer>> presum_index = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            sum += A[i];
            if(presum_index.containsKey(sum))
                presum_index.get(sum).add(i);
            else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                presum_index.put(sum, temp);
            }
        }
        if(A.length < 3 || sum / 3 != sum / 3.0 || !presum_index.containsKey(sum / 3) || !presum_index.containsKey(2 * sum / 3))
            return false;
        for(int num1 : presum_index.get(sum / 3)){
            for(int num2 : presum_index.get(2 * sum / 3)){
                if(num1 < num2 && num2 < A.length - 1)
                    return true;
            }
        }
        return false;
    }
}
