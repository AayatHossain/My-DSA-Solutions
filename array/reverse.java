public class reverse {
    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10};
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
