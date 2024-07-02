import java.util.Arrays;

public class practice {

    public static void countSort(int exp, int a[], int n){
        int output[] = new int[n];
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for(int i = 0; i < n; i++){
            count[(a[i]/exp)%10]++;
        }
        for(int i = 1; i < 10; i++){
            count[i] = count[i] + count[i-1];
        }
        for(int i = n-1; i >= 0; i--){
            output[count[(a[i]/exp)%10] -1] = a[i];
            count[(a[i]/exp)%10] --;
        }
        for(int i = 0; i < n; i++){
            a[i] = output[i];
        }
    }


    public static void main(String[] args) {
        int a[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n = a.length;

        int max = Arrays.stream(a).max().getAsInt();

        for(int exp = 1; max/exp > 0; exp *= 10){
            countSort(exp, a, n);
        }

        System.out.println(Arrays.toString(a));

    }
}
