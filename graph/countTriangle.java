
class Solution {
    public static int numberOfTriangles(int n, int[][] g) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if(i != j && j != k && k != i){
                        if (g[i][j] == 1 && g[j][k] == 1 && g[k][i] == 1) {
                        count++;
                    }
                    }
                    
                }
            }
        }
        return count / 3;
    }
}
        
