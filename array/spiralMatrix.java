public class spiralMatrix {
    public static void main(String args[]){
        int[][] arr = {
            {1,  2,  3,  4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9,  8,  7}
        };
        int n = arr.length;
        //fixing starting row, column and ending row, column
        int sr = 0;
        int er = n-1;

        int sc = 0;
        int ec = n-1;

        //as soon as the sr becomes greater than er, the roop will stop. same goes for columns
        while(sr <= er && sc <= ec){
            //top
            for(int j = sc; j <= ec; j++){
                System.out.print(arr[sr][j]+" ");
            }
            //right
            for(int i = sr+1; i <= er; i++){
                System.out.print(arr[i][ec]+" ");
            }
            //bottom
            for(int j = ec-1 ; j >= sc; j--){
                //in case rows are equal, the contents are already printed in top part. so no need to print bottom part as it will repeat the numbers.
                if(sr==er){
                    break;
                }
                System.out.print(arr[er][j]+" ");
            }
            //left
            for(int i = er-1 ; i >= sr+1; i--){
                //in case columns are equal, the contents are already printed in right part. so no need to print left part as it will repeat the numbers.
                if(sc==ec){
                    break;
                }
                System.out.print(arr[i][sc]+" ");
            }
            //the current spiral has been printed. So the matrix is compressed.
            sr++;
            sc++;
            er--;
            ec--;
        }
    }
}
