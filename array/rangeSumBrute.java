public class rangeSumBrute {
    public static void main(String args[]){
        int  query[][] = {{0, 4}, {1, 3}, {2, 4}};
        int arr[]   = {1, 1, 2, 1, 3, 4, 5, 2, 8};
        for(int i = 0; i < query.length; i++){
            int left = query[i][0];
            int right = query[i][1];
            int sum = 0;
            for(int j = 0; j < arr.length; j++){
                if(j >= left && j <= right){
                    sum += arr[j];
                }   
            }
            System.out.println("sum for("+left+","+right+"): "+sum);

        }
    }
}
