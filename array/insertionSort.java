public class insertionSort {
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int curr = arr[i];
            int previousIndex = i-1;
            while (previousIndex >= 0 && curr < arr[previousIndex]) {
                arr[previousIndex+1] = arr[previousIndex];
                previousIndex--;
            }
            arr[previousIndex+1] = curr;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
