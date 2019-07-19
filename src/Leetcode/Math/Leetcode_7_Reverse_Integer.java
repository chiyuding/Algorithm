package Leetcode.Math;

public class Leetcode_7_Reverse_Integer {
    public static void main(String[] args) {
        int x = -1230;
        System.out.println(reverse(x));
    }

    private static int reverse(int x) {
        if(x == 0)
            return 0;
        boolean isNegative;
        if(x < 0)
            isNegative = true;
        else
            isNegative = false;
        String str = String.valueOf(x);
        if(isNegative)
             str = str.substring(1);
        int i = str.length() - 1;
        while(str.charAt(i) == '0')
            i--;
        str = str.substring(0, i + 1);
        char[] charArray = new char[str.length()];
        for(int j = 0; j < str.length(); j++)
            charArray[j] = str.charAt(str.length() - 1 - j);
        long res = Long.parseLong(new String(charArray));
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
        if(isNegative)
            return (int)-res;
        return (int)res;
    }
}
