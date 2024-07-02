public class countSort {
    public static void countSort(int a[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++){
            max = Math.max(max, a[i]);
        }
        int count[] = new int[max+1];
        for(int i =0; i < a.length; i++){
            count[a[i]]++;
        }
        int k = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                a[k] = i;
                count[i]--;
                k++;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,1,3,2,4,7};
        countSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
