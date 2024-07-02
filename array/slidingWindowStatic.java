public class slidingWindowStatic {
    public static int sliding(int a[], int k){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
            if(i >= k-1){
                max = Math.max(max, sum);
                sum -= a[i-(k-1)];
            }
        }
        return max;
    }


    public static void main(String args[]){
        int a[] = {4,2,1,7,8,1,2,8,1,0};
        System.out.println(sliding(a, 3));
    }
}
