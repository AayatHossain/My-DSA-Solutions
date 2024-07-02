//main logic, from a side, only the max length buildings will make the skyline, for example if we look from up, the skyline will be like 9 4 8 7, its like the south side of the figure
// for a specific building, in that specific row and colomn, we can increase the height upto the minimum of the max heights from row andd column, beacuse the skyline is made
//with all the max height buildings, so we cant increase the height above the max height./



class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int total = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int curr = grid[i][j];
                int max1 = Integer.MIN_VALUE;
                int max2 = Integer.MIN_VALUE;
                for(int k = 0; k < n; k++){
                    //counting max from column
                    max1 = Math.max(max1, grid[k][j]);
                    //counting max from row.
                    max2 = Math.max(max2, grid[i][k]);
                }
                //minimum of these 2
                int min = Math.min(max1,max2);
                grid[i][j] = min;
                //difference between previous and later height
                int diff = min - curr;
                total += diff;
            }
        }
        return total;
    }
}