public class array{
    public static int largestValue(int arr[]){
        //with max function
        // int largest = Integer.MIN_VALUE;
        // for(int i = 0; i < arr.length; i++){
        //     largest = Math.max(largest, arr[i]);
        // }
        //without max function
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            
        }
        return largest;
    }


        public static int minValue(int arr[]){
        //with max function
        // int largest = Integer.MIN_VALUE;
        // for(int i = 0; i < arr.length; i++){
        //     largest = Math.max(largest, arr[i]);
        // }
        //without max function
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            
        }
        return min;
    }

    //easier and important
    public static int binarySearch(int arr[],int key){
        
        int sI = 0;
        int eI = arr.length-1;
        
        while(sI <= eI){
            // int mI = (sI+eI)/2; we can use this as well. the later one is used to avoid potential integer overflow issues.
            int mI = sI + (eI - sI)/2;
            if(arr[mI]==key){
            return mI;
        }
            if(key > arr[mI]){
               sI = mI + 1;
            }
            if(key < arr[mI]){
                eI = mI - 1;
            }
        }
        return -1;
    }


    public static int binarySearch2(int arr[], int sI, int eI, int key) {
        if (sI <= eI) {
            int mI = (sI + eI) / 2;
    
            if (arr[mI] == key) {
                return mI;
            }
    
            if (key > arr[mI]) {
                return binarySearch2(arr, mI + 1, eI, key);
            } else {
                return binarySearch2(arr, sI, mI - 1, key);
            }
        }
    
        return -1; // Return -1 if key is not found in the array
    }


    public static void reverseArray(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
        }
    
        System.out.println("The reversed array is");
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }


    public static void arrayPairs(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                System.out.print("("+ arr[i]+","+arr[j]+") ");
            }
            System.out.println();
            
        }
    }


    public static void subArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }



    public static int kadanes(int a[]){

        //if all the elements are negative
        boolean flag = false;
        for(int i = 0; i < a.length; i++){
            if(a[i] > 0){
                //if any element is positive, we make it true,
                flag = true;
            }
        }

        //flag false means all the elements are negative
        if(!flag){
            int maxSum = Integer.MIN_VALUE;
            
            for(int i = 0; i < a.length; i++){
           
            maxSum = Math.max(maxSum, a[i]);
        }
        return maxSum;
        }


        //if there are positive numbers
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }




    public static void main(String arg[]){
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(kadanes(arr));
        
        
    }
}