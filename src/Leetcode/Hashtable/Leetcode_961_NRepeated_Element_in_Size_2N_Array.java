package Leetcode.Hashtable;

import java.util.Hashtable;
import java.util.Map;

public class Leetcode_961_NRepeated_Element_in_Size_2N_Array {
    public static void main(String[] args) {
        int[] A = {2,1,2,5,3,2};
        System.out.println(repeatedNTimes(A));
    }

    private static int repeatedNTimes(int[] A) {
        Hashtable<Integer, Integer> counter = new Hashtable<>();
        int majority = -1;
        for(int num : A){
            if(!counter.containsKey(num)){
                counter.put(num, 1);
            }else{
                int temp_count = counter.get(num);
                counter.put(num, temp_count + 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : counter.entrySet()){
            if(entry.getValue() == A.length / 2){
                majority = entry.getKey();
                break;
            }
        }
        return majority;
    }
}


