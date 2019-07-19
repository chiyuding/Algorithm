package Leetcode.String;

public class Leetcode_917_Reverse_Only_Letters {
    public static void main(String[] args) {
        String S = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(S));
    }

    private static String reverseOnlyLetters(String S){
        char[] res = new char[S.length()];
        int j = 0;
        for(int i = S.length() - 1; i >= 0; i--){
            if(!Character.isLetter(S.charAt(i))){
                res[i] = S.charAt(i);
            }else{
                while(!Character.isLetter(S.charAt(j))){
                    j++;
                }
                res[j++] = S.charAt(i);
            }
        }
        return new String(res);
    }
}
