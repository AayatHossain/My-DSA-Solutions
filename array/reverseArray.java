public class reverseArray {
    public static void main(String[] args) {
        int a[] = {4, 5, 2};
        int i = 0;
        int j = a.length-1;
        while(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        for(i = 0; i < a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
