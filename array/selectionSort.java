public class selectionSort {
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int smallestIndex = i;
          
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[smallestIndex]){
                    smallestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
