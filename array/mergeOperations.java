public class mergeOperations {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 1};
        int n = a.length;
        int i = 0;
        int j = n-1;
        int count = 0;
        while(i < j){
            if(a[i]==a[j]){
                i++;
                j--;
            }else if(i+i == j){
                count++;
                break;
            }else{
                count = count + 2;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
