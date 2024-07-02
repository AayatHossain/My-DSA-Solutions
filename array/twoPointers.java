import java.util.*;
public class twoPointers {
    public static void main(String args[]){
        int arr[] = {-2, 5, 0, 6, 2, 10, 14};
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0;
        int j = n-1;
        int sum = 16;
        while(i < j){
            if(arr[i]+arr[j] < sum){
                i++;
            }else if(arr[i]+arr[j] > sum){
                j--;
            }else{
                System.out.println("Sum found for the pair: ("+arr[i]+","+arr[j]+")");
                i++;
                j--;
            }
        }

    }
}
