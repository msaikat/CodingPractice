package com.coding.practice.leetcode;

public class IslandPerimeter {
    public static int calculateIslandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0) {
                    perimeter += getLandPerimeter(grid, i, j);
                }
            }
        }

        return perimeter;
    }

    private static int getLandPerimeter(int[][] grid, int i, int j) {
        int landPerimeter = 0;
        if (i - 1 < 0 || grid[i - 1][j] != 1) {
            landPerimeter++;
        }
        if (i + 1 == grid.length || grid[i + 1][j] != 1) {
            landPerimeter++;
        }
        if (j - 1 < 0 || grid[i][j - 1] != 1) {
            landPerimeter++;
        }
        if (j + 1 == grid[i].length || grid[i][j + 1] != 1) {
            landPerimeter++;
        }
        return landPerimeter;
    }
}
