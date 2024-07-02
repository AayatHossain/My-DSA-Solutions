class Solution {

    public static void floodFill(int image[][], int i, int j, int color, int n, int prevColor){
        if(i >= n || i < 0 || j >= image[i].length || j < 0|| image[i][j]==color||image[i][j] != prevColor  ){
            return;
        }
        image[i][j] = color;
        floodFill(image, i+1, j, color, n, prevColor);
        floodFill(image, i-1, j, color, n, prevColor);
        floodFill(image, i, j+1, color, n, prevColor);
        floodFill(image, i, j-1, color, n, prevColor);
    }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int prevColor = image[sr][sc];
        floodFill(image, sr, sc, color, n, prevColor);
        return image;
    }
}