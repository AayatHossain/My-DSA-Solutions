
// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    
    public static void maze(int i, int j, int m[][], String str, ArrayList<String> ans, int n){
        
        if (i < 0 || j < 0 || i >= n || j >= n || m[i][j] == 0) {
            return;
        }
        if(i==n-1 && j==n-1){
            ans.add(str);
            return;
        }

        
        m[i][j] = 0;
        maze(i+1, j, m, str+"D", ans, n);
        maze(i-1, j, m, str+"U", ans, n);
        maze(i, j+1, m, str+"R", ans, n);
        maze(i, j-1, m, str+"L", ans, n);
        m[i][j] = 1;

    }
    
    
    public static ArrayList<String> findPath(int[][] m, int n) {
       
        String str = "";
        ArrayList<String> ans = new ArrayList<>();
        maze(0, 0, m, str, ans, n);
       
        Collections.sort(ans);
        return ans;
        
    }
}