package Leetcode.Array;

public class Leetcode_999_Available_Captures_for_Rook {
    public static void main(String[] args){
        char[][] board = {{'.', 'R', 'p'}, {'.', 'p', 'p'}, {'.', 'p', 'B'}};
        System.out.println(numRookCaptures(board));
    }

    private static int numRookCaptures(char[][] board) {
        int row = board.length, col = board[0].length;
        int x = -1, y = -1;
        int cnt = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'R'){
                    x = i;
                    y = j;
                }

            }
        }

        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int i = 0; i < 4; i++) {
            int delta = 1;
            while (x + delta * dir[i][0] >= 0 && x + delta * dir[i][0] < row &&
                    y + delta * dir[i][1] >= 0 && y + delta * dir[i][1] < col) {
                int tempx = x + delta * dir[i][0];
                int tempy = y + delta * dir[i][1];
                if (board[tempx][tempy] == 'p') {
                    cnt++;
                    break;
                } else if (board[tempx][tempy] == 'B') {
                    break;
                } else {
                    delta++;
                }
            }
        }
        return cnt;
    }
}
