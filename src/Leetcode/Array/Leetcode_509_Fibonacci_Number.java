package Leetcode.Array;

public class Leetcode_509_Fibonacci_Number {
    public static void main(String[] args){
        int N = 10;
        System.out.println(fib(N));
    }

    private static int fib(int N){
        if(N == 0){
            return 0;
        }else if(N == 1){
            return 1;
        }else{
            int temp1 = 0, temp2 = 1;
            int i = 1;
            while(i++ < N){
                int sum = temp1 + temp2;
                temp1 = temp2;
                temp2 = sum;
            }
            return temp2;
        }

    }
}
