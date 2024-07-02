public class mergeSort {


    public static void merge(int a[], int l, int m, int r){
        int temp[] = new int[r+1];

        int i = l;
        int j = m+1;
        int k = l;
        while(i <= m && j <= r){
            if(a[i] < a[j]){
                temp[k] = a[i];
                i++;
            }else{
                temp[k] = a[j];
                j++;
            }
            k++;
        }

        if(j > r){
            while(i <= m){
                temp[k] = a[i];
                i++;k++;
            }
        }else{
            while(j <= r){
                temp[k] = a[j];
                j++;k++;
            }
        }
        for( i = l; i <= r; i++){
            a[i] = temp[i];
        }
    }


    public static void mergeSortt(int a[], int l, int r){
        if(l < r){
            int m = (l+r)/2;
            mergeSortt(a, l, m);
            mergeSortt(a, m+1, r);
            merge(a, l, m, r);
        }
    }
    public static void main(String args[]){
        int arr[] = {5,3,4,1,2};
        mergeSortt(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
