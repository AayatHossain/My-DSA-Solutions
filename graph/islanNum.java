public class islanNum {


    public static void islands(char grid[][], boolean visited[][], int i, int j){
        int numRows = grid.length;
        int numCols = grid[0].length;
    
        // Check if the current position is out of bounds or if it's water ('0') or already visited
        if (i < 0 || i >= numRows || j < 0 || j >= numCols || grid[i][j] == '0' || visited[i][j]) {
            return;
        }
    
        visited[i][j] = true;
        grid[i][j] = '0';
        islands(grid, visited, i+1, j);        
        islands(grid, visited, i-1, j);
        islands(grid, visited, i, j+1);
        islands(grid, visited, i, j-1);
        islands(grid, visited, i+1, j+1);
        islands(grid, visited, i+1, j-1);
        islands(grid, visited, i-1, j+1);
        islands(grid, visited, i-1, j-1);
        grid[i][j] = '1';

    }


    public static void main(String args[]){
        char grid[][] = {{'0','1','1','1','0','0','0'},
                        {'0','0','1','1','0','1','0'}};
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        int count = 0;
        for(int i = 0; i < grid.length; i++){
           for(int j = 0; j < grid[i].length; j++){
            if(grid[i][j]=='1' && !visited[i][j]){
                islands(grid, visited, i, j);
                count++;
            }
        } 
        }
        System.out.println(count);

        
    }
}
