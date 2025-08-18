package GYM;
import java.util.*;

public class Island {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] island = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                island[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(islandPerimeter(island));
    }

    public static int islandPerimeter(int[][] grid) {
        // your code here


        int periemeter = 0 ; 
        int row = grid.length;
        int col = grid[0].length;

        for(int i = 0 ; i < row;i++){
            for(int j = 0 ; j<col;j++){
                if(grid[i][j] == 1){
                    periemeter +=4;

                    if(i>0&& grid[i-1][j] == 1){
                        periemeter-=1;
                    }
                    if(i<row-1&& grid[i+1][j]==1){
                        periemeter-=1;
                    }
                    if(j>0&&grid[i][j-1]==1){
                        periemeter-=1;
                    }
                    if(j<col-1&& grid[i][j+1]==1){
                        periemeter-=1;
                    }
                }
            }
        }
        return periemeter;
    }
}