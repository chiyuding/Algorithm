package Leetcode.String;

public class Leetcode_520_Detect_Capital {
    public static void main(String[] args){
        String word = "adDefiho";
        System.out.println(detectCapitalUse(word));
    }

    private static boolean detectCapitalUse(String word) {
        boolean isValid = true;
        boolean isCapital = true;
        int diff = 0;
        if(Character.isLowerCase(word.charAt(0))){
            isCapital = false;
        }
        if(isCapital){
            for(int i = 1; i < word.length(); i++){
                if(Character.isUpperCase(word.charAt(i)))
                    diff++;
                else
                    diff--;
            }
        }else{
            for(int i = 1; i < word.length(); i++){
                if(Character.isUpperCase(word.charAt(i))){
                    isValid = false;
                    return isValid;
                }
            }
            return isValid;
        }
        if(!(diff == word.length() - 1 || diff == -(word.length() - 1)))
            isValid = false;
        return isValid;
    }
}
