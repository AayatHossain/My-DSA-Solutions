import java.util.*;

public class ratMaze {

    public static void maze(int i, int j, int m[][], String str, ArrayList<String> ans, int n){
        
        if (i < 0 || j < 0 || i >= n || j >= n || m[i][j] == 0) {
            return;// If out of bounds or blocked cell, return
        }
        if(i==n-1 && j==n-1){
            ans.add(str);
            return; //If destination is reached, add the path to the list and return
        }

        
        m[i][j] = 0; // Mark the cell as visited, so that we dont go to the previous cell again.
        maze(i+1, j, m, str+"D", ans, n);
        maze(i-1, j, m, str+"U", ans, n);
        maze(i, j+1, m, str+"R", ans, n);
        maze(i, j-1, m, str+"L", ans, n);
        m[i][j] = 1;// Backtrack: Mark the cell as unvisited

    }

    public static void main(String args[]){
        int m[][] = {{1, 0, 0, 0},
                    {1, 1, 0, 1}, 
                    {1, 1, 0, 0},
                    {0, 1, 1, 0}};
        int n = m.length;
        String str = "";
        ArrayList<String> ans = new ArrayList<>();
        maze(0, 0, m, str, ans, n);
        if (ans.isEmpty()) {
            System.out.println("-1");
        } else {
            Collections.sort(ans);
            System.out.println(ans);
        }
    }
}
