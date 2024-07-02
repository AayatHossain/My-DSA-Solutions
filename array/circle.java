class Solution {

    public static double calcDist(int x1,int y1,int x2, int y2){
        int z = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        double result = Math.sqrt(z);
        return result;

    }
    public int[] countPoints(int[][] points, int[][] queries) {
         int ans[] = new int[queries.length];
       
        for(int i = 0; i < queries.length; i++){
             int count = 0;
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            double r = queries[i][2];
            //for each querie, we are checking if the point exists within the circle.
            for(int j = 0; j < points.length; j++){
                int x2 = points[j][0];
                int y2 = points[j][1];
                //calculating distance between the point and querie,
                double dist = calcDist(x1,y1,x2,y2);
                
                //if the distance is less than or equal to radius, means the point lies in the circle.
                if(dist<=r){
                    count++;
                }
            }
            
            ans[i]= count;
        
        }
        return ans;
    }
}