package Leetcode.String;

public class Leetcode_657_Robot_Return_to_Origin {
    public static void main(String[] args){
        String moves = "UDLL";
        System.out.println(judgeCircle(moves));
    }
    private static boolean judgeCircle(String moves) {
        int cnt_UD = 0;
        int cnt_LR = 0;
        boolean isReturn = false;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                cnt_UD++;
            }else if(moves.charAt(i) == 'D'){
                cnt_UD--;
            }else if(moves.charAt(i) == 'L'){
                cnt_LR++;
            }else if(moves.charAt(i) == 'R'){
                cnt_LR--;
            }
        }
        if(cnt_LR == 0 && cnt_UD == 0){
            isReturn = true;
        }
        return isReturn;

    }
}

