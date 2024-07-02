public class quickSort {


    public static int partition(int a[], int sI, int eI){
        int pivot = a[eI];
        int i = sI-1;
        for(int j = sI; j < eI; j++){
            if(a[j] < pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                
            }
        }
        i++;
        int temp = a[i];
        a[i] = a[eI];
        a[eI] = temp;
        return i;
    }


    public static void quickSortt(int a[], int sI, int eI){
        if(sI >= eI){
            return;
        }
        int pivotIndex = partition(a, sI, eI);
        quickSortt(a, sI, pivotIndex-1);
        quickSortt(a, pivotIndex+1, eI);
    }






    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        quickSortt(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
