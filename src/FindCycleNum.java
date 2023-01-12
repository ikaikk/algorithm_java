public class FindCycleNum {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        if (n == 0) {
            return 0;
        }

        int result = 0;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i);
                result++;
            }
        }

        return result;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int i) {
        visited[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (!visited[j] && 1 == isConnected[i][j]) {
                dfs(isConnected, visited, j);
            }
        }
    }
}
