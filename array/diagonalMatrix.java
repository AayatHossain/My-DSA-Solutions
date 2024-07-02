public class diagonalMatrix {
    public static void main(String args[]){
        int[][] arr = {
            {1,  2,  3,  4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9,  8,  7}
        };
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            //for principal diagonal, let contents indexes are (i, j) where i=j ; finally arr[i][i].
            sum += arr[i][i];
            //to skip overlapping middle value on the second digaonal. i cant be equal to j, as in (i,j) when i=j, the mid value exists.
            if(i != n-i-1){
                //for second diagonal, let contents indexes are (i, j) where i+j = n-1; so j = n-1-i; finally arr[i][n-i-1].
                sum += arr[i][n-i-1]; 
            }
        }
        System.out.println(sum);
    }
}
