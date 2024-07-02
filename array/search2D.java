public class search2D {
    public static void main(String args[]){
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 50;
        //let key doesnt exist
        boolean flag = false;
        int n = arr.length;

        //we start from top right. thats the best spot
        int row = 0;
        int col = n-1;

        //the loop will run till the bottom left if no key is found.
        while(row < n && col >= 0){
            if(arr[row][col]==key){
                System.out.println("key found at"+"("+row+","+col+")");
                //key found!
                flag = true;
                break;
            }
            //bottom part has larger values. so we go to the bottom.
            else if(key > arr[row][col]){
                row++;
            }
            //left side has smaller values, so we go left.
            else{
                col--;
            }
        }
        //if key wasnt found. we print it.
        if(flag==false){
            System.out.println("key doesnt exist");
        }

    }   
}
