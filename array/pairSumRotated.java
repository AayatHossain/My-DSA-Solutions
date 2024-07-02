public class pairSumRotated {
    public static void main(String args[]){
       int arr[] = {11, 15, 26, 38, 9, 10};
       int sum = 35;
       int n = arr.length;
       int pivot = 0;
       int pivotIndex = 0;

       for(int i = 1; i < n; i++){
        if(arr[i-1] > arr[i]){
            pivot = arr[i-1];
            System.out.println(pivot);
            pivotIndex = i-1;
            System.out.println(pivotIndex);
            break;

        }
       }

       for(int i = pivotIndex; i < n; i++){
        for(int j = i; j < n; j++){
            if(arr[i]+arr[j]==sum && i != j){
                System.out.println(arr[i]+","+arr[j]);
            }
        }
       }

       for(int i = 0; i <= pivotIndex; i++){
        for(int j = i; j <= pivotIndex; j++){
            if(arr[i]+arr[j]==sum && i != j){
                System.out.println(arr[i]+","+arr[j]);
            }
        }
       }
    }
}
