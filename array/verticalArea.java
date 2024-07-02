class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int x[] = new int[points.length];
        for(int i = 0; i < points.length; i++){
            x[i] = points[i][0];
        }
        Arrays.sort(x);
        int diff = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < x.length; i++){
            diff = x[i] - x[i-1];
            max = Math.max(max, diff);
            diff = 0;
        }
        return max;
    }
}