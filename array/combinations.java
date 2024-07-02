public class combinations {


    public static void comb(int[] arr,int[] ans, int r, int n, int ansIndex, int left){
        if(ansIndex==r){
            for(int i = 0; i < ans.length; i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
            return;
        }
        
        for(int i = left; i < n; i++){
            ans[ansIndex] = arr[i];
            comb(arr, ans, r, n, ansIndex+1,i+1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int r = 2;
        int n = arr.length;
        int ans[] = new int[r];
        comb(arr, ans, r, n, 0, 0);
    }
}
