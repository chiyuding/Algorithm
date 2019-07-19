package Leetcode.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Leetcode_1046_Last_Stone_Weight {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
    }
    private static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int weight : stones){
            heap.add(weight);
        }
        int last_stone = 0;
        while(!heap.isEmpty()){
            if(heap.size() > 1){
                int w1 = heap.poll(), w2 = heap.poll();
                if(w1 != w2){
                    int w3 = Math.abs(w1 - w2);
                    heap.add(w3);
                }
            }else
                last_stone = heap.poll();
        }
        return last_stone;
    }
}
