import java.util.*;

class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            Arrays.fill(matrix[i], Integer.MAX_VALUE / 3 - 1);
            matrix[i][i] = 0;
        }

        for(int[] e : edges) {
            matrix[e[0]][e[1]] = e[2];
            matrix[e[1]][e[0]] = e[2];
        }

        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                }
            }
        }


        int min = Integer.MAX_VALUE;
        int res = -1;
        for(int i = 0; i < n; i++) {
            int c = 0;
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] <= distanceThreshold) {
                    c++;
                }
            }
            if(c <= min) {
                min = c;
                res = i;
            }

        }
        return res;
    }
}