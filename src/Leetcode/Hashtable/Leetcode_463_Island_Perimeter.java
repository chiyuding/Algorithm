package Leetcode.Hashtable;

public class Leetcode_463_Island_Perimeter {
    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},
                        {1,1,1,0},
                        {0,1,0,0},
                        {1,1,0,0}};
        System.out.println(islandPerimeter(grid));
    }

    private static int islandPerimeter(int[][] grid) {
        int cnt1 = 0;
        int cntdown = 0, cntright = 0;
        int perimeter = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    cnt1++;
                    if(i < grid.length - 1 && grid[i + 1][j] == 1)
                        cntdown++;
                    if(j < grid[0].length - 1 && grid[i][j + 1] == 1)
                        cntright++;
                }
            }
        }
        perimeter = 4 * cnt1 - 2 * (cntdown + cntright);
        return perimeter;
    }
}
