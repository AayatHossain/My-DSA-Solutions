public class pairRotatedOptimized {
    public static void main(String[] args) {
        int a[] = {11, 15, 6, 8, 9, 10};
        int pivotIndex = 0;
        int n = a.length;
        for(int i = 0; i < n-1; i++){
            if(a[i]>a[i+1]){
                pivotIndex = i;
                break;
            }
        }
        int sum = 17;
        int i = pivotIndex+1;
        int j = pivotIndex;
        while(i != j){
            if(a[i]+a[j]==sum){
                System.err.println(a[i]+","+a[j]);
                break;
            }else if(a[i]+a[j] > sum){
                j = (n+j-1)%n;
            }else{
                i = (i+1)%n;
            }
        }
    }
}
