package questions;

import java.util.Scanner;

public class pathSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][] grid = new int[m][n];

        // Input the grid
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Base conditions
        for(int i = 1; i < n; i++) {
            grid[0][i] += grid[0][i - 1];
        }

        for(int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        // Fill the rest of the grid
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }

        System.out.print(grid[m-1][n-1]);
    }
}
