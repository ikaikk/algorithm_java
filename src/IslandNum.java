public class IslandNum {
    /**
     * 判断岛屿数量
     * @param grid char字符型二维数组
     * @return int整型
     */
    public int solve (char[][] grid) {
        // write code here
        if (grid.length == 0) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if ('1' == grid[i][j]) {
                    dfs(grid, i, j);
                    result++;
                }
            }
        }

        return result;
    }

    private static void dfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        grid[i][j] = '0';
        if (i - 1 >= 0 && '1' == grid[i-1][j]) {
            dfs(grid, i-1, j);
        }
        if (i + 1 < n && '1' == grid[i+1][j]) {
            dfs(grid, i+1, j);
        }
        if (j -1 >= 0 && '1' == grid[i][j-1]) {
            dfs(grid, i, j-1);
        }
        if (j + 1 < m && '1' == grid[i][j+1]) {
            dfs(grid, i, j+1);
        }

    }
}
